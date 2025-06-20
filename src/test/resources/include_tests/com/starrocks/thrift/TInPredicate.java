/**
 * Autogenerated by Thrift Compiler (0.20.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.starrocks.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.20.0)", date = "2025-06-16")
public class TInPredicate implements org.apache.thrift.TBase<TInPredicate, TInPredicate._Fields>, java.io.Serializable, Cloneable, Comparable<TInPredicate> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TInPredicate");

  private static final org.apache.thrift.protocol.TField IS_NOT_IN_FIELD_DESC = new org.apache.thrift.protocol.TField("is_not_in", org.apache.thrift.protocol.TType.BOOL, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TInPredicateStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TInPredicateTupleSchemeFactory();

  public boolean is_not_in; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IS_NOT_IN((short)1, "is_not_in");

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
        case 1: // IS_NOT_IN
          return IS_NOT_IN;
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
  private static final int __IS_NOT_IN_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_NOT_IN, new org.apache.thrift.meta_data.FieldMetaData("is_not_in", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TInPredicate.class, metaDataMap);
  }

  public TInPredicate() {
  }

  public TInPredicate(
    boolean is_not_in)
  {
    this();
    this.is_not_in = is_not_in;
    setIs_not_inIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TInPredicate(TInPredicate other) {
    __isset_bitfield = other.__isset_bitfield;
    this.is_not_in = other.is_not_in;
  }

  @Override
  public TInPredicate deepCopy() {
    return new TInPredicate(this);
  }

  @Override
  public void clear() {
    setIs_not_inIsSet(false);
    this.is_not_in = false;
  }

  public boolean isIs_not_in() {
    return this.is_not_in;
  }

  public TInPredicate setIs_not_in(boolean is_not_in) {
    this.is_not_in = is_not_in;
    setIs_not_inIsSet(true);
    return this;
  }

  public void unsetIs_not_in() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IS_NOT_IN_ISSET_ID);
  }

  /** Returns true if field is_not_in is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_not_in() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IS_NOT_IN_ISSET_ID);
  }

  public void setIs_not_inIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IS_NOT_IN_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case IS_NOT_IN:
      if (value == null) {
        unsetIs_not_in();
      } else {
        setIs_not_in((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_NOT_IN:
      return isIs_not_in();

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
    case IS_NOT_IN:
      return isSetIs_not_in();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TInPredicate)
      return this.equals((TInPredicate)that);
    return false;
  }

  public boolean equals(TInPredicate that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_is_not_in = true;
    boolean that_present_is_not_in = true;
    if (this_present_is_not_in || that_present_is_not_in) {
      if (!(this_present_is_not_in && that_present_is_not_in))
        return false;
      if (this.is_not_in != that.is_not_in)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_not_in) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TInPredicate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetIs_not_in(), other.isSetIs_not_in());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_not_in()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_not_in, other.is_not_in);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TInPredicate(");
    boolean first = true;

    sb.append("is_not_in:");
    sb.append(this.is_not_in);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'is_not_in' because it's a primitive and you chose the non-beans generator.
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

  private static class TInPredicateStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TInPredicateStandardScheme getScheme() {
      return new TInPredicateStandardScheme();
    }
  }

  private static class TInPredicateStandardScheme extends org.apache.thrift.scheme.StandardScheme<TInPredicate> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TInPredicate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IS_NOT_IN
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_not_in = iprot.readBool();
              struct.setIs_not_inIsSet(true);
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
      if (!struct.isSetIs_not_in()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_not_in' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TInPredicate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IS_NOT_IN_FIELD_DESC);
      oprot.writeBool(struct.is_not_in);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TInPredicateTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TInPredicateTupleScheme getScheme() {
      return new TInPredicateTupleScheme();
    }
  }

  private static class TInPredicateTupleScheme extends org.apache.thrift.scheme.TupleScheme<TInPredicate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TInPredicate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeBool(struct.is_not_in);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TInPredicate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.is_not_in = iprot.readBool();
      struct.setIs_not_inIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

