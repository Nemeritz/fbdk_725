/* Copyright (c)2013 nxtControl GmbH. All rights reserved. */
package fb.rt.cs725; import java.lang.Math;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK Conveyor_Photoeyes_Model
  * @author Gareth
  * @version 20130429/Gareth
  */
public class Conveyor_Photoeyes_Model extends FBInstance
{
/** Currently in px, later in mm */
  public INT ConvLength = new INT();
/** VAR AngularDisplacement */
  public INT AngularDisplacement = new INT();
/** VAR ConvID */
  public INT ConvID = new INT();
/** VAR PECount */
  public INT PECount = new INT();
/** VAR PEPositions */
  public ARRAY PEPositions = new ARRAY(new DINT(),6);
/** VAR MergePositions */
  public ARRAY MergePositions = new ARRAY(new DINT(),3);
/** VAR DivertPositions */
  public ARRAY DivertPositions = new ARRAY(new DINT(),4);
/** VAR Incline */
  public INT Incline = new INT();
/** VAR EncCount */
  public DINT EncCount = new DINT();
/** VAR DiverterStatus */
  public ARRAY DiverterStatus = new ARRAY(new BOOL(),4);
/** VAR BagInID */
  public DINT BagInID = new DINT();
/** VAR BagInAngle */
  public DINT BagInAngle = new DINT();
/** VAR BagInLength */
  public DINT BagInLength = new DINT();
/** VAR BagInWidth */
  public DINT BagInWidth = new DINT();
/** Needed when diverting in */
  public DINT BagInOffset = new DINT();
/** VAR BagMerge1ID */
  public DINT BagMerge1ID = new DINT();
/** VAR BagMerge1Angle */
  public DINT BagMerge1Angle = new DINT();
/** VAR BagMerge1Length */
  public DINT BagMerge1Length = new DINT();
/** VAR BagMerge1Width */
  public DINT BagMerge1Width = new DINT();
/** VAR BagMerge2ID */
  public DINT BagMerge2ID = new DINT();
/** VAR BagMerge2Angle */
  public DINT BagMerge2Angle = new DINT();
/** VAR BagMerge2Length */
  public DINT BagMerge2Length = new DINT();
/** VAR BagMerge2Width */
  public DINT BagMerge2Width = new DINT();
/** Output event qualifier */
  public ARRAY PEDetects = new ARRAY(new BOOL(),6);
/** VAR BagOutID */
  public DINT BagOutID = new DINT();
/** VAR BagOutAngle */
  public DINT BagOutAngle = new DINT();
/** VAR BagOutLength */
  public DINT BagOutLength = new DINT();
/** VAR BagOutWidth */
  public DINT BagOutWidth = new DINT();
/** VAR BagOutOffset */
  public DINT BagOutOffset = new DINT();
/** VAR BagDivertID */
  public DINT BagDivertID = new DINT();
/** VAR BagDivertAngle */
  public DINT BagDivertAngle = new DINT();
/** VAR BagDivertLength */
  public DINT BagDivertLength = new DINT();
/** VAR BagDivertWidth */
  public DINT BagDivertWidth = new DINT();
/** VAR BagDivertOffset */
  public DINT BagDivertOffset = new DINT();
/** VAR BagCount */
  public INT BagCount = new INT();
/** VAR BagIDData */
  public ARRAY BagIDData = new ARRAY(new INT(),20);
/** VAR BagXPosData */
  public ARRAY BagXPosData = new ARRAY(new DINT(),20);
/** VAR BagYPosData */
  public ARRAY BagYPosData = new ARRAY(new DINT(),20);
/** VAR BagAngleData */
  public ARRAY BagAngleData = new ARRAY(new INT(),20);
/** VAR BagLengthData */
  public ARRAY BagLengthData = new ARRAY(new INT(),20);
/** VAR Out_PC */
  public BOOL Out_PC = new BOOL();
/** VAR Out_P2 */
  public BOOL Out_P2 = new BOOL();
/** VAR Out_P3 */
  public BOOL Out_P3 = new BOOL();
/** VAR Status */
  public STRING Status = new STRING();
/** VAR StatusData1 */
  public DINT StatusData1 = new DINT();
/** VAR StatusData2 */
  public DINT StatusData2 = new DINT();
/** VAR StatusData3 */
  public DINT StatusData3 = new DINT();
/** VAR ModelHeadPtr */
  public INT ModelHeadPtr = new INT();
/** VAR ModelTailPtr */
  public INT ModelTailPtr = new INT();
/** VAR looper */
  public INT looper = new INT();
/** VAR ModelDSPtr */
  public INT ModelDSPtr = new INT();
/** VAR BagExited */
  public BOOL BagExited = new BOOL();
/** VAR BagDiverted */
  public BOOL BagDiverted = new BOOL();
/** VAR BagModelLLCID */
  public ARRAY BagModelLLCID = new ARRAY(new DINT(),20);
/** VAR BagModelPLCTrackStatus */
  public ARRAY BagModelPLCTrackStatus = new ARRAY(new INT(),20);
/** VAR BagModelBagLength */
  public ARRAY BagModelBagLength = new ARRAY(new DINT(),20);
/** Which index to remove */
  public INT BagRemoveModelPtr = new INT();
/** VAR ConvRadius */
  public REAL ConvRadius = new REAL();
/** Angle that the tangent of the curve makes with the positve x-axis */
  public ARRAY currentBagAngle = new ARRAY(new REAL(),20);
/** Angular displacement of the bag around its center relative to the tangent to the curve */
  public ARRAY BagModelBagAngle = new ARRAY(new DINT(),20);
/** x-position of bag center */
  public ARRAY BagModelBagCenterX = new ARRAY(new DINT(),20);
/** y-position of bag center */
  public ARRAY BagModelBagCenterY = new ARRAY(new DINT(),20);
/** width of bag */
  public ARRAY BagModelBagWidth = new ARRAY(new DINT(),20);
/** Scalar projection magintude of the point bagCenter to the most DS point of the bag onto the x-axis */
  public ARRAY BagModelBagScalarProj = new ARRAY(new DINT(),20);
/** Transformed x-position of the bag */
  public ARRAY BagModelBagCenterXT = new ARRAY(new DINT(),20);
/** Transformed y-position of the bag */
  public ARRAY BagModelBagCenterYT = new ARRAY(new DINT(),20);
/** Initialization Request */
 public EventServer Init = new EventInput(this);
/** Normal Execution Request */
 public EventServer Tick = new EventInput(this);
/** EVENT BagIn */
 public EventServer BagIn = new EventInput(this);
/** EVENT BagMerge1 */
 public EventServer BagMerge1 = new EventInput(this);
/** EVENT BagMerge2 */
 public EventServer BagMerge2 = new EventInput(this);
/** Initialization Confirm */
 public EventOutput InitO = new EventOutput();
/** Execution Confirmation */
 public EventOutput Cnf = new EventOutput();
/** EVENT BagOut */
 public EventOutput BagOut = new EventOutput();
/** EVENT BagDivertOut */
 public EventOutput BagDivertOut = new EventOutput();
/** EVENT temp */
 public EventOutput temp = new EventOutput();
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventServer eiNamed(String s){
    if("Init".equals(s)) return Init;
    if("Tick".equals(s)) return Tick;
    if("BagIn".equals(s)) return BagIn;
    if("BagMerge1".equals(s)) return BagMerge1;
    if("BagMerge2".equals(s)) return BagMerge2;
    return super.eiNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventOutput eoNamed(String s){
    if("InitO".equals(s)) return InitO;
    if("Cnf".equals(s)) return Cnf;
    if("BagOut".equals(s)) return BagOut;
    if("BagDivertOut".equals(s)) return BagDivertOut;
    if("temp".equals(s)) return temp;
    return super.eoNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ivNamed(String s) throws FBRManagementException{
    if("ConvLength".equals(s)) return ConvLength;
    if("AngularDisplacement".equals(s)) return AngularDisplacement;
    if("ConvID".equals(s)) return ConvID;
    if("PECount".equals(s)) return PECount;
    if("PEPositions".equals(s)) return PEPositions;
    if("MergePositions".equals(s)) return MergePositions;
    if("DivertPositions".equals(s)) return DivertPositions;
    if("Incline".equals(s)) return Incline;
    if("EncCount".equals(s)) return EncCount;
    if("DiverterStatus".equals(s)) return DiverterStatus;
    if("BagInID".equals(s)) return BagInID;
    if("BagInAngle".equals(s)) return BagInAngle;
    if("BagInLength".equals(s)) return BagInLength;
    if("BagInWidth".equals(s)) return BagInWidth;
    if("BagInOffset".equals(s)) return BagInOffset;
    if("BagMerge1ID".equals(s)) return BagMerge1ID;
    if("BagMerge1Angle".equals(s)) return BagMerge1Angle;
    if("BagMerge1Length".equals(s)) return BagMerge1Length;
    if("BagMerge1Width".equals(s)) return BagMerge1Width;
    if("BagMerge2ID".equals(s)) return BagMerge2ID;
    if("BagMerge2Angle".equals(s)) return BagMerge2Angle;
    if("BagMerge2Length".equals(s)) return BagMerge2Length;
    if("BagMerge2Width".equals(s)) return BagMerge2Width;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("PEDetects".equals(s)) return PEDetects;
    if("BagOutID".equals(s)) return BagOutID;
    if("BagOutAngle".equals(s)) return BagOutAngle;
    if("BagOutLength".equals(s)) return BagOutLength;
    if("BagOutWidth".equals(s)) return BagOutWidth;
    if("BagOutOffset".equals(s)) return BagOutOffset;
    if("BagDivertID".equals(s)) return BagDivertID;
    if("BagDivertAngle".equals(s)) return BagDivertAngle;
    if("BagDivertLength".equals(s)) return BagDivertLength;
    if("BagDivertWidth".equals(s)) return BagDivertWidth;
    if("BagDivertOffset".equals(s)) return BagDivertOffset;
    if("BagCount".equals(s)) return BagCount;
    if("BagIDData".equals(s)) return BagIDData;
    if("BagXPosData".equals(s)) return BagXPosData;
    if("BagYPosData".equals(s)) return BagYPosData;
    if("BagAngleData".equals(s)) return BagAngleData;
    if("BagLengthData".equals(s)) return BagLengthData;
    if("Out_PC".equals(s)) return Out_PC;
    if("Out_P2".equals(s)) return Out_P2;
    if("Out_P3".equals(s)) return Out_P3;
    if("Status".equals(s)) return Status;
    if("StatusData1".equals(s)) return StatusData1;
    if("StatusData2".equals(s)) return StatusData2;
    if("StatusData3".equals(s)) return StatusData3;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("ConvLength".equals(ivName)) connect_ConvLength((INT)newIV);
    else if("AngularDisplacement".equals(ivName)) connect_AngularDisplacement((INT)newIV);
    else if("ConvID".equals(ivName)) connect_ConvID((INT)newIV);
    else if("PECount".equals(ivName)) connect_PECount((INT)newIV);
    else if("PEPositions".equals(ivName)) connect_PEPositions((ARRAY)newIV);
    else if("MergePositions".equals(ivName)) connect_MergePositions((ARRAY)newIV);
    else if("DivertPositions".equals(ivName)) connect_DivertPositions((ARRAY)newIV);
    else if("Incline".equals(ivName)) connect_Incline((INT)newIV);
    else if("EncCount".equals(ivName)) connect_EncCount((DINT)newIV);
    else if("DiverterStatus".equals(ivName)) connect_DiverterStatus((ARRAY)newIV);
    else if("BagInID".equals(ivName)) connect_BagInID((DINT)newIV);
    else if("BagInAngle".equals(ivName)) connect_BagInAngle((DINT)newIV);
    else if("BagInLength".equals(ivName)) connect_BagInLength((DINT)newIV);
    else if("BagInWidth".equals(ivName)) connect_BagInWidth((DINT)newIV);
    else if("BagInOffset".equals(ivName)) connect_BagInOffset((DINT)newIV);
    else if("BagMerge1ID".equals(ivName)) connect_BagMerge1ID((DINT)newIV);
    else if("BagMerge1Angle".equals(ivName)) connect_BagMerge1Angle((DINT)newIV);
    else if("BagMerge1Length".equals(ivName)) connect_BagMerge1Length((DINT)newIV);
    else if("BagMerge1Width".equals(ivName)) connect_BagMerge1Width((DINT)newIV);
    else if("BagMerge2ID".equals(ivName)) connect_BagMerge2ID((DINT)newIV);
    else if("BagMerge2Angle".equals(ivName)) connect_BagMerge2Angle((DINT)newIV);
    else if("BagMerge2Length".equals(ivName)) connect_BagMerge2Length((DINT)newIV);
    else if("BagMerge2Width".equals(ivName)) connect_BagMerge2Width((DINT)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable ConvLength
  * @param newIV The variable to connect
 */
  public void connect_ConvLength(INT newIV){
    ConvLength = newIV;
    }
/** Connect the given variable to the input variable AngularDisplacement
  * @param newIV The variable to connect
 */
  public void connect_AngularDisplacement(INT newIV){
    AngularDisplacement = newIV;
    }
/** Connect the given variable to the input variable ConvID
  * @param newIV The variable to connect
 */
  public void connect_ConvID(INT newIV){
    ConvID = newIV;
    }
/** Connect the given variable to the input variable PECount
  * @param newIV The variable to connect
 */
  public void connect_PECount(INT newIV){
    PECount = newIV;
    }
/** Connect the given variable to the input variable PEPositions
  * @param newIV The variable to connect
 */
  public void connect_PEPositions(ARRAY newIV){
    PEPositions = newIV;
    }
/** Connect the given variable to the input variable MergePositions
  * @param newIV The variable to connect
 */
  public void connect_MergePositions(ARRAY newIV){
    MergePositions = newIV;
    }
/** Connect the given variable to the input variable DivertPositions
  * @param newIV The variable to connect
 */
  public void connect_DivertPositions(ARRAY newIV){
    DivertPositions = newIV;
    }
/** Connect the given variable to the input variable Incline
  * @param newIV The variable to connect
 */
  public void connect_Incline(INT newIV){
    Incline = newIV;
    }
/** Connect the given variable to the input variable EncCount
  * @param newIV The variable to connect
 */
  public void connect_EncCount(DINT newIV){
    EncCount = newIV;
    }
/** Connect the given variable to the input variable DiverterStatus
  * @param newIV The variable to connect
 */
  public void connect_DiverterStatus(ARRAY newIV){
    DiverterStatus = newIV;
    }
/** Connect the given variable to the input variable BagInID
  * @param newIV The variable to connect
 */
  public void connect_BagInID(DINT newIV){
    BagInID = newIV;
    }
/** Connect the given variable to the input variable BagInAngle
  * @param newIV The variable to connect
 */
  public void connect_BagInAngle(DINT newIV){
    BagInAngle = newIV;
    }
/** Connect the given variable to the input variable BagInLength
  * @param newIV The variable to connect
 */
  public void connect_BagInLength(DINT newIV){
    BagInLength = newIV;
    }
/** Connect the given variable to the input variable BagInWidth
  * @param newIV The variable to connect
 */
  public void connect_BagInWidth(DINT newIV){
    BagInWidth = newIV;
    }
/** Connect the given variable to the input variable BagInOffset
  * @param newIV The variable to connect
 */
  public void connect_BagInOffset(DINT newIV){
    BagInOffset = newIV;
    }
/** Connect the given variable to the input variable BagMerge1ID
  * @param newIV The variable to connect
 */
  public void connect_BagMerge1ID(DINT newIV){
    BagMerge1ID = newIV;
    }
/** Connect the given variable to the input variable BagMerge1Angle
  * @param newIV The variable to connect
 */
  public void connect_BagMerge1Angle(DINT newIV){
    BagMerge1Angle = newIV;
    }
/** Connect the given variable to the input variable BagMerge1Length
  * @param newIV The variable to connect
 */
  public void connect_BagMerge1Length(DINT newIV){
    BagMerge1Length = newIV;
    }
/** Connect the given variable to the input variable BagMerge1Width
  * @param newIV The variable to connect
 */
  public void connect_BagMerge1Width(DINT newIV){
    BagMerge1Width = newIV;
    }
/** Connect the given variable to the input variable BagMerge2ID
  * @param newIV The variable to connect
 */
  public void connect_BagMerge2ID(DINT newIV){
    BagMerge2ID = newIV;
    }
/** Connect the given variable to the input variable BagMerge2Angle
  * @param newIV The variable to connect
 */
  public void connect_BagMerge2Angle(DINT newIV){
    BagMerge2Angle = newIV;
    }
/** Connect the given variable to the input variable BagMerge2Length
  * @param newIV The variable to connect
 */
  public void connect_BagMerge2Length(DINT newIV){
    BagMerge2Length = newIV;
    }
/** Connect the given variable to the input variable BagMerge2Width
  * @param newIV The variable to connect
 */
  public void connect_BagMerge2Width(DINT newIV){
    BagMerge2Width = newIV;
    }
  public void connect_PEDetects(ANY newOV){
    PEDetects = (ARRAY)newOV;
    }
  public void connect_BagIDData(ANY newOV){
    BagIDData = (ARRAY)newOV;
    }
  public void connect_BagXPosData(ANY newOV){
    BagXPosData = (ARRAY)newOV;
    }
  public void connect_BagYPosData(ANY newOV){
    BagYPosData = (ARRAY)newOV;
    }
  public void connect_BagAngleData(ANY newOV){
    BagAngleData = (ARRAY)newOV;
    }
  public void connect_BagLengthData(ANY newOV){
    BagLengthData = (ARRAY)newOV;
    }
/** {@inheritDoc}
* @param ovName {@inheritDoc}
* @param newOV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
public void connectOV(String ovName, ANY newOV) throws FBRManagementException{
	if(ovName.equals("PEDetects"))connect_PEDetects(newOV);
	else if(ovName.equals("BagIDData"))connect_BagIDData(newOV);
	else if(ovName.equals("BagXPosData"))connect_BagXPosData(newOV);
	else if(ovName.equals("BagYPosData"))connect_BagYPosData(newOV);
	else if(ovName.equals("BagAngleData"))connect_BagAngleData(newOV);
	else if(ovName.equals("BagLengthData"))connect_BagLengthData(newOV);
	else super.connectOV(ovName, newOV);}
private static final int index_START = 0;
private void state_START(){
  eccState = index_START;
}
private static final int index_INIT = 1;
private void state_INIT(){
  eccState = index_INIT;
  alg_INIT();
  InitO.serviceEvent(this);
state_START();
}
private static final int index_TICK = 2;
private void state_TICK(){
  eccState = index_TICK;
  alg_TICK();
  Cnf.serviceEvent(this);
  alg_CheckDiverters();
    if(BagExited.value) state_BagExited();
    else if(BagDiverted.value) state_BagDiverted();
state_START();
}
private static final int index_BagIn = 3;
private void state_BagIn(){
  eccState = index_BagIn;
  alg_BagIn();
  temp.serviceEvent(this);
state_START();
}
private static final int index_BagMerge = 4;
private void state_BagMerge(){
  eccState = index_BagMerge;
  alg_BagMerge1();
  temp.serviceEvent(this);
state_START();
}
private static final int index_BagExited = 5;
private void state_BagExited(){
  eccState = index_BagExited;
  alg_BagExited();
  BagOut.serviceEvent(this);
    if(BagDiverted.value) state_BagDiverted();
state_START();
}
private static final int index_BagDiverted = 6;
private void state_BagDiverted(){
  eccState = index_BagDiverted;
  alg_BagDiverted();
  BagDivertOut.serviceEvent(this);
    if(BagExited.value) state_BagExited();
state_START();
}
private static final int index_BagMerge2 = 7;
private void state_BagMerge2(){
  eccState = index_BagMerge2;
  alg_BagMerge2();
  temp.serviceEvent(this);
state_START();
}
/** The default constructor. */
public Conveyor_Photoeyes_Model(){
    super();
  }
/** {@inheritDoc}
* @param e {@inheritDoc} */
  public void serviceEvent(EventServer e){
    if (e == Init) service_Init();
    else if (e == Tick) service_Tick();
    else if (e == BagIn) service_BagIn();
    else if (e == BagMerge1) service_BagMerge1();
    else if (e == BagMerge2) service_BagMerge2();
  }
/** Services the Init event. */
  public void service_Init(){
    if ((eccState == index_START)) state_INIT();
  }
/** Services the Tick event. */
  public void service_Tick(){
    if ((eccState == index_START)) state_TICK();
  }
/** Services the BagIn event. */
  public void service_BagIn(){
    if ((eccState == index_START)) state_BagIn();
  }
/** Services the BagMerge1 event. */
  public void service_BagMerge1(){
    if ((eccState == index_START)) state_BagMerge();
  }
/** Services the BagMerge2 event. */
  public void service_BagMerge2(){
    if ((eccState == index_START)) state_BagMerge2();
  }
  /** ALGORITHM INIT IN Java*/
public void alg_INIT(){
ModelHeadPtr.value=(short)(0);
ModelTailPtr.value=(short)(0);
ModelDSPtr.value=(short)(-1);

for(looper.value=(short)(0); looper.value<=19; looper.value++){
((INT)BagModelPLCTrackStatus.value[looper.value]).value=(short)(0);
};


//TempPEPositions[0]).value=(short)(4500);
//TempPEPositions[1]).value=(short)(2500);
//TempPEPositions[2]).value=(short)(1500);

if((AngularDisplacement.value!=0)){
ConvRadius.value=(((ConvLength.value)*360)/(float)(2*3.14*(Math.abs((int)AngularDisplacement.value))));
};

System.out.println("Conveyor Photoeyes Initialised");

}
  /** ALGORITHM TICK IN Java*/
public void alg_TICK(){
//System.out.println("In Tick");
INT index = new INT();
INT bagPtr =  new INT();
INT upperLimit = new INT();
INT pePtr = new INT();
DINT tempOrd = new DINT();//ULINTtempOrdinateof'current'PE|diverter(EncCount.value-Position)(seeCheckDivertfor(explination)
INT CopySourcePtr = new INT();
INT CopyDestPtr = new INT();

DINT tempMostDS = new DINT();
DINT tempMostUS = new DINT();
DINT tempCount = new DINT();


bagPtr.value=ModelTailPtr.value;
upperLimit.value=ModelHeadPtr.value;

pePtr.value=0; // Pointerin((DINT)PEPositions.valueARRAY
tempOrd.value=0;

//CLEAROUTPUTS
BagExited.value=false;
BagDiverted.value=false;
BagOutID.value=(int)(0);
BagOutLength.value=(int)(0);
BagDivertID.value=(int)(0);
BagDivertLength.value=(int)(0);
//ClearDetects!!!!!!!
((BOOL)PEDetects.value[0]).value=true;
((BOOL)PEDetects.value[1]).value=true;
((BOOL)PEDetects.value[2]).value=true;
((BOOL)PEDetects.value[3]).value=true;
((BOOL)PEDetects.value[4]).value=true;
((BOOL)PEDetects.value[5]).value=true;


//NOOOOO"Loop through all bags... increment Positions?"
//usingordinates...assumingbagsdontslipwewontneed; ModelTailPtr.value<=changetheirUS/DSOrd
if(ModelTailPtr.value>ModelHeadPtr.value)
{
upperLimit.value=(short)(ModelHeadPtr.value+20); //sizeofBagARRAY
};

for(pePtr.value=0; pePtr.value<=PECount.value-1; pePtr.value++)
{
tempOrd.value=(EncCount.value-(((DINT)PEPositions.value[(int)pePtr.value]).value));
for(bagPtr.value= ModelTailPtr.value; bagPtr.value<=upperLimit.value-1; bagPtr.value++)
{
//CalculatethemostDS&USpositionofthebag
tempMostDS.value = (((DINT)(BagModelBagCenterX.value[bagPtr.value%20])).value + ((DINT)BagModelBagScalarProj.value[bagPtr.value%20]).value);
tempMostUS.value = (((DINT)BagModelBagCenterX.value[bagPtr.value %20]).value-((DINT)BagModelBagScalarProj.value[bagPtr.value%20]).value);
if((tempMostDS.value>=tempOrd.value)&(tempMostUS.value<=tempOrd.value))
{
//thisPEneeds; ModelTailPtr.value<='detect'
//((BOOL)PEDetects.value[pePtr.value]).value=true;
((BOOL)PEDetects.value[pePtr.value]).value=false;

break; //onlyonebagcanintersect...
}
}
}

/*CheckmostDSBag..if(passedConvLength....valuestartcontinueprocess
Everythingmodelledasastraightconveyor&bagstrackedusingcenterx,y+angle
TODO:if(array!EMPTY */
if((ModelDSPtr.value!=-1))
{
//Ensurethebaghas!alreadyexited
if((((INT)BagModelPLCTrackStatus.value[ModelDSPtr.value]).value==2))
{//ACTIVE
//'continue'thebagwhenthecenterofthebagreachestheendofthisconveyor
if((EncCount.value>=(((DINT)BagModelBagCenterX.value[ModelDSPtr.value]).value+ConvLength.value)))
{//>*==*soassoonascenterpointisatDS'tip',itisalsoatmostUSendofDSConv
//Status.value='Bagcenterpointexited';

//Thebaghas'exited'i.e.belongs; ModelTailPtr.value<=thenextconveyorinanobjectownershipsense
BagOutID.value=(((DINT)BagModelLLCID.value[ModelDSPtr.value]).value);
BagOutLength.value=(int)(((DINT)BagModelBagLength.value[ModelDSPtr.value]).value);
BagOutWidth.value=(int)(((DINT)BagModelBagWidth.value[ModelDSPtr.value]).value);

BagOutOffset.value=(int)(((DINT)BagModelBagCenterY.value[ModelDSPtr.value]).value);//y-axisoffset,zerofor(now
BagOutAngle.value=(int)(((DINT)BagModelBagAngle.value[ModelDSPtr.value]).value);

BagExited.value=true;
((INT)BagModelPLCTrackStatus.value[ModelDSPtr.value]).value=(short)(3);
}
}
else if((((INT)BagModelPLCTrackStatus.value[ModelDSPtr.value]).value==3))
{//COMPLETED//Centerhasexited..justwaitingonmostUSpoint
//Re-calculatethemostUSx-position
tempMostUS.value=(((DINT)BagModelBagCenterX.value[ModelDSPtr.value]).value-((DINT)BagModelBagScalarProj.value[ModelDSPtr.value]).value);
if(((EncCount.value-tempMostUS.value)>ConvLength.value))
{
//Justremovefrommodel
((INT)BagModelPLCTrackStatus.value[ModelDSPtr.value]).value=(short)(0);
/*Status.value='Bagremoved';
StatusData1.value=(int)((EncCount.value-BagModelBagUSOrd[ModelDSPtr.value]).value));*/
//ConveyorModel_CM_RemoveBag(me,((DINT)BagModelLLCID.value[ModelDSPtr.value]).value,ModelDSPtr);
CopyDestPtr.value=(short)(ModelDSPtr.value);//Overwritethisbag
while(true) 
{
BagOutAngle.value++;
//IsthistheMostDSbag?
if((CopyDestPtr.value==ModelTailPtr.value))
{
//Deletethemodelentry
((DINT)BagModelLLCID.value[CopyDestPtr.value]).value=(int)(-1);
//UpdateDSpointer
ModelTailPtr.value=(short)(ModelTailPtr.value+1);
ModelTailPtr.value=(short)(ModelTailPtr.value%20);
//RE-setModelDSPtr.value
ModelDSPtr.value=(short)(-1);
//FindthemostDSbag; BagOutAngle.value<=settheModelDSPtr.value
for(bagPtr.value=(short)((ModelTailPtr.value)); bagPtr.value<=upperLimit.value-1; bagPtr.value++)
{
if((((DINT)BagModelLLCID.value[bagPtr.value]).value%20!=-1))
{
if((ModelDSPtr.value<0))
{ //thisnewbagismoreDSthanlastmostDS...shufflearray
ModelDSPtr.value=(short)(bagPtr.value%20);
}
else if(((DINT)BagModelBagCenterX.value[bagPtr.value%20]).value<((DINT)BagModelBagCenterX.value[ModelDSPtr.value]).value)
{
ModelDSPtr.value=(short)(bagPtr.value%20);
}
}
}
Status.value= (new String("TICK most DS bag")).getBytes();
break;
}
else
{
//CalculatetheCopySourcePtr
if((CopyDestPtr.value==0))
{
CopySourcePtr.value=20-1;//"Next entry is top"
}
else
{
CopySourcePtr.value=(short)((CopyDestPtr.value-1)%20);
}
//CopyModelData
((DINT)BagModelLLCID.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelLLCID.value[CopySourcePtr.value]).value);
((DINT)BagModelBagLength.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelBagLength.value[CopySourcePtr.value]).value);
((INT)BagModelPLCTrackStatus.value[CopyDestPtr.value]).value=(short)(((INT)BagModelPLCTrackStatus.value[CopySourcePtr.value]).value);
((DINT)BagModelBagWidth.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelBagWidth.value[CopySourcePtr.value]).value);
((DINT)BagModelBagAngle.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelBagAngle.value[CopySourcePtr.value]).value);
((DINT)BagModelBagCenterX.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelBagCenterX.value[CopySourcePtr.value]).value);
((DINT)BagModelBagCenterY.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelBagCenterY.value[CopySourcePtr.value]).value);
((DINT)BagModelBagScalarProj.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelBagScalarProj.value[CopySourcePtr.value]).value);
//nextmodelentry
CopyDestPtr.value=(short)(CopySourcePtr.value);
}
}
//ENDREMOVEINLINE
upperLimit.value=(short)(ModelHeadPtr.value);//REDOupperLimit.value(mayhavechanged)
if((ModelTailPtr.value>ModelHeadPtr.value))
{
upperLimit.value=(short)(ModelHeadPtr.value+20);//sizeofBagarray
}
}
}
}
//Transformstraightconveyordisplacement; ModelTailPtr.value<=curvedconveyordisplacement
for(bagPtr.value=(short)(ModelTailPtr.value); bagPtr.value<=upperLimit.value-1; bagPtr.value++)
{
if((AngularDisplacement.value!=0))
{
((REAL)currentBagAngle.value[bagPtr.value]).value=(float)(((EncCount.value-((DINT)BagModelBagCenterX.value[bagPtr.value%20]).value)/(ConvLength.value))*(AngularDisplacement.value));
((DINT)BagModelBagCenterXT.value[bagPtr.value%20]).value=(int)((ConvRadius.value*Math.sin((((REAL)currentBagAngle.value[bagPtr.value]).value/180)*3.14)));
((DINT)BagModelBagCenterYT.value[bagPtr.value%20]).value=(int)((ConvRadius.value-ConvRadius.value*Math.cos((((REAL)currentBagAngle.value[bagPtr.value]).value/180)*3.14)));
//However,if(thebagisleavingtheconveyor,maybe){otherstuff,likegoinastraightlineafterpassingconvLength
}
else
{
/*(
else{thisisastraightline*/
((DINT)BagModelBagCenterXT.value[bagPtr.value%20]).value=(int)(EncCount.value-((DINT)BagModelBagCenterX.value[bagPtr.value%20]).value);
((DINT)BagModelBagCenterYT.value[bagPtr.value%20]).value=(int)(((DINT)BagModelBagCenterY.value[bagPtr.value%20]).value);
}
}

//SetVisData
BagCount.value=(short)(upperLimit.value-ModelTailPtr.value);
bagPtr.value=(short)(ModelTailPtr.value);
//cleararrays
for(bagPtr.value=(short)(0); bagPtr.value<=19; bagPtr.value++)
{
((INT)BagIDData.value[bagPtr.value]).value=(short)(0);
((DINT)BagXPosData.value[bagPtr.value]).value=0;
((INT)BagLengthData.value[bagPtr.value]).value=(short)(0);
}

bagPtr.value=(short)(ModelTailPtr.value);
for(index.value=(short)(0); index.value<=19; index.value++)
{
if((bagPtr.value>=upperLimit.value))
{
break;
};

((DINT)BagYPosData.value[index.value]).value=(int)(((DINT)BagModelBagCenterYT.value[bagPtr.value%20]).value);
((DINT)BagXPosData.value[index.value]).value=(int)(((DINT)BagModelBagCenterXT.value[bagPtr.value%20]).value)+1;
((INT)BagAngleData.value[index.value]).value=(short)((((REAL)currentBagAngle.value[bagPtr.value%20]).value)+(((DINT)BagModelBagAngle.value[bagPtr.value%20]).value));
((INT)BagLengthData.value[index.value]).value=(short)((((DINT)BagModelBagLength.value[bagPtr.value%20]).value));
//((INT)BagWidthData.value[index.value]).value=(short)((((DINT)BagModelBagWidth.value[bagPtr.value%20]).value));
((INT)BagIDData.value[index.value]).value=(short)((((DINT)BagModelLLCID.value[bagPtr.value%20]).value));

bagPtr.value++;
};

//Tempfixfor(non-blankingarrays
if((BagCount.value==0))
{
((DINT)BagYPosData.value[0]).value=(int)(0);
((DINT)BagXPosData.value[0]).value=0;
((INT)BagAngleData.value[0]).value=(short)(0);
((INT)BagLengthData.value[0]).value=(short)(0);
//((INT)BagWidthData.value[0]).value=(short)(0);
((INT)BagIDData.value[0]).value=(short)(0);
}

//TEMPUN-ARRAY
Out_PC.value=((BOOL)PEDetects.value[0]).value;
//System.out.println("PE SET = " + ((BOOL)PEDetects.value[0]).value + Out_PC.value);
Out_P2.value=((BOOL)PEDetects.value[1]).value;
Out_P3.value=((BOOL)PEDetects.value[2]).value;

}
  /** ALGORITHM BagIn IN Java*/
public void alg_BagIn(){
REAL bagRectTopRightX = new REAL();
REAL bagRectBottomRightX = new REAL();
DINT tempX = new DINT();
REAL bagRectRadius = new REAL(); //Halfthelengthofthediagonalinsidethebagrectangle
REAL bagRectInternalAngle = new REAL(); //Theanglethediagonalmakeswiththepositivex-axisofthebag

System.out.println("Bag IN!!! and ModelHeadPtr = " + ModelHeadPtr.value + " ModelDSPtr = " + ModelDSPtr.value);

if(((INT)BagModelPLCTrackStatus.value[ModelHeadPtr.value]).value==2){//ACTIVE ModelFull
return;
};

if (ModelDSPtr.value<0) 
{ //thisnewbagismoreDSthanlastmostDS...
ModelDSPtr.value=(short)(ModelHeadPtr.value); //ThelocationwherethisTHINGwillbestored
}
else if ((EncCount.value-BagInOffset.value) < ((DINT)BagModelBagCenterX.value[ModelDSPtr.value]).value)
{ //thisnewbagismoreDSthanlastmostDS...
ModelDSPtr.value=(short)(ModelHeadPtr.value); //ThelocationwherethisTHINGwillbestored
}


((DINT)BagModelBagCenterX.value[ModelHeadPtr.value]).value=(int)(EncCount.value);
((DINT)BagModelBagWidth.value[ModelHeadPtr.value]).value=(int)(BagInWidth.value);
((DINT)BagModelBagCenterY.value[ModelHeadPtr.value]).value=(int)(0);
((DINT)BagModelBagAngle.value[ModelHeadPtr.value]).value=(int)(BagInAngle.value);
((DINT)BagModelLLCID.value[ModelHeadPtr.value]).value=(int)(BagInID.value);
((DINT)BagModelBagLength.value[ModelHeadPtr.value]).value=(int)(BagInLength.value);
((INT)BagModelPLCTrackStatus.value[ModelHeadPtr.value]).value=(short)(2); //ACTIVE

 //Calculatethex-distancebetweenthemostdownstreampointofthebagminusthecenterpoint
bagRectRadius.value=(float)Math.sqrt((BagInLength.value/2)*(BagInLength.value/2)+(BagInWidth.value/2)*(BagInWidth.value/2));
bagRectInternalAngle.value=(float)Math.atan(BagInWidth.value/BagInLength.value);

bagRectTopRightX.value=(bagRectRadius.value*(float)Math.cos(3.14*((((DINT)BagModelBagAngle.value[ModelHeadPtr.value]).value))/180+bagRectInternalAngle.value));
bagRectBottomRightX.value=(bagRectRadius.value*(float)Math.cos(3.14*((((DINT)BagModelBagAngle.value[ModelHeadPtr.value]).value))/180-bagRectInternalAngle.value));


if((BagInAngle.value<90)){
((DINT)BagModelBagScalarProj.value[ModelHeadPtr.value]).value=(int)(bagRectBottomRightX.value);
}
else if((BagInAngle.value<180)){
((DINT)BagModelBagScalarProj.value[ModelHeadPtr.value]).value=(int)(-1*bagRectTopRightX.value);
}
else if((BagInAngle.value<270)){
((DINT)BagModelBagScalarProj.value[ModelHeadPtr.value]).value=(int)(-1*bagRectBottomRightX.value);
}
else if((BagInAngle.value<360)){
((DINT)BagModelBagScalarProj.value[ModelHeadPtr.value]).value=(int)(bagRectTopRightX.value);
};

//Incrementthepointers
ModelHeadPtr.value=(short)(ModelHeadPtr.value+1);
ModelHeadPtr.value=(short)(ModelHeadPtr.value%20);

}
  /** ALGORITHM BagMerge1 IN Java*/
public void alg_BagMerge1(){
REAL bagRectTopRightX = new REAL();
REAL bagRectBottomRightX = new REAL();
DINT tempX = new DINT();
REAL bagRectRadius = new REAL(); //Halfthelengthofthediagonalinsidethebagrectangle
REAL bagRectInternalAngle = new REAL(); //Theanglethediagonalmakeswiththepositivex-axisofthebag

System.out.println("BagMerge1!!");

if(((INT)BagModelPLCTrackStatus.value[ModelHeadPtr.value]).value==2){ //ACTIVE ModelFull
return;
};

if(ModelDSPtr.value<0)
{
ModelDSPtr.value=(short)(ModelHeadPtr.value); //ThelocationwherethisTHINGwillbestored
Status.value= (new String("NewmostDSbag")).getBytes();;
}
else if(((EncCount.value-(((DINT)MergePositions.value[0]).value))<((DINT)BagModelBagCenterX.value[ModelDSPtr.value]).value)){ //thisnewbagismoreDSthanlastmostDS...
ModelDSPtr.value=(short)(ModelHeadPtr.value); //ThelocationwherethisTHINGwillbestored
Status.value= (new String("NewmostDSbag")).getBytes();;
};

((DINT)BagModelBagCenterX.value[ModelHeadPtr.value]).value=(int)(EncCount.value-((DINT)MergePositions.value[0]).value);
((DINT)BagModelBagWidth.value[ModelHeadPtr.value]).value=(int)(BagMerge1Width.value);
((DINT)BagModelBagCenterY.value[ModelHeadPtr.value]).value=(int)(0);
((DINT)BagModelBagAngle.value[ModelHeadPtr.value]).value=(int)(BagMerge1Angle.value);
((DINT)BagModelLLCID.value[ModelHeadPtr.value]).value=(int)(BagMerge1ID.value);
((DINT)BagModelBagLength.value[ModelHeadPtr.value]).value=(int)(BagMerge1Length.value);
((INT)BagModelPLCTrackStatus.value[ModelHeadPtr.value]).value=(short)(2); //ACTIVE

//Calculatethex-distancebetweenthemostdownstreampointofthebagminusthecenterpoint
bagRectRadius.value= (float)Math.sqrt(((BagMerge1Length.value/2)*(BagMerge1Length.value/2))+((BagMerge1Width.value/2)*(BagMerge1Width.value/2)));
bagRectInternalAngle.value=(float)Math.atan(BagMerge1Width.value/BagMerge1Length.value);

bagRectTopRightX.value=(bagRectRadius.value*(float)Math.cos(3.14*((((DINT)BagModelBagAngle.value[ModelHeadPtr.value]).value))/180+bagRectInternalAngle.value));
bagRectBottomRightX.value=(bagRectRadius.value*(float)Math.cos(3.14*((((DINT)BagModelBagAngle.value[ModelHeadPtr.value]).value))/180-bagRectInternalAngle.value));

if((BagInAngle.value<90)){
((DINT)BagModelBagScalarProj.value[ModelHeadPtr.value]).value=(int)(bagRectBottomRightX.value);
}
else if((BagInAngle.value<180)){
((DINT)BagModelBagScalarProj.value[ModelHeadPtr.value]).value=(int)(-1*bagRectTopRightX.value);
}
else if((BagInAngle.value<270)){
((DINT)BagModelBagScalarProj.value[ModelHeadPtr.value]).value=(int)(-1*bagRectBottomRightX.value);
}
else if((BagInAngle.value<360)){
((DINT)BagModelBagScalarProj.value[ModelHeadPtr.value]).value=(int)(bagRectTopRightX.value);
};

//Increment
ModelHeadPtr.value=(short)(ModelHeadPtr.value+1);
ModelHeadPtr.value=(short)(ModelHeadPtr.value%20);

}
  /** ALGORITHM CheckDiverters IN Java*/
public void alg_CheckDiverters(){
INT upperLimit = new INT();
INT bagPtr = new INT();
INT DivID = new INT();
DINT tempOrd = new DINT(); //ULINT
INT CopySourcePtr = new INT();
INT CopyDestPtr = new INT();

//System.out.println("In CheckDiverters");

DINT tempMostDS = new DINT();
DINT tempMostUS = new DINT();


upperLimit.value=ModelHeadPtr.value;
DivID.value=0;
/*
EncCount.value-BagOrd=(int)(Position
|
EncCount.value-Position=(int)(BagOrd
(sowegetEncCount.value-PosONCE..&comparewithbagords)
*/
tempOrd.value=0;// Special*ORDINATEofdiverter(EncCount.value-Position)
/*//if(thediverterisactive
checkupperLimit*/
if(((ModelHeadPtr.value)<(ModelTailPtr.value)))
{
upperLimit.value=(short)(upperLimit.value+20);//Lengthofbagarray
}

while(DivID.value<4)
{
if((((DINT)DivertPositions.value[DivID.value]).value>0&((BOOL)DiverterStatus.value[DivID.value]).value))
{//configured&'active'//Statuses+1becauseitalsocontainsExitDev0whichisrunout
tempOrd.value=EncCount.value-((DINT)DivertPositions.value[DivID.value]).value;
//Anybagsthatintersect/cross'DiverterPosition'isdiverted(assumeonlyonebagperanyONEtick)
for(bagPtr.value=(short)((ModelTailPtr.value)); bagPtr.value<=upperLimit.value-1; bagPtr.value++)
{
//CalculatethemostDS&USpositionofthebag
tempMostDS.value=(((DINT)BagModelBagCenterX.value[bagPtr.value%20]).value+((DINT)BagModelBagScalarProj.value[bagPtr.value%20]).value);
tempMostUS.value=(((DINT)BagModelBagCenterX.value[bagPtr.value%20]).value-((DINT)BagModelBagScalarProj.value[bagPtr.value%20]).value);

if(((tempMostUS.value>=tempOrd.value)&(tempMostDS.value<=tempOrd.value)))
{
/*thisBagINTERSECTS!!!
setaflag*///
BagDiverted.value=true;
BagDivertID.value=(int)(((DINT)BagModelLLCID.value[bagPtr.value%20]).value);
BagDivertLength.value=(int)(((DINT)BagModelBagLength.value[bagPtr.value%20]).value);
//2010-07-05:HandoverOffset(howfarINFRONTofDiverterthebagis)
BagDivertOffset.value=(int)(tempOrd.value-((DINT)BagModelBagCenterX.value[bagPtr.value%20]).value);
//Unlikenormalexit...weIMEDIATELYremovethebagfromourmodel(itwill!passanymorePEs)
//ConveyorModel_CM_RemoveBag(me,BagDivertID,bagPtr.value%20);
CopyDestPtr.value=(short)(bagPtr.value%20);//Overwritethisbag
while(true)
{
//IsthistheMostDSbag?
if((CopyDestPtr.value==ModelTailPtr.value))
{
//Deletethemodelentry
((DINT)BagModelLLCID.value[CopyDestPtr.value]).value=(int)(-1);
//UpdateDSpointer
ModelTailPtr.value=(short)(ModelTailPtr.value+1);
ModelTailPtr.value=(short)(ModelTailPtr.value%20);
//RE-setModelDSPtr.value
ModelDSPtr.value=(short)(-1);
for(bagPtr.value=(short)((ModelTailPtr.value)); bagPtr.value<=upperLimit.value-1; bagPtr.value++)
{
if((((DINT)BagModelLLCID.value[bagPtr.value]).value%20!=-1))
{
if((ModelDSPtr.value<0))
{//thisnewbagismoreDSthanlastmostDS...shufflearray
ModelDSPtr.value=(short)(bagPtr.value%20);
}
else if(((DINT)BagModelBagCenterX.value[bagPtr.value%20]).value<((DINT)BagModelBagCenterX.value[ModelDSPtr.value]).value)
{
ModelDSPtr.value=(short)(bagPtr.value%20);
}
}
}
break;
}
else
{
//CalculatetheCopySourcePtr
if((CopyDestPtr.value==0))
{
CopySourcePtr.value=20-1;//"Next entry is top"
}
else
{
CopySourcePtr.value=(short)((CopyDestPtr.value-1)%20);
}

//CopyModelData
((DINT)BagModelLLCID.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelLLCID.value[CopySourcePtr.value]).value);
((DINT)BagModelBagLength.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelBagLength.value[CopySourcePtr.value]).value);
((INT)BagModelPLCTrackStatus.value[CopyDestPtr.value]).value=(short)(((INT)BagModelPLCTrackStatus.value[CopySourcePtr.value]).value);
((DINT)BagModelBagWidth.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelBagWidth.value[CopySourcePtr.value]).value);
((DINT)BagModelBagAngle.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelBagAngle.value[CopySourcePtr.value]).value);
((DINT)BagModelBagCenterX.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelBagCenterX.value[CopySourcePtr.value]).value);
((DINT)BagModelBagCenterY.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelBagCenterY.value[CopySourcePtr.value]).value);
((DINT)BagModelBagScalarProj.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelBagScalarProj.value[CopySourcePtr.value]).value);
//nextmodelentry
CopyDestPtr.value=CopySourcePtr.value;
}
}
break;
}
}
}
DivID.value++;
}

}
  /** ALGORITHM RemoveBag IN Java*/
public void alg_RemoveBag(){
INT CopySourcePtr = new INT();
INT CopyDestPtr = new INT();
INT bagPtr = new INT();
DINT upperBound = new DINT();//ULINT

CopySourcePtr.value=-1;
CopyDestPtr.value=-1;
upperBound.value=ModelHeadPtr.value;

if((ModelHeadPtr.value<ModelTailPtr.value))
{
upperBound.value=(short)(upperBound.value+20);
}

CopyDestPtr.value=(short)(BagRemoveModelPtr.value);//Overwritethisbag
if((CopyDestPtr.value==-1))
{
return;
}


while(true)
{
//IsthistheMostDSbag?
if((CopyDestPtr.value==ModelTailPtr.value))
{
//Deletethemodelentry
((DINT)BagModelLLCID.value[CopyDestPtr.value]).value=(int)(-1);
//UpdateDSpointer
ModelTailPtr.value=(short)(ModelTailPtr.value+1);
ModelTailPtr.value=(short)(ModelTailPtr.value%20);
//RE-setModelDSPtr.value
ModelDSPtr.value=(short)(-1);
for(bagPtr.value=(short)((ModelTailPtr.value)); bagPtr.value<=upperBound.value; bagPtr.value++)
{
if((((DINT)BagModelLLCID.value[bagPtr.value]).value%20!=-1))
{
if((ModelDSPtr.value<0))
{//thisnewbagismoreDSthanlastmostDS...shufflearray
ModelDSPtr.value=(short)(bagPtr.value%20);
}
else if(((DINT)BagModelBagCenterX.value[bagPtr.value%20]).value<((DINT)BagModelBagCenterX.value[ModelDSPtr.value]).value)
{
ModelDSPtr.value=(short)(bagPtr.value%20);
}
}
}
break;
}
else
{
//CalculatetheCopySourcePtr
if((CopyDestPtr.value==0))
{
CopySourcePtr.value=(short)(20-1);//"Next entry is top"
}
else
{
CopySourcePtr.value=(short)((CopyDestPtr.value-1)%20);
}
//CopyModelData
((DINT)BagModelLLCID.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelLLCID.value[CopySourcePtr.value]).value);
((DINT)BagModelBagLength.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelBagLength.value[CopySourcePtr.value]).value);
((INT)BagModelPLCTrackStatus.value[CopyDestPtr.value]).value=(short)(((INT)BagModelPLCTrackStatus.value[CopySourcePtr.value]).value);
((DINT)BagModelBagWidth.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelBagWidth.value[CopySourcePtr.value]).value);
((DINT)BagModelBagAngle.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelBagAngle.value[CopySourcePtr.value]).value);
((DINT)BagModelBagCenterX.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelBagCenterX.value[CopySourcePtr.value]).value);
((DINT)BagModelBagCenterY.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelBagCenterY.value[CopySourcePtr.value]).value);
((DINT)BagModelBagScalarProj.value[CopyDestPtr.value]).value=(int)(((DINT)BagModelBagScalarProj.value[CopySourcePtr.value]).value);

//nextmodelentry
CopyDestPtr.value=(short)(CopySourcePtr.value);
}
}

}
  /** ALGORITHM BagExited IN Java*/
public void alg_BagExited(){
BagExited.value=false;//DONE
System.out.println("BagOut!!");

}
  /** ALGORITHM BagDiverted IN Java*/
public void alg_BagDiverted(){
BagDiverted.value=false; //DONE

}
  /** ALGORITHM BagMerge2 IN Java*/
public void alg_BagMerge2(){
REAL bagRectTopRightX = new REAL();
REAL bagRectBottomRightX = new REAL();
DINT tempX = new DINT();;
REAL bagRectRadius = new REAL();;//Halfthelengthofthediagonalinsidethebagrectangle
REAL bagRectInternalAngle = new REAL();;//Theanglethediagonalmakeswiththepositivex-axisofthebag

System.out.println("BagMerge2!!");
if(((INT)BagModelPLCTrackStatus.value[ModelHeadPtr.value]).value==2){//ACTIVE ModelFull
return;
};

if(ModelDSPtr.value<0)
{
ModelDSPtr.value=(short)(ModelHeadPtr.value);//ThelocationwherethisTHINGwillbestored
Status.value=(new String("NewmostDSbag")).getBytes();
}
else if (((EncCount.value-((DINT)MergePositions.value[1]).value)<((DINT)BagModelBagCenterX.value[ModelDSPtr.value]).value)){//thisnewbagismoreDSthanlastmostDS...
ModelDSPtr.value=(short)(ModelHeadPtr.value);//ThelocationwherethisTHINGwillbestored
Status.value=(new String("NewmostDSbag")).getBytes();
};

((DINT)BagModelBagCenterX.value[ModelHeadPtr.value]).value=(int)(EncCount.value-((DINT)MergePositions.value[1]).value);
((DINT)BagModelBagWidth.value[ModelHeadPtr.value]).value=(int)(BagMerge2Width.value);
((DINT)BagModelBagCenterY.value[ModelHeadPtr.value]).value=(int)(0);
((DINT)BagModelBagAngle.value[ModelHeadPtr.value]).value=(int)(BagMerge2Angle.value);
((DINT)BagModelLLCID.value[ModelHeadPtr.value]).value=(int)(BagMerge2ID.value);
((DINT)BagModelBagLength.value[ModelHeadPtr.value]).value=(int)(BagMerge2Length.value);
((INT)BagModelPLCTrackStatus.value[ModelHeadPtr.value]).value=(short)(2);//ACTIVE

//Calculatethex-distancebetweenthemostdownstreampointofthebagminusthecenterpoint
bagRectRadius.value= (float)Math.sqrt(((BagMerge2Length.value/2)*(BagMerge2Length.value/2))+((BagMerge2Width.value/2)*(BagMerge2Width.value/2)));
bagRectInternalAngle.value=(float)Math.atan(BagMerge2Width.value/BagMerge2Length.value);

bagRectTopRightX.value=(bagRectRadius.value*(float)Math.cos(3.14*((((DINT)BagModelBagAngle.value[ModelHeadPtr.value]).value))/180+bagRectInternalAngle.value));
bagRectBottomRightX.value=(bagRectRadius.value*(float)Math.cos(3.14*((((DINT)BagModelBagAngle.value[ModelHeadPtr.value]).value))/180-bagRectInternalAngle.value));

if((BagInAngle.value<90)){
((DINT)BagModelBagScalarProj.value[ModelHeadPtr.value]).value=(int)((bagRectBottomRightX.value));
}
else if((BagInAngle.value<180)){
((DINT)BagModelBagScalarProj.value[ModelHeadPtr.value]).value=(int)((-1*bagRectTopRightX.value));
}
else if((BagInAngle.value<270)){
((DINT)BagModelBagScalarProj.value[ModelHeadPtr.value]).value=(int)((-1*bagRectBottomRightX.value));
}
else if((BagInAngle.value<360)){
((DINT)BagModelBagScalarProj.value[ModelHeadPtr.value]).value=(int)((bagRectTopRightX.value));
};

//Increment
ModelHeadPtr.value=(short)(ModelHeadPtr.value+1);
ModelHeadPtr.value=(short)(ModelHeadPtr.value%20);

}
}
