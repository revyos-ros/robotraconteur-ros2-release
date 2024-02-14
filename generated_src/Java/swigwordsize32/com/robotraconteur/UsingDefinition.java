/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.robotraconteur;

public class UsingDefinition {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected UsingDefinition(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UsingDefinition obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RobotRaconteurJavaJNI.delete_UsingDefinition(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setQualifiedName(String value) {
    RobotRaconteurJavaJNI.UsingDefinition_QualifiedName_set(swigCPtr, this, value);
  }

  public String getQualifiedName() {
    return RobotRaconteurJavaJNI.UsingDefinition_QualifiedName_get(swigCPtr, this);
  }

  public void setUnqualifiedName(String value) {
    RobotRaconteurJavaJNI.UsingDefinition_UnqualifiedName_set(swigCPtr, this, value);
  }

  public String getUnqualifiedName() {
    return RobotRaconteurJavaJNI.UsingDefinition_UnqualifiedName_get(swigCPtr, this);
  }

  public void setParseInfo(ServiceDefinitionParseInfo value) {
    RobotRaconteurJavaJNI.UsingDefinition_ParseInfo_set(swigCPtr, this, ServiceDefinitionParseInfo.getCPtr(value), value);
  }

  public ServiceDefinitionParseInfo getParseInfo() {
    long cPtr = RobotRaconteurJavaJNI.UsingDefinition_ParseInfo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ServiceDefinitionParseInfo(cPtr, false);
  }

  public ServiceDefinition getService() {
    long cPtr = RobotRaconteurJavaJNI.UsingDefinition_getService(swigCPtr, this);
    return (cPtr == 0) ? null : new ServiceDefinition(cPtr, true);
  }

  public void setService(ServiceDefinition value) {
    RobotRaconteurJavaJNI.UsingDefinition_setService(swigCPtr, this, ServiceDefinition.getCPtr(value), value);
  }

  public UsingDefinition(ServiceDefinition service) {
    this(RobotRaconteurJavaJNI.new_UsingDefinition(ServiceDefinition.getCPtr(service), service), true);
  }

  public String toString() {
    return RobotRaconteurJavaJNI.UsingDefinition_toString(swigCPtr, this);
  }

  public void fromString(String s, ServiceDefinitionParseInfo parse_info) {
    RobotRaconteurJavaJNI.UsingDefinition_fromString__SWIG_0(swigCPtr, this, s, ServiceDefinitionParseInfo.getCPtr(parse_info), parse_info);
  }

  public void fromString(String s) {
    RobotRaconteurJavaJNI.UsingDefinition_fromString__SWIG_1(swigCPtr, this, s);
  }

}