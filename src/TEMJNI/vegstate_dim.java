/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class vegstate_dim {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected vegstate_dim(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(vegstate_dim obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_vegstate_dim(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVegage(int value) {
    temcoreJNI.vegstate_dim_vegage_set(swigCPtr, this, value);
  }

  public int getVegage() {
    return temcoreJNI.vegstate_dim_vegage_get(swigCPtr, this);
  }

  public void setIfwoody(int value) {
    temcoreJNI.vegstate_dim_ifwoody_set(swigCPtr, this, value);
  }

  public int getIfwoody() {
    return temcoreJNI.vegstate_dim_ifwoody_get(swigCPtr, this);
  }

  public void setIfdeciwoody(int value) {
    temcoreJNI.vegstate_dim_ifdeciwoody_set(swigCPtr, this, value);
  }

  public int getIfdeciwoody() {
    return temcoreJNI.vegstate_dim_ifdeciwoody_get(swigCPtr, this);
  }

  public void setIfperenial(int value) {
    temcoreJNI.vegstate_dim_ifperenial_set(swigCPtr, this, value);
  }

  public int getIfperenial() {
    return temcoreJNI.vegstate_dim_ifperenial_get(swigCPtr, this);
  }

  public void setNonvascular(int value) {
    temcoreJNI.vegstate_dim_nonvascular_set(swigCPtr, this, value);
  }

  public int getNonvascular() {
    return temcoreJNI.vegstate_dim_nonvascular_get(swigCPtr, this);
  }

  public void setFnonvascular(double value) {
    temcoreJNI.vegstate_dim_fnonvascular_set(swigCPtr, this, value);
  }

  public double getFnonvascular() {
    return temcoreJNI.vegstate_dim_fnonvascular_get(swigCPtr, this);
  }

  public void setVegcov(double value) {
    temcoreJNI.vegstate_dim_vegcov_set(swigCPtr, this, value);
  }

  public double getVegcov() {
    return temcoreJNI.vegstate_dim_vegcov_get(swigCPtr, this);
  }

  public void setLai(double value) {
    temcoreJNI.vegstate_dim_lai_set(swigCPtr, this, value);
  }

  public double getLai() {
    return temcoreJNI.vegstate_dim_lai_get(swigCPtr, this);
  }

  public void setFpc(double value) {
    temcoreJNI.vegstate_dim_fpc_set(swigCPtr, this, value);
  }

  public double getFpc() {
    return temcoreJNI.vegstate_dim_fpc_get(swigCPtr, this);
  }

  public void setFrootfrac(double[] value) {
    temcoreJNI.vegstate_dim_frootfrac_set(swigCPtr, this, value);
  }

  public double[] getFrootfrac() {
    return temcoreJNI.vegstate_dim_frootfrac_get(swigCPtr, this);
  }

  public vegstate_dim() {
    this(temcoreJNI.new_vegstate_dim(), true);
  }

}
