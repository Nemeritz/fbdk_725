/* Copyright (c)2018 Rockwell Automation. All rights reserved. */
package fb.rt.cs725;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK RingTokenMember
  * @author JHC
  * @version 20181018/JHC
  */
public class RingTokenMember extends FBInstance
{
/** Input event qualifier */
  public BOOL PERequest = new BOOL();
/** VAR TokenIn */
  public BOOL TokenIn = new BOOL();
/** VAR PEExit */
  public BOOL PEExit = new BOOL();
/** VAR NoPERequest */
  public BOOL NoPERequest = new BOOL();
/** Output event qualifier */
  public BOOL Block = new BOOL();
/** VAR TokenOut */
  public BOOL TokenOut = new BOOL();
/** VAR lastTokenIn */
  public BOOL lastTokenIn = new BOOL();
/** VAR lastPEExit */
  public BOOL lastPEExit = new BOOL();
/** VAR TokenChanged */
  public BOOL TokenChanged = new BOOL();
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
    if("PERequest".equals(s)) return PERequest;
    if("TokenIn".equals(s)) return TokenIn;
    if("PEExit".equals(s)) return PEExit;
    if("NoPERequest".equals(s)) return NoPERequest;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("Block".equals(s)) return Block;
    if("TokenOut".equals(s)) return TokenOut;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("PERequest".equals(ivName)) connect_PERequest((BOOL)newIV);
    else if("TokenIn".equals(ivName)) connect_TokenIn((BOOL)newIV);
    else if("PEExit".equals(ivName)) connect_PEExit((BOOL)newIV);
    else if("NoPERequest".equals(ivName)) connect_NoPERequest((BOOL)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable PERequest
  * @param newIV The variable to connect
 */
  public void connect_PERequest(BOOL newIV){
    PERequest = newIV;
    }
/** Connect the given variable to the input variable TokenIn
  * @param newIV The variable to connect
 */
  public void connect_TokenIn(BOOL newIV){
    TokenIn = newIV;
    }
/** Connect the given variable to the input variable PEExit
  * @param newIV The variable to connect
 */
  public void connect_PEExit(BOOL newIV){
    PEExit = newIV;
    }
/** Connect the given variable to the input variable NoPERequest
  * @param newIV The variable to connect
 */
  public void connect_NoPERequest(BOOL newIV){
    NoPERequest = newIV;
    }
private static final int index_START = 0;
private void state_START(){
  eccState = index_START;
    if(PERequest.value) state_HasRequest();
    else if(NoPERequest.value) state_NoRequest();
}
private static final int index_HasRequest = 1;
private void state_HasRequest(){
  eccState = index_HasRequest;
  alg_HOLDTOKEN();
  CNF.serviceEvent(this);
  alg_RUNCONVEYER();
  CNF.serviceEvent(this);
}
private static final int index_NoRequest = 2;
private void state_NoRequest(){
  eccState = index_NoRequest;
  alg_PASSTOKEN();
  CNF.serviceEvent(this);
  alg_RUNCONVEYER();
  CNF.serviceEvent(this);
state_IDLE();
}
private static final int index_IDLE = 3;
private void state_IDLE(){
  eccState = index_IDLE;
  alg_PASSTOKEN();
  CNF.serviceEvent(this);
  alg_RUNCONVEYER();
  CNF.serviceEvent(this);
}
private static final int index_BagPassedEye = 4;
private void state_BagPassedEye(){
  eccState = index_BagPassedEye;
    if(NoPERequest.value) state_IDLE();
    else if(PERequest.value) state_HasRequest();
}
private static final int index_NoTokenButRequest = 5;
private void state_NoTokenButRequest(){
  eccState = index_NoTokenButRequest;
  alg_PASSTOKEN();
  CNF.serviceEvent(this);
  alg_BLOCKCONVEYER();
  CNF.serviceEvent(this);
}
/** The default constructor. */
public RingTokenMember(){
    super();
    TokenIn.initializeNoException("true");
    TokenOut.initializeNoException("true");
    lastTokenIn.initializeNoException("true");
    lastPEExit.initializeNoException("0");
    TokenChanged.initializeNoException("true");
  }
/** {@inheritDoc}
* @param e {@inheritDoc} */
  public void serviceEvent(EventServer e){
    if (e == INIT) service_INIT();
    else if (e == REQ) service_REQ();
  }
/** Services the INIT event. */
  public void service_INIT(){
  }
/** Services the REQ event. */
  public void service_REQ(){
    if ((eccState == index_HasRequest) && (PEExit.value)) state_BagPassedEye();
    else if ((eccState == index_IDLE) && (TokenIn.value)) state_START();
    else if ((eccState == index_IDLE) && (PERequest.value)) state_NoTokenButRequest();
    else if ((eccState == index_NoTokenButRequest) && (TokenIn.value)) state_START();
    else if ((eccState == index_START) && (NoPERequest.value)) state_IDLE();
  }
  /** ALGORITHM INIT IN Java*/
public void alg_INIT(){
Block.value=false;
TokenOut.value=false;
System.out.println("init head, grant false, token true");

}
  /** ALGORITHM REQ IN Java*/
public void alg_REQ(){
System.out.println("3LastTokenIn, TokenIn, TokenOut:" + lastTokenIn.value + TokenIn.value + TokenOut.value);

if(lastTokenIn.value) {
if (TokenChanged.value) {
 if (!PERequest.value) {
  Block.value = false;
  TokenOut.value = false;
  System.out.println("Conv 3: I just got token, request is coming let bag go and keep token");
 } else {
  Block.value = false;
  TokenOut.value = true;
  System.out.println("Conv 3: I just got token, no request so run conveyer but let token go");
 }
} else {
 if (!PERequest.value) {
  System.out.println("Conv 3: I had token for a while, request here and bag passed eye, keep running conv and keep token");
  Block.value = false;
  TokenOut.value = false;
 } else {
  if (PEExit.value) {
   Block.value = false;
   TokenOut.value = true;
   System.out.println("Conv 3: I had token for a while, no requests and bag passed eye, let token go");
  } else {
   Block.value = false;
   TokenOut.value = false;
   System.out.println("Conv 3: I have token, no requests and bag not passed eye yet, keep token");
  }
 }
}
}

else {
    if (!PERequest.value) {
 Block.value = true;
TokenOut.value = true;
 System.out.println("Conv 3: No token, rquest here. Wait");
    }
else {
Block.value = false;
TokenOut.value = false;
System.out.println("Conv 3: No token no request");
}
}

if(lastTokenIn.value != TokenIn.value) {
    TokenChanged.value = true;
}
else {
    TokenChanged.value = false;
}
lastTokenIn.value = TokenIn.value;

}
  /** ALGORITHM PASSTOKEN IN Java*/
public void alg_PASSTOKEN(){
TokenOut.value=true;
System.out.println("pass");

}
  /** ALGORITHM HOLDTOKEN IN Java*/
public void alg_HOLDTOKEN(){
TokenOut.value=false;
System.out.println("hold");

}
  /** ALGORITHM BLOCKCONVEYER IN Java*/
public void alg_BLOCKCONVEYER(){
Block.value=true;
System.out.println("block");

}
  /** ALGORITHM RUNCONVEYER IN Java*/
public void alg_RUNCONVEYER(){
Block.value=false;
System.out.println("run");

}
}
