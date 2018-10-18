/* Copyright (c)2018 Rockwell Automation. All rights reserved. */
package fb.rt.cs725;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK TwoConCtlRingHead
  * @author JHC
  * @version 20181018/JHC
  */
public class TwoConCtlRingHead extends FBInstance
{
/** VAR Candidate */
  public BOOL Candidate = new BOOL();
/** VAR Block */
  public BOOL Block = new BOOL();
/** VAR PE */
  public BOOL PE = new BOOL();
/** VAR TokenIn */
  public BOOL TokenIn = new BOOL();
/** VAR PEExit */
  public BOOL PEExit = new BOOL();
/** VAR MotoRotate1 */
  public BOOL MotoRotate1 = new BOOL();
/** VAR MotoRotate2 */
  public BOOL MotoRotate2 = new BOOL();
/** VAR BlockCon */
  public BOOL BlockCon = new BOOL();
/** VAR TokenOut */
  public BOOL TokenOut = new BOOL();
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
    return super.eoNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ivNamed(String s) throws FBRManagementException{
    if("Candidate".equals(s)) return Candidate;
    if("Block".equals(s)) return Block;
    if("PE".equals(s)) return PE;
    if("TokenIn".equals(s)) return TokenIn;
    if("PEExit".equals(s)) return PEExit;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("MotoRotate1".equals(s)) return MotoRotate1;
    if("MotoRotate2".equals(s)) return MotoRotate2;
    if("BlockCon".equals(s)) return BlockCon;
    if("TokenOut".equals(s)) return TokenOut;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("Candidate".equals(ivName)) connect_Candidate((BOOL)newIV);
    else if("Block".equals(ivName)) connect_Block((BOOL)newIV);
    else if("PE".equals(ivName)) connect_PE((BOOL)newIV);
    else if("TokenIn".equals(ivName)) connect_TokenIn((BOOL)newIV);
    else if("PEExit".equals(ivName)) connect_PEExit((BOOL)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable Candidate
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_Candidate(BOOL newIV) throws FBRManagementException{
    Candidate = newIV;
    FC11.connectIVNoException("Candidate",Candidate);
    C2.connectIVNoException("Candidate",Candidate);
    }
/** Connect the given variable to the input variable Block
  * @param newIV The variable to connect
 */
  public void connect_Block(BOOL newIV){
    Block = newIV;
    }
/** Connect the given variable to the input variable PE
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PE(BOOL newIV) throws FBRManagementException{
    PE = newIV;
    C2.connectIVNoException("PE",PE);
    C2.connectIVNoException("PERequest",PE);
    }
/** Connect the given variable to the input variable TokenIn
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_TokenIn(BOOL newIV) throws FBRManagementException{
    TokenIn = newIV;
    C2.connectIVNoException("TokenIn",TokenIn);
    }
/** Connect the given variable to the input variable PEExit
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PEExit(BOOL newIV) throws FBRManagementException{
    PEExit = newIV;
    C2.connectIVNoException("PEExit",PEExit);
    }
/** FB FC11 */
  protected ConveyorCTL FC11 = new ConveyorCTL() ;
/** FB C2 */
  protected RingTokenConveyerCTL C2 = new RingTokenConveyerCTL() ;
/** The default constructor. */
public TwoConCtlRingHead(){
    super();
    INIT.connectTo(FC11.INIT);
    REQ.connectTo(FC11.REQ);
    C2.CNF.connectTo(CNF);
    C2.STOP_OUT.connectTo(FC11.CAS_STOP);
    C2.START_OUT.connectTo(FC11.CAS_START);
    START.connectTo(C2.START);
    STOP.connectTo(C2.STOP);
    REQ.connectTo(C2.REQ);
    FC11.INITO.connectTo(INITO);
    FC11.connectIVNoException("Candidate",Candidate);
    BlockCon = (BOOL)FC11.ovNamedNoException("BlockCon");
    MotoRotate2 = (BOOL)C2.ovNamedNoException("MotoRotate");
    FC11.connectIVNoException("Block",C2.ovNamedNoException("BlockCon"));
    C2.connectIVNoException("PE",PE);
    C2.connectIVNoException("Candidate",Candidate);
    C2.connectIVNoException("PERequest",PE);
    C2.connectIVNoException("TokenIn",TokenIn);
    TokenOut = (BOOL)C2.ovNamedNoException("TokenOut");
    C2.connectIVNoException("PEExit",PEExit);
    MotoRotate1 = (BOOL)C2.ovNamedNoException("MotoRotate");
    FC11.PE.initializeNoException("1");
  }
/** {@inheritDoc}
 * @param fbName {@inheritDoc}
 * @param r {@inheritDoc}
 * @throws FBRManagementException {@inheritDoc} */
  public void initialize(String fbName, Resource r)
  throws FBRManagementException{
    super.initialize(fbName,r);
    FC11.initialize("FC11",r);
    C2.initialize("C2",r);
}
/** Start the FB instances. */
public void start( ){
  FC11.start();
  C2.start();
}
/** Stop the FB instances. */
public void stop( ){
  FC11.stop();
  C2.stop();
}
}
