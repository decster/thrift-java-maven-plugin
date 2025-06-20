/**
 * Autogenerated by Thrift Compiler (0.20.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.starrocks.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.20.0)", date = "2025-06-16")
public enum TExprNodeType implements org.apache.thrift.TEnum {
  AGG_EXPR(0),
  ARITHMETIC_EXPR(1),
  BINARY_PRED(2),
  BOOL_LITERAL(3),
  CASE_EXPR(4),
  CAST_EXPR(5),
  COMPOUND_PRED(6),
  DATE_LITERAL(7),
  FLOAT_LITERAL(8),
  INT_LITERAL(9),
  DECIMAL_LITERAL(10),
  IN_PRED(11),
  IS_NULL_PRED(12),
  LIKE_PRED(13),
  LITERAL_PRED(14),
  NULL_LITERAL(15),
  SLOT_REF(16),
  STRING_LITERAL(17),
  TUPLE_IS_NULL_PRED(18),
  INFO_FUNC(19),
  FUNCTION_CALL(20),
  COMPUTE_FUNCTION_CALL(21),
  LARGE_INT_LITERAL(22),
  ARRAY_EXPR(23),
  ARRAY_ELEMENT_EXPR(24),
  ARRAY_SLICE_EXPR(25),
  TABLE_FUNCTION_EXPR(26),
  DICT_EXPR(27),
  PLACEHOLDER_EXPR(28),
  CLONE_EXPR(29),
  LAMBDA_FUNCTION_EXPR(30),
  SUBFIELD_EXPR(31),
  RUNTIME_FILTER_MIN_MAX_EXPR(32),
  MAP_ELEMENT_EXPR(33),
  BINARY_LITERAL(34),
  MAP_EXPR(35),
  DICT_QUERY_EXPR(36),
  DICTIONARY_GET_EXPR(37),
  JIT_EXPR(38),
  MATCH_EXPR(39);

  private final int value;

  private TExprNodeType(int value) {
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
  public static TExprNodeType findByValue(int value) { 
    switch (value) {
      case 0:
        return AGG_EXPR;
      case 1:
        return ARITHMETIC_EXPR;
      case 2:
        return BINARY_PRED;
      case 3:
        return BOOL_LITERAL;
      case 4:
        return CASE_EXPR;
      case 5:
        return CAST_EXPR;
      case 6:
        return COMPOUND_PRED;
      case 7:
        return DATE_LITERAL;
      case 8:
        return FLOAT_LITERAL;
      case 9:
        return INT_LITERAL;
      case 10:
        return DECIMAL_LITERAL;
      case 11:
        return IN_PRED;
      case 12:
        return IS_NULL_PRED;
      case 13:
        return LIKE_PRED;
      case 14:
        return LITERAL_PRED;
      case 15:
        return NULL_LITERAL;
      case 16:
        return SLOT_REF;
      case 17:
        return STRING_LITERAL;
      case 18:
        return TUPLE_IS_NULL_PRED;
      case 19:
        return INFO_FUNC;
      case 20:
        return FUNCTION_CALL;
      case 21:
        return COMPUTE_FUNCTION_CALL;
      case 22:
        return LARGE_INT_LITERAL;
      case 23:
        return ARRAY_EXPR;
      case 24:
        return ARRAY_ELEMENT_EXPR;
      case 25:
        return ARRAY_SLICE_EXPR;
      case 26:
        return TABLE_FUNCTION_EXPR;
      case 27:
        return DICT_EXPR;
      case 28:
        return PLACEHOLDER_EXPR;
      case 29:
        return CLONE_EXPR;
      case 30:
        return LAMBDA_FUNCTION_EXPR;
      case 31:
        return SUBFIELD_EXPR;
      case 32:
        return RUNTIME_FILTER_MIN_MAX_EXPR;
      case 33:
        return MAP_ELEMENT_EXPR;
      case 34:
        return BINARY_LITERAL;
      case 35:
        return MAP_EXPR;
      case 36:
        return DICT_QUERY_EXPR;
      case 37:
        return DICTIONARY_GET_EXPR;
      case 38:
        return JIT_EXPR;
      case 39:
        return MATCH_EXPR;
      default:
        return null;
    }
  }
}
