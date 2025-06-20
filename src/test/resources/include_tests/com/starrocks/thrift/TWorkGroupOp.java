/**
 * Autogenerated by Thrift Compiler (0.20.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.starrocks.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.20.0)", date = "2025-06-16")
public class TWorkGroupOp implements org.apache.thrift.TBase<TWorkGroupOp, TWorkGroupOp._Fields>, java.io.Serializable, Cloneable, Comparable<TWorkGroupOp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TWorkGroupOp");

  private static final org.apache.thrift.protocol.TField WORKGROUP_FIELD_DESC = new org.apache.thrift.protocol.TField("workgroup", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField OP_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("op_type", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TWorkGroupOpStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TWorkGroupOpTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable TWorkGroup workgroup; // required
  /**
   * 
   * @see TWorkGroupOpType
   */
  public @org.apache.thrift.annotation.Nullable TWorkGroupOpType op_type; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    WORKGROUP((short)1, "workgroup"),
    /**
     * 
     * @see TWorkGroupOpType
     */
    OP_TYPE((short)2, "op_type");

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
        case 1: // WORKGROUP
          return WORKGROUP;
        case 2: // OP_TYPE
          return OP_TYPE;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WORKGROUP, new org.apache.thrift.meta_data.FieldMetaData("workgroup", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TWorkGroup.class)));
    tmpMap.put(_Fields.OP_TYPE, new org.apache.thrift.meta_data.FieldMetaData("op_type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TWorkGroupOpType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TWorkGroupOp.class, metaDataMap);
  }

  public TWorkGroupOp() {
  }

  public TWorkGroupOp(
    TWorkGroup workgroup,
    TWorkGroupOpType op_type)
  {
    this();
    this.workgroup = workgroup;
    this.op_type = op_type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TWorkGroupOp(TWorkGroupOp other) {
    if (other.isSetWorkgroup()) {
      this.workgroup = new TWorkGroup(other.workgroup);
    }
    if (other.isSetOp_type()) {
      this.op_type = other.op_type;
    }
  }

  @Override
  public TWorkGroupOp deepCopy() {
    return new TWorkGroupOp(this);
  }

  @Override
  public void clear() {
    this.workgroup = null;
    this.op_type = null;
  }

  @org.apache.thrift.annotation.Nullable
  public TWorkGroup getWorkgroup() {
    return this.workgroup;
  }

  public TWorkGroupOp setWorkgroup(@org.apache.thrift.annotation.Nullable TWorkGroup workgroup) {
    this.workgroup = workgroup;
    return this;
  }

  public void unsetWorkgroup() {
    this.workgroup = null;
  }

  /** Returns true if field workgroup is set (has been assigned a value) and false otherwise */
  public boolean isSetWorkgroup() {
    return this.workgroup != null;
  }

  public void setWorkgroupIsSet(boolean value) {
    if (!value) {
      this.workgroup = null;
    }
  }

  /**
   * 
   * @see TWorkGroupOpType
   */
  @org.apache.thrift.annotation.Nullable
  public TWorkGroupOpType getOp_type() {
    return this.op_type;
  }

  /**
   * 
   * @see TWorkGroupOpType
   */
  public TWorkGroupOp setOp_type(@org.apache.thrift.annotation.Nullable TWorkGroupOpType op_type) {
    this.op_type = op_type;
    return this;
  }

  public void unsetOp_type() {
    this.op_type = null;
  }

  /** Returns true if field op_type is set (has been assigned a value) and false otherwise */
  public boolean isSetOp_type() {
    return this.op_type != null;
  }

  public void setOp_typeIsSet(boolean value) {
    if (!value) {
      this.op_type = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case WORKGROUP:
      if (value == null) {
        unsetWorkgroup();
      } else {
        setWorkgroup((TWorkGroup)value);
      }
      break;

    case OP_TYPE:
      if (value == null) {
        unsetOp_type();
      } else {
        setOp_type((TWorkGroupOpType)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case WORKGROUP:
      return getWorkgroup();

    case OP_TYPE:
      return getOp_type();

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
    case WORKGROUP:
      return isSetWorkgroup();
    case OP_TYPE:
      return isSetOp_type();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TWorkGroupOp)
      return this.equals((TWorkGroupOp)that);
    return false;
  }

  public boolean equals(TWorkGroupOp that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_workgroup = true && this.isSetWorkgroup();
    boolean that_present_workgroup = true && that.isSetWorkgroup();
    if (this_present_workgroup || that_present_workgroup) {
      if (!(this_present_workgroup && that_present_workgroup))
        return false;
      if (!this.workgroup.equals(that.workgroup))
        return false;
    }

    boolean this_present_op_type = true && this.isSetOp_type();
    boolean that_present_op_type = true && that.isSetOp_type();
    if (this_present_op_type || that_present_op_type) {
      if (!(this_present_op_type && that_present_op_type))
        return false;
      if (!this.op_type.equals(that.op_type))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetWorkgroup()) ? 131071 : 524287);
    if (isSetWorkgroup())
      hashCode = hashCode * 8191 + workgroup.hashCode();

    hashCode = hashCode * 8191 + ((isSetOp_type()) ? 131071 : 524287);
    if (isSetOp_type())
      hashCode = hashCode * 8191 + op_type.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TWorkGroupOp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetWorkgroup(), other.isSetWorkgroup());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWorkgroup()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.workgroup, other.workgroup);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetOp_type(), other.isSetOp_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOp_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.op_type, other.op_type);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TWorkGroupOp(");
    boolean first = true;

    sb.append("workgroup:");
    if (this.workgroup == null) {
      sb.append("null");
    } else {
      sb.append(this.workgroup);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("op_type:");
    if (this.op_type == null) {
      sb.append("null");
    } else {
      sb.append(this.op_type);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (workgroup != null) {
      workgroup.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TWorkGroupOpStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TWorkGroupOpStandardScheme getScheme() {
      return new TWorkGroupOpStandardScheme();
    }
  }

  private static class TWorkGroupOpStandardScheme extends org.apache.thrift.scheme.StandardScheme<TWorkGroupOp> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TWorkGroupOp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WORKGROUP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.workgroup = new TWorkGroup();
              struct.workgroup.read(iprot);
              struct.setWorkgroupIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OP_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.op_type = com.starrocks.thrift.TWorkGroupOpType.findByValue(iprot.readI32());
              struct.setOp_typeIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TWorkGroupOp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.workgroup != null) {
        oprot.writeFieldBegin(WORKGROUP_FIELD_DESC);
        struct.workgroup.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.op_type != null) {
        oprot.writeFieldBegin(OP_TYPE_FIELD_DESC);
        oprot.writeI32(struct.op_type.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TWorkGroupOpTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TWorkGroupOpTupleScheme getScheme() {
      return new TWorkGroupOpTupleScheme();
    }
  }

  private static class TWorkGroupOpTupleScheme extends org.apache.thrift.scheme.TupleScheme<TWorkGroupOp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TWorkGroupOp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetWorkgroup()) {
        optionals.set(0);
      }
      if (struct.isSetOp_type()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetWorkgroup()) {
        struct.workgroup.write(oprot);
      }
      if (struct.isSetOp_type()) {
        oprot.writeI32(struct.op_type.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TWorkGroupOp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.workgroup = new TWorkGroup();
        struct.workgroup.read(iprot);
        struct.setWorkgroupIsSet(true);
      }
      if (incoming.get(1)) {
        struct.op_type = com.starrocks.thrift.TWorkGroupOpType.findByValue(iprot.readI32());
        struct.setOp_typeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

