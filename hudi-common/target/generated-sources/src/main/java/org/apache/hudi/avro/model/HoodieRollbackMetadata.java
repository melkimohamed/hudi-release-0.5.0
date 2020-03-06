/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hudi.avro.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class HoodieRollbackMetadata extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HoodieRollbackMetadata\",\"namespace\":\"org.apache.hudi.avro.model\",\"fields\":[{\"name\":\"startRollbackTime\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"timeTakenInMillis\",\"type\":\"long\"},{\"name\":\"totalFilesDeleted\",\"type\":\"int\"},{\"name\":\"commitsRollback\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"partitionMetadata\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"HoodieRollbackPartitionMetadata\",\"fields\":[{\"name\":\"partitionPath\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"successDeleteFiles\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"failedDeleteFiles\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}]},\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String startRollbackTime;
  @Deprecated public long timeTakenInMillis;
  @Deprecated public int totalFilesDeleted;
  @Deprecated public java.util.List<java.lang.String> commitsRollback;
  @Deprecated public java.util.Map<java.lang.String,org.apache.hudi.avro.model.HoodieRollbackPartitionMetadata> partitionMetadata;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public HoodieRollbackMetadata() {}

  /**
   * All-args constructor.
   */
  public HoodieRollbackMetadata(java.lang.String startRollbackTime, java.lang.Long timeTakenInMillis, java.lang.Integer totalFilesDeleted, java.util.List<java.lang.String> commitsRollback, java.util.Map<java.lang.String,org.apache.hudi.avro.model.HoodieRollbackPartitionMetadata> partitionMetadata) {
    this.startRollbackTime = startRollbackTime;
    this.timeTakenInMillis = timeTakenInMillis;
    this.totalFilesDeleted = totalFilesDeleted;
    this.commitsRollback = commitsRollback;
    this.partitionMetadata = partitionMetadata;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return startRollbackTime;
    case 1: return timeTakenInMillis;
    case 2: return totalFilesDeleted;
    case 3: return commitsRollback;
    case 4: return partitionMetadata;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: startRollbackTime = (java.lang.String)value$; break;
    case 1: timeTakenInMillis = (java.lang.Long)value$; break;
    case 2: totalFilesDeleted = (java.lang.Integer)value$; break;
    case 3: commitsRollback = (java.util.List<java.lang.String>)value$; break;
    case 4: partitionMetadata = (java.util.Map<java.lang.String,org.apache.hudi.avro.model.HoodieRollbackPartitionMetadata>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'startRollbackTime' field.
   */
  public java.lang.String getStartRollbackTime() {
    return startRollbackTime;
  }

  /**
   * Sets the value of the 'startRollbackTime' field.
   * @param value the value to set.
   */
  public void setStartRollbackTime(java.lang.String value) {
    this.startRollbackTime = value;
  }

  /**
   * Gets the value of the 'timeTakenInMillis' field.
   */
  public java.lang.Long getTimeTakenInMillis() {
    return timeTakenInMillis;
  }

  /**
   * Sets the value of the 'timeTakenInMillis' field.
   * @param value the value to set.
   */
  public void setTimeTakenInMillis(java.lang.Long value) {
    this.timeTakenInMillis = value;
  }

  /**
   * Gets the value of the 'totalFilesDeleted' field.
   */
  public java.lang.Integer getTotalFilesDeleted() {
    return totalFilesDeleted;
  }

  /**
   * Sets the value of the 'totalFilesDeleted' field.
   * @param value the value to set.
   */
  public void setTotalFilesDeleted(java.lang.Integer value) {
    this.totalFilesDeleted = value;
  }

  /**
   * Gets the value of the 'commitsRollback' field.
   */
  public java.util.List<java.lang.String> getCommitsRollback() {
    return commitsRollback;
  }

  /**
   * Sets the value of the 'commitsRollback' field.
   * @param value the value to set.
   */
  public void setCommitsRollback(java.util.List<java.lang.String> value) {
    this.commitsRollback = value;
  }

  /**
   * Gets the value of the 'partitionMetadata' field.
   */
  public java.util.Map<java.lang.String,org.apache.hudi.avro.model.HoodieRollbackPartitionMetadata> getPartitionMetadata() {
    return partitionMetadata;
  }

  /**
   * Sets the value of the 'partitionMetadata' field.
   * @param value the value to set.
   */
  public void setPartitionMetadata(java.util.Map<java.lang.String,org.apache.hudi.avro.model.HoodieRollbackPartitionMetadata> value) {
    this.partitionMetadata = value;
  }

  /** Creates a new HoodieRollbackMetadata RecordBuilder */
  public static org.apache.hudi.avro.model.HoodieRollbackMetadata.Builder newBuilder() {
    return new org.apache.hudi.avro.model.HoodieRollbackMetadata.Builder();
  }
  
  /** Creates a new HoodieRollbackMetadata RecordBuilder by copying an existing Builder */
  public static org.apache.hudi.avro.model.HoodieRollbackMetadata.Builder newBuilder(org.apache.hudi.avro.model.HoodieRollbackMetadata.Builder other) {
    return new org.apache.hudi.avro.model.HoodieRollbackMetadata.Builder(other);
  }
  
  /** Creates a new HoodieRollbackMetadata RecordBuilder by copying an existing HoodieRollbackMetadata instance */
  public static org.apache.hudi.avro.model.HoodieRollbackMetadata.Builder newBuilder(org.apache.hudi.avro.model.HoodieRollbackMetadata other) {
    return new org.apache.hudi.avro.model.HoodieRollbackMetadata.Builder(other);
  }
  
  /**
   * RecordBuilder for HoodieRollbackMetadata instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HoodieRollbackMetadata>
    implements org.apache.avro.data.RecordBuilder<HoodieRollbackMetadata> {

    private java.lang.String startRollbackTime;
    private long timeTakenInMillis;
    private int totalFilesDeleted;
    private java.util.List<java.lang.String> commitsRollback;
    private java.util.Map<java.lang.String,org.apache.hudi.avro.model.HoodieRollbackPartitionMetadata> partitionMetadata;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.hudi.avro.model.HoodieRollbackMetadata.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.hudi.avro.model.HoodieRollbackMetadata.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.startRollbackTime)) {
        this.startRollbackTime = data().deepCopy(fields()[0].schema(), other.startRollbackTime);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timeTakenInMillis)) {
        this.timeTakenInMillis = data().deepCopy(fields()[1].schema(), other.timeTakenInMillis);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.totalFilesDeleted)) {
        this.totalFilesDeleted = data().deepCopy(fields()[2].schema(), other.totalFilesDeleted);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.commitsRollback)) {
        this.commitsRollback = data().deepCopy(fields()[3].schema(), other.commitsRollback);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.partitionMetadata)) {
        this.partitionMetadata = data().deepCopy(fields()[4].schema(), other.partitionMetadata);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing HoodieRollbackMetadata instance */
    private Builder(org.apache.hudi.avro.model.HoodieRollbackMetadata other) {
            super(org.apache.hudi.avro.model.HoodieRollbackMetadata.SCHEMA$);
      if (isValidValue(fields()[0], other.startRollbackTime)) {
        this.startRollbackTime = data().deepCopy(fields()[0].schema(), other.startRollbackTime);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timeTakenInMillis)) {
        this.timeTakenInMillis = data().deepCopy(fields()[1].schema(), other.timeTakenInMillis);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.totalFilesDeleted)) {
        this.totalFilesDeleted = data().deepCopy(fields()[2].schema(), other.totalFilesDeleted);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.commitsRollback)) {
        this.commitsRollback = data().deepCopy(fields()[3].schema(), other.commitsRollback);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.partitionMetadata)) {
        this.partitionMetadata = data().deepCopy(fields()[4].schema(), other.partitionMetadata);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'startRollbackTime' field */
    public java.lang.String getStartRollbackTime() {
      return startRollbackTime;
    }
    
    /** Sets the value of the 'startRollbackTime' field */
    public org.apache.hudi.avro.model.HoodieRollbackMetadata.Builder setStartRollbackTime(java.lang.String value) {
      validate(fields()[0], value);
      this.startRollbackTime = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'startRollbackTime' field has been set */
    public boolean hasStartRollbackTime() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'startRollbackTime' field */
    public org.apache.hudi.avro.model.HoodieRollbackMetadata.Builder clearStartRollbackTime() {
      startRollbackTime = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'timeTakenInMillis' field */
    public java.lang.Long getTimeTakenInMillis() {
      return timeTakenInMillis;
    }
    
    /** Sets the value of the 'timeTakenInMillis' field */
    public org.apache.hudi.avro.model.HoodieRollbackMetadata.Builder setTimeTakenInMillis(long value) {
      validate(fields()[1], value);
      this.timeTakenInMillis = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'timeTakenInMillis' field has been set */
    public boolean hasTimeTakenInMillis() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'timeTakenInMillis' field */
    public org.apache.hudi.avro.model.HoodieRollbackMetadata.Builder clearTimeTakenInMillis() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'totalFilesDeleted' field */
    public java.lang.Integer getTotalFilesDeleted() {
      return totalFilesDeleted;
    }
    
    /** Sets the value of the 'totalFilesDeleted' field */
    public org.apache.hudi.avro.model.HoodieRollbackMetadata.Builder setTotalFilesDeleted(int value) {
      validate(fields()[2], value);
      this.totalFilesDeleted = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'totalFilesDeleted' field has been set */
    public boolean hasTotalFilesDeleted() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'totalFilesDeleted' field */
    public org.apache.hudi.avro.model.HoodieRollbackMetadata.Builder clearTotalFilesDeleted() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'commitsRollback' field */
    public java.util.List<java.lang.String> getCommitsRollback() {
      return commitsRollback;
    }
    
    /** Sets the value of the 'commitsRollback' field */
    public org.apache.hudi.avro.model.HoodieRollbackMetadata.Builder setCommitsRollback(java.util.List<java.lang.String> value) {
      validate(fields()[3], value);
      this.commitsRollback = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'commitsRollback' field has been set */
    public boolean hasCommitsRollback() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'commitsRollback' field */
    public org.apache.hudi.avro.model.HoodieRollbackMetadata.Builder clearCommitsRollback() {
      commitsRollback = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'partitionMetadata' field */
    public java.util.Map<java.lang.String,org.apache.hudi.avro.model.HoodieRollbackPartitionMetadata> getPartitionMetadata() {
      return partitionMetadata;
    }
    
    /** Sets the value of the 'partitionMetadata' field */
    public org.apache.hudi.avro.model.HoodieRollbackMetadata.Builder setPartitionMetadata(java.util.Map<java.lang.String,org.apache.hudi.avro.model.HoodieRollbackPartitionMetadata> value) {
      validate(fields()[4], value);
      this.partitionMetadata = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'partitionMetadata' field has been set */
    public boolean hasPartitionMetadata() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'partitionMetadata' field */
    public org.apache.hudi.avro.model.HoodieRollbackMetadata.Builder clearPartitionMetadata() {
      partitionMetadata = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public HoodieRollbackMetadata build() {
      try {
        HoodieRollbackMetadata record = new HoodieRollbackMetadata();
        record.startRollbackTime = fieldSetFlags()[0] ? this.startRollbackTime : (java.lang.String) defaultValue(fields()[0]);
        record.timeTakenInMillis = fieldSetFlags()[1] ? this.timeTakenInMillis : (java.lang.Long) defaultValue(fields()[1]);
        record.totalFilesDeleted = fieldSetFlags()[2] ? this.totalFilesDeleted : (java.lang.Integer) defaultValue(fields()[2]);
        record.commitsRollback = fieldSetFlags()[3] ? this.commitsRollback : (java.util.List<java.lang.String>) defaultValue(fields()[3]);
        record.partitionMetadata = fieldSetFlags()[4] ? this.partitionMetadata : (java.util.Map<java.lang.String,org.apache.hudi.avro.model.HoodieRollbackPartitionMetadata>) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}