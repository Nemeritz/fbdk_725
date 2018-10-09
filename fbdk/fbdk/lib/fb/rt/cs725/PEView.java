/* Copyright (c)2013 Rockwell Automation. All rights reserved. */
package fb.rt.cs725;import fb.rt.vhmi.*;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK PEView
  * @author JHC
  * @version 20130429/JHC
  */
public class PEView extends FBInstance
{
/** VAR name1 */
  public WSTRING name1 = new WSTRING();
/** VAR name2 */
  public WSTRING name2 = new WSTRING();
/** VAR name3 */
  public WSTRING name3 = new WSTRING();
/** VAR name4 */
  public WSTRING name4 = new WSTRING();
/** VAR name5 */
  public WSTRING name5 = new WSTRING();
/** VAR name6 */
  public WSTRING name6 = new WSTRING();
/** VAR name7 */
  public WSTRING name7 = new WSTRING();
/** VAR name8 */
  public WSTRING name8 = new WSTRING();
/** VAR name9 */
  public WSTRING name9 = new WSTRING();
/** VAR name10 */
  public WSTRING name10 = new WSTRING();
/** VAR name11 */
  public WSTRING name11 = new WSTRING();
/** VAR name12 */
  public WSTRING name12 = new WSTRING();
/** VAR name13 */
  public WSTRING name13 = new WSTRING();
/** VAR name14 */
  public WSTRING name14 = new WSTRING();
/** VAR name15 */
  public WSTRING name15 = new WSTRING();
/** VAR name16 */
  public WSTRING name16 = new WSTRING();
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
    if("name1".equals(s)) return name1;
    if("name2".equals(s)) return name2;
    if("name3".equals(s)) return name3;
    if("name4".equals(s)) return name4;
    if("name5".equals(s)) return name5;
    if("name6".equals(s)) return name6;
    if("name7".equals(s)) return name7;
    if("name8".equals(s)) return name8;
    if("name9".equals(s)) return name9;
    if("name10".equals(s)) return name10;
    if("name11".equals(s)) return name11;
    if("name12".equals(s)) return name12;
    if("name13".equals(s)) return name13;
    if("name14".equals(s)) return name14;
    if("name15".equals(s)) return name15;
    if("name16".equals(s)) return name16;
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
    if("name1".equals(ivName)) connect_name1((WSTRING)newIV);
    else if("name2".equals(ivName)) connect_name2((WSTRING)newIV);
    else if("name3".equals(ivName)) connect_name3((WSTRING)newIV);
    else if("name4".equals(ivName)) connect_name4((WSTRING)newIV);
    else if("name5".equals(ivName)) connect_name5((WSTRING)newIV);
    else if("name6".equals(ivName)) connect_name6((WSTRING)newIV);
    else if("name7".equals(ivName)) connect_name7((WSTRING)newIV);
    else if("name8".equals(ivName)) connect_name8((WSTRING)newIV);
    else if("name9".equals(ivName)) connect_name9((WSTRING)newIV);
    else if("name10".equals(ivName)) connect_name10((WSTRING)newIV);
    else if("name11".equals(ivName)) connect_name11((WSTRING)newIV);
    else if("name12".equals(ivName)) connect_name12((WSTRING)newIV);
    else if("name13".equals(ivName)) connect_name13((WSTRING)newIV);
    else if("name14".equals(ivName)) connect_name14((WSTRING)newIV);
    else if("name15".equals(ivName)) connect_name15((WSTRING)newIV);
    else if("name16".equals(ivName)) connect_name16((WSTRING)newIV);
    else if("PosX1".equals(ivName)) connect_PosX1((UINT)newIV);
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
/** Connect the given variable to the input variable name1
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_name1(WSTRING newIV) throws FBRManagementException{
    name1 = newIV;
    PE1.connectIVNoException("name",name1);
    }
/** Connect the given variable to the input variable name2
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_name2(WSTRING newIV) throws FBRManagementException{
    name2 = newIV;
    PE2.connectIVNoException("name",name2);
    }
/** Connect the given variable to the input variable name3
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_name3(WSTRING newIV) throws FBRManagementException{
    name3 = newIV;
    PE3.connectIVNoException("name",name3);
    }
/** Connect the given variable to the input variable name4
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_name4(WSTRING newIV) throws FBRManagementException{
    name4 = newIV;
    PE4.connectIVNoException("name",name4);
    }
/** Connect the given variable to the input variable name5
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_name5(WSTRING newIV) throws FBRManagementException{
    name5 = newIV;
    PE5.connectIVNoException("name",name5);
    }
/** Connect the given variable to the input variable name6
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_name6(WSTRING newIV) throws FBRManagementException{
    name6 = newIV;
    PE6.connectIVNoException("name",name6);
    }
/** Connect the given variable to the input variable name7
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_name7(WSTRING newIV) throws FBRManagementException{
    name7 = newIV;
    PE7.connectIVNoException("name",name7);
    }
/** Connect the given variable to the input variable name8
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_name8(WSTRING newIV) throws FBRManagementException{
    name8 = newIV;
    PE8.connectIVNoException("name",name8);
    }
/** Connect the given variable to the input variable name9
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_name9(WSTRING newIV) throws FBRManagementException{
    name9 = newIV;
    PE9.connectIVNoException("name",name9);
    }
/** Connect the given variable to the input variable name10
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_name10(WSTRING newIV) throws FBRManagementException{
    name10 = newIV;
    PE10.connectIVNoException("name",name10);
    }
/** Connect the given variable to the input variable name11
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_name11(WSTRING newIV) throws FBRManagementException{
    name11 = newIV;
    PE11.connectIVNoException("name",name11);
    }
/** Connect the given variable to the input variable name12
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_name12(WSTRING newIV) throws FBRManagementException{
    name12 = newIV;
    PE12.connectIVNoException("name",name12);
    }
/** Connect the given variable to the input variable name13
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_name13(WSTRING newIV) throws FBRManagementException{
    name13 = newIV;
    PE13.connectIVNoException("name",name13);
    }
/** Connect the given variable to the input variable name14
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_name14(WSTRING newIV) throws FBRManagementException{
    name14 = newIV;
    PE14.connectIVNoException("name",name14);
    }
/** Connect the given variable to the input variable name15
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_name15(WSTRING newIV) throws FBRManagementException{
    name15 = newIV;
    PE15.connectIVNoException("name",name15);
    }
/** Connect the given variable to the input variable name16
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_name16(WSTRING newIV) throws FBRManagementException{
    name16 = newIV;
    PE16.connectIVNoException("name",name16);
    }
/** Connect the given variable to the input variable PosX1
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX1(UINT newIV) throws FBRManagementException{
    PosX1 = newIV;
    PE1.connectIVNoException("PosX",PosX1);
    }
/** Connect the given variable to the input variable PosY1
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY1(UINT newIV) throws FBRManagementException{
    PosY1 = newIV;
    PE1.connectIVNoException("PosY",PosY1);
    }
/** Connect the given variable to the input variable PosX2
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX2(UINT newIV) throws FBRManagementException{
    PosX2 = newIV;
    PE2.connectIVNoException("PosX",PosX2);
    }
/** Connect the given variable to the input variable PosY2
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY2(UINT newIV) throws FBRManagementException{
    PosY2 = newIV;
    PE2.connectIVNoException("PosY",PosY2);
    }
/** Connect the given variable to the input variable PosX3
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX3(UINT newIV) throws FBRManagementException{
    PosX3 = newIV;
    PE3.connectIVNoException("PosX",PosX3);
    }
/** Connect the given variable to the input variable PosY3
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY3(UINT newIV) throws FBRManagementException{
    PosY3 = newIV;
    PE3.connectIVNoException("PosY",PosY3);
    }
/** Connect the given variable to the input variable PosX4
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX4(UINT newIV) throws FBRManagementException{
    PosX4 = newIV;
    PE4.connectIVNoException("PosX",PosX4);
    }
/** Connect the given variable to the input variable PosY4
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY4(UINT newIV) throws FBRManagementException{
    PosY4 = newIV;
    PE4.connectIVNoException("PosY",PosY4);
    }
/** Connect the given variable to the input variable PosX5
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX5(UINT newIV) throws FBRManagementException{
    PosX5 = newIV;
    PE5.connectIVNoException("PosX",PosX5);
    }
/** Connect the given variable to the input variable PosY5
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY5(UINT newIV) throws FBRManagementException{
    PosY5 = newIV;
    PE5.connectIVNoException("PosY",PosY5);
    }
/** Connect the given variable to the input variable PosX6
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX6(UINT newIV) throws FBRManagementException{
    PosX6 = newIV;
    PE6.connectIVNoException("PosX",PosX6);
    }
/** Connect the given variable to the input variable PosY6
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY6(UINT newIV) throws FBRManagementException{
    PosY6 = newIV;
    PE6.connectIVNoException("PosY",PosY6);
    }
/** Connect the given variable to the input variable PosX7
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX7(UINT newIV) throws FBRManagementException{
    PosX7 = newIV;
    PE7.connectIVNoException("PosX",PosX7);
    }
/** Connect the given variable to the input variable PosY7
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY7(UINT newIV) throws FBRManagementException{
    PosY7 = newIV;
    PE7.connectIVNoException("PosY",PosY7);
    }
/** Connect the given variable to the input variable PosX8
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX8(UINT newIV) throws FBRManagementException{
    PosX8 = newIV;
    PE8.connectIVNoException("PosX",PosX8);
    }
/** Connect the given variable to the input variable PosY8
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY8(UINT newIV) throws FBRManagementException{
    PosY8 = newIV;
    PE8.connectIVNoException("PosY",PosY8);
    }
/** Connect the given variable to the input variable PosX9
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX9(UINT newIV) throws FBRManagementException{
    PosX9 = newIV;
    PE9.connectIVNoException("PosX",PosX9);
    }
/** Connect the given variable to the input variable PosY9
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY9(UINT newIV) throws FBRManagementException{
    PosY9 = newIV;
    PE9.connectIVNoException("PosY",PosY9);
    }
/** Connect the given variable to the input variable PosX10
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX10(UINT newIV) throws FBRManagementException{
    PosX10 = newIV;
    PE10.connectIVNoException("PosX",PosX10);
    }
/** Connect the given variable to the input variable PosY10
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY10(UINT newIV) throws FBRManagementException{
    PosY10 = newIV;
    PE10.connectIVNoException("PosY",PosY10);
    }
/** Connect the given variable to the input variable PosX11
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX11(UINT newIV) throws FBRManagementException{
    PosX11 = newIV;
    PE11.connectIVNoException("PosX",PosX11);
    }
/** Connect the given variable to the input variable PosY11
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY11(UINT newIV) throws FBRManagementException{
    PosY11 = newIV;
    PE11.connectIVNoException("PosY",PosY11);
    }
/** Connect the given variable to the input variable PosX12
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX12(UINT newIV) throws FBRManagementException{
    PosX12 = newIV;
    PE12.connectIVNoException("PosX",PosX12);
    }
/** Connect the given variable to the input variable PosY12
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY12(UINT newIV) throws FBRManagementException{
    PosY12 = newIV;
    PE12.connectIVNoException("PosY",PosY12);
    }
/** Connect the given variable to the input variable PosX13
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX13(UINT newIV) throws FBRManagementException{
    PosX13 = newIV;
    PE13.connectIVNoException("PosX",PosX13);
    }
/** Connect the given variable to the input variable PosY13
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY13(UINT newIV) throws FBRManagementException{
    PosY13 = newIV;
    PE13.connectIVNoException("PosY",PosY13);
    }
/** Connect the given variable to the input variable PosX14
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX14(UINT newIV) throws FBRManagementException{
    PosX14 = newIV;
    PE14.connectIVNoException("PosX",PosX14);
    }
/** Connect the given variable to the input variable PosY14
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY14(UINT newIV) throws FBRManagementException{
    PosY14 = newIV;
    PE14.connectIVNoException("PosY",PosY14);
    }
/** Connect the given variable to the input variable PosX15
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX15(UINT newIV) throws FBRManagementException{
    PosX15 = newIV;
    PE15.connectIVNoException("PosX",PosX15);
    }
/** Connect the given variable to the input variable PosY15
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY15(UINT newIV) throws FBRManagementException{
    PosY15 = newIV;
    PE15.connectIVNoException("PosY",PosY15);
    }
/** Connect the given variable to the input variable PosX16
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosX16(UINT newIV) throws FBRManagementException{
    PosX16 = newIV;
    PE16.connectIVNoException("PosX",PosX16);
    }
/** Connect the given variable to the input variable PosY16
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_PosY16(UINT newIV) throws FBRManagementException{
    PosY16 = newIV;
    PE16.connectIVNoException("PosY",PosY16);
    }
/** Connect the given variable to the input variable PosX17
  * @param newIV The variable to connect
 */
  public void connect_PosX17(UINT newIV){
    PosX17 = newIV;
    }
/** Connect the given variable to the input variable PosY17
  * @param newIV The variable to connect
 */
  public void connect_PosY17(UINT newIV){
    PosY17 = newIV;
    }
/** Connect the given variable to the input variable PosX18
  * @param newIV The variable to connect
 */
  public void connect_PosX18(UINT newIV){
    PosX18 = newIV;
    }
/** Connect the given variable to the input variable PosY18
  * @param newIV The variable to connect
 */
  public void connect_PosY18(UINT newIV){
    PosY18 = newIV;
    }
/** FB PE1 */
  protected RenderComp PE1 = new RenderComp() ;
/** FB PE2 */
  protected RenderComp PE2 = new RenderComp() ;
/** FB PE3 */
  protected RenderComp PE3 = new RenderComp() ;
/** FB PE4 */
  protected RenderComp PE4 = new RenderComp() ;
/** FB PE5 */
  protected RenderComp PE5 = new RenderComp() ;
/** FB PE6 */
  protected RenderComp PE6 = new RenderComp() ;
/** FB PE7 */
  protected RenderComp PE7 = new RenderComp() ;
/** FB PE8 */
  protected RenderComp PE8 = new RenderComp() ;
/** FB PE9 */
  protected RenderComp PE9 = new RenderComp() ;
/** FB PE10 */
  protected RenderComp PE10 = new RenderComp() ;
/** FB PE11 */
  protected RenderComp PE11 = new RenderComp() ;
/** FB PE12 */
  protected RenderComp PE12 = new RenderComp() ;
/** FB PE13 */
  protected RenderComp PE13 = new RenderComp() ;
/** FB PE14 */
  protected RenderComp PE14 = new RenderComp() ;
/** FB PE15 */
  protected RenderComp PE15 = new RenderComp() ;
/** FB PE16 */
  protected RenderComp PE16 = new RenderComp() ;
/** The default constructor. */
public PEView(){
    super();
    INIT.connectTo(PE1.INIT);
    PE1.INITO.connectTo(PE2.INIT);
    PE2.INITO.connectTo(PE3.INIT);
    PE3.INITO.connectTo(PE4.INIT);
    PE4.INITO.connectTo(PE5.INIT);
    PE5.INITO.connectTo(PE6.INIT);
    PE6.INITO.connectTo(PE7.INIT);
    PE7.INITO.connectTo(PE8.INIT);
    PE8.INITO.connectTo(PE9.INIT);
    PE9.INITO.connectTo(PE10.INIT);
    PE10.INITO.connectTo(PE11.INIT);
    PE11.INITO.connectTo(PE12.INIT);
    PE12.INITO.connectTo(PE13.INIT);
    PE13.INITO.connectTo(PE14.INIT);
    PE15.INITO.connectTo(PE16.INIT);
    PE16.INITO.connectTo(INITO);
    PE16.CNF.connectTo(CNF);
    ChangePic.connectTo(PE1.ChangePic);
    ChangePic.connectTo(PE2.ChangePic);
    ChangePic.connectTo(PE3.ChangePic);
    ChangePic.connectTo(PE4.ChangePic);
    ChangePic.connectTo(PE5.ChangePic);
    ChangePic.connectTo(PE6.ChangePic);
    ChangePic.connectTo(PE7.ChangePic);
    ChangePic.connectTo(PE8.ChangePic);
    ChangePic.connectTo(PE9.ChangePic);
    ChangePic.connectTo(PE10.ChangePic);
    ChangePic.connectTo(PE11.ChangePic);
    ChangePic.connectTo(PE12.ChangePic);
    ChangePic.connectTo(PE13.ChangePic);
    ChangePic.connectTo(PE14.ChangePic);
    ChangePic.connectTo(PE15.ChangePic);
    ChangePic.connectTo(PE16.ChangePic);
    PE14.INITO.connectTo(INITO);
    PE1.connectIVNoException("PosX",PosX1);
    PE1.connectIVNoException("PosY",PosY1);
    PE2.connectIVNoException("PosX",PosX2);
    PE2.connectIVNoException("PosY",PosY2);
    PE3.connectIVNoException("PosX",PosX3);
    PE3.connectIVNoException("PosY",PosY3);
    PE4.connectIVNoException("PosX",PosX4);
    PE4.connectIVNoException("PosY",PosY4);
    PE5.connectIVNoException("PosX",PosX5);
    PE5.connectIVNoException("PosY",PosY5);
    PE6.connectIVNoException("PosX",PosX6);
    PE6.connectIVNoException("PosY",PosY6);
    PE7.connectIVNoException("PosX",PosX7);
    PE7.connectIVNoException("PosY",PosY7);
    PE8.connectIVNoException("PosX",PosX8);
    PE8.connectIVNoException("PosY",PosY8);
    PE9.connectIVNoException("PosX",PosX9);
    PE9.connectIVNoException("PosY",PosY9);
    PE10.connectIVNoException("PosX",PosX10);
    PE10.connectIVNoException("PosY",PosY10);
    PE11.connectIVNoException("PosX",PosX11);
    PE11.connectIVNoException("PosY",PosY11);
    PE12.connectIVNoException("PosX",PosX12);
    PE12.connectIVNoException("PosY",PosY12);
    PE13.connectIVNoException("PosX",PosX13);
    PE13.connectIVNoException("PosY",PosY13);
    PE14.connectIVNoException("PosX",PosX14);
    PE14.connectIVNoException("PosY",PosY14);
    PE15.connectIVNoException("PosX",PosX15);
    PE15.connectIVNoException("PosY",PosY15);
    PE16.connectIVNoException("PosX",PosX16);
    PE16.connectIVNoException("PosY",PosY16);
    PE1.connectIVNoException("name",name1);
    PE2.connectIVNoException("name",name2);
    PE3.connectIVNoException("name",name3);
    PE4.connectIVNoException("name",name4);
    PE5.connectIVNoException("name",name5);
    PE6.connectIVNoException("name",name6);
    PE7.connectIVNoException("name",name7);
    PE8.connectIVNoException("name",name8);
    PE9.connectIVNoException("name",name9);
    PE10.connectIVNoException("name",name10);
    PE11.connectIVNoException("name",name11);
    PE12.connectIVNoException("name",name12);
    PE13.connectIVNoException("name",name13);
    PE14.connectIVNoException("name",name14);
    PE15.connectIVNoException("name",name15);
    PE16.connectIVNoException("name",name16);
    PE1.Layer.initializeNoException("1");
    PE1.Display.initializeNoException("1");
    PE2.Layer.initializeNoException("1");
    PE2.Display.initializeNoException("1");
    PE3.Layer.initializeNoException("1");
    PE3.Display.initializeNoException("1");
    PE4.Layer.initializeNoException("1");
    PE4.Display.initializeNoException("1");
    PE5.Layer.initializeNoException("1");
    PE5.Display.initializeNoException("1");
    PE6.Layer.initializeNoException("1");
    PE6.Display.initializeNoException("1");
    PE7.Layer.initializeNoException("1");
    PE7.Display.initializeNoException("1");
    PE8.Layer.initializeNoException("1");
    PE8.Display.initializeNoException("1");
    PE9.Layer.initializeNoException("1");
    PE9.Display.initializeNoException("1");
    PE10.Layer.initializeNoException("1");
    PE10.Display.initializeNoException("1");
    PE11.Layer.initializeNoException("1");
    PE11.Display.initializeNoException("1");
    PE12.Layer.initializeNoException("1");
    PE12.Display.initializeNoException("1");
    PE13.Layer.initializeNoException("1");
    PE13.Display.initializeNoException("1");
    PE14.Layer.initializeNoException("1");
    PE14.Display.initializeNoException("1");
    PE15.Layer.initializeNoException("1");
    PE15.Display.initializeNoException("1");
    PE16.Layer.initializeNoException("1");
    PE16.Display.initializeNoException("1");
  }
/** {@inheritDoc}
 * @param fbName {@inheritDoc}
 * @param r {@inheritDoc}
 * @throws FBRManagementException {@inheritDoc} */
  public void initialize(String fbName, Resource r)
  throws FBRManagementException{
    super.initialize(fbName,r);
    PE1.initialize("PE1",r);
    PE2.initialize("PE2",r);
    PE3.initialize("PE3",r);
    PE4.initialize("PE4",r);
    PE5.initialize("PE5",r);
    PE6.initialize("PE6",r);
    PE7.initialize("PE7",r);
    PE8.initialize("PE8",r);
    PE9.initialize("PE9",r);
    PE10.initialize("PE10",r);
    PE11.initialize("PE11",r);
    PE12.initialize("PE12",r);
    PE13.initialize("PE13",r);
    PE14.initialize("PE14",r);
    PE15.initialize("PE15",r);
    PE16.initialize("PE16",r);
}
/** Start the FB instances. */
public void start( ){
  PE1.start();
  PE2.start();
  PE3.start();
  PE4.start();
  PE5.start();
  PE6.start();
  PE7.start();
  PE8.start();
  PE9.start();
  PE10.start();
  PE11.start();
  PE12.start();
  PE13.start();
  PE14.start();
  PE15.start();
  PE16.start();
}
/** Stop the FB instances. */
public void stop( ){
  PE1.stop();
  PE2.stop();
  PE3.stop();
  PE4.stop();
  PE5.stop();
  PE6.stop();
  PE7.stop();
  PE8.stop();
  PE9.stop();
  PE10.stop();
  PE11.stop();
  PE12.stop();
  PE13.stop();
  PE14.stop();
  PE15.stop();
  PE16.stop();
}
}
