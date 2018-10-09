/* Copyright (c)2012 nxtControl GmbH. All rights reserved. */
package fb.rt.cs725;import java.util.*;import java.text.SimpleDateFormat;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK ClockCounterInc
  * @author XPMUser
  * @version 20120225/XPMUser
  */
public class ClockCounterInc extends FBInstance
{
/** Clock * ScaleUpFactor = CLOCK output */
  public DINT Increment = new DINT();
/** VAR SyncValue */
  public LINT SyncValue = new LINT();
/** Output event qualifier */
  public WSTRING ClockString = new WSTRING();
/** VAR DifferenceString */
  public WSTRING DifferenceString = new WSTRING();
/** Output event qualifier */
  public LINT Clock = new LINT();
/** VAR Difference */
  public UDINT Difference = new UDINT();
/** Initialization Request */
 public EventServer INIT = new EventInput(this);
/** Normal Execution Request */
 public EventServer REQ = new EventInput(this);
/** EVENT Sync */
 public EventServer Sync = new EventInput(this);
/** Initialization Confirm */
 public EventOutput INITO = new EventOutput();
/** Execution Confirmation */
 public EventOutput CNF = new EventOutput();
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventServer eiNamed(String s){
    if("INIT".equals(s)) return INIT;
    if("REQ".equals(s)) return REQ;
    if("Sync".equals(s)) return Sync;
    return super.eiNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventOutput eoNamed(String s){
    if("INITO".equals(s)) return INITO;
    if("CNF".equals(s)) return CNF;
    return super.eoNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ivNamed(String s) throws FBRManagementException{
    if("Increment".equals(s)) return Increment;
    if("SyncValue".equals(s)) return SyncValue;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("ClockString".equals(s)) return ClockString;
    if("DifferenceString".equals(s)) return DifferenceString;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("Increment".equals(ivName)) connect_Increment((DINT)newIV);
    else if("SyncValue".equals(ivName)) connect_SyncValue((LINT)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable Increment
  * @param newIV The variable to connect
 */
  public void connect_Increment(DINT newIV){
    Increment = newIV;
    }
/** Connect the given variable to the input variable SyncValue
  * @param newIV The variable to connect
 */
  public void connect_SyncValue(LINT newIV){
    SyncValue = newIV;
    }
private static final int index_START = 0;
private void state_START(){
  eccState = index_START;
}
private static final int index_INIT = 1;
private void state_INIT(){
  eccState = index_INIT;
  alg_INIT();
  INITO.serviceEvent(this);
state_START();
}
private static final int index_REQ = 2;
private void state_REQ(){
  eccState = index_REQ;
  alg_REQ();
  CNF.serviceEvent(this);
state_START();
}
private static final int index_SYNC = 3;
private void state_SYNC(){
  eccState = index_SYNC;
  alg_Sync();
  CNF.serviceEvent(this);
state_START();
}
/** The default constructor. */
public ClockCounterInc(){
    super();
  }
/** {@inheritDoc}
* @param e {@inheritDoc} */
  public void serviceEvent(EventServer e){
    if (e == INIT) service_INIT();
    else if (e == REQ) service_REQ();
    else if (e == Sync) service_Sync();
  }
/** Services the INIT event. */
  public void service_INIT(){
    if ((eccState == index_START)) state_INIT();
  }
/** Services the REQ event. */
  public void service_REQ(){
    if ((eccState == index_START)) state_REQ();
  }
/** Services the Sync event. */
  public void service_Sync(){
    if ((eccState == index_START)) state_SYNC();
  }
  /** ALGORITHM INIT IN Java*/
public void alg_INIT(){
Clock.value = new Date().getTime() + SyncValue.value;

// with java.util.Date/Calendar api
Calendar cal = Calendar.getInstance();
cal.setTimeInMillis(Clock.value);

// and here's how to get the String representation
String timeString = new SimpleDateFormat("HH:mm:ss:SSS").format(cal.getTime());

ClockString.value = timeString;
DifferenceString.value = Long.toString(Difference.value);

}
  /** ALGORITHM REQ IN Java*/
public void alg_REQ(){
Clock.value = Clock.value + Increment.value;

// with java.util.Date/Calendar api
Calendar cal = Calendar.getInstance();
cal.setTimeInMillis(Clock.value);
// and here's how to get the String representation
String timeString = new SimpleDateFormat("HH:mm:ss:SSS").format(cal.getTime());

ClockString.value = timeString;

}
  /** ALGORITHM Sync IN ST*/
public void alg_Sync(){
Difference.value=SyncValue.value-Clock.value;
Clock.value=SyncValue.value;


System.out.println(Clock.value+" "+SyncValue.value);

ClockString.value=Long.toString(Clock.value);
DifferenceString.value=Long.toString(Difference.value);
}
}
