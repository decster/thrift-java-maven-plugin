/**
 * Autogenerated by Thrift Compiler (0.20.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.starrocks.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.20.0)", date = "2025-06-16")
public class TAdaptiveDopParam implements org.apache.thrift.TBase<TAdaptiveDopParam, TAdaptiveDopParam._Fields>, java.io.Serializable, Cloneable, Comparable<TAdaptiveDopParam> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAdaptiveDopParam");

  private static final org.apache.thrift.protocol.TField MAX_BLOCK_ROWS_PER_DRIVER_SEQ_FIELD_DESC = new org.apache.thrift.protocol.TField("max_block_rows_per_driver_seq", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField MAX_OUTPUT_AMPLIFICATION_FACTOR_FIELD_DESC = new org.apache.thrift.protocol.TField("max_output_amplification_factor", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TAdaptiveDopParamStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TAdaptiveDopParamTupleSchemeFactory();

  public long max_block_rows_per_driver_seq; // optional
  public long max_output_amplification_factor; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MAX_BLOCK_ROWS_PER_DRIVER_SEQ((short)1, "max_block_rows_per_driver_seq"),
    MAX_OUTPUT_AMPLIFICATION_FACTOR((short)2, "max_output_amplification_factor");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MAX_BLOCK_ROWS_PER_DRIVER_SEQ
          return MAX_BLOCK_ROWS_PER_DRIVER_SEQ;
        case 2: // MAX_OUTPUT_AMPLIFICATION_FACTOR
          return MAX_OUTPUT_AMPLIFICATION_FACTOR;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __MAX_BLOCK_ROWS_PER_DRIVER_SEQ_ISSET_ID = 0;
  private static final int __MAX_OUTPUT_AMPLIFICATION_FACTOR_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.MAX_BLOCK_ROWS_PER_DRIVER_SEQ,_Fields.MAX_OUTPUT_AMPLIFICATION_FACTOR};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MAX_BLOCK_ROWS_PER_DRIVER_SEQ, new org.apache.thrift.meta_data.FieldMetaData("max_block_rows_per_driver_seq", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MAX_OUTPUT_AMPLIFICATION_FACTOR, new org.apache.thrift.meta_data.FieldMetaData("max_output_amplification_factor", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAdaptiveDopParam.class, metaDataMap);
  }

  public TAdaptiveDopParam() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAdaptiveDopParam(TAdaptiveDopParam other) {
    __isset_bitfield = other.__isset_bitfield;
    this.max_block_rows_per_driver_seq = other.max_block_rows_per_driver_seq;
    this.max_output_amplification_factor = other.max_output_amplification_factor;
  }

  @Override
  public TAdaptiveDopParam deepCopy() {
    return new TAdaptiveDopParam(this);
  }

  @Override
  public void clear() {
    setMax_block_rows_per_driver_seqIsSet(false);
    this.max_block_rows_per_driver_seq = 0;
    setMax_output_amplification_factorIsSet(false);
    this.max_output_amplification_factor = 0;
  }

  public long getMax_block_rows_per_driver_seq() {
    return this.max_block_rows_per_driver_seq;
  }

  public TAdaptiveDopParam setMax_block_rows_per_driver_seq(long max_block_rows_per_driver_seq) {
    this.max_block_rows_per_driver_seq = max_block_rows_per_driver_seq;
    setMax_block_rows_per_driver_seqIsSet(true);
    return this;
  }

  public void unsetMax_block_rows_per_driver_seq() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MAX_BLOCK_ROWS_PER_DRIVER_SEQ_ISSET_ID);
  }

  /** Returns true if field max_block_rows_per_driver_seq is set (has been assigned a value) and false otherwise */
  public boolean isSetMax_block_rows_per_driver_seq() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MAX_BLOCK_ROWS_PER_DRIVER_SEQ_ISSET_ID);
  }

  public void setMax_block_rows_per_driver_seqIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MAX_BLOCK_ROWS_PER_DRIVER_SEQ_ISSET_ID, value);
  }

  public long getMax_output_amplification_factor() {
    return this.max_output_amplification_factor;
  }

  public TAdaptiveDopParam setMax_output_amplification_factor(long max_output_amplification_factor) {
    this.max_output_amplification_factor = max_output_amplification_factor;
    setMax_output_amplification_factorIsSet(true);
    return this;
  }

  public void unsetMax_output_amplification_factor() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MAX_OUTPUT_AMPLIFICATION_FACTOR_ISSET_ID);
  }

  /** Returns true if field max_output_amplification_factor is set (has been assigned a value) and false otherwise */
  public boolean isSetMax_output_amplification_factor() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MAX_OUTPUT_AMPLIFICATION_FACTOR_ISSET_ID);
  }

  public void setMax_output_amplification_factorIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MAX_OUTPUT_AMPLIFICATION_FACTOR_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case MAX_BLOCK_ROWS_PER_DRIVER_SEQ:
      if (value == null) {
        unsetMax_block_rows_per_driver_seq();
      } else {
        setMax_block_rows_per_driver_seq((java.lang.Long)value);
      }
      break;

    case MAX_OUTPUT_AMPLIFICATION_FACTOR:
      if (value == null) {
        unsetMax_output_amplification_factor();
      } else {
        setMax_output_amplification_factor((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MAX_BLOCK_ROWS_PER_DRIVER_SEQ:
      return getMax_block_rows_per_driver_seq();

    case MAX_OUTPUT_AMPLIFICATION_FACTOR:
      return getMax_output_amplification_factor();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case MAX_BLOCK_ROWS_PER_DRIVER_SEQ:
      return isSetMax_block_rows_per_driver_seq();
    case MAX_OUTPUT_AMPLIFICATION_FACTOR:
      return isSetMax_output_amplification_factor();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TAdaptiveDopParam)
      return this.equals((TAdaptiveDopParam)that);
    return false;
  }

  public boolean equals(TAdaptiveDopParam that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_max_block_rows_per_driver_seq = true && this.isSetMax_block_rows_per_driver_seq();
    boolean that_present_max_block_rows_per_driver_seq = true && that.isSetMax_block_rows_per_driver_seq();
    if (this_present_max_block_rows_per_driver_seq || that_present_max_block_rows_per_driver_seq) {
      if (!(this_present_max_block_rows_per_driver_seq && that_present_max_block_rows_per_driver_seq))
        return false;
      if (this.max_block_rows_per_driver_seq != that.max_block_rows_per_driver_seq)
        return false;
    }

    boolean this_present_max_output_amplification_factor = true && this.isSetMax_output_amplification_factor();
    boolean that_present_max_output_amplification_factor = true && that.isSetMax_output_amplification_factor();
    if (this_present_max_output_amplification_factor || that_present_max_output_amplification_factor) {
      if (!(this_present_max_output_amplification_factor && that_present_max_output_amplification_factor))
        return false;
      if (this.max_output_amplification_factor != that.max_output_amplification_factor)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMax_block_rows_per_driver_seq()) ? 131071 : 524287);
    if (isSetMax_block_rows_per_driver_seq())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(max_block_rows_per_driver_seq);

    hashCode = hashCode * 8191 + ((isSetMax_output_amplification_factor()) ? 131071 : 524287);
    if (isSetMax_output_amplification_factor())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(max_output_amplification_factor);

    return hashCode;
  }

  @Override
  public int compareTo(TAdaptiveDopParam other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetMax_block_rows_per_driver_seq(), other.isSetMax_block_rows_per_driver_seq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMax_block_rows_per_driver_seq()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.max_block_rows_per_driver_seq, other.max_block_rows_per_driver_seq);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMax_output_amplification_factor(), other.isSetMax_output_amplification_factor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMax_output_amplification_factor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.max_output_amplification_factor, other.max_output_amplification_factor);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TAdaptiveDopParam(");
    boolean first = true;

    if (isSetMax_block_rows_per_driver_seq()) {
      sb.append("max_block_rows_per_driver_seq:");
      sb.append(this.max_block_rows_per_driver_seq);
      first = false;
    }
    if (isSetMax_output_amplification_factor()) {
      if (!first) sb.append(", ");
      sb.append("max_output_amplification_factor:");
      sb.append(this.max_output_amplification_factor);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TAdaptiveDopParamStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TAdaptiveDopParamStandardScheme getScheme() {
      return new TAdaptiveDopParamStandardScheme();
    }
  }

  private static class TAdaptiveDopParamStandardScheme extends org.apache.thrift.scheme.StandardScheme<TAdaptiveDopParam> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TAdaptiveDopParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MAX_BLOCK_ROWS_PER_DRIVER_SEQ
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.max_block_rows_per_driver_seq = iprot.readI64();
              struct.setMax_block_rows_per_driver_seqIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MAX_OUTPUT_AMPLIFICATION_FACTOR
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.max_output_amplification_factor = iprot.readI64();
              struct.setMax_output_amplification_factorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TAdaptiveDopParam struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetMax_block_rows_per_driver_seq()) {
        oprot.writeFieldBegin(MAX_BLOCK_ROWS_PER_DRIVER_SEQ_FIELD_DESC);
        oprot.writeI64(struct.max_block_rows_per_driver_seq);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMax_output_amplification_factor()) {
        oprot.writeFieldBegin(MAX_OUTPUT_AMPLIFICATION_FACTOR_FIELD_DESC);
        oprot.writeI64(struct.max_output_amplification_factor);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAdaptiveDopParamTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TAdaptiveDopParamTupleScheme getScheme() {
      return new TAdaptiveDopParamTupleScheme();
    }
  }

  private static class TAdaptiveDopParamTupleScheme extends org.apache.thrift.scheme.TupleScheme<TAdaptiveDopParam> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAdaptiveDopParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMax_block_rows_per_driver_seq()) {
        optionals.set(0);
      }
      if (struct.isSetMax_output_amplification_factor()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMax_block_rows_per_driver_seq()) {
        oprot.writeI64(struct.max_block_rows_per_driver_seq);
      }
      if (struct.isSetMax_output_amplification_factor()) {
        oprot.writeI64(struct.max_output_amplification_factor);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAdaptiveDopParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.max_block_rows_per_driver_seq = iprot.readI64();
        struct.setMax_block_rows_per_driver_seqIsSet(true);
      }
      if (incoming.get(1)) {
        struct.max_output_amplification_factor = iprot.readI64();
        struct.setMax_output_amplification_factorIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

