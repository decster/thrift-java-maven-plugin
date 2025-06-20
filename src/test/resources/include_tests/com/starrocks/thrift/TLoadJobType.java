/**
 * Autogenerated by Thrift Compiler (0.20.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.starrocks.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.20.0)", date = "2025-06-16")
public enum TLoadJobType implements org.apache.thrift.TEnum {
  BROKER(0),
  SPARK(1),
  INSERT_QUERY(2),
  INSERT_VALUES(3),
  STREAM_LOAD(4),
  ROUTINE_LOAD(5);

  private final int value;

  private TLoadJobType(int value) {
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
  public static TLoadJobType findByValue(int value) { 
    switch (value) {
      case 0:
        return BROKER;
      case 1:
        return SPARK;
      case 2:
        return INSERT_QUERY;
      case 3:
        return INSERT_VALUES;
      case 4:
        return STREAM_LOAD;
      case 5:
        return ROUTINE_LOAD;
      default:
        return null;
    }
  }
}
