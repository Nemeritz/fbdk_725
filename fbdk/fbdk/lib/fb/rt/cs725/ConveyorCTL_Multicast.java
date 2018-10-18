/* Copyright (c)2018 Rockwell Automation. All rights reserved. */
package fb.rt.cs725;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK ConveyorCTL_Multicast
  * @author JHC
  * @version 20181018/JHC
  */
public class ConveyorCTL_Multicast extends FBInstance
{
/** Input event qualifier */
  public BOOL PE = new BOOL();
/** VAR Block */
  public BOOL Block = new BOOL();
/** VAR Candidate */
  public BOOL Candidate = new BOOL();
/** VAR reqTime */
  public INT reqTime = new INT();
/** VAR PEexit */
  public BOOL PEexit = new BOOL();
/** VAR inReq */
  public BOOL inReq = new BOOL();
/** VAR inResponse */
  public BOOL inResponse = new BOOL();
/** Output event qualifier */
  public BOOL MotoRotate = new BOOL();
/** VAR BlockCon */
  public BOOL BlockCon = new BOOL();
/** VAR outTime */
  public INT outTime = new INT();
/** VAR outReq */
  public BOOL outReq = new BOOL();
/** VAR outResponse */
  public BOOL outResponse = new BOOL();
/** VAR lastPE */
  public BOOL lastPE = new BOOL();
/** VAR lastBlock */
  public BOOL lastBlock = new BOOL();
/** VAR state */
  public INT state = new INT();
/** VAR timeStamp */
  public INT timeStamp = new INT();
/** VAR savedReqTime */
  public INT savedReqTime = new INT();
/** VAR waitFlag */
  public BOOL waitFlag = new BOOL();
/** VAR debugTick */
  public INT debugTick = new INT();
/** Initialization Request */
 public EventServer INIT = new EventInput(this);
/** Normal Execution Request */
 public EventServer REQ = new EventInput(this);
/** EVENT CAS_STOP */
 public EventServer CAS_STOP = new EventInput(this);
/** EVENT CAS_START */
 public EventServer CAS_START = new EventInput(this);
/** Initialization Confirm */
 public EventOutput INITO = new EventOutput();
/** Execution Confirmation */
 public EventOutput CNF = new EventOutput();
/** EVENT STOP */
 public EventOutput STOP = new EventOutput();
/** EVENT START */
 public EventOutput START = new EventOutput();
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventServer eiNamed(String s){
    if("INIT".equals(s)) return INIT;
    if("REQ".equals(s)) return REQ;
    if("CAS_STOP".equals(s)) return CAS_STOP;
    if("CAS_START".equals(s)) return CAS_START;
    return super.eiNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventOutput eoNamed(String s){
    if("INITO".equals(s)) return INITO;
    if("CNF".equals(s)) return CNF;
    if("STOP".equals(s)) return STOP;
    if("START".equals(s)) return START;
    return super.eoNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ivNamed(String s) throws FBRManagementException{
    if("PE".equals(s)) return PE;
    if("Block".equals(s)) return Block;
    if("Candidate".equals(s)) return Candidate;
    if("reqTime".equals(s)) return reqTime;
    if("PEexit".equals(s)) return PEexit;
    if("inReq".equals(s)) return inReq;
    if("inResponse".equals(s)) return inResponse;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("MotoRotate".equals(s)) return MotoRotate;
    if("BlockCon".equals(s)) return BlockCon;
    if("outTime".equals(s)) return outTime;
    if("outReq".equals(s)) return outReq;
    if("outResponse".equals(s)) return outResponse;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("PE".equals(ivName)) connect_PE((BOOL)newIV);
    else if("Block".equals(ivName)) connect_Block((BOOL)newIV);
    else if("Candidate".equals(ivName)) connect_Candidate((BOOL)newIV);
    else if("reqTime".equals(ivName)) connect_reqTime((INT)newIV);
    else if("PEexit".equals(ivName)) connect_PEexit((BOOL)newIV);
    else if("inReq".equals(ivName)) connect_inReq((BOOL)newIV);
    else if("inResponse".equals(ivName)) connect_inResponse((BOOL)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable PE
  * @param newIV The variable to connect
 */
  public void connect_PE(BOOL newIV){
    PE = newIV;
    }
/** Connect the given variable to the input variable Block
  * @param newIV The variable to connect
 */
  public void connect_Block(BOOL newIV){
    Block = newIV;
    }
/** Connect the given variable to the input variable Candidate
  * @param newIV The variable to connect
 */
  public void connect_Candidate(BOOL newIV){
    Candidate = newIV;
    }
/** Connect the given variable to the input variable reqTime
  * @param newIV The variable to connect
 */
  public void connect_reqTime(INT newIV){
    reqTime = newIV;
    }
/** Connect the given variable to the input variable PEexit
  * @param newIV The variable to connect
 */
  public void connect_PEexit(BOOL newIV){
    PEexit = newIV;
    }
/** Connect the given variable to the input variable inReq
  * @param newIV The variable to connect
 */
  public void connect_inReq(BOOL newIV){
    inReq = newIV;
    }
/** Connect the given variable to the input variable inResponse
  * @param newIV The variable to connect
 */
  public void connect_inResponse(BOOL newIV){
    inResponse = newIV;
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
  CNF.serviceEvent(this);
state_START();
}
private static final int index_REQ = 2;
private void state_REQ(){
  eccState = index_REQ;
  alg_REQ();
  CNF.serviceEvent(this);
state_START();
}
private static final int index_CAS_START = 3;
private void state_CAS_START(){
  eccState = index_CAS_START;
  alg_START();
  START.serviceEvent(this);
  CNF.serviceEvent(this);
state_START();
}
private static final int index_CAS_STOP = 4;
private void state_CAS_STOP(){
  eccState = index_CAS_STOP;
  alg_STOP();
  STOP.serviceEvent(this);
  CNF.serviceEvent(this);
state_START();
}
/** The default constructor. */
public ConveyorCTL_Multicast(){
    super();
    lastPE.initializeNoException("1");
    lastBlock.initializeNoException("0");
    state.initializeNoException("0");
    timeStamp.initializeNoException("0");
    savedReqTime.initializeNoException("0");
    waitFlag.initializeNoException("false");
    debugTick.initializeNoException("0");
  }
/** {@inheritDoc}
* @param e {@inheritDoc} */
  public void serviceEvent(EventServer e){
    if (e == INIT) service_INIT();
    else if (e == REQ) service_REQ();
    else if (e == CAS_STOP) service_CAS_STOP();
    else if (e == CAS_START) service_CAS_START();
  }
/** Services the INIT event. */
  public void service_INIT(){
    if ((eccState == index_START)) state_INIT();
  }
/** Services the REQ event. */
  public void service_REQ(){
    if ((eccState == index_START) && (Candidate.value)) state_REQ();
  }
/** Services the CAS_STOP event. */
  public void service_CAS_STOP(){
    if ((eccState == index_START)) state_CAS_STOP();
  }
/** Services the CAS_START event. */
  public void service_CAS_START(){
    if ((eccState == index_START)) state_CAS_START();
  }
  /** ALGORITHM INIT IN Java*/
public void alg_INIT(){
MotoRotate.value=true;
Block.value=false;
outTime.value =0;
outReq.value =false;
outResponse.value =false;

System.out.println(this+" "+MotoRotate.value);
System.out.println(MotoRotate.value);

}
  /** ALGORITHM REQ IN Java*/
public void alg_REQ(){
//state = 0,1,2 (released,wanted,held)

if (Candidate.value) {
 if (state.value != 2) {
  if (inResponse.value) {
   waitFlag.value = true;
   state.value = 2;
  } else if (!PE.value) {
   state.value = 1;
  } else {
   waitFlag.value = true;
   state.value = 0;
  }
 }

 if (lastBlock.value != Block.value) {
  if (Block.value) {
   STOP.serviceEvent(this);
   MotoRotate.value = false;
   System.out.println("Cas Stop");
  } else {
   START.serviceEvent(this);
   MotoRotate.value = true;
   System.out.println("Cas Start");

  }
  lastBlock.value = Block.value;
 }

 if (state.value == 0) {
  outReq.value = false;
  BlockCon.value = false;
  MotoRotate.value = true;
  if (inReq.value) {
   outResponse.value = true;
  } else {
   outResponse.value = false;
  }
  System.out.println("CONVEYOR IS IN THE RELEASED STATE-----------------------------");

 } else if (state.value == 1) {
  if (waitFlag.value) {
   savedReqTime.value = timeStamp.value;
   waitFlag.value = false;
  }
  System.out.println("SAVED TIME IS --------------------- " + savedReqTime);

  outReq.value = true;
  outTime.value = timeStamp.value;
  BlockCon.value = true;
  MotoRotate.value = false;
  if (inReq.value) {
   if (reqTime.value < savedReqTime.value) {
    outResponse.value = true;
    BlockCon.value = true;
    MotoRotate.value = false;

   } else {
    outResponse.value = false;
    outReq.value = false;
    BlockCon.value = false;
    MotoRotate.value = true;
    state.value = 2;
    System.out.println("CONVEYOR IS IN THE WAITING STATE-----------------------------");

   }
  }

  System.out.println("CONVEYOR IS IN THE WAITING STATE-----------------------------");

 } else {
  outReq.value = false;
  BlockCon.value = false;
  outResponse.value = false;
  if (lastPE.value != PEexit.value) {
   if (!PEexit.value && PE.value) {
    state.value = 0;
   } else if (!PEexit.value && !PE.value) {
    state.value = 1;
   }
   lastPE.value = PEexit.value;
  }




  System.out.println("CONVEYOR IS IN THE HELD STATE-----------------------------");
 }
}

timeStamp.value++;

}
  /** ALGORITHM START IN ST*/
public void alg_START(){
MotoRotate.value=true;
System.out.println(this+"//////////////////////////////////////////////////////////////// Start "+MotoRotate.value);
}
  /** ALGORITHM STOP IN ST*/
public void alg_STOP(){
MotoRotate.value=false;
System.out.println(this+"/////////////////////////////////////////////////// Stop "+MotoRotate.value);
}
}
