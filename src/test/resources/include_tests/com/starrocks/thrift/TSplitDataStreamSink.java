/**
 * Autogenerated by Thrift Compiler (0.20.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.starrocks.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.20.0)", date = "2025-06-16")
public class TSplitDataStreamSink implements org.apache.thrift.TBase<TSplitDataStreamSink, TSplitDataStreamSink._Fields>, java.io.Serializable, Cloneable, Comparable<TSplitDataStreamSink> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSplitDataStreamSink");

  private static final org.apache.thrift.protocol.TField SINKS_FIELD_DESC = new org.apache.thrift.protocol.TField("sinks", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField DESTINATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("destinations", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField SPLIT_EXPRS_FIELD_DESC = new org.apache.thrift.protocol.TField("splitExprs", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TSplitDataStreamSinkStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TSplitDataStreamSinkTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<TDataStreamSink> sinks; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<java.util.List<TPlanFragmentDestination>> destinations; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<com.starrocks.thrift.TExpr> splitExprs; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SINKS((short)1, "sinks"),
    DESTINATIONS((short)2, "destinations"),
    SPLIT_EXPRS((short)3, "splitExprs");

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
        case 1: // SINKS
          return SINKS;
        case 2: // DESTINATIONS
          return DESTINATIONS;
        case 3: // SPLIT_EXPRS
          return SPLIT_EXPRS;
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
  private static final _Fields optionals[] = {_Fields.SINKS,_Fields.DESTINATIONS,_Fields.SPLIT_EXPRS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SINKS, new org.apache.thrift.meta_data.FieldMetaData("sinks", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDataStreamSink.class))));
    tmpMap.put(_Fields.DESTINATIONS, new org.apache.thrift.meta_data.FieldMetaData("destinations", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TPlanFragmentDestination.class)))));
    tmpMap.put(_Fields.SPLIT_EXPRS, new org.apache.thrift.meta_data.FieldMetaData("splitExprs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.starrocks.thrift.TExpr.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSplitDataStreamSink.class, metaDataMap);
  }

  public TSplitDataStreamSink() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSplitDataStreamSink(TSplitDataStreamSink other) {
    if (other.isSetSinks()) {
      java.util.List<TDataStreamSink> __this__sinks = new java.util.ArrayList<TDataStreamSink>(other.sinks.size());
      for (TDataStreamSink other_element : other.sinks) {
        __this__sinks.add(new TDataStreamSink(other_element));
      }
      this.sinks = __this__sinks;
    }
    if (other.isSetDestinations()) {
      java.util.List<java.util.List<TPlanFragmentDestination>> __this__destinations = new java.util.ArrayList<java.util.List<TPlanFragmentDestination>>(other.destinations.size());
      for (java.util.List<TPlanFragmentDestination> other_element : other.destinations) {
        java.util.List<TPlanFragmentDestination> __this__destinations_copy = new java.util.ArrayList<TPlanFragmentDestination>(other_element.size());
        for (TPlanFragmentDestination other_element_element : other_element) {
          __this__destinations_copy.add(new TPlanFragmentDestination(other_element_element));
        }
        __this__destinations.add(__this__destinations_copy);
      }
      this.destinations = __this__destinations;
    }
    if (other.isSetSplitExprs()) {
      java.util.List<com.starrocks.thrift.TExpr> __this__splitExprs = new java.util.ArrayList<com.starrocks.thrift.TExpr>(other.splitExprs.size());
      for (com.starrocks.thrift.TExpr other_element : other.splitExprs) {
        __this__splitExprs.add(new com.starrocks.thrift.TExpr(other_element));
      }
      this.splitExprs = __this__splitExprs;
    }
  }

  @Override
  public TSplitDataStreamSink deepCopy() {
    return new TSplitDataStreamSink(this);
  }

  @Override
  public void clear() {
    this.sinks = null;
    this.destinations = null;
    this.splitExprs = null;
  }

  public int getSinksSize() {
    return (this.sinks == null) ? 0 : this.sinks.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TDataStreamSink> getSinksIterator() {
    return (this.sinks == null) ? null : this.sinks.iterator();
  }

  public void addToSinks(TDataStreamSink elem) {
    if (this.sinks == null) {
      this.sinks = new java.util.ArrayList<TDataStreamSink>();
    }
    this.sinks.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TDataStreamSink> getSinks() {
    return this.sinks;
  }

  public TSplitDataStreamSink setSinks(@org.apache.thrift.annotation.Nullable java.util.List<TDataStreamSink> sinks) {
    this.sinks = sinks;
    return this;
  }

  public void unsetSinks() {
    this.sinks = null;
  }

  /** Returns true if field sinks is set (has been assigned a value) and false otherwise */
  public boolean isSetSinks() {
    return this.sinks != null;
  }

  public void setSinksIsSet(boolean value) {
    if (!value) {
      this.sinks = null;
    }
  }

  public int getDestinationsSize() {
    return (this.destinations == null) ? 0 : this.destinations.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.util.List<TPlanFragmentDestination>> getDestinationsIterator() {
    return (this.destinations == null) ? null : this.destinations.iterator();
  }

  public void addToDestinations(java.util.List<TPlanFragmentDestination> elem) {
    if (this.destinations == null) {
      this.destinations = new java.util.ArrayList<java.util.List<TPlanFragmentDestination>>();
    }
    this.destinations.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.util.List<TPlanFragmentDestination>> getDestinations() {
    return this.destinations;
  }

  public TSplitDataStreamSink setDestinations(@org.apache.thrift.annotation.Nullable java.util.List<java.util.List<TPlanFragmentDestination>> destinations) {
    this.destinations = destinations;
    return this;
  }

  public void unsetDestinations() {
    this.destinations = null;
  }

  /** Returns true if field destinations is set (has been assigned a value) and false otherwise */
  public boolean isSetDestinations() {
    return this.destinations != null;
  }

  public void setDestinationsIsSet(boolean value) {
    if (!value) {
      this.destinations = null;
    }
  }

  public int getSplitExprsSize() {
    return (this.splitExprs == null) ? 0 : this.splitExprs.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<com.starrocks.thrift.TExpr> getSplitExprsIterator() {
    return (this.splitExprs == null) ? null : this.splitExprs.iterator();
  }

  public void addToSplitExprs(com.starrocks.thrift.TExpr elem) {
    if (this.splitExprs == null) {
      this.splitExprs = new java.util.ArrayList<com.starrocks.thrift.TExpr>();
    }
    this.splitExprs.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<com.starrocks.thrift.TExpr> getSplitExprs() {
    return this.splitExprs;
  }

  public TSplitDataStreamSink setSplitExprs(@org.apache.thrift.annotation.Nullable java.util.List<com.starrocks.thrift.TExpr> splitExprs) {
    this.splitExprs = splitExprs;
    return this;
  }

  public void unsetSplitExprs() {
    this.splitExprs = null;
  }

  /** Returns true if field splitExprs is set (has been assigned a value) and false otherwise */
  public boolean isSetSplitExprs() {
    return this.splitExprs != null;
  }

  public void setSplitExprsIsSet(boolean value) {
    if (!value) {
      this.splitExprs = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SINKS:
      if (value == null) {
        unsetSinks();
      } else {
        setSinks((java.util.List<TDataStreamSink>)value);
      }
      break;

    case DESTINATIONS:
      if (value == null) {
        unsetDestinations();
      } else {
        setDestinations((java.util.List<java.util.List<TPlanFragmentDestination>>)value);
      }
      break;

    case SPLIT_EXPRS:
      if (value == null) {
        unsetSplitExprs();
      } else {
        setSplitExprs((java.util.List<com.starrocks.thrift.TExpr>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SINKS:
      return getSinks();

    case DESTINATIONS:
      return getDestinations();

    case SPLIT_EXPRS:
      return getSplitExprs();

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
    case SINKS:
      return isSetSinks();
    case DESTINATIONS:
      return isSetDestinations();
    case SPLIT_EXPRS:
      return isSetSplitExprs();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TSplitDataStreamSink)
      return this.equals((TSplitDataStreamSink)that);
    return false;
  }

  public boolean equals(TSplitDataStreamSink that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sinks = true && this.isSetSinks();
    boolean that_present_sinks = true && that.isSetSinks();
    if (this_present_sinks || that_present_sinks) {
      if (!(this_present_sinks && that_present_sinks))
        return false;
      if (!this.sinks.equals(that.sinks))
        return false;
    }

    boolean this_present_destinations = true && this.isSetDestinations();
    boolean that_present_destinations = true && that.isSetDestinations();
    if (this_present_destinations || that_present_destinations) {
      if (!(this_present_destinations && that_present_destinations))
        return false;
      if (!this.destinations.equals(that.destinations))
        return false;
    }

    boolean this_present_splitExprs = true && this.isSetSplitExprs();
    boolean that_present_splitExprs = true && that.isSetSplitExprs();
    if (this_present_splitExprs || that_present_splitExprs) {
      if (!(this_present_splitExprs && that_present_splitExprs))
        return false;
      if (!this.splitExprs.equals(that.splitExprs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSinks()) ? 131071 : 524287);
    if (isSetSinks())
      hashCode = hashCode * 8191 + sinks.hashCode();

    hashCode = hashCode * 8191 + ((isSetDestinations()) ? 131071 : 524287);
    if (isSetDestinations())
      hashCode = hashCode * 8191 + destinations.hashCode();

    hashCode = hashCode * 8191 + ((isSetSplitExprs()) ? 131071 : 524287);
    if (isSetSplitExprs())
      hashCode = hashCode * 8191 + splitExprs.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TSplitDataStreamSink other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetSinks(), other.isSetSinks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSinks()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sinks, other.sinks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDestinations(), other.isSetDestinations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDestinations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.destinations, other.destinations);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSplitExprs(), other.isSetSplitExprs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSplitExprs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.splitExprs, other.splitExprs);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TSplitDataStreamSink(");
    boolean first = true;

    if (isSetSinks()) {
      sb.append("sinks:");
      if (this.sinks == null) {
        sb.append("null");
      } else {
        sb.append(this.sinks);
      }
      first = false;
    }
    if (isSetDestinations()) {
      if (!first) sb.append(", ");
      sb.append("destinations:");
      if (this.destinations == null) {
        sb.append("null");
      } else {
        sb.append(this.destinations);
      }
      first = false;
    }
    if (isSetSplitExprs()) {
      if (!first) sb.append(", ");
      sb.append("splitExprs:");
      if (this.splitExprs == null) {
        sb.append("null");
      } else {
        sb.append(this.splitExprs);
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

  private static class TSplitDataStreamSinkStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TSplitDataStreamSinkStandardScheme getScheme() {
      return new TSplitDataStreamSinkStandardScheme();
    }
  }

  private static class TSplitDataStreamSinkStandardScheme extends org.apache.thrift.scheme.StandardScheme<TSplitDataStreamSink> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TSplitDataStreamSink struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SINKS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list100 = iprot.readListBegin();
                struct.sinks = new java.util.ArrayList<TDataStreamSink>(_list100.size);
                @org.apache.thrift.annotation.Nullable TDataStreamSink _elem101;
                for (int _i102 = 0; _i102 < _list100.size; ++_i102)
                {
                  _elem101 = new TDataStreamSink();
                  _elem101.read(iprot);
                  struct.sinks.add(_elem101);
                }
                iprot.readListEnd();
              }
              struct.setSinksIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DESTINATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list103 = iprot.readListBegin();
                struct.destinations = new java.util.ArrayList<java.util.List<TPlanFragmentDestination>>(_list103.size);
                @org.apache.thrift.annotation.Nullable java.util.List<TPlanFragmentDestination> _elem104;
                for (int _i105 = 0; _i105 < _list103.size; ++_i105)
                {
                  {
                    org.apache.thrift.protocol.TList _list106 = iprot.readListBegin();
                    _elem104 = new java.util.ArrayList<TPlanFragmentDestination>(_list106.size);
                    @org.apache.thrift.annotation.Nullable TPlanFragmentDestination _elem107;
                    for (int _i108 = 0; _i108 < _list106.size; ++_i108)
                    {
                      _elem107 = new TPlanFragmentDestination();
                      _elem107.read(iprot);
                      _elem104.add(_elem107);
                    }
                    iprot.readListEnd();
                  }
                  struct.destinations.add(_elem104);
                }
                iprot.readListEnd();
              }
              struct.setDestinationsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SPLIT_EXPRS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list109 = iprot.readListBegin();
                struct.splitExprs = new java.util.ArrayList<com.starrocks.thrift.TExpr>(_list109.size);
                @org.apache.thrift.annotation.Nullable com.starrocks.thrift.TExpr _elem110;
                for (int _i111 = 0; _i111 < _list109.size; ++_i111)
                {
                  _elem110 = new com.starrocks.thrift.TExpr();
                  _elem110.read(iprot);
                  struct.splitExprs.add(_elem110);
                }
                iprot.readListEnd();
              }
              struct.setSplitExprsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TSplitDataStreamSink struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sinks != null) {
        if (struct.isSetSinks()) {
          oprot.writeFieldBegin(SINKS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.sinks.size()));
            for (TDataStreamSink _iter112 : struct.sinks)
            {
              _iter112.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.destinations != null) {
        if (struct.isSetDestinations()) {
          oprot.writeFieldBegin(DESTINATIONS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.destinations.size()));
            for (java.util.List<TPlanFragmentDestination> _iter113 : struct.destinations)
            {
              {
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter113.size()));
                for (TPlanFragmentDestination _iter114 : _iter113)
                {
                  _iter114.write(oprot);
                }
                oprot.writeListEnd();
              }
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.splitExprs != null) {
        if (struct.isSetSplitExprs()) {
          oprot.writeFieldBegin(SPLIT_EXPRS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.splitExprs.size()));
            for (com.starrocks.thrift.TExpr _iter115 : struct.splitExprs)
            {
              _iter115.write(oprot);
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

  private static class TSplitDataStreamSinkTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TSplitDataStreamSinkTupleScheme getScheme() {
      return new TSplitDataStreamSinkTupleScheme();
    }
  }

  private static class TSplitDataStreamSinkTupleScheme extends org.apache.thrift.scheme.TupleScheme<TSplitDataStreamSink> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSplitDataStreamSink struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSinks()) {
        optionals.set(0);
      }
      if (struct.isSetDestinations()) {
        optionals.set(1);
      }
      if (struct.isSetSplitExprs()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSinks()) {
        {
          oprot.writeI32(struct.sinks.size());
          for (TDataStreamSink _iter116 : struct.sinks)
          {
            _iter116.write(oprot);
          }
        }
      }
      if (struct.isSetDestinations()) {
        {
          oprot.writeI32(struct.destinations.size());
          for (java.util.List<TPlanFragmentDestination> _iter117 : struct.destinations)
          {
            {
              oprot.writeI32(_iter117.size());
              for (TPlanFragmentDestination _iter118 : _iter117)
              {
                _iter118.write(oprot);
              }
            }
          }
        }
      }
      if (struct.isSetSplitExprs()) {
        {
          oprot.writeI32(struct.splitExprs.size());
          for (com.starrocks.thrift.TExpr _iter119 : struct.splitExprs)
          {
            _iter119.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSplitDataStreamSink struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list120 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.sinks = new java.util.ArrayList<TDataStreamSink>(_list120.size);
          @org.apache.thrift.annotation.Nullable TDataStreamSink _elem121;
          for (int _i122 = 0; _i122 < _list120.size; ++_i122)
          {
            _elem121 = new TDataStreamSink();
            _elem121.read(iprot);
            struct.sinks.add(_elem121);
          }
        }
        struct.setSinksIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list123 = iprot.readListBegin(org.apache.thrift.protocol.TType.LIST);
          struct.destinations = new java.util.ArrayList<java.util.List<TPlanFragmentDestination>>(_list123.size);
          @org.apache.thrift.annotation.Nullable java.util.List<TPlanFragmentDestination> _elem124;
          for (int _i125 = 0; _i125 < _list123.size; ++_i125)
          {
            {
              org.apache.thrift.protocol.TList _list126 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
              _elem124 = new java.util.ArrayList<TPlanFragmentDestination>(_list126.size);
              @org.apache.thrift.annotation.Nullable TPlanFragmentDestination _elem127;
              for (int _i128 = 0; _i128 < _list126.size; ++_i128)
              {
                _elem127 = new TPlanFragmentDestination();
                _elem127.read(iprot);
                _elem124.add(_elem127);
              }
            }
            struct.destinations.add(_elem124);
          }
        }
        struct.setDestinationsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list129 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.splitExprs = new java.util.ArrayList<com.starrocks.thrift.TExpr>(_list129.size);
          @org.apache.thrift.annotation.Nullable com.starrocks.thrift.TExpr _elem130;
          for (int _i131 = 0; _i131 < _list129.size; ++_i131)
          {
            _elem130 = new com.starrocks.thrift.TExpr();
            _elem130.read(iprot);
            struct.splitExprs.add(_elem130);
          }
        }
        struct.setSplitExprsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

