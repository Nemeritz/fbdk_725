/* Copyright (c)2018 Rockwell Automation. All rights reserved. */
package fb.rt.template;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK RingTokenMemberHead
  * @author JHC
  * @version 20181009/JHC
  */
public class RingTokenMemberHead extends FBInstance
{
/** Input event qualifier */
  public BOOL Request = new BOOL();
/** VAR TokenIn */
  public BOOL TokenIn = new BOOL();
/** Output event qualifier */
  public BOOL Grant = new BOOL();
/** VAR TokenOut */
  public BOOL TokenOut = new BOOL();
/** VAR lastTokenIn */
  public BOOL lastTokenIn = new BOOL();
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
    if("Request".equals(s)) return Request;
    if("TokenIn".equals(s)) return TokenIn;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("Grant".equals(s)) return Grant;
    if("TokenOut".equals(s)) return TokenOut;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("Request".equals(ivName)) connect_Request((BOOL)newIV);
    else if("TokenIn".equals(ivName)) connect_TokenIn((BOOL)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable Request
  * @param newIV The variable to connect
 */
  public void connect_Request(BOOL newIV){
    Request = newIV;
    }
/** Connect the given variable to the input variable TokenIn
  * @param newIV The variable to connect
 */
  public void connect_TokenIn(BOOL newIV){
    TokenIn = newIV;
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
public RingTokenMemberHead(){
    super();
    lastTokenIn.initializeNoException("0");
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
Grant.value=false;
TokenOut.value=true;
System.out.println("init head, grant false, token true");

}
  /** ALGORITHM REQ IN Java*/
public void alg_REQ(){
boolean TokenChanged;
if (TokenIn.value != lastTokenIn.value) {
TokenChanged = true;
}
else {
TokenChanged = false;
}

if(TokenChanged) {
if (TokenIn.value) {
if(Request.value) {
Grant.value = true;
TokenOut.value = false;
System.out.println("1");
}
else {
Grant.value = false;
TokenOut.value = true;
System.out.println("2");
}
}
else {
TokenOut.value = false;
Grant.value = false;
}
}

}
}
