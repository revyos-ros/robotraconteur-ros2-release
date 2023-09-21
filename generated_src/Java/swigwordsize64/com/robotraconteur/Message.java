/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.robotraconteur;

public class Message extends RRValue {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Message(long cPtr, boolean cMemoryOwn) {
    super(RobotRaconteurJavaJNI.Message_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Message obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwnDerived) {
      swigCMemOwnDerived = false;
      RobotRaconteurJavaJNI.delete_Message(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public void setHeader(MessageHeader value) {
    RobotRaconteurJavaJNI.Message_header_set(swigCPtr, this, MessageHeader.getCPtr(value), value);
  }

  public MessageHeader getHeader() {
    long cPtr = RobotRaconteurJavaJNI.Message_header_get(swigCPtr, this);
    return (cPtr == 0) ? null : new MessageHeader(cPtr, true);
  }

  public void setEntries(vectorptr_messageentry value) {
    RobotRaconteurJavaJNI.Message_entries_set(swigCPtr, this, vectorptr_messageentry.getCPtr(value), value);
  }

  public vectorptr_messageentry getEntries() {
    long cPtr = RobotRaconteurJavaJNI.Message_entries_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vectorptr_messageentry(cPtr, false);
  }

  public Message() {
    this(RobotRaconteurJavaJNI.new_Message(), true);
  }

  public long computeSize() {
    return RobotRaconteurJavaJNI.Message_computeSize(swigCPtr, this);
  }

  public MessageEntry findEntry(String name) {
    long cPtr = RobotRaconteurJavaJNI.Message_findEntry(swigCPtr, this, name);
    return (cPtr == 0) ? null : new MessageEntry(cPtr, true);
  }

  public MessageEntry addEntry(MessageEntryType t, String name) {
    long cPtr = RobotRaconteurJavaJNI.Message_addEntry(swigCPtr, this, t.swigValue(), name);
    return (cPtr == 0) ? null : new MessageEntry(cPtr, true);
  }

}