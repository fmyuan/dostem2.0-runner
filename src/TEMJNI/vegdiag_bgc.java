/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class vegdiag_bgc {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected vegdiag_bgc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(vegdiag_bgc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_vegdiag_bgc(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRaq10(double value) {
    temcoreJNI.vegdiag_bgc_raq10_set(swigCPtr, this, value);
  }

  public double getRaq10() {
    return temcoreJNI.vegdiag_bgc_raq10_get(swigCPtr, this);
  }

  public void setFtemp(double value) {
    temcoreJNI.vegdiag_bgc_ftemp_set(swigCPtr, this, value);
  }

  public double getFtemp() {
    return temcoreJNI.vegdiag_bgc_ftemp_get(swigCPtr, this);
  }

  public void setGv(double value) {
    temcoreJNI.vegdiag_bgc_gv_set(swigCPtr, this, value);
  }

  public double getGv() {
    return temcoreJNI.vegdiag_bgc_gv_get(swigCPtr, this);
  }

  public void setKr(double[] value) {
    temcoreJNI.vegdiag_bgc_kr_set(swigCPtr, this, value);
  }

  public double[] getKr() {
    return temcoreJNI.vegdiag_bgc_kr_get(swigCPtr, this);
  }

  public void setFna(double value) {
    temcoreJNI.vegdiag_bgc_fna_set(swigCPtr, this, value);
  }

  public double getFna() {
    return temcoreJNI.vegdiag_bgc_fna_get(swigCPtr, this);
  }

  public void setFca(double value) {
    temcoreJNI.vegdiag_bgc_fca_set(swigCPtr, this, value);
  }

  public double getFca() {
    return temcoreJNI.vegdiag_bgc_fca_get(swigCPtr, this);
  }

  public vegdiag_bgc() {
    this(temcoreJNI.new_vegdiag_bgc(), true);
  }

}