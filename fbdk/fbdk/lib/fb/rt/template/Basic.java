/* Copyright (c)2018 Rockwell Automation. All rights reserved. */
package fb.rt.template;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK Basic
  * @author JHC
  * @version 20181017/JHC
  */
public class Basic extends FBInstance
{
/** Input event qualifier */
  public BOOL QI = new BOOL();
/** VAR NOTQI */
  public BOOL NOTQI = new BOOL();
/** VAR QO */
  public BOOL QO = new BOOL();
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
    if("QI".equals(s)) return QI;
    if("NOTQI".equals(s)) return NOTQI;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("QO".equals(s)) return QO;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("QI".equals(ivName)) connect_QI((BOOL)newIV);
    else if("NOTQI".equals(ivName)) connect_NOTQI((BOOL)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable QI
  * @param newIV The variable to connect
 */
  public void connect_QI(BOOL newIV){
    QI = newIV;
    }
/** Connect the given variable to the input variable NOTQI
  * @param newIV The variable to connect
 */
  public void connect_NOTQI(BOOL newIV){
    NOTQI = newIV;
    }
private static final int index_START = 0;
private void state_START(){
  eccState = index_START;
  alg_RESET();
  CNF.serviceEvent(this);
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
}
private static final int index_DELAY = 3;
private void state_DELAY(){
  eccState = index_DELAY;
state_REQ();
}
private static final int index_DELAYBACK = 4;
private void state_DELAYBACK(){
  eccState = index_DELAYBACK;
state_START();
}
/** The default constructor. */
public Basic(){
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
    if ((eccState == index_START) && (QI.value)) state_DELAY();
    else if ((eccState == index_REQ) && (NOTQI.value)) state_DELAYBACK();
  }
  /** ALGORITHM INIT IN ST*/
public void alg_INIT(){
}
  /** ALGORITHM REQ IN Java*/
public void alg_REQ(){
QO.value = true;

}
  /** ALGORITHM RESET IN Java*/
public void alg_RESET(){
QO.value = false;

}
}
