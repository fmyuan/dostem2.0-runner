/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class veg2soi_bgc {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected veg2soi_bgc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(veg2soi_bgc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_veg2soi_bgc(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRtlfalfrac(double[] value) {
    temcoreJNI.veg2soi_bgc_rtlfalfrac_set(swigCPtr, this, value);
  }

  public double[] getRtlfalfrac() {
    return temcoreJNI.veg2soi_bgc_rtlfalfrac_get(swigCPtr, this);
  }

  public void setD2wdebrisc(double value) {
    temcoreJNI.veg2soi_bgc_d2wdebrisc_set(swigCPtr, this, value);
  }

  public double getD2wdebrisc() {
    return temcoreJNI.veg2soi_bgc_d2wdebrisc_get(swigCPtr, this);
  }

  public void setLtrfalcall(double value) {
    temcoreJNI.veg2soi_bgc_ltrfalcall_set(swigCPtr, this, value);
  }

  public double getLtrfalcall() {
    return temcoreJNI.veg2soi_bgc_ltrfalcall_get(swigCPtr, this);
  }

  public void setMossdeathc(double value) {
    temcoreJNI.veg2soi_bgc_mossdeathc_set(swigCPtr, this, value);
  }

  public double getMossdeathc() {
    return temcoreJNI.veg2soi_bgc_mossdeathc_get(swigCPtr, this);
  }

  public void setLtrfalc(double[] value) {
    temcoreJNI.veg2soi_bgc_ltrfalc_set(swigCPtr, this, value);
  }

  public double[] getLtrfalc() {
    return temcoreJNI.veg2soi_bgc_ltrfalc_get(swigCPtr, this);
  }

  public void setD2wdebrisn(double value) {
    temcoreJNI.veg2soi_bgc_d2wdebrisn_set(swigCPtr, this, value);
  }

  public double getD2wdebrisn() {
    return temcoreJNI.veg2soi_bgc_d2wdebrisn_get(swigCPtr, this);
  }

  public void setLtrfalnall(double value) {
    temcoreJNI.veg2soi_bgc_ltrfalnall_set(swigCPtr, this, value);
  }

  public double getLtrfalnall() {
    return temcoreJNI.veg2soi_bgc_ltrfalnall_get(swigCPtr, this);
  }

  public void setMossdeathn(double value) {
    temcoreJNI.veg2soi_bgc_mossdeathn_set(swigCPtr, this, value);
  }

  public double getMossdeathn() {
    return temcoreJNI.veg2soi_bgc_mossdeathn_get(swigCPtr, this);
  }

  public void setLtrfaln(double[] value) {
    temcoreJNI.veg2soi_bgc_ltrfaln_set(swigCPtr, this, value);
  }

  public double[] getLtrfaln() {
    return temcoreJNI.veg2soi_bgc_ltrfaln_get(swigCPtr, this);
  }

  public veg2soi_bgc() {
    this(temcoreJNI.new_veg2soi_bgc(), true);
  }

}
