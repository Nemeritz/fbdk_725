/* Copyright (c)2013 Rockwell Automation. All rights reserved. */
package fb.rt.cs725;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK ThreeConveyor
  * @author JHC
  * @version 20130429/JHC
  */
public class ThreeConveyor extends FBInstance
{
/** VAR MergePositions */
  public ARRAY MergePositions = new ARRAY(new DINT(),3);
/** VAR msSinceMidnight */
  public DINT msSinceMidnight = new DINT();
/** VAR MotorForward1 */
  public BOOL MotorForward1 = new BOOL();
/** VAR MotorForward2 */
  public BOOL MotorForward2 = new BOOL();
/** VAR MotorForward3 */
  public BOOL MotorForward3 = new BOOL();
/** VAR BagMerge1ID */
  public DINT BagMerge1ID = new DINT();
/** VAR BagMerge1Length */
  public DINT BagMerge1Length = new DINT();
/** VAR BagMerge2ID */
  public DINT BagMerge2ID = new DINT();
/** VAR BagMerge2Length */
  public DINT BagMerge2Length = new DINT();
/** VAR BagMerge3ID */
  public DINT BagMerge3ID = new DINT();
/** VAR BagMerge3Length */
  public DINT BagMerge3Length = new DINT();
/** VAR ConvLength */
  public INT ConvLength = new INT();
/** VAR PEPositions */
  public ARRAY PEPositions = new ARRAY(new DINT(),6);
/** VAR BagMerge4ID */
  public DINT BagMerge4ID = new DINT();
/** VAR BagMerge4Length */
  public DINT BagMerge4Length = new DINT();
/** VAR BagOutX1 */
  public ARRAY BagOutX1 = new ARRAY(new DINT(),20);
/** VAR BagOutPE1 */
  public BOOL BagOutPE1 = new BOOL();
/** VAR BagOutX2 */
  public ARRAY BagOutX2 = new ARRAY(new DINT(),20);
/** VAR BagOutPE2 */
  public BOOL BagOutPE2 = new BOOL();
/** VAR BagOutX3 */
  public ARRAY BagOutX3 = new ARRAY(new DINT(),20);
/** VAR BagOutPE3 */
  public BOOL BagOutPE3 = new BOOL();
/** VAR BagOutPE4 */
  public BOOL BagOutPE4 = new BOOL();
/** VAR BagOutPE5 */
  public BOOL BagOutPE5 = new BOOL();
/** VAR BagOutPE6 */
  public BOOL BagOutPE6 = new BOOL();
/** Initialization Request */
 public EventOutput INIT = new EventOutput();
/** Normal Execution Request */
 public EventOutput TICK = new EventOutput();
/** EVENT BagMerge1 */
 public EventOutput BagMerge1 = new EventOutput();
/** EVENT BagMerge2 */
 public EventOutput BagMerge2 = new EventOutput();
/** EVENT BagMerge3 */
 public EventOutput BagMerge3 = new EventOutput();
/** EVENT BagMerge4 */
 public EventOutput BagMerge4 = new EventOutput();
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
    if("BagMerge1".equals(s)) return BagMerge1;
    if("BagMerge2".equals(s)) return BagMerge2;
    if("BagMerge3".equals(s)) return BagMerge3;
    if("BagMerge4".equals(s)) return BagMerge4;
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
    if("MergePositions".equals(s)) return MergePositions;
    if("msSinceMidnight".equals(s)) return msSinceMidnight;
    if("MotorForward1".equals(s)) return MotorForward1;
    if("MotorForward2".equals(s)) return MotorForward2;
    if("MotorForward3".equals(s)) return MotorForward3;
    if("BagMerge1ID".equals(s)) return BagMerge1ID;
    if("BagMerge1Length".equals(s)) return BagMerge1Length;
    if("BagMerge2ID".equals(s)) return BagMerge2ID;
    if("BagMerge2Length".equals(s)) return BagMerge2Length;
    if("BagMerge3ID".equals(s)) return BagMerge3ID;
    if("BagMerge3Length".equals(s)) return BagMerge3Length;
    if("ConvLength".equals(s)) return ConvLength;
    if("PEPositions".equals(s)) return PEPositions;
    if("BagMerge4ID".equals(s)) return BagMerge4ID;
    if("BagMerge4Length".equals(s)) return BagMerge4Length;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("BagOutX1".equals(s)) return BagOutX1;
    if("BagOutPE1".equals(s)) return BagOutPE1;
    if("BagOutX2".equals(s)) return BagOutX2;
    if("BagOutPE2".equals(s)) return BagOutPE2;
    if("BagOutX3".equals(s)) return BagOutX3;
    if("BagOutPE3".equals(s)) return BagOutPE3;
    if("BagOutPE4".equals(s)) return BagOutPE4;
    if("BagOutPE5".equals(s)) return BagOutPE5;
    if("BagOutPE6".equals(s)) return BagOutPE6;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("MergePositions".equals(ivName)) connect_MergePositions((ARRAY)newIV);
    else if("msSinceMidnight".equals(ivName)) connect_msSinceMidnight((DINT)newIV);
    else if("MotorForward1".equals(ivName)) connect_MotorForward1((BOOL)newIV);
    else if("MotorForward2".equals(ivName)) connect_MotorForward2((BOOL)newIV);
    else if("MotorForward3".equals(ivName)) connect_MotorForward3((BOOL)newIV);
    else if("BagMerge1ID".equals(ivName)) connect_BagMerge1ID((DINT)newIV);
    else if("BagMerge1Length".equals(ivName)) connect_BagMerge1Length((DINT)newIV);
    else if("BagMerge2ID".equals(ivName)) connect_BagMerge2ID((DINT)newIV);
    else if("BagMerge2Length".equals(ivName)) connect_BagMerge2Length((DINT)newIV);
    else if("BagMerge3ID".equals(ivName)) connect_BagMerge3ID((DINT)newIV);
    else if("BagMerge3Length".equals(ivName)) connect_BagMerge3Length((DINT)newIV);
    else if("ConvLength".equals(ivName)) connect_ConvLength((INT)newIV);
    else if("PEPositions".equals(ivName)) connect_PEPositions((ARRAY)newIV);
    else if("BagMerge4ID".equals(ivName)) connect_BagMerge4ID((DINT)newIV);
    else if("BagMerge4Length".equals(ivName)) connect_BagMerge4Length((DINT)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable MergePositions
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_MergePositions(ARRAY newIV) throws FBRManagementException{
    MergePositions = newIV;
    C1.connectIVNoException("MergePositions",MergePositions);
    C2.connectIVNoException("MergePositions",MergePositions);
    C3.connectIVNoException("MergePositions",MergePositions);
    }
/** Connect the given variable to the input variable msSinceMidnight
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_msSinceMidnight(DINT newIV) throws FBRManagementException{
    msSinceMidnight = newIV;
    C1.connectIVNoException("msSinceMidnight",msSinceMidnight);
    C2.connectIVNoException("msSinceMidnight",msSinceMidnight);
    C3.connectIVNoException("msSinceMidnight",msSinceMidnight);
    }
/** Connect the given variable to the input variable MotorForward1
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_MotorForward1(BOOL newIV) throws FBRManagementException{
    MotorForward1 = newIV;
    C1.connectIVNoException("MotorForward",MotorForward1);
    }
/** Connect the given variable to the input variable MotorForward2
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_MotorForward2(BOOL newIV) throws FBRManagementException{
    MotorForward2 = newIV;
    C2.connectIVNoException("MotorForward",MotorForward2);
    }
/** Connect the given variable to the input variable MotorForward3
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_MotorForward3(BOOL newIV) throws FBRManagementException{
    MotorForward3 = newIV;
    C3.connectIVNoException("MotorForward",MotorForward3);
    }
/** Connect the given variable to the input variable BagMerge1ID
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_BagMerge1ID(DINT newIV) throws FBRManagementException{
    BagMerge1ID = newIV;
    C1.connectIVNoException("BagMerge1ID",BagMerge1ID);
    }
/** Connect the given variable to the input variable BagMerge1Length
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_BagMerge1Length(DINT newIV) throws FBRManagementException{
    BagMerge1Length = newIV;
    C1.connectIVNoException("BagMerge1Length",BagMerge1Length);
    }
/** Connect the given variable to the input variable BagMerge2ID
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_BagMerge2ID(DINT newIV) throws FBRManagementException{
    BagMerge2ID = newIV;
    C2.connectIVNoException("BagMerge1ID",BagMerge2ID);
    }
/** Connect the given variable to the input variable BagMerge2Length
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_BagMerge2Length(DINT newIV) throws FBRManagementException{
    BagMerge2Length = newIV;
    C2.connectIVNoException("BagMerge1Length",BagMerge2Length);
    }
/** Connect the given variable to the input variable BagMerge3ID
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_BagMerge3ID(DINT newIV) throws FBRManagementException{
    BagMerge3ID = newIV;
    C1.connectIVNoException("BagMerge2ID",BagMerge3ID);
    }
/** Connect the given variable to the input variable BagMerge3Length
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_BagMerge3Length(DINT newIV) throws FBRManagementException{
    BagMerge3Length = newIV;
    C1.connectIVNoException("BagMerge2Length",BagMerge3Length);
    }
/** Connect the given variable to the input variable ConvLength
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_ConvLength(INT newIV) throws FBRManagementException{
    ConvLength = newIV;
    C1.connectIVNoException("ConvLength",ConvLength);
    C2.connectIVNoException("ConvLength",ConvLength);
    C3.connectIVNoException("ConvLength",ConvLength);
    }
/** Connect the given variable to the input variable PEPositions
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PEPositions(ARRAY newIV) throws FBRManagementException{
    PEPositions = newIV;
    C1.connectIVNoException("PEPositions",PEPositions);
    C2.connectIVNoException("PEPositions",PEPositions);
    C3.connectIVNoException("PEPositions",PEPositions);
    }
/** Connect the given variable to the input variable BagMerge4ID
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_BagMerge4ID(DINT newIV) throws FBRManagementException{
    BagMerge4ID = newIV;
    C3.connectIVNoException("BagMerge1ID",BagMerge4ID);
    }
/** Connect the given variable to the input variable BagMerge4Length
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_BagMerge4Length(DINT newIV) throws FBRManagementException{
    BagMerge4Length = newIV;
    C3.connectIVNoException("BagMerge1Length",BagMerge4Length);
    }
  public void connect_BagOutX1(ANY newOV){
    BagOutX1 = (ARRAY)newOV;
    C1.connectOVNoException("BagOutX", newOV);
    }
  public void connect_BagOutX2(ANY newOV){
    BagOutX2 = (ARRAY)newOV;
    C2.connectOVNoException("BagOutX", newOV);
    }
  public void connect_BagOutX3(ANY newOV){
    BagOutX3 = (ARRAY)newOV;
    C3.connectOVNoException("BagOutX", newOV);
    }
/** {@inheritDoc}
* @param ovName {@inheritDoc}
* @param newOV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
public void connectOV(String ovName, ANY newOV) throws FBRManagementException{
	if(ovName.equals("BagOutX1"))connect_BagOutX1(newOV);
	else if(ovName.equals("BagOutX2"))connect_BagOutX2(newOV);
	else if(ovName.equals("BagOutX3"))connect_BagOutX3(newOV);
	else super.connectOV(ovName, newOV);}
/** FB C1 */
  protected Conveyor_Model_WithNetwork C1 = new Conveyor_Model_WithNetwork() ;
/** FB C2 */
  protected Conveyor_Model_WithNetwork C2 = new Conveyor_Model_WithNetwork() ;
/** FB C3 */
  protected Conveyor_Model_WithNetwork C3 = new Conveyor_Model_WithNetwork() ;
/** The default constructor. */
public ThreeConveyor(){
    super();
    INIT.connectTo(C1.INIT);
    TICK.connectTo(C1.TICK);
    BagMerge1.connectTo(C1.BagMerge1);
    BagMerge3.connectTo(C1.BagMerge2);
    C1.BagOut.connectTo(C2.BagIn);
    C1.CNF.connectTo(C2.TICK);
    C1.INITO.connectTo(C2.INIT);
    C2.INITO.connectTo(C3.INIT);
    C2.CNF.connectTo(C3.TICK);
    C2.BagOut.connectTo(C3.BagIn);
    C3.INITO.connectTo(INITO);
    C3.CNF.connectTo(CNF);
    BagMerge2.connectTo(C2.BagMerge1);
    BagMerge4.connectTo(C3.BagMerge1);
    C1.connectIVNoException("ConvLength",ConvLength);
    C1.connectIVNoException("PEPositions",PEPositions);
    C1.connectIVNoException("MergePositions",MergePositions);
    C1.connectIVNoException("msSinceMidnight",msSinceMidnight);
    C1.connectIVNoException("MotorForward",MotorForward1);
    C1.connectIVNoException("BagMerge1ID",BagMerge1ID);
    C1.connectIVNoException("BagMerge1Length",BagMerge1Length);
    C1.connectIVNoException("BagMerge2ID",BagMerge3ID);
    C1.connectIVNoException("BagMerge2Length",BagMerge3Length);
    C2.connectIVNoException("ConvLength",ConvLength);
    C2.connectIVNoException("PEPositions",PEPositions);
    C2.connectIVNoException("MergePositions",MergePositions);
    C2.connectIVNoException("BagInID",C1.ovNamedNoException("BagOutID"));
    C2.connectIVNoException("BagInLength",C1.ovNamedNoException("BagOutLength"));
    C3.connectIVNoException("BagInID",C2.ovNamedNoException("BagOutID"));
    C3.connectIVNoException("BagInLength",C2.ovNamedNoException("BagOutLength"));
    C2.connectIVNoException("msSinceMidnight",msSinceMidnight);
    C2.connectIVNoException("MotorForward",MotorForward2);
    C2.connectIVNoException("BagMerge1ID",BagMerge2ID);
    C2.connectIVNoException("BagMerge1Length",BagMerge2Length);
    C3.connectIVNoException("ConvLength",ConvLength);
    C3.connectIVNoException("PEPositions",PEPositions);
    C3.connectIVNoException("MergePositions",MergePositions);
    C3.connectIVNoException("msSinceMidnight",msSinceMidnight);
    C3.connectIVNoException("MotorForward",MotorForward3);
    BagOutX1 = (ARRAY)C1.ovNamedNoException("BagOutX");
    BagOutX2 = (ARRAY)C2.ovNamedNoException("BagOutX");
    BagOutX3 = (ARRAY)C3.ovNamedNoException("BagOutX");
    BagOutPE4 = (BOOL)C1.ovNamedNoException("BagOutPE");
    BagOutPE5 = (BOOL)C2.ovNamedNoException("BagOutPE");
    BagOutPE1 = (BOOL)C1.ovNamedNoException("BagOutPE2");
    BagOutPE2 = (BOOL)C2.ovNamedNoException("BagOutPE2");
    BagOutPE3 = (BOOL)C3.ovNamedNoException("BagOutPE2");
    C3.connectIVNoException("BagMerge1ID",BagMerge4ID);
    C3.connectIVNoException("BagMerge1Length",BagMerge4Length);
    BagOutPE6 = (BOOL)C3.ovNamedNoException("BagOutPE");
  }
/** {@inheritDoc}
 * @param fbName {@inheritDoc}
 * @param r {@inheritDoc}
 * @throws FBRManagementException {@inheritDoc} */
  public void initialize(String fbName, Resource r)
  throws FBRManagementException{
    super.initialize(fbName,r);
    C1.initialize("C1",r);
    C2.initialize("C2",r);
    C3.initialize("C3",r);
}
/** Start the FB instances. */
public void start( ){
  C1.start();
  C2.start();
  C3.start();
}
/** Stop the FB instances. */
public void stop( ){
  C1.stop();
  C2.stop();
  C3.stop();
}
}
