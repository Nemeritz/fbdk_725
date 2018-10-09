/* Copyright (c)2012 Rockwell Automation. All rights reserved. */
package fb.rt.cs725;import fb.rt.vhmi.*;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK RenderComp
  * @author JHC
  * @version 20120225/JHC
  */
public class RenderComp extends FBInstance
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
/** Initialization Request */
 public EventOutput INIT = new EventOutput();
/** Normal Execution Request */
 public EventOutput ChangeXY = new EventOutput();
/** EVENT ChangeValidity */
 public EventOutput ChangeValidity = new EventOutput();
/** EVENT ChangePic */
 public EventOutput ChangePic = new EventOutput();
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
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_name(WSTRING newIV) throws FBRManagementException{
    name = newIV;
    MyRen.connectIVNoException("name",name);
    }
/** Connect the given variable to the input variable PosX
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX(UINT newIV) throws FBRManagementException{
    PosX = newIV;
    Ren.connectIVNoException("PosX",PosX);
    }
/** Connect the given variable to the input variable PosY
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY(UINT newIV) throws FBRManagementException{
    PosY = newIV;
    Ren.connectIVNoException("PosY",PosY);
    }
/** Connect the given variable to the input variable Display
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_Display(BOOL newIV) throws FBRManagementException{
    Display = newIV;
    Ren.connectIVNoException("Display",Display);
    }
/** Connect the given variable to the input variable Layer
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_Layer(UINT newIV) throws FBRManagementException{
    Layer = newIV;
    Ren.connectIVNoException("Layer",Layer);
    }
/** FB MyRen */
  protected MyRender MyRen = new MyRender() ;
/** FB Ren */
  protected Render Ren = new Render() ;
/** The default constructor. */
public RenderComp(){
    super();
    INIT.connectTo(MyRen.INIT);
    MyRen.INITO.connectTo(Ren.INIT);
    Ren.INITO.connectTo(INITO);
    ChangeXY.connectTo(Ren.ChangeXY);
    ChangeValidity.connectTo(Ren.ChangeValidity);
    ChangePic.connectTo(MyRen.ChangePic);
    MyRen.CNF.connectTo(Ren.ChangePic);
    Ren.CNF.connectTo(CNF);
    Ren.connectIVNoException("name",MyRen.ovNamedNoException("tempName"));
    MyRen.connectIVNoException("name",name);
    Ren.connectIVNoException("PosX",PosX);
    Ren.connectIVNoException("PosY",PosY);
    Ren.connectIVNoException("Display",Display);
    Ren.connectIVNoException("Layer",Layer);
  }
/** {@inheritDoc}
 * @param fbName {@inheritDoc}
 * @param r {@inheritDoc}
 * @throws FBRManagementException {@inheritDoc} */
  public void initialize(String fbName, Resource r)
  throws FBRManagementException{
    super.initialize(fbName,r);
    MyRen.initialize("MyRen",r);
    Ren.initialize("Ren",r);
}
/** Start the FB instances. */
public void start( ){
  MyRen.start();
  Ren.start();
}
/** Stop the FB instances. */
public void stop( ){
  MyRen.stop();
  Ren.stop();
}
}
