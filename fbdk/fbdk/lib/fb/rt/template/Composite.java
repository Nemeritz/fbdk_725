/* Copyright (c)2018 Rockwell Automation. All rights reserved. */
package fb.rt.template;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK Composite
  * @author JHC
  * @version 20181017/JHC
  */
public class Composite extends FBInstance
{
/** Input event qualifier */
  public BOOL QI = new BOOL();
/** VAR TokenIn */
  public BOOL TokenIn = new BOOL();
/** VAR PE */
  public BOOL PE = new BOOL();
/** VAR PEExit */
  public BOOL PEExit = new BOOL();
/** VAR TJC */
  public BOOL TJC = new BOOL();
/** Output event qualifier */
  public BOOL QO = new BOOL();
/** Initialization Request */
 public EventOutput INIT = new EventOutput();
/** Normal Execution Request */
 public EventOutput REQ = new EventOutput();
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
    if("TokenIn".equals(s)) return TokenIn;
    if("PE".equals(s)) return PE;
    if("PEExit".equals(s)) return PEExit;
    if("TJC".equals(s)) return TJC;
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
    else if("TokenIn".equals(ivName)) connect_TokenIn((BOOL)newIV);
    else if("PE".equals(ivName)) connect_PE((BOOL)newIV);
    else if("PEExit".equals(ivName)) connect_PEExit((BOOL)newIV);
    else if("TJC".equals(ivName)) connect_TJC((BOOL)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable QI
  * @param newIV The variable to connect
 */
  public void connect_QI(BOOL newIV){
    QI = newIV;
    }
/** Connect the given variable to the input variable TokenIn
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_TokenIn(BOOL newIV) throws FBRManagementException{
    TokenIn = newIV;
    test1.connectIVNoException("TokenIn",TokenIn);
    }
/** Connect the given variable to the input variable PE
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PE(BOOL newIV) throws FBRManagementException{
    PE = newIV;
    test1.connectIVNoException("PE",PE);
    }
/** Connect the given variable to the input variable PEExit
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PEExit(BOOL newIV) throws FBRManagementException{
    PEExit = newIV;
    test1.connectIVNoException("PEExit",PEExit);
    }
/** Connect the given variable to the input variable TJC
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_TJC(BOOL newIV) throws FBRManagementException{
    TJC = newIV;
    test1.connectIVNoException("TokenJustChanged",TJC);
    }
/** FB test1 */
  protected TwoConCtlRingMember test1 = new TwoConCtlRingMember() ;
/** FB not1 */
  protected NOT not1 = new NOT() ;
/** FB d1 */
  protected Delay d1 = new Delay() ;
/** The default constructor. */
public Composite(){
    super();
    not1.connectIVNoException("QI",test1.ovNamedNoException("TokenOut"));
    d1.connectIVNoException("NOTQI",not1.ovNamedNoException("QO"));
    d1.connectIVNoException("QI",test1.ovNamedNoException("TokenOut"));
    QO = (BOOL)d1.ovNamedNoException("QO");
    test1.connectIVNoException("PE",PE);
    test1.connectIVNoException("TokenIn",TokenIn);
    test1.connectIVNoException("PEExit",PEExit);
    test1.connectIVNoException("TokenJustChanged",TJC);
    test1.Candidate.initializeNoException("1");
    test1.Block.initializeNoException("0");
  }
/** {@inheritDoc}
 * @param fbName {@inheritDoc}
 * @param r {@inheritDoc}
 * @throws FBRManagementException {@inheritDoc} */
  public void initialize(String fbName, Resource r)
  throws FBRManagementException{
    super.initialize(fbName,r);
    test1.initialize("test1",r);
    not1.initialize("not1",r);
    d1.initialize("d1",r);
}
/** Start the FB instances. */
public void start( ){
  test1.start();
  not1.start();
  d1.start();
}
/** Stop the FB instances. */
public void stop( ){
  test1.stop();
  not1.stop();
  d1.stop();
}
}
