/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.robotraconteur;

public enum DataTypes_ArrayTypes {
  DataTypes_ArrayTypes_none(0),
  DataTypes_ArrayTypes_array,
  DataTypes_ArrayTypes_multidimarray;

  public final int swigValue() {
    return swigValue;
  }

  public static DataTypes_ArrayTypes swigToEnum(int swigValue) {
    DataTypes_ArrayTypes[] swigValues = DataTypes_ArrayTypes.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (DataTypes_ArrayTypes swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + DataTypes_ArrayTypes.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private DataTypes_ArrayTypes() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private DataTypes_ArrayTypes(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private DataTypes_ArrayTypes(DataTypes_ArrayTypes swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
