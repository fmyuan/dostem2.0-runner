/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class veg2atm_env {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected veg2atm_env(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(veg2atm_env obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_veg2atm_env(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTran(double value) {
    temcoreJNI.veg2atm_env_tran_set(swigCPtr, this, value);
  }

  public double getTran() {
    return temcoreJNI.veg2atm_env_tran_get(swigCPtr, this);
  }

  public void setEvap(double value) {
    temcoreJNI.veg2atm_env_evap_set(swigCPtr, this, value);
  }

  public double getEvap() {
    return temcoreJNI.veg2atm_env_evap_get(swigCPtr, this);
  }

  public void setTran_pet(double value) {
    temcoreJNI.veg2atm_env_tran_pet_set(swigCPtr, this, value);
  }

  public double getTran_pet() {
    return temcoreJNI.veg2atm_env_tran_pet_get(swigCPtr, this);
  }

  public void setEvap_pet(double value) {
    temcoreJNI.veg2atm_env_evap_pet_set(swigCPtr, this, value);
  }

  public double getEvap_pet() {
    return temcoreJNI.veg2atm_env_evap_pet_get(swigCPtr, this);
  }

  public void setSublim(double value) {
    temcoreJNI.veg2atm_env_sublim_set(swigCPtr, this, value);
  }

  public double getSublim() {
    return temcoreJNI.veg2atm_env_sublim_get(swigCPtr, this);
  }

  public void setSwrefl(double value) {
    temcoreJNI.veg2atm_env_swrefl_set(swigCPtr, this, value);
  }

  public double getSwrefl() {
    return temcoreJNI.veg2atm_env_swrefl_get(swigCPtr, this);
  }

  public veg2atm_env() {
    this(temcoreJNI.new_veg2atm_env(), true);
  }

}
