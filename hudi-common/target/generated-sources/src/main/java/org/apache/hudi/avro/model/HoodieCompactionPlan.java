/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hudi.avro.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class HoodieCompactionPlan extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HoodieCompactionPlan\",\"namespace\":\"org.apache.hudi.avro.model\",\"fields\":[{\"name\":\"operations\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"HoodieCompactionOperation\",\"fields\":[{\"name\":\"baseInstantTime\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"deltaFilePaths\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"dataFilePath\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"fileId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"partitionPath\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"metrics\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"double\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null},{\"name\":\"extraMetadata\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<org.apache.hudi.avro.model.HoodieCompactionOperation> operations;
  @Deprecated public java.util.Map<java.lang.String,java.lang.String> extraMetadata;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public HoodieCompactionPlan() {}

  /**
   * All-args constructor.
   */
  public HoodieCompactionPlan(java.util.List<org.apache.hudi.avro.model.HoodieCompactionOperation> operations, java.util.Map<java.lang.String,java.lang.String> extraMetadata) {
    this.operations = operations;
    this.extraMetadata = extraMetadata;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return operations;
    case 1: return extraMetadata;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: operations = (java.util.List<org.apache.hudi.avro.model.HoodieCompactionOperation>)value$; break;
    case 1: extraMetadata = (java.util.Map<java.lang.String,java.lang.String>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'operations' field.
   */
  public java.util.List<org.apache.hudi.avro.model.HoodieCompactionOperation> getOperations() {
    return operations;
  }

  /**
   * Sets the value of the 'operations' field.
   * @param value the value to set.
   */
  public void setOperations(java.util.List<org.apache.hudi.avro.model.HoodieCompactionOperation> value) {
    this.operations = value;
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

  /** Creates a new HoodieCompactionPlan RecordBuilder */
  public static org.apache.hudi.avro.model.HoodieCompactionPlan.Builder newBuilder() {
    return new org.apache.hudi.avro.model.HoodieCompactionPlan.Builder();
  }
  
  /** Creates a new HoodieCompactionPlan RecordBuilder by copying an existing Builder */
  public static org.apache.hudi.avro.model.HoodieCompactionPlan.Builder newBuilder(org.apache.hudi.avro.model.HoodieCompactionPlan.Builder other) {
    return new org.apache.hudi.avro.model.HoodieCompactionPlan.Builder(other);
  }
  
  /** Creates a new HoodieCompactionPlan RecordBuilder by copying an existing HoodieCompactionPlan instance */
  public static org.apache.hudi.avro.model.HoodieCompactionPlan.Builder newBuilder(org.apache.hudi.avro.model.HoodieCompactionPlan other) {
    return new org.apache.hudi.avro.model.HoodieCompactionPlan.Builder(other);
  }
  
  /**
   * RecordBuilder for HoodieCompactionPlan instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HoodieCompactionPlan>
    implements org.apache.avro.data.RecordBuilder<HoodieCompactionPlan> {

    private java.util.List<org.apache.hudi.avro.model.HoodieCompactionOperation> operations;
    private java.util.Map<java.lang.String,java.lang.String> extraMetadata;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.hudi.avro.model.HoodieCompactionPlan.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.hudi.avro.model.HoodieCompactionPlan.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.operations)) {
        this.operations = data().deepCopy(fields()[0].schema(), other.operations);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.extraMetadata)) {
        this.extraMetadata = data().deepCopy(fields()[1].schema(), other.extraMetadata);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing HoodieCompactionPlan instance */
    private Builder(org.apache.hudi.avro.model.HoodieCompactionPlan other) {
            super(org.apache.hudi.avro.model.HoodieCompactionPlan.SCHEMA$);
      if (isValidValue(fields()[0], other.operations)) {
        this.operations = data().deepCopy(fields()[0].schema(), other.operations);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.extraMetadata)) {
        this.extraMetadata = data().deepCopy(fields()[1].schema(), other.extraMetadata);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'operations' field */
    public java.util.List<org.apache.hudi.avro.model.HoodieCompactionOperation> getOperations() {
      return operations;
    }
    
    /** Sets the value of the 'operations' field */
    public org.apache.hudi.avro.model.HoodieCompactionPlan.Builder setOperations(java.util.List<org.apache.hudi.avro.model.HoodieCompactionOperation> value) {
      validate(fields()[0], value);
      this.operations = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'operations' field has been set */
    public boolean hasOperations() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'operations' field */
    public org.apache.hudi.avro.model.HoodieCompactionPlan.Builder clearOperations() {
      operations = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'extraMetadata' field */
    public java.util.Map<java.lang.String,java.lang.String> getExtraMetadata() {
      return extraMetadata;
    }
    
    /** Sets the value of the 'extraMetadata' field */
    public org.apache.hudi.avro.model.HoodieCompactionPlan.Builder setExtraMetadata(java.util.Map<java.lang.String,java.lang.String> value) {
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
    public org.apache.hudi.avro.model.HoodieCompactionPlan.Builder clearExtraMetadata() {
      extraMetadata = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public HoodieCompactionPlan build() {
      try {
        HoodieCompactionPlan record = new HoodieCompactionPlan();
        record.operations = fieldSetFlags()[0] ? this.operations : (java.util.List<org.apache.hudi.avro.model.HoodieCompactionOperation>) defaultValue(fields()[0]);
        record.extraMetadata = fieldSetFlags()[1] ? this.extraMetadata : (java.util.Map<java.lang.String,java.lang.String>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
