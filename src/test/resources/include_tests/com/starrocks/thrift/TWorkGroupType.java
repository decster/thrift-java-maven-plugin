/**
 * Autogenerated by Thrift Compiler (0.20.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.starrocks.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.20.0)", date = "2025-06-16")
public enum TWorkGroupType implements org.apache.thrift.TEnum {
  WG_REALTIME(0),
  WG_NORMAL(1),
  WG_DEFAULT(2),
  WG_SHORT_QUERY(3),
  WG_MV(4);

  private final int value;

  private TWorkGroupType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  @Override
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static TWorkGroupType findByValue(int value) { 
    switch (value) {
      case 0:
        return WG_REALTIME;
      case 1:
        return WG_NORMAL;
      case 2:
        return WG_DEFAULT;
      case 3:
        return WG_SHORT_QUERY;
      case 4:
        return WG_MV;
      default:
        return null;
    }
  }
}
