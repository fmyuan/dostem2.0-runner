/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class veg2gnd_env {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected veg2gnd_env(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(veg2gnd_env obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_veg2gnd_env(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRthfl(double value) {
    temcoreJNI.veg2gnd_env_rthfl_set(swigCPtr, this, value);
  }

  public double getRthfl() {
    return temcoreJNI.veg2gnd_env_rthfl_get(swigCPtr, this);
  }

  public void setSthfl(double value) {
    temcoreJNI.veg2gnd_env_sthfl_set(swigCPtr, this, value);
  }

  public double getSthfl() {
    return temcoreJNI.veg2gnd_env_sthfl_get(swigCPtr, this);
  }

  public void setRdrip(double value) {
    temcoreJNI.veg2gnd_env_rdrip_set(swigCPtr, this, value);
  }

  public double getRdrip() {
    return temcoreJNI.veg2gnd_env_rdrip_get(swigCPtr, this);
  }

  public void setSdrip(double value) {
    temcoreJNI.veg2gnd_env_sdrip_set(swigCPtr, this, value);
  }

  public double getSdrip() {
    return temcoreJNI.veg2gnd_env_sdrip_get(swigCPtr, this);
  }

  public void setSwthfl(double value) {
    temcoreJNI.veg2gnd_env_swthfl_set(swigCPtr, this, value);
  }

  public double getSwthfl() {
    return temcoreJNI.veg2gnd_env_swthfl_get(swigCPtr, this);
  }

  public veg2gnd_env() {
    this(temcoreJNI.new_veg2gnd_env(), true);
  }

}
