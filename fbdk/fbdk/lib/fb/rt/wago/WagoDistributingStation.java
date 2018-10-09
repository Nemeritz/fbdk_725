/* Copyright (c)2011 Rockwell Automation. All rights reserved. */
package fb.rt.wago;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK WagoDistributingStation
  * @author JHC
  * @version 20110331/JHC
  */
public class WagoDistributingStation extends FBInstance
{
/** Input event qualifier */
  public BOOL PusherBack = new BOOL();
/** Input event qualifier */
  public BOOL PusherFront = new BOOL();
/** Input event qualifier */
  public BOOL ArmAtPickup = new BOOL();
/** Input event qualifier */
  public BOOL ArmAtDropoff = new BOOL();
/** Input event qualifier */
  public BOOL CylinderEmpty = new BOOL();
/** VAR PusherForward */
  public BOOL PusherForward = new BOOL();
/** VAR ArmSUCKING */
  public BOOL ArmSUCKING = new BOOL();
/** VAR ArmRELEASE */
  public BOOL ArmRELEASE = new BOOL();
/** VAR ArmPICKINGUP */
  public BOOL ArmPICKINGUP = new BOOL();
/** Output event qualifier */
  public BOOL ArmDROPPINGOFF = new BOOL();
/** EVENT InputsChange */
 public EventOutput InputsChange = new EventOutput();
/** EVENT OutputsChange */
 public EventOutput OutputsChange = new EventOutput();
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventServer eiNamed(String s){
    if("InputsChange".equals(s)) return InputsChange;
    return super.eiNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventOutput eoNamed(String s){
    if("OutputsChange".equals(s)) return OutputsChange;
    return super.eoNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ivNamed(String s) throws FBRManagementException{
    if("PusherBack".equals(s)) return PusherBack;
    if("PusherFront".equals(s)) return PusherFront;
    if("ArmAtPickup".equals(s)) return ArmAtPickup;
    if("ArmAtDropoff".equals(s)) return ArmAtDropoff;
    if("CylinderEmpty".equals(s)) return CylinderEmpty;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("PusherForward".equals(s)) return PusherForward;
    if("ArmSUCKING".equals(s)) return ArmSUCKING;
    if("ArmRELEASE".equals(s)) return ArmRELEASE;
    if("ArmPICKINGUP".equals(s)) return ArmPICKINGUP;
    if("ArmDROPPINGOFF".equals(s)) return ArmDROPPINGOFF;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("PusherBack".equals(ivName)) connect_PusherBack((BOOL)newIV);
    else if("PusherFront".equals(ivName)) connect_PusherFront((BOOL)newIV);
    else if("ArmAtPickup".equals(ivName)) connect_ArmAtPickup((BOOL)newIV);
    else if("ArmAtDropoff".equals(ivName)) connect_ArmAtDropoff((BOOL)newIV);
    else if("CylinderEmpty".equals(ivName)) connect_CylinderEmpty((BOOL)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable PusherBack
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PusherBack(BOOL newIV) throws FBRManagementException{
    PusherBack = newIV;
    DistStnPusher.connectIVNoException("PosBack",PusherBack);
    }
/** Connect the given variable to the input variable PusherFront
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PusherFront(BOOL newIV) throws FBRManagementException{
    PusherFront = newIV;
    DistStnPusher.connectIVNoException("PosFront",PusherFront);
    }
/** Connect the given variable to the input variable ArmAtPickup
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_ArmAtPickup(BOOL newIV) throws FBRManagementException{
    ArmAtPickup = newIV;
    DistStnArm.connectIVNoException("PosReadyToSuck",ArmAtPickup);
    }
/** Connect the given variable to the input variable ArmAtDropoff
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_ArmAtDropoff(BOOL newIV) throws FBRManagementException{
    ArmAtDropoff = newIV;
    DistStnArm.connectIVNoException("PosReadyToDrop",ArmAtDropoff);
    }
/** Connect the given variable to the input variable CylinderEmpty
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_CylinderEmpty(BOOL newIV) throws FBRManagementException{
    CylinderEmpty = newIV;
    DistStnPusher.connectIVNoException("CylinderEmpty",CylinderEmpty);
    }
/** FB DistStnArm */
  protected DistStnArm DistStnArm = new DistStnArm() ;
/** FB DistStnPusher */
  protected DistStnPusher DistStnPusher = new DistStnPusher() ;
/** The default constructor. */
public WagoDistributingStation(){
    super();
    PusherForward.initializeNoException("false");
    ArmSUCKING.initializeNoException("false");
    ArmRELEASE.initializeNoException("false");
    ArmPICKINGUP.initializeNoException("false");
    ArmDROPPINGOFF.initializeNoException("false");
    InputsChange.connectTo(DistStnPusher.PosChange);
    InputsChange.connectTo(DistStnArm.PosChange);
    DistStnArm.ArmCtrl.connectTo(OutputsChange);
    DistStnPusher.PusherCtrl.connectTo(OutputsChange);
    DistStnPusher.ItemStatus.connectTo(DistStnArm.ItemStatus);
    DistStnArm.ArmStatus.connectTo(DistStnPusher.ArmStatusChange);
    DistStnPusher.connectIVNoException("PosBack",PusherBack);
    DistStnPusher.connectIVNoException("PosFront",PusherFront);
    DistStnPusher.connectIVNoException("CylinderEmpty",CylinderEmpty);
    DistStnArm.connectIVNoException("PosReadyToSuck",ArmAtPickup);
    DistStnArm.connectIVNoException("PosReadyToDrop",ArmAtDropoff);
    ArmPICKINGUP = (BOOL)DistStnArm.ovNamedNoException("ArmPICKINGUP");
    ArmDROPPINGOFF = (BOOL)DistStnArm.ovNamedNoException("ArmDROPPINGOFF");
    ArmSUCKING = (BOOL)DistStnArm.ovNamedNoException("ArmSUCKING");
    ArmRELEASE = (BOOL)DistStnArm.ovNamedNoException("ArmRELEASE");
    PusherForward = (BOOL)DistStnPusher.ovNamedNoException("PusherForward");
    DistStnArm.connectIVNoException("ItemNeedingPickup",DistStnPusher.ovNamedNoException("ItemPresent"));
    DistStnPusher.connectIVNoException("ArmClear",DistStnArm.ovNamedNoException("ArmClear"));
  }
/** {@inheritDoc}
 * @param fbName {@inheritDoc}
 * @param r {@inheritDoc}
 * @throws FBRManagementException {@inheritDoc} */
  public void initialize(String fbName, Resource r)
  throws FBRManagementException{
    super.initialize(fbName,r);
    DistStnArm.initialize("DistStnArm",r);
    DistStnPusher.initialize("DistStnPusher",r);
}
/** Start the FB instances. */
public void start( ){
  DistStnArm.start();
  DistStnPusher.start();
}
/** Stop the FB instances. */
public void stop( ){
  DistStnArm.stop();
  DistStnPusher.stop();
}
}
