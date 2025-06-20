/**
 * Autogenerated by Thrift Compiler (0.20.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.starrocks.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.20.0)", date = "2025-06-16")
public class TReportLakeCompactionRequest implements org.apache.thrift.TBase<TReportLakeCompactionRequest, TReportLakeCompactionRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TReportLakeCompactionRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TReportLakeCompactionRequest");

  private static final org.apache.thrift.protocol.TField TXN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("txn_id", org.apache.thrift.protocol.TType.I64, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TReportLakeCompactionRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TReportLakeCompactionRequestTupleSchemeFactory();

  public long txn_id; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TXN_ID((short)1, "txn_id");

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
        case 1: // TXN_ID
          return TXN_ID;
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
  private static final int __TXN_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TXN_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TXN_ID, new org.apache.thrift.meta_data.FieldMetaData("txn_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TReportLakeCompactionRequest.class, metaDataMap);
  }

  public TReportLakeCompactionRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TReportLakeCompactionRequest(TReportLakeCompactionRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.txn_id = other.txn_id;
  }

  @Override
  public TReportLakeCompactionRequest deepCopy() {
    return new TReportLakeCompactionRequest(this);
  }

  @Override
  public void clear() {
    setTxn_idIsSet(false);
    this.txn_id = 0;
  }

  public long getTxn_id() {
    return this.txn_id;
  }

  public TReportLakeCompactionRequest setTxn_id(long txn_id) {
    this.txn_id = txn_id;
    setTxn_idIsSet(true);
    return this;
  }

  public void unsetTxn_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TXN_ID_ISSET_ID);
  }

  /** Returns true if field txn_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTxn_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TXN_ID_ISSET_ID);
  }

  public void setTxn_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TXN_ID_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TXN_ID:
      if (value == null) {
        unsetTxn_id();
      } else {
        setTxn_id((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TXN_ID:
      return getTxn_id();

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
    case TXN_ID:
      return isSetTxn_id();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TReportLakeCompactionRequest)
      return this.equals((TReportLakeCompactionRequest)that);
    return false;
  }

  public boolean equals(TReportLakeCompactionRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_txn_id = true && this.isSetTxn_id();
    boolean that_present_txn_id = true && that.isSetTxn_id();
    if (this_present_txn_id || that_present_txn_id) {
      if (!(this_present_txn_id && that_present_txn_id))
        return false;
      if (this.txn_id != that.txn_id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTxn_id()) ? 131071 : 524287);
    if (isSetTxn_id())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(txn_id);

    return hashCode;
  }

  @Override
  public int compareTo(TReportLakeCompactionRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTxn_id(), other.isSetTxn_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxn_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txn_id, other.txn_id);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TReportLakeCompactionRequest(");
    boolean first = true;

    if (isSetTxn_id()) {
      sb.append("txn_id:");
      sb.append(this.txn_id);
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

  private static class TReportLakeCompactionRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TReportLakeCompactionRequestStandardScheme getScheme() {
      return new TReportLakeCompactionRequestStandardScheme();
    }
  }

  private static class TReportLakeCompactionRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TReportLakeCompactionRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TReportLakeCompactionRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TXN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txn_id = iprot.readI64();
              struct.setTxn_idIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TReportLakeCompactionRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetTxn_id()) {
        oprot.writeFieldBegin(TXN_ID_FIELD_DESC);
        oprot.writeI64(struct.txn_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TReportLakeCompactionRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TReportLakeCompactionRequestTupleScheme getScheme() {
      return new TReportLakeCompactionRequestTupleScheme();
    }
  }

  private static class TReportLakeCompactionRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TReportLakeCompactionRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TReportLakeCompactionRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTxn_id()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetTxn_id()) {
        oprot.writeI64(struct.txn_id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TReportLakeCompactionRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.txn_id = iprot.readI64();
        struct.setTxn_idIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

