/**
 * Autogenerated by Thrift Compiler (0.20.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.starrocks.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.20.0)", date = "2025-06-16")
public class TPartitionVersionInfo implements org.apache.thrift.TBase<TPartitionVersionInfo, TPartitionVersionInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TPartitionVersionInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPartitionVersionInfo");

  private static final org.apache.thrift.protocol.TField PARTITION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField VERSION_HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("version_hash", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField BINLOG_CONFIG_FIELD_DESC = new org.apache.thrift.protocol.TField("binlog_config", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField GTID_FIELD_DESC = new org.apache.thrift.protocol.TField("gtid", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField IS_DOUBLE_WRITE_FIELD_DESC = new org.apache.thrift.protocol.TField("is_double_write", org.apache.thrift.protocol.TType.BOOL, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TPartitionVersionInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TPartitionVersionInfoTupleSchemeFactory();

  public long partition_id; // required
  public long version; // required
  public long version_hash; // required
  public @org.apache.thrift.annotation.Nullable TBinlogConfig binlog_config; // optional
  public long gtid; // optional
  public boolean is_double_write; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARTITION_ID((short)1, "partition_id"),
    VERSION((short)2, "version"),
    VERSION_HASH((short)3, "version_hash"),
    BINLOG_CONFIG((short)4, "binlog_config"),
    GTID((short)5, "gtid"),
    IS_DOUBLE_WRITE((short)6, "is_double_write");

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
        case 1: // PARTITION_ID
          return PARTITION_ID;
        case 2: // VERSION
          return VERSION;
        case 3: // VERSION_HASH
          return VERSION_HASH;
        case 4: // BINLOG_CONFIG
          return BINLOG_CONFIG;
        case 5: // GTID
          return GTID;
        case 6: // IS_DOUBLE_WRITE
          return IS_DOUBLE_WRITE;
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
  private static final int __PARTITION_ID_ISSET_ID = 0;
  private static final int __VERSION_ISSET_ID = 1;
  private static final int __VERSION_HASH_ISSET_ID = 2;
  private static final int __GTID_ISSET_ID = 3;
  private static final int __IS_DOUBLE_WRITE_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.BINLOG_CONFIG,_Fields.GTID,_Fields.IS_DOUBLE_WRITE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTITION_ID, new org.apache.thrift.meta_data.FieldMetaData("partition_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TPartitionId")));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TVersion")));
    tmpMap.put(_Fields.VERSION_HASH, new org.apache.thrift.meta_data.FieldMetaData("version_hash", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TVersionHash")));
    tmpMap.put(_Fields.BINLOG_CONFIG, new org.apache.thrift.meta_data.FieldMetaData("binlog_config", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TBinlogConfig.class)));
    tmpMap.put(_Fields.GTID, new org.apache.thrift.meta_data.FieldMetaData("gtid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.IS_DOUBLE_WRITE, new org.apache.thrift.meta_data.FieldMetaData("is_double_write", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPartitionVersionInfo.class, metaDataMap);
  }

  public TPartitionVersionInfo() {
  }

  public TPartitionVersionInfo(
    long partition_id,
    long version,
    long version_hash)
  {
    this();
    this.partition_id = partition_id;
    setPartition_idIsSet(true);
    this.version = version;
    setVersionIsSet(true);
    this.version_hash = version_hash;
    setVersion_hashIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPartitionVersionInfo(TPartitionVersionInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.partition_id = other.partition_id;
    this.version = other.version;
    this.version_hash = other.version_hash;
    if (other.isSetBinlog_config()) {
      this.binlog_config = new TBinlogConfig(other.binlog_config);
    }
    this.gtid = other.gtid;
    this.is_double_write = other.is_double_write;
  }

  @Override
  public TPartitionVersionInfo deepCopy() {
    return new TPartitionVersionInfo(this);
  }

  @Override
  public void clear() {
    setPartition_idIsSet(false);
    this.partition_id = 0;
    setVersionIsSet(false);
    this.version = 0;
    setVersion_hashIsSet(false);
    this.version_hash = 0;
    this.binlog_config = null;
    setGtidIsSet(false);
    this.gtid = 0;
    setIs_double_writeIsSet(false);
    this.is_double_write = false;
  }

  public long getPartition_id() {
    return this.partition_id;
  }

  public TPartitionVersionInfo setPartition_id(long partition_id) {
    this.partition_id = partition_id;
    setPartition_idIsSet(true);
    return this;
  }

  public void unsetPartition_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PARTITION_ID_ISSET_ID);
  }

  /** Returns true if field partition_id is set (has been assigned a value) and false otherwise */
  public boolean isSetPartition_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PARTITION_ID_ISSET_ID);
  }

  public void setPartition_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PARTITION_ID_ISSET_ID, value);
  }

  public long getVersion() {
    return this.version;
  }

  public TPartitionVersionInfo setVersion(long version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  public long getVersion_hash() {
    return this.version_hash;
  }

  public TPartitionVersionInfo setVersion_hash(long version_hash) {
    this.version_hash = version_hash;
    setVersion_hashIsSet(true);
    return this;
  }

  public void unsetVersion_hash() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VERSION_HASH_ISSET_ID);
  }

  /** Returns true if field version_hash is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion_hash() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VERSION_HASH_ISSET_ID);
  }

  public void setVersion_hashIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VERSION_HASH_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public TBinlogConfig getBinlog_config() {
    return this.binlog_config;
  }

  public TPartitionVersionInfo setBinlog_config(@org.apache.thrift.annotation.Nullable TBinlogConfig binlog_config) {
    this.binlog_config = binlog_config;
    return this;
  }

  public void unsetBinlog_config() {
    this.binlog_config = null;
  }

  /** Returns true if field binlog_config is set (has been assigned a value) and false otherwise */
  public boolean isSetBinlog_config() {
    return this.binlog_config != null;
  }

  public void setBinlog_configIsSet(boolean value) {
    if (!value) {
      this.binlog_config = null;
    }
  }

  public long getGtid() {
    return this.gtid;
  }

  public TPartitionVersionInfo setGtid(long gtid) {
    this.gtid = gtid;
    setGtidIsSet(true);
    return this;
  }

  public void unsetGtid() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __GTID_ISSET_ID);
  }

  /** Returns true if field gtid is set (has been assigned a value) and false otherwise */
  public boolean isSetGtid() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __GTID_ISSET_ID);
  }

  public void setGtidIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __GTID_ISSET_ID, value);
  }

  public boolean isIs_double_write() {
    return this.is_double_write;
  }

  public TPartitionVersionInfo setIs_double_write(boolean is_double_write) {
    this.is_double_write = is_double_write;
    setIs_double_writeIsSet(true);
    return this;
  }

  public void unsetIs_double_write() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IS_DOUBLE_WRITE_ISSET_ID);
  }

  /** Returns true if field is_double_write is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_double_write() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IS_DOUBLE_WRITE_ISSET_ID);
  }

  public void setIs_double_writeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IS_DOUBLE_WRITE_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PARTITION_ID:
      if (value == null) {
        unsetPartition_id();
      } else {
        setPartition_id((java.lang.Long)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((java.lang.Long)value);
      }
      break;

    case VERSION_HASH:
      if (value == null) {
        unsetVersion_hash();
      } else {
        setVersion_hash((java.lang.Long)value);
      }
      break;

    case BINLOG_CONFIG:
      if (value == null) {
        unsetBinlog_config();
      } else {
        setBinlog_config((TBinlogConfig)value);
      }
      break;

    case GTID:
      if (value == null) {
        unsetGtid();
      } else {
        setGtid((java.lang.Long)value);
      }
      break;

    case IS_DOUBLE_WRITE:
      if (value == null) {
        unsetIs_double_write();
      } else {
        setIs_double_write((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITION_ID:
      return getPartition_id();

    case VERSION:
      return getVersion();

    case VERSION_HASH:
      return getVersion_hash();

    case BINLOG_CONFIG:
      return getBinlog_config();

    case GTID:
      return getGtid();

    case IS_DOUBLE_WRITE:
      return isIs_double_write();

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
    case PARTITION_ID:
      return isSetPartition_id();
    case VERSION:
      return isSetVersion();
    case VERSION_HASH:
      return isSetVersion_hash();
    case BINLOG_CONFIG:
      return isSetBinlog_config();
    case GTID:
      return isSetGtid();
    case IS_DOUBLE_WRITE:
      return isSetIs_double_write();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TPartitionVersionInfo)
      return this.equals((TPartitionVersionInfo)that);
    return false;
  }

  public boolean equals(TPartitionVersionInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_partition_id = true;
    boolean that_present_partition_id = true;
    if (this_present_partition_id || that_present_partition_id) {
      if (!(this_present_partition_id && that_present_partition_id))
        return false;
      if (this.partition_id != that.partition_id)
        return false;
    }

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_version_hash = true;
    boolean that_present_version_hash = true;
    if (this_present_version_hash || that_present_version_hash) {
      if (!(this_present_version_hash && that_present_version_hash))
        return false;
      if (this.version_hash != that.version_hash)
        return false;
    }

    boolean this_present_binlog_config = true && this.isSetBinlog_config();
    boolean that_present_binlog_config = true && that.isSetBinlog_config();
    if (this_present_binlog_config || that_present_binlog_config) {
      if (!(this_present_binlog_config && that_present_binlog_config))
        return false;
      if (!this.binlog_config.equals(that.binlog_config))
        return false;
    }

    boolean this_present_gtid = true && this.isSetGtid();
    boolean that_present_gtid = true && that.isSetGtid();
    if (this_present_gtid || that_present_gtid) {
      if (!(this_present_gtid && that_present_gtid))
        return false;
      if (this.gtid != that.gtid)
        return false;
    }

    boolean this_present_is_double_write = true && this.isSetIs_double_write();
    boolean that_present_is_double_write = true && that.isSetIs_double_write();
    if (this_present_is_double_write || that_present_is_double_write) {
      if (!(this_present_is_double_write && that_present_is_double_write))
        return false;
      if (this.is_double_write != that.is_double_write)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(partition_id);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(version);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(version_hash);

    hashCode = hashCode * 8191 + ((isSetBinlog_config()) ? 131071 : 524287);
    if (isSetBinlog_config())
      hashCode = hashCode * 8191 + binlog_config.hashCode();

    hashCode = hashCode * 8191 + ((isSetGtid()) ? 131071 : 524287);
    if (isSetGtid())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(gtid);

    hashCode = hashCode * 8191 + ((isSetIs_double_write()) ? 131071 : 524287);
    if (isSetIs_double_write())
      hashCode = hashCode * 8191 + ((is_double_write) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TPartitionVersionInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPartition_id(), other.isSetPartition_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartition_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition_id, other.partition_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetVersion(), other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetVersion_hash(), other.isSetVersion_hash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion_hash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version_hash, other.version_hash);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBinlog_config(), other.isSetBinlog_config());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBinlog_config()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.binlog_config, other.binlog_config);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetGtid(), other.isSetGtid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGtid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gtid, other.gtid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIs_double_write(), other.isSetIs_double_write());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_double_write()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_double_write, other.is_double_write);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TPartitionVersionInfo(");
    boolean first = true;

    sb.append("partition_id:");
    sb.append(this.partition_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("version_hash:");
    sb.append(this.version_hash);
    first = false;
    if (isSetBinlog_config()) {
      if (!first) sb.append(", ");
      sb.append("binlog_config:");
      if (this.binlog_config == null) {
        sb.append("null");
      } else {
        sb.append(this.binlog_config);
      }
      first = false;
    }
    if (isSetGtid()) {
      if (!first) sb.append(", ");
      sb.append("gtid:");
      sb.append(this.gtid);
      first = false;
    }
    if (isSetIs_double_write()) {
      if (!first) sb.append(", ");
      sb.append("is_double_write:");
      sb.append(this.is_double_write);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'partition_id' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'version' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'version_hash' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (binlog_config != null) {
      binlog_config.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TPartitionVersionInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TPartitionVersionInfoStandardScheme getScheme() {
      return new TPartitionVersionInfoStandardScheme();
    }
  }

  private static class TPartitionVersionInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TPartitionVersionInfo> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TPartitionVersionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.partition_id = iprot.readI64();
              struct.setPartition_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.version = iprot.readI64();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VERSION_HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.version_hash = iprot.readI64();
              struct.setVersion_hashIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BINLOG_CONFIG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.binlog_config = new TBinlogConfig();
              struct.binlog_config.read(iprot);
              struct.setBinlog_configIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // GTID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.gtid = iprot.readI64();
              struct.setGtidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // IS_DOUBLE_WRITE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_double_write = iprot.readBool();
              struct.setIs_double_writeIsSet(true);
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
      if (!struct.isSetPartition_id()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'partition_id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetVersion()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'version' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetVersion_hash()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'version_hash' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TPartitionVersionInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PARTITION_ID_FIELD_DESC);
      oprot.writeI64(struct.partition_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI64(struct.version);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VERSION_HASH_FIELD_DESC);
      oprot.writeI64(struct.version_hash);
      oprot.writeFieldEnd();
      if (struct.binlog_config != null) {
        if (struct.isSetBinlog_config()) {
          oprot.writeFieldBegin(BINLOG_CONFIG_FIELD_DESC);
          struct.binlog_config.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetGtid()) {
        oprot.writeFieldBegin(GTID_FIELD_DESC);
        oprot.writeI64(struct.gtid);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIs_double_write()) {
        oprot.writeFieldBegin(IS_DOUBLE_WRITE_FIELD_DESC);
        oprot.writeBool(struct.is_double_write);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPartitionVersionInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TPartitionVersionInfoTupleScheme getScheme() {
      return new TPartitionVersionInfoTupleScheme();
    }
  }

  private static class TPartitionVersionInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TPartitionVersionInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPartitionVersionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.partition_id);
      oprot.writeI64(struct.version);
      oprot.writeI64(struct.version_hash);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetBinlog_config()) {
        optionals.set(0);
      }
      if (struct.isSetGtid()) {
        optionals.set(1);
      }
      if (struct.isSetIs_double_write()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetBinlog_config()) {
        struct.binlog_config.write(oprot);
      }
      if (struct.isSetGtid()) {
        oprot.writeI64(struct.gtid);
      }
      if (struct.isSetIs_double_write()) {
        oprot.writeBool(struct.is_double_write);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPartitionVersionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.partition_id = iprot.readI64();
      struct.setPartition_idIsSet(true);
      struct.version = iprot.readI64();
      struct.setVersionIsSet(true);
      struct.version_hash = iprot.readI64();
      struct.setVersion_hashIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.binlog_config = new TBinlogConfig();
        struct.binlog_config.read(iprot);
        struct.setBinlog_configIsSet(true);
      }
      if (incoming.get(1)) {
        struct.gtid = iprot.readI64();
        struct.setGtidIsSet(true);
      }
      if (incoming.get(2)) {
        struct.is_double_write = iprot.readBool();
        struct.setIs_double_writeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

