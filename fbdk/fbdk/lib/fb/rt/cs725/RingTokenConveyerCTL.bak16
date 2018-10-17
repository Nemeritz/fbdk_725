/* Copyright (c)2018 Rockwell Automation. All rights reserved. */
package fb.rt.cs725;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK RingTokenConveyerCTL
  * @author JHC
  * @version 20181015/JHC
  */
public class RingTokenConveyerCTL extends FBInstance
{
/** Input event qualifier */
  public BOOL PERequest = new BOOL();
/** VAR TokenIn */
  public BOOL TokenIn = new BOOL();
/** VAR Candidate */
  public BOOL Candidate = new BOOL();
/** VAR PE */
  public BOOL PE = new BOOL();
/** VAR PEExit */
  public BOOL PEExit = new BOOL();
/** VAR TokenOut */
  public BOOL TokenOut = new BOOL();
/** VAR BlockCon */
  public BOOL BlockCon = new BOOL();
/** VAR MotoRotate */
  public BOOL MotoRotate = new BOOL();
/** Initialization Request */
 public EventOutput INIT = new EventOutput();
/** Normal Execution Request */
 public EventOutput REQ = new EventOutput();
/** EVENT START */
 public EventOutput START = new EventOutput();
/** EVENT STOP */
 public EventOutput STOP = new EventOutput();
/** Initialization Confirm */
 public EventOutput INITO = new EventOutput();
/** Execution Confirmation */
 public EventOutput CNF = new EventOutput();
/** EVENT STOP_OUT */
 public EventOutput STOP_OUT = new EventOutput();
/** EVENT START_OUT */
 public EventOutput START_OUT = new EventOutput();
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventServer eiNamed(String s){
    if("INIT".equals(s)) return INIT;
    if("REQ".equals(s)) return REQ;
    if("START".equals(s)) return START;
    if("STOP".equals(s)) return STOP;
    return super.eiNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventOutput eoNamed(String s){
    if("INITO".equals(s)) return INITO;
    if("CNF".equals(s)) return CNF;
    if("STOP_OUT".equals(s)) return STOP_OUT;
    if("START_OUT".equals(s)) return START_OUT;
    return super.eoNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ivNamed(String s) throws FBRManagementException{
    if("PERequest".equals(s)) return PERequest;
    if("TokenIn".equals(s)) return TokenIn;
    if("Candidate".equals(s)) return Candidate;
    if("PE".equals(s)) return PE;
    if("PEExit".equals(s)) return PEExit;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("TokenOut".equals(s)) return TokenOut;
    if("BlockCon".equals(s)) return BlockCon;
    if("MotoRotate".equals(s)) return MotoRotate;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("PERequest".equals(ivName)) connect_PERequest((BOOL)newIV);
    else if("TokenIn".equals(ivName)) connect_TokenIn((BOOL)newIV);
    else if("Candidate".equals(ivName)) connect_Candidate((BOOL)newIV);
    else if("PE".equals(ivName)) connect_PE((BOOL)newIV);
    else if("PEExit".equals(ivName)) connect_PEExit((BOOL)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable PERequest
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PERequest(BOOL newIV) throws FBRManagementException{
    PERequest = newIV;
    RTM1.connectIVNoException("PERequest",PERequest);
    }
/** Connect the given variable to the input variable TokenIn
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_TokenIn(BOOL newIV) throws FBRManagementException{
    TokenIn = newIV;
    RTM1.connectIVNoException("TokenIn",TokenIn);
    }
/** Connect the given variable to the input variable Candidate
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_Candidate(BOOL newIV) throws FBRManagementException{
    Candidate = newIV;
    c2.connectIVNoException("Candidate",Candidate);
    }
/** Connect the given variable to the input variable PE
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PE(BOOL newIV) throws FBRManagementException{
    PE = newIV;
    c2.connectIVNoException("PE",PE);
    }
/** Connect the given variable to the input variable PEExit
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PEExit(BOOL newIV) throws FBRManagementException{
    PEExit = newIV;
    RTM1.connectIVNoException("PEExit",PEExit);
    }
/** FB RTM1 */
  protected RingTokenMemberHead RTM1 = new RingTokenMemberHead() ;
/** FB c2 */
  protected ConveyorCTL c2 = new ConveyorCTL() ;
/** The default constructor. */
public RingTokenConveyerCTL(){
    super();
    INIT.connectTo(RTM1.INIT);
    REQ.connectTo(RTM1.REQ);
    c2.START.connectTo(START_OUT);
    c2.STOP.connectTo(STOP_OUT);
    c2.CNF.connectTo(CNF);
    c2.INITO.connectTo(INITO);
    INIT.connectTo(c2.INIT);
    REQ.connectTo(c2.REQ);
    STOP.connectTo(c2.CAS_STOP);
    START.connectTo(c2.CAS_START);
    MotoRotate = (BOOL)c2.ovNamedNoException("MotoRotate");
    BlockCon = (BOOL)c2.ovNamedNoException("BlockCon");
    TokenOut = (BOOL)RTM1.ovNamedNoException("TokenOut");
    RTM1.connectIVNoException("TokenIn",TokenIn);
    c2.connectIVNoException("PE",PE);
    c2.connectIVNoException("Candidate",Candidate);
    RTM1.connectIVNoException("PERequest",PERequest);
    c2.connectIVNoException("Block",RTM1.ovNamedNoException("Block"));
    RTM1.connectIVNoException("PEExit",PEExit);
  }
/** {@inheritDoc}
 * @param fbName {@inheritDoc}
 * @param r {@inheritDoc}
 * @throws FBRManagementException {@inheritDoc} */
  public void initialize(String fbName, Resource r)
  throws FBRManagementException{
    super.initialize(fbName,r);
    RTM1.initialize("RTM1",r);
    c2.initialize("c2",r);
}
/** Start the FB instances. */
public void start( ){
  RTM1.start();
  c2.start();
}
/** Stop the FB instances. */
public void stop( ){
  RTM1.stop();
  c2.stop();
}
}
