/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hudi.utilities.deltastreamer;

import static org.apache.hudi.utilities.schema.RowBasedSchemaProvider.HOODIE_RECORD_NAMESPACE;
import static org.apache.hudi.utilities.schema.RowBasedSchemaProvider.HOODIE_RECORD_STRUCT_NAME;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.apache.hudi.AvroConversionUtils;
import org.apache.hudi.common.util.Option;
import org.apache.hudi.utilities.sources.AvroSource;
import org.apache.hudi.utilities.sources.InputBatch;
import org.apache.hudi.utilities.sources.JsonSource;
import org.apache.hudi.utilities.sources.RowSource;
import org.apache.hudi.utilities.sources.Source;
import org.apache.hudi.utilities.sources.helpers.AvroConvertor;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.types.StructType;

/**
 * Adapts data-format provided by the source to the data-format required by the client (DeltaStreamer)
 */
public final class SourceFormatAdapter {

  private final Source source;


  public SourceFormatAdapter(Source source) {
    this.source = source;
  }

  /**
   * Fetch new data in avro format. If the source provides data in different format, they are translated to Avro format
   * 
   * @param lastCkptStr
   * @param sourceLimit
   * @return
   */
  public InputBatch<JavaRDD<GenericRecord>> fetchNewDataInAvroFormat(Option<String> lastCkptStr, long sourceLimit) {
    switch (source.getSourceType()) {
      case AVRO:
        return ((AvroSource) source).fetchNext(lastCkptStr, sourceLimit);
      case JSON: {
        InputBatch<JavaRDD<String>> r = ((JsonSource) source).fetchNext(lastCkptStr, sourceLimit);
        AvroConvertor convertor = new AvroConvertor(r.getSchemaProvider().getSourceSchema());
        return new InputBatch<>(Option.ofNullable(r.getBatch().map(rdd -> rdd.map(convertor::fromJson)).orElse(null)),
            r.getCheckpointForNextBatch(), r.getSchemaProvider());
      }
      case ROW: {
        InputBatch<Dataset<Row>> r = ((RowSource) source).fetchNext(lastCkptStr, sourceLimit);
        return new InputBatch<>(Option.ofNullable(r.getBatch().map(
            rdd -> (AvroConversionUtils.createRdd(rdd, HOODIE_RECORD_STRUCT_NAME, HOODIE_RECORD_NAMESPACE).toJavaRDD()))
            .orElse(null)), r.getCheckpointForNextBatch(), r.getSchemaProvider());
      }
      default:
        throw new IllegalArgumentException("Unknown source type (" + source.getSourceType() + ")");
    }
  }

  /**
   * Fetch new data in row format. If the source provides data in different format, they are translated to Row format
   * 
   * @param lastCkptStr
   * @param sourceLimit
   * @return
   */
  public InputBatch<Dataset<Row>> fetchNewDataInRowFormat(Option<String> lastCkptStr, long sourceLimit) {
    switch (source.getSourceType()) {
      case ROW:
        return ((RowSource) source).fetchNext(lastCkptStr, sourceLimit);
      case AVRO: {
        InputBatch<JavaRDD<GenericRecord>> r = ((AvroSource) source).fetchNext(lastCkptStr, sourceLimit);
        Schema sourceSchema = r.getSchemaProvider().getSourceSchema();
        return new InputBatch<>(
            Option
                .ofNullable(
                    r.getBatch()
                        .map(rdd -> AvroConversionUtils.createDataFrame(JavaRDD.toRDD(rdd), sourceSchema.toString(),
                            source.getSparkSession()))
                        .orElse(null)),
            r.getCheckpointForNextBatch(), r.getSchemaProvider());
      }
      case JSON: {
        InputBatch<JavaRDD<String>> r = ((JsonSource) source).fetchNext(lastCkptStr, sourceLimit);
        Schema sourceSchema = r.getSchemaProvider().getSourceSchema();
        StructType dataType = AvroConversionUtils.convertAvroSchemaToStructType(sourceSchema);
        return new InputBatch<>(
            Option.ofNullable(
                r.getBatch().map(rdd -> source.getSparkSession().read().schema(dataType).json(rdd)).orElse(null)),
            r.getCheckpointForNextBatch(), r.getSchemaProvider());
      }
      default:
        throw new IllegalArgumentException("Unknown source type (" + source.getSourceType() + ")");
    }
  }
}
