/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hudi.avro.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class HoodieSavepointMetadata extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HoodieSavepointMetadata\",\"namespace\":\"org.apache.hudi.avro.model\",\"fields\":[{\"name\":\"savepointedBy\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"savepointedAt\",\"type\":\"long\"},{\"name\":\"comments\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"partitionMetadata\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"HoodieSavepointPartitionMetadata\",\"fields\":[{\"name\":\"partitionPath\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"savepointDataFile\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}]},\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String savepointedBy;
  @Deprecated public long savepointedAt;
  @Deprecated public java.lang.String comments;
  @Deprecated public java.util.Map<java.lang.String,org.apache.hudi.avro.model.HoodieSavepointPartitionMetadata> partitionMetadata;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public HoodieSavepointMetadata() {}

  /**
   * All-args constructor.
   */
  public HoodieSavepointMetadata(java.lang.String savepointedBy, java.lang.Long savepointedAt, java.lang.String comments, java.util.Map<java.lang.String,org.apache.hudi.avro.model.HoodieSavepointPartitionMetadata> partitionMetadata) {
    this.savepointedBy = savepointedBy;
    this.savepointedAt = savepointedAt;
    this.comments = comments;
    this.partitionMetadata = partitionMetadata;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return savepointedBy;
    case 1: return savepointedAt;
    case 2: return comments;
    case 3: return partitionMetadata;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: savepointedBy = (java.lang.String)value$; break;
    case 1: savepointedAt = (java.lang.Long)value$; break;
    case 2: comments = (java.lang.String)value$; break;
    case 3: partitionMetadata = (java.util.Map<java.lang.String,org.apache.hudi.avro.model.HoodieSavepointPartitionMetadata>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'savepointedBy' field.
   */
  public java.lang.String getSavepointedBy() {
    return savepointedBy;
  }

  /**
   * Sets the value of the 'savepointedBy' field.
   * @param value the value to set.
   */
  public void setSavepointedBy(java.lang.String value) {
    this.savepointedBy = value;
  }

  /**
   * Gets the value of the 'savepointedAt' field.
   */
  public java.lang.Long getSavepointedAt() {
    return savepointedAt;
  }

  /**
   * Sets the value of the 'savepointedAt' field.
   * @param value the value to set.
   */
  public void setSavepointedAt(java.lang.Long value) {
    this.savepointedAt = value;
  }

  /**
   * Gets the value of the 'comments' field.
   */
  public java.lang.String getComments() {
    return comments;
  }

  /**
   * Sets the value of the 'comments' field.
   * @param value the value to set.
   */
  public void setComments(java.lang.String value) {
    this.comments = value;
  }

  /**
   * Gets the value of the 'partitionMetadata' field.
   */
  public java.util.Map<java.lang.String,org.apache.hudi.avro.model.HoodieSavepointPartitionMetadata> getPartitionMetadata() {
    return partitionMetadata;
  }

  /**
   * Sets the value of the 'partitionMetadata' field.
   * @param value the value to set.
   */
  public void setPartitionMetadata(java.util.Map<java.lang.String,org.apache.hudi.avro.model.HoodieSavepointPartitionMetadata> value) {
    this.partitionMetadata = value;
  }

  /** Creates a new HoodieSavepointMetadata RecordBuilder */
  public static org.apache.hudi.avro.model.HoodieSavepointMetadata.Builder newBuilder() {
    return new org.apache.hudi.avro.model.HoodieSavepointMetadata.Builder();
  }
  
  /** Creates a new HoodieSavepointMetadata RecordBuilder by copying an existing Builder */
  public static org.apache.hudi.avro.model.HoodieSavepointMetadata.Builder newBuilder(org.apache.hudi.avro.model.HoodieSavepointMetadata.Builder other) {
    return new org.apache.hudi.avro.model.HoodieSavepointMetadata.Builder(other);
  }
  
  /** Creates a new HoodieSavepointMetadata RecordBuilder by copying an existing HoodieSavepointMetadata instance */
  public static org.apache.hudi.avro.model.HoodieSavepointMetadata.Builder newBuilder(org.apache.hudi.avro.model.HoodieSavepointMetadata other) {
    return new org.apache.hudi.avro.model.HoodieSavepointMetadata.Builder(other);
  }
  
  /**
   * RecordBuilder for HoodieSavepointMetadata instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HoodieSavepointMetadata>
    implements org.apache.avro.data.RecordBuilder<HoodieSavepointMetadata> {

    private java.lang.String savepointedBy;
    private long savepointedAt;
    private java.lang.String comments;
    private java.util.Map<java.lang.String,org.apache.hudi.avro.model.HoodieSavepointPartitionMetadata> partitionMetadata;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.hudi.avro.model.HoodieSavepointMetadata.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.hudi.avro.model.HoodieSavepointMetadata.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.savepointedBy)) {
        this.savepointedBy = data().deepCopy(fields()[0].schema(), other.savepointedBy);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.savepointedAt)) {
        this.savepointedAt = data().deepCopy(fields()[1].schema(), other.savepointedAt);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.comments)) {
        this.comments = data().deepCopy(fields()[2].schema(), other.comments);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.partitionMetadata)) {
        this.partitionMetadata = data().deepCopy(fields()[3].schema(), other.partitionMetadata);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing HoodieSavepointMetadata instance */
    private Builder(org.apache.hudi.avro.model.HoodieSavepointMetadata other) {
            super(org.apache.hudi.avro.model.HoodieSavepointMetadata.SCHEMA$);
      if (isValidValue(fields()[0], other.savepointedBy)) {
        this.savepointedBy = data().deepCopy(fields()[0].schema(), other.savepointedBy);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.savepointedAt)) {
        this.savepointedAt = data().deepCopy(fields()[1].schema(), other.savepointedAt);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.comments)) {
        this.comments = data().deepCopy(fields()[2].schema(), other.comments);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.partitionMetadata)) {
        this.partitionMetadata = data().deepCopy(fields()[3].schema(), other.partitionMetadata);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'savepointedBy' field */
    public java.lang.String getSavepointedBy() {
      return savepointedBy;
    }
    
    /** Sets the value of the 'savepointedBy' field */
    public org.apache.hudi.avro.model.HoodieSavepointMetadata.Builder setSavepointedBy(java.lang.String value) {
      validate(fields()[0], value);
      this.savepointedBy = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'savepointedBy' field has been set */
    public boolean hasSavepointedBy() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'savepointedBy' field */
    public org.apache.hudi.avro.model.HoodieSavepointMetadata.Builder clearSavepointedBy() {
      savepointedBy = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'savepointedAt' field */
    public java.lang.Long getSavepointedAt() {
      return savepointedAt;
    }
    
    /** Sets the value of the 'savepointedAt' field */
    public org.apache.hudi.avro.model.HoodieSavepointMetadata.Builder setSavepointedAt(long value) {
      validate(fields()[1], value);
      this.savepointedAt = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'savepointedAt' field has been set */
    public boolean hasSavepointedAt() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'savepointedAt' field */
    public org.apache.hudi.avro.model.HoodieSavepointMetadata.Builder clearSavepointedAt() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'comments' field */
    public java.lang.String getComments() {
      return comments;
    }
    
    /** Sets the value of the 'comments' field */
    public org.apache.hudi.avro.model.HoodieSavepointMetadata.Builder setComments(java.lang.String value) {
      validate(fields()[2], value);
      this.comments = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'comments' field has been set */
    public boolean hasComments() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'comments' field */
    public org.apache.hudi.avro.model.HoodieSavepointMetadata.Builder clearComments() {
      comments = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'partitionMetadata' field */
    public java.util.Map<java.lang.String,org.apache.hudi.avro.model.HoodieSavepointPartitionMetadata> getPartitionMetadata() {
      return partitionMetadata;
    }
    
    /** Sets the value of the 'partitionMetadata' field */
    public org.apache.hudi.avro.model.HoodieSavepointMetadata.Builder setPartitionMetadata(java.util.Map<java.lang.String,org.apache.hudi.avro.model.HoodieSavepointPartitionMetadata> value) {
      validate(fields()[3], value);
      this.partitionMetadata = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'partitionMetadata' field has been set */
    public boolean hasPartitionMetadata() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'partitionMetadata' field */
    public org.apache.hudi.avro.model.HoodieSavepointMetadata.Builder clearPartitionMetadata() {
      partitionMetadata = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public HoodieSavepointMetadata build() {
      try {
        HoodieSavepointMetadata record = new HoodieSavepointMetadata();
        record.savepointedBy = fieldSetFlags()[0] ? this.savepointedBy : (java.lang.String) defaultValue(fields()[0]);
        record.savepointedAt = fieldSetFlags()[1] ? this.savepointedAt : (java.lang.Long) defaultValue(fields()[1]);
        record.comments = fieldSetFlags()[2] ? this.comments : (java.lang.String) defaultValue(fields()[2]);
        record.partitionMetadata = fieldSetFlags()[3] ? this.partitionMetadata : (java.util.Map<java.lang.String,org.apache.hudi.avro.model.HoodieSavepointPartitionMetadata>) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
