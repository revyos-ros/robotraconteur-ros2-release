/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.robotraconteur;

public class map_subscriptionclients extends java.util.AbstractMap<WrappedServiceSubscriptionClientID, WrappedServiceStub> {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected map_subscriptionclients(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(map_subscriptionclients obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(map_subscriptionclients obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings({"deprecation", "removal"})
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RobotRaconteurJavaJNI.delete_map_subscriptionclients(swigCPtr);
      }
      swigCPtr = 0;
    }
  }


  public int size() {
    return sizeImpl();
  }

  public boolean containsKey(java.lang.Object key) {
    if (!(key instanceof WrappedServiceSubscriptionClientID)) {
      return false;
    }

    return containsImpl((WrappedServiceSubscriptionClientID)key);
  }

  public WrappedServiceStub get(java.lang.Object key) {
    if (!(key instanceof WrappedServiceSubscriptionClientID)) {
      return null;
    }

    Iterator itr = find((WrappedServiceSubscriptionClientID) key);
    if (itr.isNot(end())) {
      return itr.getValue();
    }

    return null;
  }

  public WrappedServiceStub put(WrappedServiceSubscriptionClientID key, WrappedServiceStub value) {
    Iterator itr = find(key);
    if (itr.isNot(end())) {
      WrappedServiceStub oldValue = itr.getValue();
      itr.setValue(value);
      return oldValue;
    } else {
      putUnchecked(key, value);
      return null;
    }
  }

  public WrappedServiceStub remove(java.lang.Object key) {
    if (!(key instanceof WrappedServiceSubscriptionClientID)) {
      return null;
    }

    Iterator itr = find((WrappedServiceSubscriptionClientID) key);
    if (itr.isNot(end())) {
      WrappedServiceStub oldValue = itr.getValue();
      removeUnchecked(itr);
      return oldValue;
    } else {
      return null;
    }
  }

  public java.util.Set<Entry<WrappedServiceSubscriptionClientID, WrappedServiceStub>> entrySet() {
    java.util.Set<Entry<WrappedServiceSubscriptionClientID, WrappedServiceStub>> setToReturn =
        new java.util.HashSet<Entry<WrappedServiceSubscriptionClientID, WrappedServiceStub>>();

    Iterator itr = begin();
    final Iterator end = end();
    while (itr.isNot(end)) {
      setToReturn.add(new Entry<WrappedServiceSubscriptionClientID, WrappedServiceStub>() {
        private Iterator iterator;

        private Entry<WrappedServiceSubscriptionClientID, WrappedServiceStub> init(Iterator iterator) {
          this.iterator = iterator;
          return this;
        }

        public WrappedServiceSubscriptionClientID getKey() {
          return iterator.getKey();
        }

        public WrappedServiceStub getValue() {
          return iterator.getValue();
        }

        public WrappedServiceStub setValue(WrappedServiceStub newValue) {
          WrappedServiceStub oldValue = iterator.getValue();
          iterator.setValue(newValue);
          return oldValue;
        }
      }.init(itr));
      itr = itr.getNextUnchecked();
    }

    return setToReturn;
  }

  public map_subscriptionclients() {
    this(RobotRaconteurJavaJNI.new_map_subscriptionclients__SWIG_0(), true);
  }

  public map_subscriptionclients(map_subscriptionclients other) {
    this(RobotRaconteurJavaJNI.new_map_subscriptionclients__SWIG_1(map_subscriptionclients.getCPtr(other), other), true);
  }

  static protected class Iterator {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected Iterator(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(Iterator obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected static long swigRelease(Iterator obj) {
      long ptr = 0;
      if (obj != null) {
        if (!obj.swigCMemOwn)
          throw new RuntimeException("Cannot release ownership as memory is not owned");
        ptr = obj.swigCPtr;
        obj.swigCMemOwn = false;
        obj.delete();
      }
      return ptr;
    }
  
    @SuppressWarnings({"deprecation", "removal"})
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          RobotRaconteurJavaJNI.delete_map_subscriptionclients_Iterator(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    private map_subscriptionclients.Iterator getNextUnchecked() {
      return new map_subscriptionclients.Iterator(RobotRaconteurJavaJNI.map_subscriptionclients_Iterator_getNextUnchecked(swigCPtr, this), true);
    }
  
    private boolean isNot(map_subscriptionclients.Iterator other) {
      return RobotRaconteurJavaJNI.map_subscriptionclients_Iterator_isNot(swigCPtr, this, map_subscriptionclients.Iterator.getCPtr(other), other);
    }
  
    private WrappedServiceSubscriptionClientID getKey() {
      return new WrappedServiceSubscriptionClientID(RobotRaconteurJavaJNI.map_subscriptionclients_Iterator_getKey(swigCPtr, this), true);
    }
  
    private WrappedServiceStub getValue() {
      long cPtr = RobotRaconteurJavaJNI.map_subscriptionclients_Iterator_getValue(swigCPtr, this);
      return (cPtr == 0) ? null : new WrappedServiceStub(cPtr, true);
    }
  
    private void setValue(WrappedServiceStub newValue) {
      RobotRaconteurJavaJNI.map_subscriptionclients_Iterator_setValue(swigCPtr, this, WrappedServiceStub.getCPtr(newValue), newValue);
    }
  
  }

  public boolean isEmpty() {
    return RobotRaconteurJavaJNI.map_subscriptionclients_isEmpty(swigCPtr, this);
  }

  public void clear() {
    RobotRaconteurJavaJNI.map_subscriptionclients_clear(swigCPtr, this);
  }

  private map_subscriptionclients.Iterator find(WrappedServiceSubscriptionClientID key) {
    return new map_subscriptionclients.Iterator(RobotRaconteurJavaJNI.map_subscriptionclients_find(swigCPtr, this, WrappedServiceSubscriptionClientID.getCPtr(key), key), true);
  }

  private map_subscriptionclients.Iterator begin() {
    return new map_subscriptionclients.Iterator(RobotRaconteurJavaJNI.map_subscriptionclients_begin(swigCPtr, this), true);
  }

  private map_subscriptionclients.Iterator end() {
    return new map_subscriptionclients.Iterator(RobotRaconteurJavaJNI.map_subscriptionclients_end(swigCPtr, this), true);
  }

  private int sizeImpl() {
    return RobotRaconteurJavaJNI.map_subscriptionclients_sizeImpl(swigCPtr, this);
  }

  private boolean containsImpl(WrappedServiceSubscriptionClientID key) {
    return RobotRaconteurJavaJNI.map_subscriptionclients_containsImpl(swigCPtr, this, WrappedServiceSubscriptionClientID.getCPtr(key), key);
  }

  private void putUnchecked(WrappedServiceSubscriptionClientID key, WrappedServiceStub value) {
    RobotRaconteurJavaJNI.map_subscriptionclients_putUnchecked(swigCPtr, this, WrappedServiceSubscriptionClientID.getCPtr(key), key, WrappedServiceStub.getCPtr(value), value);
  }

  private void removeUnchecked(map_subscriptionclients.Iterator itr) {
    RobotRaconteurJavaJNI.map_subscriptionclients_removeUnchecked(swigCPtr, this, map_subscriptionclients.Iterator.getCPtr(itr), itr);
  }

}
