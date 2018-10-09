/* Copyright (c)2012 nxtControl GmbH. All rights reserved. */
package fb.rt.cs725;import fb.rt.hmi.*;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK Conveyor_Model_WithNetwork
  * @author User
  * @version 20120225/User
  */
public class Conveyor_Model_WithNetwork extends FBInstance
{
/** VAR ConvLength */
  public INT ConvLength = new INT();
/** VAR PEPositions */
  public ARRAY PEPositions = new ARRAY(new DINT(),6);
/** VAR MergePositions */
  public ARRAY MergePositions = new ARRAY(new DINT(),3);
/** VAR BagInID */
  public DINT BagInID = new DINT();
/** VAR BagInLength */
  public DINT BagInLength = new DINT();
/** VAR msSinceMidnight */
  public DINT msSinceMidnight = new DINT();
/** VAR MotorForward */
  public BOOL MotorForward = new BOOL();
/** VAR BagMerge1ID */
  public DINT BagMerge1ID = new DINT();
/** VAR BagMerge1Length */
  public DINT BagMerge1Length = new DINT();
/** VAR BagMerge2ID */
  public DINT BagMerge2ID = new DINT();
/** VAR BagMerge2Length */
  public DINT BagMerge2Length = new DINT();
/** VAR MotorFeedback */
  public BOOL MotorFeedback = new BOOL();
/** VAR BagOutID */
  public DINT BagOutID = new DINT();
/** VAR BagOutLength */
  public DINT BagOutLength = new DINT();
/** VAR EncCount */
  public DINT EncCount = new DINT();
/** VAR BagOutX */
  public ARRAY BagOutX = new ARRAY(new DINT(),20);
/** VAR BagOutPE */
  public BOOL BagOutPE = new BOOL();
/** VAR BagOutPE2 */
  public BOOL BagOutPE2 = new BOOL();
/** Initialization Request */
 public EventOutput INIT = new EventOutput();
/** Normal Execution Request */
 public EventOutput TICK = new EventOutput();
/** EVENT BagIn */
 public EventOutput BagIn = new EventOutput();
/** EVENT BagMerge1 */
 public EventOutput BagMerge1 = new EventOutput();
/** EVENT BagMerge2 */
 public EventOutput BagMerge2 = new EventOutput();
/** Initialization Confirm */
 public EventOutput INITO = new EventOutput();
/** Execution Confirmation */
 public EventOutput CNF = new EventOutput();
/** EVENT BagOut */
 public EventOutput BagOut = new EventOutput();
/** EVENT BagDivertOut */
 public EventOutput BagDivertOut = new EventOutput();
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventServer eiNamed(String s){
    if("INIT".equals(s)) return INIT;
    if("TICK".equals(s)) return TICK;
    if("BagIn".equals(s)) return BagIn;
    if("BagMerge1".equals(s)) return BagMerge1;
    if("BagMerge2".equals(s)) return BagMerge2;
    return super.eiNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventOutput eoNamed(String s){
    if("INITO".equals(s)) return INITO;
    if("CNF".equals(s)) return CNF;
    if("BagOut".equals(s)) return BagOut;
    if("BagDivertOut".equals(s)) return BagDivertOut;
    return super.eoNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ivNamed(String s) throws FBRManagementException{
    if("ConvLength".equals(s)) return ConvLength;
    if("PEPositions".equals(s)) return PEPositions;
    if("MergePositions".equals(s)) return MergePositions;
    if("BagInID".equals(s)) return BagInID;
    if("BagInLength".equals(s)) return BagInLength;
    if("msSinceMidnight".equals(s)) return msSinceMidnight;
    if("MotorForward".equals(s)) return MotorForward;
    if("BagMerge1ID".equals(s)) return BagMerge1ID;
    if("BagMerge1Length".equals(s)) return BagMerge1Length;
    if("BagMerge2ID".equals(s)) return BagMerge2ID;
    if("BagMerge2Length".equals(s)) return BagMerge2Length;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("MotorFeedback".equals(s)) return MotorFeedback;
    if("BagOutID".equals(s)) return BagOutID;
    if("BagOutLength".equals(s)) return BagOutLength;
    if("EncCount".equals(s)) return EncCount;
    if("BagOutX".equals(s)) return BagOutX;
    if("BagOutPE".equals(s)) return BagOutPE;
    if("BagOutPE2".equals(s)) return BagOutPE2;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("ConvLength".equals(ivName)) connect_ConvLength((INT)newIV);
    else if("PEPositions".equals(ivName)) connect_PEPositions((ARRAY)newIV);
    else if("MergePositions".equals(ivName)) connect_MergePositions((ARRAY)newIV);
    else if("BagInID".equals(ivName)) connect_BagInID((DINT)newIV);
    else if("BagInLength".equals(ivName)) connect_BagInLength((DINT)newIV);
    else if("msSinceMidnight".equals(ivName)) connect_msSinceMidnight((DINT)newIV);
    else if("MotorForward".equals(ivName)) connect_MotorForward((BOOL)newIV);
    else if("BagMerge1ID".equals(ivName)) connect_BagMerge1ID((DINT)newIV);
    else if("BagMerge1Length".equals(ivName)) connect_BagMerge1Length((DINT)newIV);
    else if("BagMerge2ID".equals(ivName)) connect_BagMerge2ID((DINT)newIV);
    else if("BagMerge2Length".equals(ivName)) connect_BagMerge2Length((DINT)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable ConvLength
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_ConvLength(INT newIV) throws FBRManagementException{
    ConvLength = newIV;
    FB1.connectIVNoException("ConvLength",ConvLength);
    }
/** Connect the given variable to the input variable PEPositions
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PEPositions(ARRAY newIV) throws FBRManagementException{
    PEPositions = newIV;
    FB1.connectIVNoException("PEPositions",PEPositions);
    }
/** Connect the given variable to the input variable MergePositions
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_MergePositions(ARRAY newIV) throws FBRManagementException{
    MergePositions = newIV;
    FB1.connectIVNoException("MergePositions",MergePositions);
    }
/** Connect the given variable to the input variable BagInID
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_BagInID(DINT newIV) throws FBRManagementException{
    BagInID = newIV;
    FB1.connectIVNoException("BagInID",BagInID);
    }
/** Connect the given variable to the input variable BagInLength
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_BagInLength(DINT newIV) throws FBRManagementException{
    BagInLength = newIV;
    FB1.connectIVNoException("BagInLength",BagInLength);
    }
/** Connect the given variable to the input variable msSinceMidnight
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_msSinceMidnight(DINT newIV) throws FBRManagementException{
    msSinceMidnight = newIV;
    FB0.connectIVNoException("msSinceMidnight",msSinceMidnight);
    }
/** Connect the given variable to the input variable MotorForward
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_MotorForward(BOOL newIV) throws FBRManagementException{
    MotorForward = newIV;
    FB0.connectIVNoException("MotorForward",MotorForward);
    }
/** Connect the given variable to the input variable BagMerge1ID
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_BagMerge1ID(DINT newIV) throws FBRManagementException{
    BagMerge1ID = newIV;
    FB1.connectIVNoException("BagMerge1ID",BagMerge1ID);
    }
/** Connect the given variable to the input variable BagMerge1Length
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_BagMerge1Length(DINT newIV) throws FBRManagementException{
    BagMerge1Length = newIV;
    FB1.connectIVNoException("BagMerge1Length",BagMerge1Length);
    }
/** Connect the given variable to the input variable BagMerge2ID
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_BagMerge2ID(DINT newIV) throws FBRManagementException{
    BagMerge2ID = newIV;
    FB1.connectIVNoException("BagMerge2ID",BagMerge2ID);
    }
/** Connect the given variable to the input variable BagMerge2Length
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_BagMerge2Length(DINT newIV) throws FBRManagementException{
    BagMerge2Length = newIV;
    FB1.connectIVNoException("BagMerge2Length",BagMerge2Length);
    }
  public void connect_BagOutX(ANY newOV){
    BagOutX = (ARRAY)newOV;
    FB1.connectOVNoException("BagXPosData", newOV);
    }
/** {@inheritDoc}
* @param ovName {@inheritDoc}
* @param newOV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
public void connectOV(String ovName, ANY newOV) throws FBRManagementException{
	if(ovName.equals("BagOutX"))connect_BagOutX(newOV);
	else super.connectOV(ovName, newOV);}
/** FB FB0 */
  protected Conveyor_Belt_Model FB0 = new Conveyor_Belt_Model() ;
/** FB FB1 */
  protected Conveyor_Photoeyes_Model FB1 = new Conveyor_Photoeyes_Model() ;
/** The default constructor. */
public Conveyor_Model_WithNetwork(){
    super();
    INIT.connectTo(FB0.INIT);
    TICK.connectTo(FB0.TICK);
    FB0.CNF.connectTo(FB1.Tick);
    FB0.INITO.connectTo(FB1.Init);
    BagIn.connectTo(FB1.BagIn);
    FB1.BagOut.connectTo(BagOut);
    FB1.BagDivertOut.connectTo(BagDivertOut);
    BagMerge1.connectTo(FB1.BagMerge1);
    BagMerge2.connectTo(FB1.BagMerge2);
    FB1.InitO.connectTo(INITO);
    FB1.Cnf.connectTo(CNF);
    FB1.connectIVNoException("ConvLength",ConvLength);
    FB1.connectIVNoException("PEPositions",PEPositions);
    FB1.connectIVNoException("MergePositions",MergePositions);
    FB1.connectIVNoException("BagInID",BagInID);
    FB1.connectIVNoException("BagInLength",BagInLength);
    BagOutID = (DINT)FB1.ovNamedNoException("BagOutID");
    BagOutLength = (DINT)FB1.ovNamedNoException("BagOutLength");
    FB0.connectIVNoException("msSinceMidnight",msSinceMidnight);
    FB0.connectIVNoException("MotorForward",MotorForward);
    MotorFeedback = (BOOL)FB0.ovNamedNoException("MotorFeedback");
    EncCount = (DINT)FB0.ovNamedNoException("EncCount");
    FB1.connectIVNoException("BagMerge1ID",BagMerge1ID);
    FB1.connectIVNoException("BagMerge1Length",BagMerge1Length);
    FB1.connectIVNoException("BagMerge2ID",BagMerge2ID);
    FB1.connectIVNoException("BagMerge2Length",BagMerge2Length);
    BagOutX = (ARRAY)FB1.ovNamedNoException("BagXPosData");
    BagOutPE = (BOOL)FB1.ovNamedNoException("Out_PC");
    FB1.connectIVNoException("EncCount",FB0.ovNamedNoException("EncCount"));
    BagOutPE2 = (BOOL)FB1.ovNamedNoException("Out_P2");
    FB0.Accel.initializeNoException("2.0");
    FB0.Decel.initializeNoException("4.0");
    FB0.Vmax.initializeNoException("1.5");
    FB0.EncoderInc.initializeNoException("500");
    FB1.Incline.initializeNoException("0");
    FB1.AngularDisplacement.initializeNoException("0");
    FB1.ConvID.initializeNoException("1");
    FB1.PECount.initializeNoException("2");
    FB1.BagInAngle.initializeNoException("0");
    FB1.BagInWidth.initializeNoException("30");
    FB1.BagInOffset.initializeNoException("0");
    FB1.BagMerge1Angle.initializeNoException("0");
    FB1.BagMerge1Width.initializeNoException("30");
    FB1.BagMerge2Angle.initializeNoException("0");
    FB1.BagMerge2Width.initializeNoException("30");
  }
/** {@inheritDoc}
 * @param fbName {@inheritDoc}
 * @param r {@inheritDoc}
 * @throws FBRManagementException {@inheritDoc} */
  public void initialize(String fbName, Resource r)
  throws FBRManagementException{
    super.initialize(fbName,r);
    FB0.initialize("FB0",r);
    FB1.initialize("FB1",r);
}
/** Start the FB instances. */
public void start( ){
  FB0.start();
  FB1.start();
}
/** Stop the FB instances. */
public void stop( ){
  FB0.stop();
  FB1.stop();
}
}
