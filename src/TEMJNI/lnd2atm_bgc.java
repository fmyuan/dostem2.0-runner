/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class lnd2atm_bgc {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected lnd2atm_bgc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(lnd2atm_bgc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_lnd2atm_bgc(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setNep(double value) {
    temcoreJNI.lnd2atm_bgc_nep_set(swigCPtr, this, value);
  }

  public double getNep() {
    return temcoreJNI.lnd2atm_bgc_nep_get(swigCPtr, this);
  }

  public lnd2atm_bgc() {
    this(temcoreJNI.new_lnd2atm_bgc(), true);
  }

}
