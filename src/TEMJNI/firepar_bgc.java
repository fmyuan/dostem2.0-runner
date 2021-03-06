/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class firepar_bgc {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected firepar_bgc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(firepar_bgc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_firepar_bgc(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVsmburn(double value) {
    temcoreJNI.firepar_bgc_vsmburn_set(swigCPtr, this, value);
  }

  public double getVsmburn() {
    return temcoreJNI.firepar_bgc_vsmburn_get(swigCPtr, this);
  }

  public void setFoslburn(double[] value) {
    temcoreJNI.firepar_bgc_foslburn_set(swigCPtr, this, value);
  }

  public double[] getFoslburn() {
    return temcoreJNI.firepar_bgc_foslburn_get(swigCPtr, this);
  }

  public void setFvcomb(double[] value) {
    temcoreJNI.firepar_bgc_fvcomb_set(swigCPtr, this, value);
  }

  public double[] getFvcomb() {
    return temcoreJNI.firepar_bgc_fvcomb_get(swigCPtr, this);
  }

  public void setFvdead(double[] value) {
    temcoreJNI.firepar_bgc_fvdead_set(swigCPtr, this, value);
  }

  public double[] getFvdead() {
    return temcoreJNI.firepar_bgc_fvdead_get(swigCPtr, this);
  }

  public void setR_retain_c(double value) {
    temcoreJNI.firepar_bgc_r_retain_c_set(swigCPtr, this, value);
  }

  public double getR_retain_c() {
    return temcoreJNI.firepar_bgc_r_retain_c_get(swigCPtr, this);
  }

  public void setR_retain_n(double value) {
    temcoreJNI.firepar_bgc_r_retain_n_set(swigCPtr, this, value);
  }

  public double getR_retain_n() {
    return temcoreJNI.firepar_bgc_r_retain_n_get(swigCPtr, this);
  }

  public firepar_bgc() {
    this(temcoreJNI.new_firepar_bgc(), true);
  }

}
