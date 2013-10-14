/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class Timer {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Timer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Timer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_Timer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Timer() {
    this(temcoreJNI.new_Timer(), true);
  }

  public void setMd(ModelData value) {
    temcoreJNI.Timer_md_set(swigCPtr, this, ModelData.getCPtr(value), value);
  }

  public ModelData getMd() {
    long cPtr = temcoreJNI.Timer_md_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelData(cPtr, false);
  }

  public void setYearind(int value) {
    temcoreJNI.Timer_yearind_set(swigCPtr, this, value);
  }

  public int getYearind() {
    return temcoreJNI.Timer_yearind_get(swigCPtr, this);
  }

  public void setMonind(int value) {
    temcoreJNI.Timer_monind_set(swigCPtr, this, value);
  }

  public int getMonind() {
    return temcoreJNI.Timer_monind_get(swigCPtr, this);
  }

  public void setStageyrind(int value) {
    temcoreJNI.Timer_stageyrind_set(swigCPtr, this, value);
  }

  public int getStageyrind() {
    return temcoreJNI.Timer_stageyrind_get(swigCPtr, this);
  }

  public void setOutyrind(int value) {
    temcoreJNI.Timer_outyrind_set(swigCPtr, this, value);
  }

  public int getOutyrind() {
    return temcoreJNI.Timer_outyrind_get(swigCPtr, this);
  }

  public void setEqend(boolean value) {
    temcoreJNI.Timer_eqend_set(swigCPtr, this, value);
  }

  public boolean getEqend() {
    return temcoreJNI.Timer_eqend_get(swigCPtr, this);
  }

  public void setSpend(boolean value) {
    temcoreJNI.Timer_spend_set(swigCPtr, this, value);
  }

  public boolean getSpend() {
    return temcoreJNI.Timer_spend_get(swigCPtr, this);
  }

  public void setTrend(boolean value) {
    temcoreJNI.Timer_trend_set(swigCPtr, this, value);
  }

  public boolean getTrend() {
    return temcoreJNI.Timer_trend_get(swigCPtr, this);
  }

  public void setScend(boolean value) {
    temcoreJNI.Timer_scend_set(swigCPtr, this, value);
  }

  public boolean getScend() {
    return temcoreJNI.Timer_scend_get(swigCPtr, this);
  }

  public void setMaxeqrunyrs(int value) {
    temcoreJNI.Timer_maxeqrunyrs_set(swigCPtr, this, value);
  }

  public int getMaxeqrunyrs() {
    return temcoreJNI.Timer_maxeqrunyrs_get(swigCPtr, this);
  }

  public void setSpbegyr(int value) {
    temcoreJNI.Timer_spbegyr_set(swigCPtr, this, value);
  }

  public int getSpbegyr() {
    return temcoreJNI.Timer_spbegyr_get(swigCPtr, this);
  }

  public void setSpendyr(int value) {
    temcoreJNI.Timer_spendyr_set(swigCPtr, this, value);
  }

  public int getSpendyr() {
    return temcoreJNI.Timer_spendyr_get(swigCPtr, this);
  }

  public void setSpnumyr(int value) {
    temcoreJNI.Timer_spnumyr_set(swigCPtr, this, value);
  }

  public int getSpnumyr() {
    return temcoreJNI.Timer_spnumyr_get(swigCPtr, this);
  }

  public void setTrbegyr(int value) {
    temcoreJNI.Timer_trbegyr_set(swigCPtr, this, value);
  }

  public int getTrbegyr() {
    return temcoreJNI.Timer_trbegyr_get(swigCPtr, this);
  }

  public void setTrendyr(int value) {
    temcoreJNI.Timer_trendyr_set(swigCPtr, this, value);
  }

  public int getTrendyr() {
    return temcoreJNI.Timer_trendyr_get(swigCPtr, this);
  }

  public void setTrnumyr(int value) {
    temcoreJNI.Timer_trnumyr_set(swigCPtr, this, value);
  }

  public int getTrnumyr() {
    return temcoreJNI.Timer_trnumyr_get(swigCPtr, this);
  }

  public void setScbegyr(int value) {
    temcoreJNI.Timer_scbegyr_set(swigCPtr, this, value);
  }

  public int getScbegyr() {
    return temcoreJNI.Timer_scbegyr_get(swigCPtr, this);
  }

  public void setScendyr(int value) {
    temcoreJNI.Timer_scendyr_set(swigCPtr, this, value);
  }

  public int getScendyr() {
    return temcoreJNI.Timer_scendyr_get(swigCPtr, this);
  }

  public void setScnumyr(int value) {
    temcoreJNI.Timer_scnumyr_set(swigCPtr, this, value);
  }

  public int getScnumyr() {
    return temcoreJNI.Timer_scnumyr_get(swigCPtr, this);
  }

  public void setModeldata(ModelData mdp) {
    temcoreJNI.Timer_setModeldata(swigCPtr, this, ModelData.getCPtr(mdp), mdp);
  }

  public void reset() {
    temcoreJNI.Timer_reset(swigCPtr, this);
  }

  public int getOutputYearIndex() {
    return temcoreJNI.Timer_getOutputYearIndex(swigCPtr, this);
  }

  public int getCalendarYear() {
    return temcoreJNI.Timer_getCalendarYear(swigCPtr, this);
  }

  public int getDOYIndex(int mon, int id) {
    return temcoreJNI.Timer_getDOYIndex(swigCPtr, this, mon, id);
  }

  public int getDaysInMonth(SWIGTYPE_p_int mon) {
    return temcoreJNI.Timer_getDaysInMonth(swigCPtr, this, SWIGTYPE_p_int.getCPtr(mon));
  }

  public int getCurrentMonthIndex() {
    return temcoreJNI.Timer_getCurrentMonthIndex(swigCPtr, this);
  }

  public int getNextMonthIndex() {
    return temcoreJNI.Timer_getNextMonthIndex(swigCPtr, this);
  }

  public int getCurrentYearIndex() {
    return temcoreJNI.Timer_getCurrentYearIndex(swigCPtr, this);
  }

  public void advanceOneMonth() {
    temcoreJNI.Timer_advanceOneMonth(swigCPtr, this);
  }

}