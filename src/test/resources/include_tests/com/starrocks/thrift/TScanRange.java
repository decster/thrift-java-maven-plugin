/**
 * Autogenerated by Thrift Compiler (0.20.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.starrocks.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.20.0)", date = "2025-06-16")
public class TScanRange implements org.apache.thrift.TBase<TScanRange, TScanRange._Fields>, java.io.Serializable, Cloneable, Comparable<TScanRange> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TScanRange");

  private static final org.apache.thrift.protocol.TField INTERNAL_SCAN_RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("internal_scan_range", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField KUDU_SCAN_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("kudu_scan_token", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField BROKER_SCAN_RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("broker_scan_range", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField ES_SCAN_RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("es_scan_range", org.apache.thrift.protocol.TType.STRUCT, (short)7);
  private static final org.apache.thrift.protocol.TField HDFS_SCAN_RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("hdfs_scan_range", org.apache.thrift.protocol.TType.STRUCT, (short)20);
  private static final org.apache.thrift.protocol.TField BINLOG_SCAN_RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("binlog_scan_range", org.apache.thrift.protocol.TType.STRUCT, (short)30);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TScanRangeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TScanRangeTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable TInternalScanRange internal_scan_range; // optional
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer kudu_scan_token; // optional
  public @org.apache.thrift.annotation.Nullable TBrokerScanRange broker_scan_range; // optional
  public @org.apache.thrift.annotation.Nullable TEsScanRange es_scan_range; // optional
  public @org.apache.thrift.annotation.Nullable THdfsScanRange hdfs_scan_range; // optional
  public @org.apache.thrift.annotation.Nullable TBinlogScanRange binlog_scan_range; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INTERNAL_SCAN_RANGE((short)4, "internal_scan_range"),
    KUDU_SCAN_TOKEN((short)5, "kudu_scan_token"),
    BROKER_SCAN_RANGE((short)6, "broker_scan_range"),
    ES_SCAN_RANGE((short)7, "es_scan_range"),
    HDFS_SCAN_RANGE((short)20, "hdfs_scan_range"),
    BINLOG_SCAN_RANGE((short)30, "binlog_scan_range");

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
        case 4: // INTERNAL_SCAN_RANGE
          return INTERNAL_SCAN_RANGE;
        case 5: // KUDU_SCAN_TOKEN
          return KUDU_SCAN_TOKEN;
        case 6: // BROKER_SCAN_RANGE
          return BROKER_SCAN_RANGE;
        case 7: // ES_SCAN_RANGE
          return ES_SCAN_RANGE;
        case 20: // HDFS_SCAN_RANGE
          return HDFS_SCAN_RANGE;
        case 30: // BINLOG_SCAN_RANGE
          return BINLOG_SCAN_RANGE;
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
  private static final _Fields optionals[] = {_Fields.INTERNAL_SCAN_RANGE,_Fields.KUDU_SCAN_TOKEN,_Fields.BROKER_SCAN_RANGE,_Fields.ES_SCAN_RANGE,_Fields.HDFS_SCAN_RANGE,_Fields.BINLOG_SCAN_RANGE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INTERNAL_SCAN_RANGE, new org.apache.thrift.meta_data.FieldMetaData("internal_scan_range", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TInternalScanRange.class)));
    tmpMap.put(_Fields.KUDU_SCAN_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("kudu_scan_token", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.BROKER_SCAN_RANGE, new org.apache.thrift.meta_data.FieldMetaData("broker_scan_range", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TBrokerScanRange.class)));
    tmpMap.put(_Fields.ES_SCAN_RANGE, new org.apache.thrift.meta_data.FieldMetaData("es_scan_range", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TEsScanRange.class)));
    tmpMap.put(_Fields.HDFS_SCAN_RANGE, new org.apache.thrift.meta_data.FieldMetaData("hdfs_scan_range", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, THdfsScanRange.class)));
    tmpMap.put(_Fields.BINLOG_SCAN_RANGE, new org.apache.thrift.meta_data.FieldMetaData("binlog_scan_range", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TBinlogScanRange.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TScanRange.class, metaDataMap);
  }

  public TScanRange() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TScanRange(TScanRange other) {
    if (other.isSetInternal_scan_range()) {
      this.internal_scan_range = new TInternalScanRange(other.internal_scan_range);
    }
    if (other.isSetKudu_scan_token()) {
      this.kudu_scan_token = org.apache.thrift.TBaseHelper.copyBinary(other.kudu_scan_token);
    }
    if (other.isSetBroker_scan_range()) {
      this.broker_scan_range = new TBrokerScanRange(other.broker_scan_range);
    }
    if (other.isSetEs_scan_range()) {
      this.es_scan_range = new TEsScanRange(other.es_scan_range);
    }
    if (other.isSetHdfs_scan_range()) {
      this.hdfs_scan_range = new THdfsScanRange(other.hdfs_scan_range);
    }
    if (other.isSetBinlog_scan_range()) {
      this.binlog_scan_range = new TBinlogScanRange(other.binlog_scan_range);
    }
  }

  @Override
  public TScanRange deepCopy() {
    return new TScanRange(this);
  }

  @Override
  public void clear() {
    this.internal_scan_range = null;
    this.kudu_scan_token = null;
    this.broker_scan_range = null;
    this.es_scan_range = null;
    this.hdfs_scan_range = null;
    this.binlog_scan_range = null;
  }

  @org.apache.thrift.annotation.Nullable
  public TInternalScanRange getInternal_scan_range() {
    return this.internal_scan_range;
  }

  public TScanRange setInternal_scan_range(@org.apache.thrift.annotation.Nullable TInternalScanRange internal_scan_range) {
    this.internal_scan_range = internal_scan_range;
    return this;
  }

  public void unsetInternal_scan_range() {
    this.internal_scan_range = null;
  }

  /** Returns true if field internal_scan_range is set (has been assigned a value) and false otherwise */
  public boolean isSetInternal_scan_range() {
    return this.internal_scan_range != null;
  }

  public void setInternal_scan_rangeIsSet(boolean value) {
    if (!value) {
      this.internal_scan_range = null;
    }
  }

  public byte[] getKudu_scan_token() {
    setKudu_scan_token(org.apache.thrift.TBaseHelper.rightSize(kudu_scan_token));
    return kudu_scan_token == null ? null : kudu_scan_token.array();
  }

  public java.nio.ByteBuffer bufferForKudu_scan_token() {
    return org.apache.thrift.TBaseHelper.copyBinary(kudu_scan_token);
  }

  public TScanRange setKudu_scan_token(byte[] kudu_scan_token) {
    this.kudu_scan_token = kudu_scan_token == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(kudu_scan_token.clone());
    return this;
  }

  public TScanRange setKudu_scan_token(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer kudu_scan_token) {
    this.kudu_scan_token = org.apache.thrift.TBaseHelper.copyBinary(kudu_scan_token);
    return this;
  }

  public void unsetKudu_scan_token() {
    this.kudu_scan_token = null;
  }

  /** Returns true if field kudu_scan_token is set (has been assigned a value) and false otherwise */
  public boolean isSetKudu_scan_token() {
    return this.kudu_scan_token != null;
  }

  public void setKudu_scan_tokenIsSet(boolean value) {
    if (!value) {
      this.kudu_scan_token = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TBrokerScanRange getBroker_scan_range() {
    return this.broker_scan_range;
  }

  public TScanRange setBroker_scan_range(@org.apache.thrift.annotation.Nullable TBrokerScanRange broker_scan_range) {
    this.broker_scan_range = broker_scan_range;
    return this;
  }

  public void unsetBroker_scan_range() {
    this.broker_scan_range = null;
  }

  /** Returns true if field broker_scan_range is set (has been assigned a value) and false otherwise */
  public boolean isSetBroker_scan_range() {
    return this.broker_scan_range != null;
  }

  public void setBroker_scan_rangeIsSet(boolean value) {
    if (!value) {
      this.broker_scan_range = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TEsScanRange getEs_scan_range() {
    return this.es_scan_range;
  }

  public TScanRange setEs_scan_range(@org.apache.thrift.annotation.Nullable TEsScanRange es_scan_range) {
    this.es_scan_range = es_scan_range;
    return this;
  }

  public void unsetEs_scan_range() {
    this.es_scan_range = null;
  }

  /** Returns true if field es_scan_range is set (has been assigned a value) and false otherwise */
  public boolean isSetEs_scan_range() {
    return this.es_scan_range != null;
  }

  public void setEs_scan_rangeIsSet(boolean value) {
    if (!value) {
      this.es_scan_range = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public THdfsScanRange getHdfs_scan_range() {
    return this.hdfs_scan_range;
  }

  public TScanRange setHdfs_scan_range(@org.apache.thrift.annotation.Nullable THdfsScanRange hdfs_scan_range) {
    this.hdfs_scan_range = hdfs_scan_range;
    return this;
  }

  public void unsetHdfs_scan_range() {
    this.hdfs_scan_range = null;
  }

  /** Returns true if field hdfs_scan_range is set (has been assigned a value) and false otherwise */
  public boolean isSetHdfs_scan_range() {
    return this.hdfs_scan_range != null;
  }

  public void setHdfs_scan_rangeIsSet(boolean value) {
    if (!value) {
      this.hdfs_scan_range = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TBinlogScanRange getBinlog_scan_range() {
    return this.binlog_scan_range;
  }

  public TScanRange setBinlog_scan_range(@org.apache.thrift.annotation.Nullable TBinlogScanRange binlog_scan_range) {
    this.binlog_scan_range = binlog_scan_range;
    return this;
  }

  public void unsetBinlog_scan_range() {
    this.binlog_scan_range = null;
  }

  /** Returns true if field binlog_scan_range is set (has been assigned a value) and false otherwise */
  public boolean isSetBinlog_scan_range() {
    return this.binlog_scan_range != null;
  }

  public void setBinlog_scan_rangeIsSet(boolean value) {
    if (!value) {
      this.binlog_scan_range = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case INTERNAL_SCAN_RANGE:
      if (value == null) {
        unsetInternal_scan_range();
      } else {
        setInternal_scan_range((TInternalScanRange)value);
      }
      break;

    case KUDU_SCAN_TOKEN:
      if (value == null) {
        unsetKudu_scan_token();
      } else {
        if (value instanceof byte[]) {
          setKudu_scan_token((byte[])value);
        } else {
          setKudu_scan_token((java.nio.ByteBuffer)value);
        }
      }
      break;

    case BROKER_SCAN_RANGE:
      if (value == null) {
        unsetBroker_scan_range();
      } else {
        setBroker_scan_range((TBrokerScanRange)value);
      }
      break;

    case ES_SCAN_RANGE:
      if (value == null) {
        unsetEs_scan_range();
      } else {
        setEs_scan_range((TEsScanRange)value);
      }
      break;

    case HDFS_SCAN_RANGE:
      if (value == null) {
        unsetHdfs_scan_range();
      } else {
        setHdfs_scan_range((THdfsScanRange)value);
      }
      break;

    case BINLOG_SCAN_RANGE:
      if (value == null) {
        unsetBinlog_scan_range();
      } else {
        setBinlog_scan_range((TBinlogScanRange)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case INTERNAL_SCAN_RANGE:
      return getInternal_scan_range();

    case KUDU_SCAN_TOKEN:
      return getKudu_scan_token();

    case BROKER_SCAN_RANGE:
      return getBroker_scan_range();

    case ES_SCAN_RANGE:
      return getEs_scan_range();

    case HDFS_SCAN_RANGE:
      return getHdfs_scan_range();

    case BINLOG_SCAN_RANGE:
      return getBinlog_scan_range();

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
    case INTERNAL_SCAN_RANGE:
      return isSetInternal_scan_range();
    case KUDU_SCAN_TOKEN:
      return isSetKudu_scan_token();
    case BROKER_SCAN_RANGE:
      return isSetBroker_scan_range();
    case ES_SCAN_RANGE:
      return isSetEs_scan_range();
    case HDFS_SCAN_RANGE:
      return isSetHdfs_scan_range();
    case BINLOG_SCAN_RANGE:
      return isSetBinlog_scan_range();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TScanRange)
      return this.equals((TScanRange)that);
    return false;
  }

  public boolean equals(TScanRange that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_internal_scan_range = true && this.isSetInternal_scan_range();
    boolean that_present_internal_scan_range = true && that.isSetInternal_scan_range();
    if (this_present_internal_scan_range || that_present_internal_scan_range) {
      if (!(this_present_internal_scan_range && that_present_internal_scan_range))
        return false;
      if (!this.internal_scan_range.equals(that.internal_scan_range))
        return false;
    }

    boolean this_present_kudu_scan_token = true && this.isSetKudu_scan_token();
    boolean that_present_kudu_scan_token = true && that.isSetKudu_scan_token();
    if (this_present_kudu_scan_token || that_present_kudu_scan_token) {
      if (!(this_present_kudu_scan_token && that_present_kudu_scan_token))
        return false;
      if (!this.kudu_scan_token.equals(that.kudu_scan_token))
        return false;
    }

    boolean this_present_broker_scan_range = true && this.isSetBroker_scan_range();
    boolean that_present_broker_scan_range = true && that.isSetBroker_scan_range();
    if (this_present_broker_scan_range || that_present_broker_scan_range) {
      if (!(this_present_broker_scan_range && that_present_broker_scan_range))
        return false;
      if (!this.broker_scan_range.equals(that.broker_scan_range))
        return false;
    }

    boolean this_present_es_scan_range = true && this.isSetEs_scan_range();
    boolean that_present_es_scan_range = true && that.isSetEs_scan_range();
    if (this_present_es_scan_range || that_present_es_scan_range) {
      if (!(this_present_es_scan_range && that_present_es_scan_range))
        return false;
      if (!this.es_scan_range.equals(that.es_scan_range))
        return false;
    }

    boolean this_present_hdfs_scan_range = true && this.isSetHdfs_scan_range();
    boolean that_present_hdfs_scan_range = true && that.isSetHdfs_scan_range();
    if (this_present_hdfs_scan_range || that_present_hdfs_scan_range) {
      if (!(this_present_hdfs_scan_range && that_present_hdfs_scan_range))
        return false;
      if (!this.hdfs_scan_range.equals(that.hdfs_scan_range))
        return false;
    }

    boolean this_present_binlog_scan_range = true && this.isSetBinlog_scan_range();
    boolean that_present_binlog_scan_range = true && that.isSetBinlog_scan_range();
    if (this_present_binlog_scan_range || that_present_binlog_scan_range) {
      if (!(this_present_binlog_scan_range && that_present_binlog_scan_range))
        return false;
      if (!this.binlog_scan_range.equals(that.binlog_scan_range))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetInternal_scan_range()) ? 131071 : 524287);
    if (isSetInternal_scan_range())
      hashCode = hashCode * 8191 + internal_scan_range.hashCode();

    hashCode = hashCode * 8191 + ((isSetKudu_scan_token()) ? 131071 : 524287);
    if (isSetKudu_scan_token())
      hashCode = hashCode * 8191 + kudu_scan_token.hashCode();

    hashCode = hashCode * 8191 + ((isSetBroker_scan_range()) ? 131071 : 524287);
    if (isSetBroker_scan_range())
      hashCode = hashCode * 8191 + broker_scan_range.hashCode();

    hashCode = hashCode * 8191 + ((isSetEs_scan_range()) ? 131071 : 524287);
    if (isSetEs_scan_range())
      hashCode = hashCode * 8191 + es_scan_range.hashCode();

    hashCode = hashCode * 8191 + ((isSetHdfs_scan_range()) ? 131071 : 524287);
    if (isSetHdfs_scan_range())
      hashCode = hashCode * 8191 + hdfs_scan_range.hashCode();

    hashCode = hashCode * 8191 + ((isSetBinlog_scan_range()) ? 131071 : 524287);
    if (isSetBinlog_scan_range())
      hashCode = hashCode * 8191 + binlog_scan_range.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TScanRange other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetInternal_scan_range(), other.isSetInternal_scan_range());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInternal_scan_range()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.internal_scan_range, other.internal_scan_range);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetKudu_scan_token(), other.isSetKudu_scan_token());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKudu_scan_token()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.kudu_scan_token, other.kudu_scan_token);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBroker_scan_range(), other.isSetBroker_scan_range());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBroker_scan_range()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.broker_scan_range, other.broker_scan_range);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEs_scan_range(), other.isSetEs_scan_range());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEs_scan_range()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.es_scan_range, other.es_scan_range);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetHdfs_scan_range(), other.isSetHdfs_scan_range());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHdfs_scan_range()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hdfs_scan_range, other.hdfs_scan_range);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBinlog_scan_range(), other.isSetBinlog_scan_range());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBinlog_scan_range()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.binlog_scan_range, other.binlog_scan_range);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TScanRange(");
    boolean first = true;

    if (isSetInternal_scan_range()) {
      sb.append("internal_scan_range:");
      if (this.internal_scan_range == null) {
        sb.append("null");
      } else {
        sb.append(this.internal_scan_range);
      }
      first = false;
    }
    if (isSetKudu_scan_token()) {
      if (!first) sb.append(", ");
      sb.append("kudu_scan_token:");
      if (this.kudu_scan_token == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.kudu_scan_token, sb);
      }
      first = false;
    }
    if (isSetBroker_scan_range()) {
      if (!first) sb.append(", ");
      sb.append("broker_scan_range:");
      if (this.broker_scan_range == null) {
        sb.append("null");
      } else {
        sb.append(this.broker_scan_range);
      }
      first = false;
    }
    if (isSetEs_scan_range()) {
      if (!first) sb.append(", ");
      sb.append("es_scan_range:");
      if (this.es_scan_range == null) {
        sb.append("null");
      } else {
        sb.append(this.es_scan_range);
      }
      first = false;
    }
    if (isSetHdfs_scan_range()) {
      if (!first) sb.append(", ");
      sb.append("hdfs_scan_range:");
      if (this.hdfs_scan_range == null) {
        sb.append("null");
      } else {
        sb.append(this.hdfs_scan_range);
      }
      first = false;
    }
    if (isSetBinlog_scan_range()) {
      if (!first) sb.append(", ");
      sb.append("binlog_scan_range:");
      if (this.binlog_scan_range == null) {
        sb.append("null");
      } else {
        sb.append(this.binlog_scan_range);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (internal_scan_range != null) {
      internal_scan_range.validate();
    }
    if (broker_scan_range != null) {
      broker_scan_range.validate();
    }
    if (es_scan_range != null) {
      es_scan_range.validate();
    }
    if (hdfs_scan_range != null) {
      hdfs_scan_range.validate();
    }
    if (binlog_scan_range != null) {
      binlog_scan_range.validate();
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

  private static class TScanRangeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TScanRangeStandardScheme getScheme() {
      return new TScanRangeStandardScheme();
    }
  }

  private static class TScanRangeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TScanRange> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TScanRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 4: // INTERNAL_SCAN_RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.internal_scan_range = new TInternalScanRange();
              struct.internal_scan_range.read(iprot);
              struct.setInternal_scan_rangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // KUDU_SCAN_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.kudu_scan_token = iprot.readBinary();
              struct.setKudu_scan_tokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // BROKER_SCAN_RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.broker_scan_range = new TBrokerScanRange();
              struct.broker_scan_range.read(iprot);
              struct.setBroker_scan_rangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // ES_SCAN_RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.es_scan_range = new TEsScanRange();
              struct.es_scan_range.read(iprot);
              struct.setEs_scan_rangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 20: // HDFS_SCAN_RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.hdfs_scan_range = new THdfsScanRange();
              struct.hdfs_scan_range.read(iprot);
              struct.setHdfs_scan_rangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 30: // BINLOG_SCAN_RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.binlog_scan_range = new TBinlogScanRange();
              struct.binlog_scan_range.read(iprot);
              struct.setBinlog_scan_rangeIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TScanRange struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.internal_scan_range != null) {
        if (struct.isSetInternal_scan_range()) {
          oprot.writeFieldBegin(INTERNAL_SCAN_RANGE_FIELD_DESC);
          struct.internal_scan_range.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.kudu_scan_token != null) {
        if (struct.isSetKudu_scan_token()) {
          oprot.writeFieldBegin(KUDU_SCAN_TOKEN_FIELD_DESC);
          oprot.writeBinary(struct.kudu_scan_token);
          oprot.writeFieldEnd();
        }
      }
      if (struct.broker_scan_range != null) {
        if (struct.isSetBroker_scan_range()) {
          oprot.writeFieldBegin(BROKER_SCAN_RANGE_FIELD_DESC);
          struct.broker_scan_range.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.es_scan_range != null) {
        if (struct.isSetEs_scan_range()) {
          oprot.writeFieldBegin(ES_SCAN_RANGE_FIELD_DESC);
          struct.es_scan_range.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.hdfs_scan_range != null) {
        if (struct.isSetHdfs_scan_range()) {
          oprot.writeFieldBegin(HDFS_SCAN_RANGE_FIELD_DESC);
          struct.hdfs_scan_range.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.binlog_scan_range != null) {
        if (struct.isSetBinlog_scan_range()) {
          oprot.writeFieldBegin(BINLOG_SCAN_RANGE_FIELD_DESC);
          struct.binlog_scan_range.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TScanRangeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TScanRangeTupleScheme getScheme() {
      return new TScanRangeTupleScheme();
    }
  }

  private static class TScanRangeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TScanRange> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TScanRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetInternal_scan_range()) {
        optionals.set(0);
      }
      if (struct.isSetKudu_scan_token()) {
        optionals.set(1);
      }
      if (struct.isSetBroker_scan_range()) {
        optionals.set(2);
      }
      if (struct.isSetEs_scan_range()) {
        optionals.set(3);
      }
      if (struct.isSetHdfs_scan_range()) {
        optionals.set(4);
      }
      if (struct.isSetBinlog_scan_range()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetInternal_scan_range()) {
        struct.internal_scan_range.write(oprot);
      }
      if (struct.isSetKudu_scan_token()) {
        oprot.writeBinary(struct.kudu_scan_token);
      }
      if (struct.isSetBroker_scan_range()) {
        struct.broker_scan_range.write(oprot);
      }
      if (struct.isSetEs_scan_range()) {
        struct.es_scan_range.write(oprot);
      }
      if (struct.isSetHdfs_scan_range()) {
        struct.hdfs_scan_range.write(oprot);
      }
      if (struct.isSetBinlog_scan_range()) {
        struct.binlog_scan_range.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TScanRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.internal_scan_range = new TInternalScanRange();
        struct.internal_scan_range.read(iprot);
        struct.setInternal_scan_rangeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.kudu_scan_token = iprot.readBinary();
        struct.setKudu_scan_tokenIsSet(true);
      }
      if (incoming.get(2)) {
        struct.broker_scan_range = new TBrokerScanRange();
        struct.broker_scan_range.read(iprot);
        struct.setBroker_scan_rangeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.es_scan_range = new TEsScanRange();
        struct.es_scan_range.read(iprot);
        struct.setEs_scan_rangeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.hdfs_scan_range = new THdfsScanRange();
        struct.hdfs_scan_range.read(iprot);
        struct.setHdfs_scan_rangeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.binlog_scan_range = new TBinlogScanRange();
        struct.binlog_scan_range.read(iprot);
        struct.setBinlog_scan_rangeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

