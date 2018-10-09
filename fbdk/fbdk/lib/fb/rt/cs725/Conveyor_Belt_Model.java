/* Copyright (c)2012 nxtControl GmbH. All rights reserved. */
package fb.rt.cs725;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK Conveyor_Belt_Model
  * @author Gareth
  * @version 20120225/Gareth
  */
public class Conveyor_Belt_Model extends FBInstance
{
/** VAR Accel */
  public REAL Accel = new REAL();
/** VAR Decel */
  public REAL Decel = new REAL();
/** VAR Vmax */
  public REAL Vmax = new REAL();
/** VAR EncoderInc */
  public DINT EncoderInc = new DINT();
/** Time in ms ULINT */
  public DINT msSinceMidnight = new DINT();
/** ConveyorForward */
  public BOOL MotorForward = new BOOL();
/** ConveyorReverse */
  public BOOL MotorReverse = new BOOL();
/** Output event qualifier */
  public BOOL EncoderState = new BOOL();
/** VAR EncCount */
  public DINT EncCount = new DINT();
/** VAR MotorFeedback */
  public BOOL MotorFeedback = new BOOL();
/** VAR MotorOverload */
  public BOOL MotorOverload = new BOOL();
/** VAR currentA */
  public REAL currentA = new REAL();
/** VAR currentV */
  public REAL currentV = new REAL();
/** VAR tickLengthO */
  public DINT tickLengthO = new DINT();
/** VAR stopped */
  public BOOL stopped = new BOOL();
/** VAR LastStateChangeCount */
  public DINT LastStateChangeCount = new DINT();
/** VAR count */
  public DINT count = new DINT();
/** LINT */
  public DINT msLastTick = new DINT();
/** Time elapsed in ms LINT */
  public DINT TickLength = new DINT();
/** Current velocity */
  public REAL V = new REAL();
/** Current Acceleration / Decel */
  public REAL a = new REAL();
/** Initialization Request */
 public EventServer INIT = new EventInput(this);
/** Normal Execution Request */
 public EventServer TICK = new EventInput(this);
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
    if("TICK".equals(s)) return TICK;
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
    if("Accel".equals(s)) return Accel;
    if("Decel".equals(s)) return Decel;
    if("Vmax".equals(s)) return Vmax;
    if("EncoderInc".equals(s)) return EncoderInc;
    if("msSinceMidnight".equals(s)) return msSinceMidnight;
    if("MotorForward".equals(s)) return MotorForward;
    if("MotorReverse".equals(s)) return MotorReverse;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("EncoderState".equals(s)) return EncoderState;
    if("EncCount".equals(s)) return EncCount;
    if("MotorFeedback".equals(s)) return MotorFeedback;
    if("MotorOverload".equals(s)) return MotorOverload;
    if("currentA".equals(s)) return currentA;
    if("currentV".equals(s)) return currentV;
    if("tickLengthO".equals(s)) return tickLengthO;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("Accel".equals(ivName)) connect_Accel((REAL)newIV);
    else if("Decel".equals(ivName)) connect_Decel((REAL)newIV);
    else if("Vmax".equals(ivName)) connect_Vmax((REAL)newIV);
    else if("EncoderInc".equals(ivName)) connect_EncoderInc((DINT)newIV);
    else if("msSinceMidnight".equals(ivName)) connect_msSinceMidnight((DINT)newIV);
    else if("MotorForward".equals(ivName)) connect_MotorForward((BOOL)newIV);
    else if("MotorReverse".equals(ivName)) connect_MotorReverse((BOOL)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable Accel
  * @param newIV The variable to connect
 */
  public void connect_Accel(REAL newIV){
    Accel = newIV;
    }
/** Connect the given variable to the input variable Decel
  * @param newIV The variable to connect
 */
  public void connect_Decel(REAL newIV){
    Decel = newIV;
    }
/** Connect the given variable to the input variable Vmax
  * @param newIV The variable to connect
 */
  public void connect_Vmax(REAL newIV){
    Vmax = newIV;
    }
/** Connect the given variable to the input variable EncoderInc
  * @param newIV The variable to connect
 */
  public void connect_EncoderInc(DINT newIV){
    EncoderInc = newIV;
    }
/** Connect the given variable to the input variable msSinceMidnight
  * @param newIV The variable to connect
 */
  public void connect_msSinceMidnight(DINT newIV){
    msSinceMidnight = newIV;
    }
/** Connect the given variable to the input variable MotorForward
  * @param newIV The variable to connect
 */
  public void connect_MotorForward(BOOL newIV){
    MotorForward = newIV;
    }
/** Connect the given variable to the input variable MotorReverse
  * @param newIV The variable to connect
 */
  public void connect_MotorReverse(BOOL newIV){
    MotorReverse = newIV;
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
state_START();
}
private static final int index_REQ = 2;
private void state_REQ(){
  eccState = index_REQ;
  alg_REQ();
  CNF.serviceEvent(this);
state_START();
}
/** The default constructor. */
public Conveyor_Belt_Model(){
    super();
  }
/** {@inheritDoc}
* @param e {@inheritDoc} */
  public void serviceEvent(EventServer e){
    if (e == INIT) service_INIT();
    else if (e == TICK) service_TICK();
  }
/** Services the INIT event. */
  public void service_INIT(){
    if ((eccState == index_START)) state_INIT();
  }
/** Services the TICK event. */
  public void service_TICK(){
    if ((eccState == index_START)) state_REQ();
  }
  /** ALGORITHM INIT IN ST*/
public void alg_INIT(){
V.value=(float)(0);
count.value=(int)(0);
stopped.value=true;
}
  /** ALGORITHM REQ IN ST*/
public void alg_REQ(){
MotorFeedback.value=MotorForward.value;
//System.out.println("Motorforward = "+MotorForward.value);

//Accel.value&Decel.valuearem/s/s,adjustfor(TickLength.valueinms*
if(msSinceMidnight.value>=msLastTick.value){
TickLength.value=(int)(msSinceMidnight.value-msLastTick.value);
}
else{
TickLength.value=(int)(10000+msSinceMidnight.value-msLastTick.value);
};
msLastTick.value=(int)(msSinceMidnight.value);

tickLengthO.value=(int)(TickLength.value);

if(MotorForward.value){
stopped.value=false;
a.value=(float)(Accel.value*TickLength.value/1000);
V.value=(float)(Vmax.value);
//TODO:if(MotorReverse.value){
}
else{
stopped.value=true;
a.value=(float)(-(Decel.value*TickLength.value/1000));
V.value=(float)(0);
};

currentA.value=(float)(a.value);
//a.value~==DeltaV.value

if(stopped.value){//Nothing; TickLength.value<=change
return;
};


count.value=(int)(count.value+(V.value*TickLength.value));

if((V.value>=EncoderInc.value)|((count.value/EncoderInc.value)>LastStateChangeCount.value)){
EncoderState.value=!EncoderState.value;
LastStateChangeCount.value=(int)((count.value/EncoderInc.value));
};

EncCount.value=(int)(count.value);
}
}
