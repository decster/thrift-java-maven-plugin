/**
 * Autogenerated by Thrift Compiler (0.20.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.starrocks.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.20.0)", date = "2025-06-16")
public enum TPartialUpdateMode implements org.apache.thrift.TEnum {
  UNKNOWN_MODE(0),
  ROW_MODE(1),
  COLUMN_UPSERT_MODE(2),
  AUTO_MODE(3),
  COLUMN_UPDATE_MODE(4);

  private final int value;

  private TPartialUpdateMode(int value) {
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
  public static TPartialUpdateMode findByValue(int value) { 
    switch (value) {
      case 0:
        return UNKNOWN_MODE;
      case 1:
        return ROW_MODE;
      case 2:
        return COLUMN_UPSERT_MODE;
      case 3:
        return AUTO_MODE;
      case 4:
        return COLUMN_UPDATE_MODE;
      default:
        return null;
    }
  }
}
