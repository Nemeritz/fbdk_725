/* Copyright (c)2012 Rockwell Automation. All rights reserved. */
package fb.rt.cs725;import fb.rt.vhmi.*;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK BagView
  * @author JHC
  * @version 20120225/JHC
  */
public class BagView extends FBInstance
{
/** VAR PosX1 */
  public UINT PosX1 = new UINT();
/** VAR PosY1 */
  public UINT PosY1 = new UINT();
/** VAR PosX2 */
  public UINT PosX2 = new UINT();
/** VAR PosY2 */
  public UINT PosY2 = new UINT();
/** VAR PosX3 */
  public UINT PosX3 = new UINT();
/** VAR PosY3 */
  public UINT PosY3 = new UINT();
/** VAR PosX4 */
  public UINT PosX4 = new UINT();
/** VAR PosY4 */
  public UINT PosY4 = new UINT();
/** VAR PosX5 */
  public UINT PosX5 = new UINT();
/** VAR PosY5 */
  public UINT PosY5 = new UINT();
/** VAR PosX6 */
  public UINT PosX6 = new UINT();
/** VAR PosY6 */
  public UINT PosY6 = new UINT();
/** VAR PosX7 */
  public UINT PosX7 = new UINT();
/** VAR PosY7 */
  public UINT PosY7 = new UINT();
/** VAR PosX8 */
  public UINT PosX8 = new UINT();
/** VAR PosY8 */
  public UINT PosY8 = new UINT();
/** VAR PosX9 */
  public UINT PosX9 = new UINT();
/** VAR PosY9 */
  public UINT PosY9 = new UINT();
/** VAR PosX10 */
  public UINT PosX10 = new UINT();
/** VAR PosY10 */
  public UINT PosY10 = new UINT();
/** VAR PosX11 */
  public UINT PosX11 = new UINT();
/** VAR PosY11 */
  public UINT PosY11 = new UINT();
/** VAR PosX12 */
  public UINT PosX12 = new UINT();
/** VAR PosY12 */
  public UINT PosY12 = new UINT();
/** VAR PosX13 */
  public UINT PosX13 = new UINT();
/** VAR PosY13 */
  public UINT PosY13 = new UINT();
/** VAR PosX14 */
  public UINT PosX14 = new UINT();
/** VAR PosY14 */
  public UINT PosY14 = new UINT();
/** VAR PosX15 */
  public UINT PosX15 = new UINT();
/** VAR PosY15 */
  public UINT PosY15 = new UINT();
/** VAR PosX16 */
  public UINT PosX16 = new UINT();
/** VAR PosY16 */
  public UINT PosY16 = new UINT();
/** VAR PosX17 */
  public UINT PosX17 = new UINT();
/** VAR PosY17 */
  public UINT PosY17 = new UINT();
/** VAR PosX18 */
  public UINT PosX18 = new UINT();
/** VAR PosY18 */
  public UINT PosY18 = new UINT();
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
    if("PosX1".equals(s)) return PosX1;
    if("PosY1".equals(s)) return PosY1;
    if("PosX2".equals(s)) return PosX2;
    if("PosY2".equals(s)) return PosY2;
    if("PosX3".equals(s)) return PosX3;
    if("PosY3".equals(s)) return PosY3;
    if("PosX4".equals(s)) return PosX4;
    if("PosY4".equals(s)) return PosY4;
    if("PosX5".equals(s)) return PosX5;
    if("PosY5".equals(s)) return PosY5;
    if("PosX6".equals(s)) return PosX6;
    if("PosY6".equals(s)) return PosY6;
    if("PosX7".equals(s)) return PosX7;
    if("PosY7".equals(s)) return PosY7;
    if("PosX8".equals(s)) return PosX8;
    if("PosY8".equals(s)) return PosY8;
    if("PosX9".equals(s)) return PosX9;
    if("PosY9".equals(s)) return PosY9;
    if("PosX10".equals(s)) return PosX10;
    if("PosY10".equals(s)) return PosY10;
    if("PosX11".equals(s)) return PosX11;
    if("PosY11".equals(s)) return PosY11;
    if("PosX12".equals(s)) return PosX12;
    if("PosY12".equals(s)) return PosY12;
    if("PosX13".equals(s)) return PosX13;
    if("PosY13".equals(s)) return PosY13;
    if("PosX14".equals(s)) return PosX14;
    if("PosY14".equals(s)) return PosY14;
    if("PosX15".equals(s)) return PosX15;
    if("PosY15".equals(s)) return PosY15;
    if("PosX16".equals(s)) return PosX16;
    if("PosY16".equals(s)) return PosY16;
    if("PosX17".equals(s)) return PosX17;
    if("PosY17".equals(s)) return PosY17;
    if("PosX18".equals(s)) return PosX18;
    if("PosY18".equals(s)) return PosY18;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("PosX1".equals(ivName)) connect_PosX1((UINT)newIV);
    else if("PosY1".equals(ivName)) connect_PosY1((UINT)newIV);
    else if("PosX2".equals(ivName)) connect_PosX2((UINT)newIV);
    else if("PosY2".equals(ivName)) connect_PosY2((UINT)newIV);
    else if("PosX3".equals(ivName)) connect_PosX3((UINT)newIV);
    else if("PosY3".equals(ivName)) connect_PosY3((UINT)newIV);
    else if("PosX4".equals(ivName)) connect_PosX4((UINT)newIV);
    else if("PosY4".equals(ivName)) connect_PosY4((UINT)newIV);
    else if("PosX5".equals(ivName)) connect_PosX5((UINT)newIV);
    else if("PosY5".equals(ivName)) connect_PosY5((UINT)newIV);
    else if("PosX6".equals(ivName)) connect_PosX6((UINT)newIV);
    else if("PosY6".equals(ivName)) connect_PosY6((UINT)newIV);
    else if("PosX7".equals(ivName)) connect_PosX7((UINT)newIV);
    else if("PosY7".equals(ivName)) connect_PosY7((UINT)newIV);
    else if("PosX8".equals(ivName)) connect_PosX8((UINT)newIV);
    else if("PosY8".equals(ivName)) connect_PosY8((UINT)newIV);
    else if("PosX9".equals(ivName)) connect_PosX9((UINT)newIV);
    else if("PosY9".equals(ivName)) connect_PosY9((UINT)newIV);
    else if("PosX10".equals(ivName)) connect_PosX10((UINT)newIV);
    else if("PosY10".equals(ivName)) connect_PosY10((UINT)newIV);
    else if("PosX11".equals(ivName)) connect_PosX11((UINT)newIV);
    else if("PosY11".equals(ivName)) connect_PosY11((UINT)newIV);
    else if("PosX12".equals(ivName)) connect_PosX12((UINT)newIV);
    else if("PosY12".equals(ivName)) connect_PosY12((UINT)newIV);
    else if("PosX13".equals(ivName)) connect_PosX13((UINT)newIV);
    else if("PosY13".equals(ivName)) connect_PosY13((UINT)newIV);
    else if("PosX14".equals(ivName)) connect_PosX14((UINT)newIV);
    else if("PosY14".equals(ivName)) connect_PosY14((UINT)newIV);
    else if("PosX15".equals(ivName)) connect_PosX15((UINT)newIV);
    else if("PosY15".equals(ivName)) connect_PosY15((UINT)newIV);
    else if("PosX16".equals(ivName)) connect_PosX16((UINT)newIV);
    else if("PosY16".equals(ivName)) connect_PosY16((UINT)newIV);
    else if("PosX17".equals(ivName)) connect_PosX17((UINT)newIV);
    else if("PosY17".equals(ivName)) connect_PosY17((UINT)newIV);
    else if("PosX18".equals(ivName)) connect_PosX18((UINT)newIV);
    else if("PosY18".equals(ivName)) connect_PosY18((UINT)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable PosX1
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX1(UINT newIV) throws FBRManagementException{
    PosX1 = newIV;
    Bag1.connectIVNoException("PosX",PosX1);
    }
/** Connect the given variable to the input variable PosY1
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY1(UINT newIV) throws FBRManagementException{
    PosY1 = newIV;
    Bag1.connectIVNoException("PosY",PosY1);
    }
/** Connect the given variable to the input variable PosX2
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX2(UINT newIV) throws FBRManagementException{
    PosX2 = newIV;
    Bag2.connectIVNoException("PosX",PosX2);
    }
/** Connect the given variable to the input variable PosY2
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY2(UINT newIV) throws FBRManagementException{
    PosY2 = newIV;
    Bag2.connectIVNoException("PosY",PosY2);
    }
/** Connect the given variable to the input variable PosX3
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX3(UINT newIV) throws FBRManagementException{
    PosX3 = newIV;
    Bag3.connectIVNoException("PosX",PosX3);
    }
/** Connect the given variable to the input variable PosY3
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY3(UINT newIV) throws FBRManagementException{
    PosY3 = newIV;
    Bag3.connectIVNoException("PosY",PosY3);
    }
/** Connect the given variable to the input variable PosX4
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX4(UINT newIV) throws FBRManagementException{
    PosX4 = newIV;
    Bag4.connectIVNoException("PosX",PosX4);
    }
/** Connect the given variable to the input variable PosY4
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY4(UINT newIV) throws FBRManagementException{
    PosY4 = newIV;
    Bag4.connectIVNoException("PosY",PosY4);
    }
/** Connect the given variable to the input variable PosX5
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX5(UINT newIV) throws FBRManagementException{
    PosX5 = newIV;
    Bag5.connectIVNoException("PosX",PosX5);
    }
/** Connect the given variable to the input variable PosY5
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY5(UINT newIV) throws FBRManagementException{
    PosY5 = newIV;
    Bag5.connectIVNoException("PosY",PosY5);
    }
/** Connect the given variable to the input variable PosX6
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX6(UINT newIV) throws FBRManagementException{
    PosX6 = newIV;
    Bag6.connectIVNoException("PosX",PosX6);
    }
/** Connect the given variable to the input variable PosY6
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY6(UINT newIV) throws FBRManagementException{
    PosY6 = newIV;
    Bag6.connectIVNoException("PosY",PosY6);
    }
/** Connect the given variable to the input variable PosX7
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX7(UINT newIV) throws FBRManagementException{
    PosX7 = newIV;
    Bag7.connectIVNoException("PosX",PosX7);
    }
/** Connect the given variable to the input variable PosY7
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY7(UINT newIV) throws FBRManagementException{
    PosY7 = newIV;
    Bag7.connectIVNoException("PosY",PosY7);
    }
/** Connect the given variable to the input variable PosX8
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX8(UINT newIV) throws FBRManagementException{
    PosX8 = newIV;
    Bag8.connectIVNoException("PosX",PosX8);
    }
/** Connect the given variable to the input variable PosY8
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY8(UINT newIV) throws FBRManagementException{
    PosY8 = newIV;
    Bag8.connectIVNoException("PosY",PosY8);
    }
/** Connect the given variable to the input variable PosX9
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX9(UINT newIV) throws FBRManagementException{
    PosX9 = newIV;
    Bag9.connectIVNoException("PosX",PosX9);
    }
/** Connect the given variable to the input variable PosY9
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY9(UINT newIV) throws FBRManagementException{
    PosY9 = newIV;
    Bag9.connectIVNoException("PosY",PosY9);
    }
/** Connect the given variable to the input variable PosX10
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX10(UINT newIV) throws FBRManagementException{
    PosX10 = newIV;
    Bag10.connectIVNoException("PosX",PosX10);
    }
/** Connect the given variable to the input variable PosY10
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY10(UINT newIV) throws FBRManagementException{
    PosY10 = newIV;
    Bag10.connectIVNoException("PosY",PosY10);
    }
/** Connect the given variable to the input variable PosX11
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX11(UINT newIV) throws FBRManagementException{
    PosX11 = newIV;
    Bag11.connectIVNoException("PosX",PosX11);
    }
/** Connect the given variable to the input variable PosY11
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY11(UINT newIV) throws FBRManagementException{
    PosY11 = newIV;
    Bag11.connectIVNoException("PosY",PosY11);
    }
/** Connect the given variable to the input variable PosX12
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX12(UINT newIV) throws FBRManagementException{
    PosX12 = newIV;
    Bag12.connectIVNoException("PosX",PosX12);
    }
/** Connect the given variable to the input variable PosY12
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY12(UINT newIV) throws FBRManagementException{
    PosY12 = newIV;
    Bag12.connectIVNoException("PosY",PosY12);
    }
/** Connect the given variable to the input variable PosX13
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX13(UINT newIV) throws FBRManagementException{
    PosX13 = newIV;
    Bag13.connectIVNoException("PosX",PosX13);
    }
/** Connect the given variable to the input variable PosY13
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY13(UINT newIV) throws FBRManagementException{
    PosY13 = newIV;
    Bag13.connectIVNoException("PosY",PosY13);
    }
/** Connect the given variable to the input variable PosX14
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX14(UINT newIV) throws FBRManagementException{
    PosX14 = newIV;
    Bag14.connectIVNoException("PosX",PosX14);
    }
/** Connect the given variable to the input variable PosY14
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY14(UINT newIV) throws FBRManagementException{
    PosY14 = newIV;
    Bag14.connectIVNoException("PosY",PosY14);
    }
/** Connect the given variable to the input variable PosX15
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX15(UINT newIV) throws FBRManagementException{
    PosX15 = newIV;
    Bag15.connectIVNoException("PosX",PosX15);
    }
/** Connect the given variable to the input variable PosY15
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY15(UINT newIV) throws FBRManagementException{
    PosY15 = newIV;
    Bag15.connectIVNoException("PosY",PosY15);
    }
/** Connect the given variable to the input variable PosX16
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX16(UINT newIV) throws FBRManagementException{
    PosX16 = newIV;
    Bag16.connectIVNoException("PosX",PosX16);
    }
/** Connect the given variable to the input variable PosY16
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY16(UINT newIV) throws FBRManagementException{
    PosY16 = newIV;
    Bag16.connectIVNoException("PosY",PosY16);
    }
/** Connect the given variable to the input variable PosX17
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX17(UINT newIV) throws FBRManagementException{
    PosX17 = newIV;
    Bag17.connectIVNoException("PosX",PosX17);
    }
/** Connect the given variable to the input variable PosY17
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY17(UINT newIV) throws FBRManagementException{
    PosY17 = newIV;
    Bag17.connectIVNoException("PosY",PosY17);
    }
/** Connect the given variable to the input variable PosX18
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX18(UINT newIV) throws FBRManagementException{
    PosX18 = newIV;
    Bag18.connectIVNoException("PosX",PosX18);
    }
/** Connect the given variable to the input variable PosY18
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY18(UINT newIV) throws FBRManagementException{
    PosY18 = newIV;
    Bag18.connectIVNoException("PosY",PosY18);
    }
/** FB Bag1 */
  protected Render Bag1 = new Render() ;
/** FB Bag2 */
  protected Render Bag2 = new Render() ;
/** FB Bag3 */
  protected Render Bag3 = new Render() ;
/** FB Bag4 */
  protected Render Bag4 = new Render() ;
/** FB Bag5 */
  protected Render Bag5 = new Render() ;
/** FB Bag6 */
  protected Render Bag6 = new Render() ;
/** FB Bag7 */
  protected Render Bag7 = new Render() ;
/** FB Bag8 */
  protected Render Bag8 = new Render() ;
/** FB Bag9 */
  protected Render Bag9 = new Render() ;
/** FB Bag10 */
  protected Render Bag10 = new Render() ;
/** FB Bag11 */
  protected Render Bag11 = new Render() ;
/** FB Bag12 */
  protected Render Bag12 = new Render() ;
/** FB Bag13 */
  protected Render Bag13 = new Render() ;
/** FB Bag14 */
  protected Render Bag14 = new Render() ;
/** FB Bag15 */
  protected Render Bag15 = new Render() ;
/** FB Bag16 */
  protected Render Bag16 = new Render() ;
/** FB Bag17 */
  protected Render Bag17 = new Render() ;
/** FB Bag18 */
  protected Render Bag18 = new Render() ;
/** The default constructor. */
public BagView(){
    super();
    Bag1.CNF.connectTo(Bag2.ChangeXY);
    Bag2.CNF.connectTo(Bag3.ChangeXY);
    Bag3.CNF.connectTo(Bag4.ChangeXY);
    Bag4.CNF.connectTo(Bag5.ChangeXY);
    Bag5.CNF.connectTo(Bag6.ChangeXY);
    Bag6.CNF.connectTo(Bag7.ChangeXY);
    Bag7.CNF.connectTo(Bag8.ChangeXY);
    Bag8.CNF.connectTo(Bag9.ChangeXY);
    Bag9.CNF.connectTo(Bag10.ChangeXY);
    Bag10.CNF.connectTo(Bag11.ChangeXY);
    Bag11.CNF.connectTo(Bag12.ChangeXY);
    Bag12.CNF.connectTo(Bag13.ChangeXY);
    Bag13.CNF.connectTo(Bag14.ChangeXY);
    Bag14.CNF.connectTo(Bag15.ChangeXY);
    Bag15.CNF.connectTo(Bag16.ChangeXY);
    Bag16.CNF.connectTo(Bag17.ChangeXY);
    Bag17.CNF.connectTo(Bag18.ChangeXY);
    INIT.connectTo(Bag1.INIT);
    Bag1.INITO.connectTo(Bag2.INIT);
    Bag2.INITO.connectTo(Bag3.INIT);
    Bag3.INITO.connectTo(Bag4.INIT);
    Bag4.INITO.connectTo(Bag5.INIT);
    Bag5.INITO.connectTo(Bag6.INIT);
    Bag6.INITO.connectTo(Bag7.INIT);
    Bag7.INITO.connectTo(Bag8.INIT);
    Bag8.INITO.connectTo(Bag9.INIT);
    Bag9.INITO.connectTo(Bag10.INIT);
    Bag10.INITO.connectTo(Bag11.INIT);
    Bag11.INITO.connectTo(Bag12.INIT);
    Bag12.INITO.connectTo(Bag13.INIT);
    Bag13.INITO.connectTo(Bag14.INIT);
    Bag14.INITO.connectTo(Bag15.INIT);
    Bag15.INITO.connectTo(Bag16.INIT);
    Bag16.INITO.connectTo(Bag17.INIT);
    Bag17.INITO.connectTo(Bag18.INIT);
    Bag18.INITO.connectTo(INITO);
    Bag18.CNF.connectTo(CNF);
    ChangeXY.connectTo(Bag1.ChangeXY);
    Bag1.connectIVNoException("PosX",PosX1);
    Bag1.connectIVNoException("PosY",PosY1);
    Bag2.connectIVNoException("PosX",PosX2);
    Bag2.connectIVNoException("PosY",PosY2);
    Bag3.connectIVNoException("PosX",PosX3);
    Bag3.connectIVNoException("PosY",PosY3);
    Bag4.connectIVNoException("PosX",PosX4);
    Bag4.connectIVNoException("PosY",PosY4);
    Bag5.connectIVNoException("PosX",PosX5);
    Bag5.connectIVNoException("PosY",PosY5);
    Bag6.connectIVNoException("PosX",PosX6);
    Bag6.connectIVNoException("PosY",PosY6);
    Bag7.connectIVNoException("PosX",PosX7);
    Bag7.connectIVNoException("PosY",PosY7);
    Bag8.connectIVNoException("PosX",PosX8);
    Bag8.connectIVNoException("PosY",PosY8);
    Bag9.connectIVNoException("PosX",PosX9);
    Bag9.connectIVNoException("PosY",PosY9);
    Bag10.connectIVNoException("PosX",PosX10);
    Bag10.connectIVNoException("PosY",PosY10);
    Bag11.connectIVNoException("PosX",PosX11);
    Bag11.connectIVNoException("PosY",PosY11);
    Bag12.connectIVNoException("PosX",PosX12);
    Bag12.connectIVNoException("PosY",PosY12);
    Bag13.connectIVNoException("PosX",PosX13);
    Bag13.connectIVNoException("PosY",PosY13);
    Bag14.connectIVNoException("PosX",PosX14);
    Bag14.connectIVNoException("PosY",PosY14);
    Bag15.connectIVNoException("PosX",PosX15);
    Bag15.connectIVNoException("PosY",PosY15);
    Bag16.connectIVNoException("PosX",PosX16);
    Bag16.connectIVNoException("PosY",PosY16);
    Bag17.connectIVNoException("PosX",PosX17);
    Bag17.connectIVNoException("PosY",PosY17);
    Bag18.connectIVNoException("PosX",PosX18);
    Bag18.connectIVNoException("PosY",PosY18);
    Bag1.Layer.initializeNoException("1");
    Bag1.Display.initializeNoException("1");
    Bag1.name.initializeNoException("/fb/rt/cs725/Bag.png");
    Bag2.Layer.initializeNoException("1");
    Bag2.Display.initializeNoException("1");
    Bag2.name.initializeNoException("/fb/rt/cs725/Bag.png");
    Bag3.Layer.initializeNoException("1");
    Bag3.Display.initializeNoException("1");
    Bag3.name.initializeNoException("/fb/rt/cs725/Bag.png");
    Bag4.Layer.initializeNoException("1");
    Bag4.Display.initializeNoException("1");
    Bag4.name.initializeNoException("/fb/rt/cs725/Bag.png");
    Bag5.Layer.initializeNoException("1");
    Bag5.Display.initializeNoException("1");
    Bag5.name.initializeNoException("/fb/rt/cs725/Bag.png");
    Bag6.Layer.initializeNoException("1");
    Bag6.Display.initializeNoException("1");
    Bag6.name.initializeNoException("/fb/rt/cs725/Bag.png");
    Bag7.Layer.initializeNoException("1");
    Bag7.Display.initializeNoException("1");
    Bag7.name.initializeNoException("/fb/rt/cs725/Bag.png");
    Bag8.Layer.initializeNoException("1");
    Bag8.Display.initializeNoException("1");
    Bag8.name.initializeNoException("/fb/rt/cs725/Bag.png");
    Bag9.Layer.initializeNoException("1");
    Bag9.Display.initializeNoException("1");
    Bag9.name.initializeNoException("/fb/rt/cs725/Bag.png");
    Bag10.Layer.initializeNoException("1");
    Bag10.Display.initializeNoException("1");
    Bag10.name.initializeNoException("/fb/rt/cs725/Bag.png");
    Bag11.Layer.initializeNoException("1");
    Bag11.Display.initializeNoException("1");
    Bag11.name.initializeNoException("/fb/rt/cs725/Bag.png");
    Bag12.Layer.initializeNoException("1");
    Bag12.Display.initializeNoException("1");
    Bag12.name.initializeNoException("/fb/rt/cs725/Bag.png");
    Bag13.Layer.initializeNoException("1");
    Bag13.Display.initializeNoException("1");
    Bag13.name.initializeNoException("/fb/rt/cs725/Bag.png");
    Bag14.Layer.initializeNoException("1");
    Bag14.Display.initializeNoException("1");
    Bag14.name.initializeNoException("/fb/rt/cs725/Bag.png");
    Bag15.Layer.initializeNoException("1");
    Bag15.Display.initializeNoException("1");
    Bag15.name.initializeNoException("/fb/rt/cs725/Bag.png");
    Bag16.Layer.initializeNoException("1");
    Bag16.Display.initializeNoException("1");
    Bag16.name.initializeNoException("/fb/rt/cs725/Bag.png");
    Bag17.Layer.initializeNoException("1");
    Bag17.Display.initializeNoException("1");
    Bag17.name.initializeNoException("/fb/rt/cs725/Bag.png");
    Bag18.Layer.initializeNoException("1");
    Bag18.Display.initializeNoException("1");
    Bag18.name.initializeNoException("/fb/rt/cs725/Bag.png");
  }
/** {@inheritDoc}
 * @param fbName {@inheritDoc}
 * @param r {@inheritDoc}
 * @throws FBRManagementException {@inheritDoc} */
  public void initialize(String fbName, Resource r)
  throws FBRManagementException{
    super.initialize(fbName,r);
    Bag1.initialize("Bag1",r);
    Bag2.initialize("Bag2",r);
    Bag3.initialize("Bag3",r);
    Bag4.initialize("Bag4",r);
    Bag5.initialize("Bag5",r);
    Bag6.initialize("Bag6",r);
    Bag7.initialize("Bag7",r);
    Bag8.initialize("Bag8",r);
    Bag9.initialize("Bag9",r);
    Bag10.initialize("Bag10",r);
    Bag11.initialize("Bag11",r);
    Bag12.initialize("Bag12",r);
    Bag13.initialize("Bag13",r);
    Bag14.initialize("Bag14",r);
    Bag15.initialize("Bag15",r);
    Bag16.initialize("Bag16",r);
    Bag17.initialize("Bag17",r);
    Bag18.initialize("Bag18",r);
}
/** Start the FB instances. */
public void start( ){
  Bag1.start();
  Bag2.start();
  Bag3.start();
  Bag4.start();
  Bag5.start();
  Bag6.start();
  Bag7.start();
  Bag8.start();
  Bag9.start();
  Bag10.start();
  Bag11.start();
  Bag12.start();
  Bag13.start();
  Bag14.start();
  Bag15.start();
  Bag16.start();
  Bag17.start();
  Bag18.start();
}
/** Stop the FB instances. */
public void stop( ){
  Bag1.stop();
  Bag2.stop();
  Bag3.stop();
  Bag4.stop();
  Bag5.stop();
  Bag6.stop();
  Bag7.stop();
  Bag8.stop();
  Bag9.stop();
  Bag10.stop();
  Bag11.stop();
  Bag12.stop();
  Bag13.stop();
  Bag14.stop();
  Bag15.stop();
  Bag16.stop();
  Bag17.stop();
  Bag18.stop();
}
}
