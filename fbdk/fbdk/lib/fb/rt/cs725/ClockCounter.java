/* Copyright (c)2012 nxtControl GmbH. All rights reserved. */
package fb.rt.cs725;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK ClockCounter
  * @author XPMUser
  * @version 20120225/XPMUser
  */
public class ClockCounter extends FBInstance
{
/** Clock * ScaleUpFactor = CLOCK output */
  public INT INCREMENTBY = new INT();
/** Output event qualifier */
  public DINT CLOCK = new DINT();
/** Initialization Request */
 public EventServer INIT = new EventInput(this);
/** Normal Execution Request */
 public EventServer REQ = new EventInput(this);
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
    if("INCREMENTBY".equals(s)) return INCREMENTBY;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("CLOCK".equals(s)) return CLOCK;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("INCREMENTBY".equals(ivName)) connect_INCREMENTBY((INT)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable INCREMENTBY
  * @param newIV The variable to connect
 */
  public void connect_INCREMENTBY(INT newIV){
    INCREMENTBY = newIV;
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
/** The default constructor. */
public ClockCounter(){
    super();
  }
/** {@inheritDoc}
* @param e {@inheritDoc} */
  public void serviceEvent(EventServer e){
    if (e == INIT) service_INIT();
    else if (e == REQ) service_REQ();
  }
/** Services the INIT event. */
  public void service_INIT(){
    if ((eccState == index_START)) state_INIT();
  }
/** Services the REQ event. */
  public void service_REQ(){
    if ((eccState == index_START)) state_REQ();
  }
  /** ALGORITHM INIT IN ST*/
public void alg_INIT(){
CLOCK.value=(int)(0);
}
  /** ALGORITHM REQ IN ST*/
public void alg_REQ(){
CLOCK.value=(int)(CLOCK.value+(INCREMENTBY.value));

if(CLOCK.value>=10000){
CLOCK.value=(int)(1);
};
}
}
