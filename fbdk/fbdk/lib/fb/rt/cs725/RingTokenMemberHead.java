/* Copyright (c)2018 Rockwell Automation. All rights reserved. */
package fb.rt.cs725;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK RingTokenMemberHead
  * @author JHC
  * @version 20181018/JHC
  */
public class RingTokenMemberHead extends FBInstance
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
/** VAR Counter */
  public REAL Counter = new REAL();
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
  alg_PASSTOKEN();
  CNF.serviceEvent(this);
  alg_RUNCONVEYER();
  CNF.serviceEvent(this);
  alg_S4();
  CNF.serviceEvent(this);
}
private static final int index_IDLE = 1;
private void state_IDLE(){
  eccState = index_IDLE;
  alg_S1();
  CNF.serviceEvent(this);
  alg_RUNCONVEYER();
  CNF.serviceEvent(this);
}
private static final int index_HasRequest = 2;
private void state_HasRequest(){
  eccState = index_HasRequest;
  alg_HOLDTOKEN();
  CNF.serviceEvent(this);
  alg_S2();
  CNF.serviceEvent(this);
  alg_RUNCONVEYER();
  CNF.serviceEvent(this);
  alg_RESETCOUNT();
  CNF.serviceEvent(this);
}
private static final int index_BagPassedEye = 3;
private void state_BagPassedEye(){
  eccState = index_BagPassedEye;
  alg_S3();
  CNF.serviceEvent(this);
}
private static final int index_NoTokenButRequest = 4;
private void state_NoTokenButRequest(){
  eccState = index_NoTokenButRequest;
  alg_PASSTOKEN();
  CNF.serviceEvent(this);
  alg_BLOCKCONVEYER();
  CNF.serviceEvent(this);
  alg_S5();
  CNF.serviceEvent(this);
}
private static final int index_BAGPASSEDFIRST = 5;
private void state_BAGPASSEDFIRST(){
  eccState = index_BAGPASSEDFIRST;
  alg_HOLDTOKEN();
  CNF.serviceEvent(this);
  alg_BLOCKAFTERDELAY();
  CNF.serviceEvent(this);
}
/** The default constructor. */
public RingTokenMemberHead(){
    super();
    TokenIn.initializeNoException("true");
    TokenOut.initializeNoException("true");
    lastTokenIn.initializeNoException("true");
    lastPEExit.initializeNoException("0");
    TokenChanged.initializeNoException("true");
    Counter.initializeNoException("0");
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
    if ((eccState == index_IDLE) && (PERequest.value)) state_HasRequest();
    else if ((eccState == index_START) && (TokenIn.value)) state_IDLE();
    else if ((eccState == index_BagPassedEye) && (NoPERequest.value)) state_START();
    else if ((eccState == index_BagPassedEye) && (PERequest.value)) state_HasRequest();
    else if ((eccState == index_START) && (PERequest.value)) state_NoTokenButRequest();
    else if ((eccState == index_NoTokenButRequest) && (TokenIn.value)) state_IDLE();
    else if ((eccState == index_IDLE) && (NoPERequest.value)) state_START();
    else if ((eccState == index_BAGPASSEDFIRST) && (PEExit.value)) state_BagPassedEye();
    else if ((eccState == index_HasRequest) && (NoPERequest.value)) state_BAGPASSEDFIRST();
    else if ((eccState == index_BAGPASSEDFIRST) && (!PEExit.value)) state_BAGPASSEDFIRST();
  }
  /** ALGORITHM INIT IN Java*/
public void alg_INIT(){
Block.value=false;
TokenOut.value=false;
System.out.println("init head, grant false, token true");

}
  /** ALGORITHM PASSTOKEN IN Java*/
public void alg_PASSTOKEN(){
TokenOut.value=true;
//System.out.println("pass");

}
  /** ALGORITHM HOLDTOKEN IN Java*/
public void alg_HOLDTOKEN(){
TokenOut.value=false;
//System.out.println("hold");

}
  /** ALGORITHM BLOCKCONVEYER IN Java*/
public void alg_BLOCKCONVEYER(){
Block.value=true;
//System.out.println("block");

}
  /** ALGORITHM RUNCONVEYER IN Java*/
public void alg_RUNCONVEYER(){
Block.value=false;
//System.out.println("run");

}
  /** ALGORITHM S1 IN ST*/
public void alg_S1(){
System.out.println("hSTATE 1");
}
  /** ALGORITHM S2 IN ST*/
public void alg_S2(){
System.out.println("hSTATE 2");
}
  /** ALGORITHM S3 IN ST*/
public void alg_S3(){
System.out.println("hSTATE 3");
}
  /** ALGORITHM S4 IN ST*/
public void alg_S4(){
System.out.println("hSTATE 4");
}
  /** ALGORITHM S5 IN ST*/
public void alg_S5(){
System.out.println("hSTATE 5");
}
  /** ALGORITHM BLOCKAFTERDELAY IN Java*/
public void alg_BLOCKAFTERDELAY(){
if(Counter.value >= 3) {
Block.value = true;
Counter.value = 0;
System.out.println("Actually blocks xD");
}
else {
Counter.value = Counter.value + 1;
}

System.out.println("Block.value");

}
  /** ALGORITHM STOPS IN ST*/
public void alg_STOPS(){
System.out.println("Head stop while on conv");
}
  /** ALGORITHM RESETCOUNT IN Java*/
public void alg_RESETCOUNT(){
Counter.value=0;

}
}
