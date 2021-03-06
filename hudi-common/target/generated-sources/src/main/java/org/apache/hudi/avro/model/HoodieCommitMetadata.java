/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hudi.avro.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class HoodieCommitMetadata extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HoodieCommitMetadata\",\"namespace\":\"org.apache.hudi.avro.model\",\"fields\":[{\"name\":\"partitionToWriteStats\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"HoodieWriteStat\",\"fields\":[{\"name\":\"fileId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"path\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"prevCommit\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"numWrites\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"numDeletes\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"numUpdateWrites\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"totalWriteBytes\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"totalWriteErrors\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"partitionPath\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"totalLogRecords\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"totalLogFiles\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"totalUpdatedRecordsCompacted\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"numInserts\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"totalLogBlocks\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"totalCorruptLogBlock\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"totalRollbackBlocks\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"fileSizeInBytes\",\"type\":[\"null\",\"long\"],\"default\":null}]}},\"avro.java.string\":\"String\"}]},{\"name\":\"extraMetadata\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.Map<java.lang.String,java.util.List<org.apache.hudi.avro.model.HoodieWriteStat>> partitionToWriteStats;
  @Deprecated public java.util.Map<java.lang.String,java.lang.String> extraMetadata;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public HoodieCommitMetadata() {}

  /**
   * All-args constructor.
   */
  public HoodieCommitMetadata(java.util.Map<java.lang.String,java.util.List<org.apache.hudi.avro.model.HoodieWriteStat>> partitionToWriteStats, java.util.Map<java.lang.String,java.lang.String> extraMetadata) {
    this.partitionToWriteStats = partitionToWriteStats;
    this.extraMetadata = extraMetadata;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return partitionToWriteStats;
    case 1: return extraMetadata;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: partitionToWriteStats = (java.util.Map<java.lang.String,java.util.List<org.apache.hudi.avro.model.HoodieWriteStat>>)value$; break;
    case 1: extraMetadata = (java.util.Map<java.lang.String,java.lang.String>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'partitionToWriteStats' field.
   */
  public java.util.Map<java.lang.String,java.util.List<org.apache.hudi.avro.model.HoodieWriteStat>> getPartitionToWriteStats() {
    return partitionToWriteStats;
  }

  /**
   * Sets the value of the 'partitionToWriteStats' field.
   * @param value the value to set.
   */
  public void setPartitionToWriteStats(java.util.Map<java.lang.String,java.util.List<org.apache.hudi.avro.model.HoodieWriteStat>> value) {
    this.partitionToWriteStats = value;
  }

  /**
   * Gets the value of the 'extraMetadata' field.
   */
  public java.util.Map<java.lang.String,java.lang.String> getExtraMetadata() {
    return extraMetadata;
  }

  /**
   * Sets the value of the 'extraMetadata' field.
   * @param value the value to set.
   */
  public void setExtraMetadata(java.util.Map<java.lang.String,java.lang.String> value) {
    this.extraMetadata = value;
  }

  /** Creates a new HoodieCommitMetadata RecordBuilder */
  public static org.apache.hudi.avro.model.HoodieCommitMetadata.Builder newBuilder() {
    return new org.apache.hudi.avro.model.HoodieCommitMetadata.Builder();
  }
  
  /** Creates a new HoodieCommitMetadata RecordBuilder by copying an existing Builder */
  public static org.apache.hudi.avro.model.HoodieCommitMetadata.Builder newBuilder(org.apache.hudi.avro.model.HoodieCommitMetadata.Builder other) {
    return new org.apache.hudi.avro.model.HoodieCommitMetadata.Builder(other);
  }
  
  /** Creates a new HoodieCommitMetadata RecordBuilder by copying an existing HoodieCommitMetadata instance */
  public static org.apache.hudi.avro.model.HoodieCommitMetadata.Builder newBuilder(org.apache.hudi.avro.model.HoodieCommitMetadata other) {
    return new org.apache.hudi.avro.model.HoodieCommitMetadata.Builder(other);
  }
  
  /**
   * RecordBuilder for HoodieCommitMetadata instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HoodieCommitMetadata>
    implements org.apache.avro.data.RecordBuilder<HoodieCommitMetadata> {

    private java.util.Map<java.lang.String,java.util.List<org.apache.hudi.avro.model.HoodieWriteStat>> partitionToWriteStats;
    private java.util.Map<java.lang.String,java.lang.String> extraMetadata;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.hudi.avro.model.HoodieCommitMetadata.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.hudi.avro.model.HoodieCommitMetadata.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.partitionToWriteStats)) {
        this.partitionToWriteStats = data().deepCopy(fields()[0].schema(), other.partitionToWriteStats);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.extraMetadata)) {
        this.extraMetadata = data().deepCopy(fields()[1].schema(), other.extraMetadata);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing HoodieCommitMetadata instance */
    private Builder(org.apache.hudi.avro.model.HoodieCommitMetadata other) {
            super(org.apache.hudi.avro.model.HoodieCommitMetadata.SCHEMA$);
      if (isValidValue(fields()[0], other.partitionToWriteStats)) {
        this.partitionToWriteStats = data().deepCopy(fields()[0].schema(), other.partitionToWriteStats);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.extraMetadata)) {
        this.extraMetadata = data().deepCopy(fields()[1].schema(), other.extraMetadata);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'partitionToWriteStats' field */
    public java.util.Map<java.lang.String,java.util.List<org.apache.hudi.avro.model.HoodieWriteStat>> getPartitionToWriteStats() {
      return partitionToWriteStats;
    }
    
    /** Sets the value of the 'partitionToWriteStats' field */
    public org.apache.hudi.avro.model.HoodieCommitMetadata.Builder setPartitionToWriteStats(java.util.Map<java.lang.String,java.util.List<org.apache.hudi.avro.model.HoodieWriteStat>> value) {
      validate(fields()[0], value);
      this.partitionToWriteStats = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'partitionToWriteStats' field has been set */
    public boolean hasPartitionToWriteStats() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'partitionToWriteStats' field */
    public org.apache.hudi.avro.model.HoodieCommitMetadata.Builder clearPartitionToWriteStats() {
      partitionToWriteStats = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'extraMetadata' field */
    public java.util.Map<java.lang.String,java.lang.String> getExtraMetadata() {
      return extraMetadata;
    }
    
    /** Sets the value of the 'extraMetadata' field */
    public org.apache.hudi.avro.model.HoodieCommitMetadata.Builder setExtraMetadata(java.util.Map<java.lang.String,java.lang.String> value) {
      validate(fields()[1], value);
      this.extraMetadata = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'extraMetadata' field has been set */
    public boolean hasExtraMetadata() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'extraMetadata' field */
    public org.apache.hudi.avro.model.HoodieCommitMetadata.Builder clearExtraMetadata() {
      extraMetadata = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public HoodieCommitMetadata build() {
      try {
        HoodieCommitMetadata record = new HoodieCommitMetadata();
        record.partitionToWriteStats = fieldSetFlags()[0] ? this.partitionToWriteStats : (java.util.Map<java.lang.String,java.util.List<org.apache.hudi.avro.model.HoodieWriteStat>>) defaultValue(fields()[0]);
        record.extraMetadata = fieldSetFlags()[1] ? this.extraMetadata : (java.util.Map<java.lang.String,java.lang.String>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
