/* Copyright (c)2012 UoA. All rights reserved. */
package fb.rt.cs725;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK MyRender
  * @author Anirudha
  * @version 20120225/Anirudha
  */
public class MyRender extends FBInstance
{
/** VAR name */
  public WSTRING name = new WSTRING();
/** VAR PosX */
  public UINT PosX = new UINT();
/** VAR PosY */
  public UINT PosY = new UINT();
/** VAR Display */
  public BOOL Display = new BOOL();
/** VAR Layer */
  public UINT Layer = new UINT();
/** VAR tempName */
  public WSTRING tempName = new WSTRING();
/** Initialization Request */
 public EventServer INIT = new EventInput(this);
/** Normal Execution Request */
 public EventServer ChangeXY = new EventInput(this);
/** EVENT ChangeValidity */
 public EventServer ChangeValidity = new EventInput(this);
/** EVENT ChangePic */
 public EventServer ChangePic = new EventInput(this);
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
    if("ChangeXY".equals(s)) return ChangeXY;
    if("ChangeValidity".equals(s)) return ChangeValidity;
    if("ChangePic".equals(s)) return ChangePic;
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
    if("name".equals(s)) return name;
    if("PosX".equals(s)) return PosX;
    if("PosY".equals(s)) return PosY;
    if("Display".equals(s)) return Display;
    if("Layer".equals(s)) return Layer;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("tempName".equals(s)) return tempName;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("name".equals(ivName)) connect_name((WSTRING)newIV);
    else if("PosX".equals(ivName)) connect_PosX((UINT)newIV);
    else if("PosY".equals(ivName)) connect_PosY((UINT)newIV);
    else if("Display".equals(ivName)) connect_Display((BOOL)newIV);
    else if("Layer".equals(ivName)) connect_Layer((UINT)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable name
  * @param newIV The variable to connect
 */
  public void connect_name(WSTRING newIV){
    name = newIV;
    }
/** Connect the given variable to the input variable PosX
  * @param newIV The variable to connect
 */
  public void connect_PosX(UINT newIV){
    PosX = newIV;
    }
/** Connect the given variable to the input variable PosY
  * @param newIV The variable to connect
 */
  public void connect_PosY(UINT newIV){
    PosY = newIV;
    }
/** Connect the given variable to the input variable Display
  * @param newIV The variable to connect
 */
  public void connect_Display(BOOL newIV){
    Display = newIV;
    }
/** Connect the given variable to the input variable Layer
  * @param newIV The variable to connect
 */
  public void connect_Layer(UINT newIV){
    Layer = newIV;
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
private static final int index_ChangePic = 2;
private void state_ChangePic(){
  eccState = index_ChangePic;
  alg_ChangePic();
state_START();
}
/** The default constructor. */
public MyRender(){
    super();
  }
/** {@inheritDoc}
* @param e {@inheritDoc} */
  public void serviceEvent(EventServer e){
    if (e == INIT) service_INIT();
    else if (e == ChangeXY) service_ChangeXY();
    else if (e == ChangeValidity) service_ChangeValidity();
    else if (e == ChangePic) service_ChangePic();
  }
/** Services the INIT event. */
  public void service_INIT(){
    if ((eccState == index_START)) state_INIT();
  }
/** Services the ChangeXY event. */
  public void service_ChangeXY(){
  }
/** Services the ChangeValidity event. */
  public void service_ChangeValidity(){
  }
/** Services the ChangePic event. */
  public void service_ChangePic(){
    if ((eccState == index_START)) state_ChangePic();
  }
  /** ALGORITHM INIT IN Java*/
public void alg_INIT(){
tempName.value = "/fb/rt/cs405/SSG.png";
System.out.println("My Render Init");

}
  /** ALGORITHM ChangeXY IN ST*/
public void alg_ChangeXY(){
}
  /** ALGORITHM ChangeValidity IN ST*/
public void alg_ChangeValidity(){
}
  /** ALGORITHM ChangePic IN Java*/
public void alg_ChangePic(){
if(!tempName.value.equals(name.value))
{
      //System.out.println("My Out Render ChangePic = " + name + "    " + tempName);
      tempName.value = name.value;
     // System.out.println("My Render ChangePic = " + name + "    " + tempName);
      CNF.serviceEvent(this);
}
//System.out.println("My Out1234567 Render ChangePic = " + name + "    " + tempName);

}
}
