/*
 * Copyright 2018 Dash Core Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This file was generated by SWIG (http://www.swig.org) and modified.
 * Version 3.0.12
 */

package org.dashj.bls;


import com.google.common.base.Preconditions;

public class SignatureVector extends java.util.AbstractList<Signature> {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SignatureVector(long cPtr, boolean cMemoryOwn) {
    Preconditions.checkArgument(cPtr != 0);
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SignatureVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JNI.delete_SignatureVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SignatureVector(java.util.Collection<Signature> e) {
    this.reserve(e.size());
    for(Signature value: e) {
      this.push_back(value);
    }
  }

  public SignatureVector() {
    this(JNI.new_SignatureVector__SWIG_0(), true);
  }

  public SignatureVector(SignatureVector o) {
    this(JNI.new_SignatureVector__SWIG_2(SignatureVector.getCPtr(o), o), true);
  }

  public long capacity() {
    return JNI.SignatureVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    JNI.SignatureVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return JNI.SignatureVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    JNI.SignatureVector_clear(swigCPtr, this);
  }

  public void push_back(Signature x) {
    Preconditions.checkNotNull(x);
    JNI.SignatureVector_push_back(swigCPtr, this, Signature.getCPtr(x), x);
  }

  public Signature get(int i) {
    return new Signature(JNI.SignatureVector_get(swigCPtr, this, i), false);
  }

  public Signature set(int i, Signature VECTOR_VALUE_IN) {
    Preconditions.checkNotNull(VECTOR_VALUE_IN);
    return new Signature(JNI.SignatureVector_set(swigCPtr, this, i, Signature.getCPtr(VECTOR_VALUE_IN), VECTOR_VALUE_IN), true);
  }

  public int size() {
    return JNI.SignatureVector_size(swigCPtr, this);
  }

  public void removeRange(int from, int to) {
    JNI.SignatureVector_removeRange(swigCPtr, this, from, to);
  }

}
