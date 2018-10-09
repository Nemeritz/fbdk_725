/* Copyright (c)2012 Rockwell Automation. All rights reserved. */
package fb.rt.cs725;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK TwoConveyor
  * @author JHC
  * @version 20120225/JHC
  */
public class TwoConveyor extends FBInstance
{
/** VAR BagInID */
  public DINT BagInID = new DINT();
/** VAR BagInLength */
  public DINT BagInLength = new DINT();
/** VAR msSinceMidnight */
  public DINT msSinceMidnight = new DINT();
/** VAR MotorRotate1 */
  public BOOL MotorRotate1 = new BOOL();
/** VAR MotorRotate2 */
  public BOOL MotorRotate2 = new BOOL();
/** VAR ConvLength */
  public INT ConvLength = new INT();
/** VAR PEPositions */
  public ARRAY PEPositions = new ARRAY(new DINT(),6);
/** VAR BagOutID */
  public DINT BagOutID = new DINT();
/** VAR BagOutLength */
  public DINT BagOutLength = new DINT();
/** VAR BagOutX1 */
  public ARRAY BagOutX1 = new ARRAY(new DINT(),20);
/** VAR BagOutPE1 */
  public BOOL BagOutPE1 = new BOOL();
/** VAR BagOutX2 */
  public ARRAY BagOutX2 = new ARRAY(new DINT(),20);
/** VAR BagOutPE2 */
  public BOOL BagOutPE2 = new BOOL();
/** Initialization Request */
 public EventOutput INIT = new EventOutput();
/** Normal Execution Request */
 public EventOutput TICK = new EventOutput();
/** EVENT BagIn */
 public EventOutput BagIn = new EventOutput();
/** Initialization Confirm */
 public EventOutput INITO = new EventOutput();
/** Execution Confirmation */
 public EventOutput CNF = new EventOutput();
/** EVENT BagOut */
 public EventOutput BagOut = new EventOutput();
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventServer eiNamed(String s){
    if("INIT".equals(s)) return INIT;
    if("TICK".equals(s)) return TICK;
    if("BagIn".equals(s)) return BagIn;
    return super.eiNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventOutput eoNamed(String s){
    if("INITO".equals(s)) return INITO;
    if("CNF".equals(s)) return CNF;
    if("BagOut".equals(s)) return BagOut;
    return super.eoNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ivNamed(String s) throws FBRManagementException{
    if("BagInID".equals(s)) return BagInID;
    if("BagInLength".equals(s)) return BagInLength;
    if("msSinceMidnight".equals(s)) return msSinceMidnight;
    if("MotorRotate1".equals(s)) return MotorRotate1;
    if("MotorRotate2".equals(s)) return MotorRotate2;
    if("ConvLength".equals(s)) return ConvLength;
    if("PEPositions".equals(s)) return PEPositions;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("BagOutID".equals(s)) return BagOutID;
    if("BagOutLength".equals(s)) return BagOutLength;
    if("BagOutX1".equals(s)) return BagOutX1;
    if("BagOutPE1".equals(s)) return BagOutPE1;
    if("BagOutX2".equals(s)) return BagOutX2;
    if("BagOutPE2".equals(s)) return BagOutPE2;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("BagInID".equals(ivName)) connect_BagInID((DINT)newIV);
    else if("BagInLength".equals(ivName)) connect_BagInLength((DINT)newIV);
    else if("msSinceMidnight".equals(ivName)) connect_msSinceMidnight((DINT)newIV);
    else if("MotorRotate1".equals(ivName)) connect_MotorRotate1((BOOL)newIV);
    else if("MotorRotate2".equals(ivName)) connect_MotorRotate2((BOOL)newIV);
    else if("ConvLength".equals(ivName)) connect_ConvLength((INT)newIV);
    else if("PEPositions".equals(ivName)) connect_PEPositions((ARRAY)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable BagInID
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_BagInID(DINT newIV) throws FBRManagementException{
    BagInID = newIV;
    C1.connectIVNoException("BagInID",BagInID);
    }
/** Connect the given variable to the input variable BagInLength
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_BagInLength(DINT newIV) throws FBRManagementException{
    BagInLength = newIV;
    C1.connectIVNoException("BagInLength",BagInLength);
    }
/** Connect the given variable to the input variable msSinceMidnight
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_msSinceMidnight(DINT newIV) throws FBRManagementException{
    msSinceMidnight = newIV;
    C1.connectIVNoException("msSinceMidnight",msSinceMidnight);
    C5.connectIVNoException("msSinceMidnight",msSinceMidnight);
    }
/** Connect the given variable to the input variable MotorRotate1
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_MotorRotate1(BOOL newIV) throws FBRManagementException{
    MotorRotate1 = newIV;
    C1.connectIVNoException("MotorForward",MotorRotate1);
    }
/** Connect the given variable to the input variable MotorRotate2
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_MotorRotate2(BOOL newIV) throws FBRManagementException{
    MotorRotate2 = newIV;
    C5.connectIVNoException("MotorForward",MotorRotate2);
    }
/** Connect the given variable to the input variable ConvLength
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_ConvLength(INT newIV) throws FBRManagementException{
    ConvLength = newIV;
    C1.connectIVNoException("ConvLength",ConvLength);
    C5.connectIVNoException("ConvLength",ConvLength);
    }
/** Connect the given variable to the input variable PEPositions
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PEPositions(ARRAY newIV) throws FBRManagementException{
    PEPositions = newIV;
    C1.connectIVNoException("PEPositions",PEPositions);
    C5.connectIVNoException("PEPositions",PEPositions);
    }
  public void connect_BagOutX1(ANY newOV){
    BagOutX1 = (ARRAY)newOV;
    C1.connectOVNoException("BagOutX", newOV);
    }
  public void connect_BagOutX2(ANY newOV){
    BagOutX2 = (ARRAY)newOV;
    C5.connectOVNoException("BagOutX", newOV);
    }
/** {@inheritDoc}
* @param ovName {@inheritDoc}
* @param newOV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
public void connectOV(String ovName, ANY newOV) throws FBRManagementException{
	if(ovName.equals("BagOutX1"))connect_BagOutX1(newOV);
	else if(ovName.equals("BagOutX2"))connect_BagOutX2(newOV);
	else super.connectOV(ovName, newOV);}
/** FB C1 */
  protected Conveyor_Model_WithNetwork C1 = new Conveyor_Model_WithNetwork() ;
/** FB C5 */
  protected Conveyor_Model_WithNetwork C5 = new Conveyor_Model_WithNetwork() ;
/** The default constructor. */
public TwoConveyor(){
    super();
    TICK.connectTo(C1.TICK);
    BagIn.connectTo(C1.BagIn);
    C5.CNF.connectTo(CNF);
    C5.INITO.connectTo(INITO);
    C5.BagOut.connectTo(BagOut);
    INIT.connectTo(C1.INIT);
    C1.INITO.connectTo(C5.INIT);
    C1.CNF.connectTo(C5.TICK);
    C1.BagOut.connectTo(C5.BagIn);
    C1.connectIVNoException("BagInID",BagInID);
    C1.connectIVNoException("BagInLength",BagInLength);
    C1.connectIVNoException("msSinceMidnight",msSinceMidnight);
    C1.connectIVNoException("MotorForward",MotorRotate1);
    BagOutID = (DINT)C5.ovNamedNoException("BagOutID");
    BagOutLength = (DINT)C5.ovNamedNoException("BagOutLength");
    C1.connectIVNoException("ConvLength",ConvLength);
    C1.connectIVNoException("PEPositions",PEPositions);
    C5.connectIVNoException("ConvLength",ConvLength);
    C5.connectIVNoException("PEPositions",PEPositions);
    BagOutPE1 = (BOOL)C1.ovNamedNoException("BagOutPE");
    C5.connectIVNoException("msSinceMidnight",msSinceMidnight);
    BagOutX1 = (ARRAY)C1.ovNamedNoException("BagOutX");
    C5.connectIVNoException("BagInID",C1.ovNamedNoException("BagOutID"));
    C5.connectIVNoException("BagInLength",C1.ovNamedNoException("BagOutLength"));
    C5.connectIVNoException("MotorForward",MotorRotate2);
    BagOutX2 = (ARRAY)C5.ovNamedNoException("BagOutX");
    BagOutPE2 = (BOOL)C5.ovNamedNoException("BagOutPE");
  }
/** {@inheritDoc}
 * @param fbName {@inheritDoc}
 * @param r {@inheritDoc}
 * @throws FBRManagementException {@inheritDoc} */
  public void initialize(String fbName, Resource r)
  throws FBRManagementException{
    super.initialize(fbName,r);
    C1.initialize("C1",r);
    C5.initialize("C5",r);
}
/** Start the FB instances. */
public void start( ){
  C1.start();
  C5.start();
}
/** Stop the FB instances. */
public void stop( ){
  C1.stop();
  C5.stop();
}
}
