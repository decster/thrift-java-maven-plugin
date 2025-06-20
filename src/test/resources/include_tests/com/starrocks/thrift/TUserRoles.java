/**
 * Autogenerated by Thrift Compiler (0.20.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.starrocks.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.20.0)", date = "2025-06-16")
public class TUserRoles implements org.apache.thrift.TBase<TUserRoles, TUserRoles._Fields>, java.io.Serializable, Cloneable, Comparable<TUserRoles> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TUserRoles");

  private static final org.apache.thrift.protocol.TField ROLE_ID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("role_id_list", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TUserRolesStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TUserRolesTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Long> role_id_list; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROLE_ID_LIST((short)1, "role_id_list");

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
        case 1: // ROLE_ID_LIST
          return ROLE_ID_LIST;
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
  private static final _Fields optionals[] = {_Fields.ROLE_ID_LIST};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROLE_ID_LIST, new org.apache.thrift.meta_data.FieldMetaData("role_id_list", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TUserRoles.class, metaDataMap);
  }

  public TUserRoles() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TUserRoles(TUserRoles other) {
    if (other.isSetRole_id_list()) {
      java.util.List<java.lang.Long> __this__role_id_list = new java.util.ArrayList<java.lang.Long>(other.role_id_list);
      this.role_id_list = __this__role_id_list;
    }
  }

  @Override
  public TUserRoles deepCopy() {
    return new TUserRoles(this);
  }

  @Override
  public void clear() {
    this.role_id_list = null;
  }

  public int getRole_id_listSize() {
    return (this.role_id_list == null) ? 0 : this.role_id_list.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Long> getRole_id_listIterator() {
    return (this.role_id_list == null) ? null : this.role_id_list.iterator();
  }

  public void addToRole_id_list(long elem) {
    if (this.role_id_list == null) {
      this.role_id_list = new java.util.ArrayList<java.lang.Long>();
    }
    this.role_id_list.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Long> getRole_id_list() {
    return this.role_id_list;
  }

  public TUserRoles setRole_id_list(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Long> role_id_list) {
    this.role_id_list = role_id_list;
    return this;
  }

  public void unsetRole_id_list() {
    this.role_id_list = null;
  }

  /** Returns true if field role_id_list is set (has been assigned a value) and false otherwise */
  public boolean isSetRole_id_list() {
    return this.role_id_list != null;
  }

  public void setRole_id_listIsSet(boolean value) {
    if (!value) {
      this.role_id_list = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ROLE_ID_LIST:
      if (value == null) {
        unsetRole_id_list();
      } else {
        setRole_id_list((java.util.List<java.lang.Long>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ROLE_ID_LIST:
      return getRole_id_list();

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
    case ROLE_ID_LIST:
      return isSetRole_id_list();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TUserRoles)
      return this.equals((TUserRoles)that);
    return false;
  }

  public boolean equals(TUserRoles that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_role_id_list = true && this.isSetRole_id_list();
    boolean that_present_role_id_list = true && that.isSetRole_id_list();
    if (this_present_role_id_list || that_present_role_id_list) {
      if (!(this_present_role_id_list && that_present_role_id_list))
        return false;
      if (!this.role_id_list.equals(that.role_id_list))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetRole_id_list()) ? 131071 : 524287);
    if (isSetRole_id_list())
      hashCode = hashCode * 8191 + role_id_list.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TUserRoles other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetRole_id_list(), other.isSetRole_id_list());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRole_id_list()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.role_id_list, other.role_id_list);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TUserRoles(");
    boolean first = true;

    if (isSetRole_id_list()) {
      sb.append("role_id_list:");
      if (this.role_id_list == null) {
        sb.append("null");
      } else {
        sb.append(this.role_id_list);
      }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TUserRolesStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TUserRolesStandardScheme getScheme() {
      return new TUserRolesStandardScheme();
    }
  }

  private static class TUserRolesStandardScheme extends org.apache.thrift.scheme.StandardScheme<TUserRoles> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TUserRoles struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROLE_ID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list80 = iprot.readListBegin();
                struct.role_id_list = new java.util.ArrayList<java.lang.Long>(_list80.size);
                long _elem81;
                for (int _i82 = 0; _i82 < _list80.size; ++_i82)
                {
                  _elem81 = iprot.readI64();
                  struct.role_id_list.add(_elem81);
                }
                iprot.readListEnd();
              }
              struct.setRole_id_listIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TUserRoles struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.role_id_list != null) {
        if (struct.isSetRole_id_list()) {
          oprot.writeFieldBegin(ROLE_ID_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.role_id_list.size()));
            for (long _iter83 : struct.role_id_list)
            {
              oprot.writeI64(_iter83);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TUserRolesTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TUserRolesTupleScheme getScheme() {
      return new TUserRolesTupleScheme();
    }
  }

  private static class TUserRolesTupleScheme extends org.apache.thrift.scheme.TupleScheme<TUserRoles> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TUserRoles struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRole_id_list()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetRole_id_list()) {
        {
          oprot.writeI32(struct.role_id_list.size());
          for (long _iter84 : struct.role_id_list)
          {
            oprot.writeI64(_iter84);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TUserRoles struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list85 = iprot.readListBegin(org.apache.thrift.protocol.TType.I64);
          struct.role_id_list = new java.util.ArrayList<java.lang.Long>(_list85.size);
          long _elem86;
          for (int _i87 = 0; _i87 < _list85.size; ++_i87)
          {
            _elem86 = iprot.readI64();
            struct.role_id_list.add(_elem86);
          }
        }
        struct.setRole_id_listIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

