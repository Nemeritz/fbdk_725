/* Copyright (c)2018 Rockwell Automation. All rights reserved. */
package fb.rt.cs725;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK CentralServer
  * @author JHC
  * @version 20181018/JHC
  */
public class CentralServer extends FBInstance
{
/** Input event qualifier */
  public BOOL req4 = new BOOL();
/** VAR req7 */
  public BOOL req7 = new BOOL();
/** VAR exit */
  public BOOL exit = new BOOL();
/** VAR block4 */
  public BOOL block4 = new BOOL();
/** VAR block7 */
  public BOOL block7 = new BOOL();
/** VAR firstReq */
  public INT firstReq = new INT();
/** VAR secReq */
  public INT secReq = new INT();
/** VAR bagInCs */
  public BOOL bagInCs = new BOOL();
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
    if("req4".equals(s)) return req4;
    if("req7".equals(s)) return req7;
    if("exit".equals(s)) return exit;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("block4".equals(s)) return block4;
    if("block7".equals(s)) return block7;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("req4".equals(ivName)) connect_req4((BOOL)newIV);
    else if("req7".equals(ivName)) connect_req7((BOOL)newIV);
    else if("exit".equals(ivName)) connect_exit((BOOL)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable req4
  * @param newIV The variable to connect
 */
  public void connect_req4(BOOL newIV){
    req4 = newIV;
    }
/** Connect the given variable to the input variable req7
  * @param newIV The variable to connect
 */
  public void connect_req7(BOOL newIV){
    req7 = newIV;
    }
/** Connect the given variable to the input variable exit
  * @param newIV The variable to connect
 */
  public void connect_exit(BOOL newIV){
    exit = newIV;
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
public CentralServer(){
    super();
    firstReq.initializeNoException("0");
    secReq.initializeNoException("0");
    bagInCs.initializeNoException("false");
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
  /** ALGORITHM INIT IN Java*/
public void alg_INIT(){
block4.value=false;
block7.value=false;

}
  /** ALGORITHM REQ IN Java*/
public void alg_REQ(){
if (!exit.value) {
 bagInCs.value = false;
}
if (!req4.value) {
 System.out.println("Conveyor 4 is requesting");
 if (firstReq.value == 0) {
  firstReq.value = 4; //Set first request to arbitrary sensor 4
 } else {
  secReq.value = 4; 
 }
}
if (!req7.value) {
 System.out.println("Conveyor 7 is requesting");
 if (firstReq.value == 0) {
  firstReq.value = 7;
 } else {
  secReq.value = 7;
 }
}
if (!bagInCs.value) {
 if (firstReq.value == 4) {
     System.out.println("Blocking conv 7, granting conv 4");
  block4.value = false;
  block7.value = true;
  firstReq.value = secReq.value;
  secReq.value = 0;
  bagInCs.value = true;
 } else if (firstReq.value == 7) {
     System.out.println("Blocking conv 4, granting conv 7");
  block4.value = true;
  block7.value = false;
  firstReq.value = secReq.value;
  secReq.value = 0;
  bagInCs.value = true;
 } else {
  block4.value = false;
  block7.value = false;
  bagInCs.value = false;
 }
}

}
}
