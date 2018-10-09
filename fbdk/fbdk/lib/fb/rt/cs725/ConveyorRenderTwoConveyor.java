/* Copyright (c)2013 Rockwell Automation. All rights reserved. */
package fb.rt.cs725;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK ConveyorRenderTwoConveyor
  * @author JHC
  * @version 20130429/JHC
  */
public class ConveyorRenderTwoConveyor extends FBInstance
{
/** VAR C1BagOutX1 */
  public ARRAY C1BagOutX1 = new ARRAY(new DINT(),20);
/** VAR C1BagOutPE1 */
  public BOOL C1BagOutPE1 = new BOOL();
/** VAR C1BagOutX2 */
  public ARRAY C1BagOutX2 = new ARRAY(new DINT(),20);
/** VAR C1BagOutPE2 */
  public BOOL C1BagOutPE2 = new BOOL();
/** VAR C2BagOutX1 */
  public ARRAY C2BagOutX1 = new ARRAY(new DINT(),20);
/** VAR C2BagOutPE1 */
  public BOOL C2BagOutPE1 = new BOOL();
/** VAR C2BagOutX2 */
  public ARRAY C2BagOutX2 = new ARRAY(new DINT(),20);
/** VAR C2BagOutPE2 */
  public BOOL C2BagOutPE2 = new BOOL();
/** VAR C3BagOutX1 */
  public ARRAY C3BagOutX1 = new ARRAY(new DINT(),20);
/** VAR C3BagOutPE1 */
  public BOOL C3BagOutPE1 = new BOOL();
/** VAR C3BagOutX2 */
  public ARRAY C3BagOutX2 = new ARRAY(new DINT(),20);
/** VAR C3BagOutPE2 */
  public BOOL C3BagOutPE2 = new BOOL();
/** VAR C4BagOutX1 */
  public ARRAY C4BagOutX1 = new ARRAY(new DINT(),20);
/** VAR C4BagOutPE1 */
  public BOOL C4BagOutPE1 = new BOOL();
/** VAR C4BagOutX2 */
  public ARRAY C4BagOutX2 = new ARRAY(new DINT(),20);
/** VAR C4BagOutPE2 */
  public BOOL C4BagOutPE2 = new BOOL();
/** VAR C4BagOutX3 */
  public ARRAY C4BagOutX3 = new ARRAY(new DINT(),20);
/** VAR C4BagOutPE3 */
  public BOOL C4BagOutPE3 = new BOOL();
/** VAR C4BagOutPE4 */
  public BOOL C4BagOutPE4 = new BOOL();
/** VAR C4BagOutPE5 */
  public BOOL C4BagOutPE5 = new BOOL();
/** VAR C4BagOutPE6 */
  public BOOL C4BagOutPE6 = new BOOL();
/** VAR C5BagOutX1 */
  public ARRAY C5BagOutX1 = new ARRAY(new DINT(),20);
/** VAR C5BagOutPE1 */
  public BOOL C5BagOutPE1 = new BOOL();
/** VAR C5BagOutX2 */
  public ARRAY C5BagOutX2 = new ARRAY(new DINT(),20);
/** VAR C5BagOutPE2 */
  public BOOL C5BagOutPE2 = new BOOL();
/** VAR C1Rotate */
  public BOOL C1Rotate = new BOOL();
/** VAR C2Rotate */
  public BOOL C2Rotate = new BOOL();
/** VAR C3Rotate */
  public BOOL C3Rotate = new BOOL();
/** VAR C4Rotate */
  public BOOL C4Rotate = new BOOL();
/** VAR C5Rotate */
  public BOOL C5Rotate = new BOOL();
/** VAR C6Rotate */
  public BOOL C6Rotate = new BOOL();
/** VAR C7Rotate */
  public BOOL C7Rotate = new BOOL();
/** VAR C8Rotate */
  public BOOL C8Rotate = new BOOL();
/** VAR C9Rotate */
  public BOOL C9Rotate = new BOOL();
/** VAR C10Rotate */
  public BOOL C10Rotate = new BOOL();
/** VAR C11Rotate */
  public BOOL C11Rotate = new BOOL();
/** VAR Bag1X */
  public UINT Bag1X = new UINT();
/** VAR Bag1Y */
  public UINT Bag1Y = new UINT();
/** VAR Bag2X */
  public UINT Bag2X = new UINT();
/** VAR Bag2Y */
  public UINT Bag2Y = new UINT();
/** VAR Bag3X */
  public UINT Bag3X = new UINT();
/** VAR Bag3Y */
  public UINT Bag3Y = new UINT();
/** VAR Bag4X */
  public UINT Bag4X = new UINT();
/** VAR Bag4Y */
  public UINT Bag4Y = new UINT();
/** VAR Bag5X */
  public UINT Bag5X = new UINT();
/** VAR Bag5Y */
  public UINT Bag5Y = new UINT();
/** VAR Bag6X */
  public UINT Bag6X = new UINT();
/** VAR Bag6Y */
  public UINT Bag6Y = new UINT();
/** VAR Bag7X */
  public UINT Bag7X = new UINT();
/** VAR Bag7Y */
  public UINT Bag7Y = new UINT();
/** VAR Bag8X */
  public UINT Bag8X = new UINT();
/** VAR Bag8Y */
  public UINT Bag8Y = new UINT();
/** VAR Bag9X */
  public UINT Bag9X = new UINT();
/** VAR Bag9Y */
  public UINT Bag9Y = new UINT();
/** VAR Bag10X */
  public UINT Bag10X = new UINT();
/** VAR Bag10Y */
  public UINT Bag10Y = new UINT();
/** VAR Bag11X */
  public UINT Bag11X = new UINT();
/** VAR Bag11Y */
  public UINT Bag11Y = new UINT();
/** VAR Bag12X */
  public UINT Bag12X = new UINT();
/** VAR Bag12Y */
  public UINT Bag12Y = new UINT();
/** VAR Bag13X */
  public UINT Bag13X = new UINT();
/** VAR Bag13Y */
  public UINT Bag13Y = new UINT();
/** VAR Bag14X */
  public UINT Bag14X = new UINT();
/** VAR Bag14Y */
  public UINT Bag14Y = new UINT();
/** VAR Bag15X */
  public UINT Bag15X = new UINT();
/** VAR Bag15Y */
  public UINT Bag15Y = new UINT();
/** VAR Bag16X */
  public UINT Bag16X = new UINT();
/** VAR Bag16Y */
  public UINT Bag16Y = new UINT();
/** VAR Bag17X */
  public UINT Bag17X = new UINT();
/** VAR Bag17Y */
  public UINT Bag17Y = new UINT();
/** VAR Bag18X */
  public UINT Bag18X = new UINT();
/** VAR Bag18Y */
  public UINT Bag18Y = new UINT();
/** VAR PE1 */
  public WSTRING PE1 = new WSTRING();
/** VAR PE2 */
  public WSTRING PE2 = new WSTRING();
/** VAR PE3 */
  public WSTRING PE3 = new WSTRING();
/** VAR PE4 */
  public WSTRING PE4 = new WSTRING();
/** VAR PE5 */
  public WSTRING PE5 = new WSTRING();
/** VAR PE6 */
  public WSTRING PE6 = new WSTRING();
/** VAR PE7 */
  public WSTRING PE7 = new WSTRING();
/** VAR PE8 */
  public WSTRING PE8 = new WSTRING();
/** VAR PE9 */
  public WSTRING PE9 = new WSTRING();
/** VAR PE10 */
  public WSTRING PE10 = new WSTRING();
/** VAR PE11 */
  public WSTRING PE11 = new WSTRING();
/** VAR PE12 */
  public WSTRING PE12 = new WSTRING();
/** VAR PE13 */
  public WSTRING PE13 = new WSTRING();
/** VAR PE14 */
  public WSTRING PE14 = new WSTRING();
/** VAR C1Rot */
  public WSTRING C1Rot = new WSTRING();
/** VAR C2Rot */
  public WSTRING C2Rot = new WSTRING();
/** VAR C3Rot */
  public WSTRING C3Rot = new WSTRING();
/** VAR C4Rot */
  public WSTRING C4Rot = new WSTRING();
/** VAR C5Rot */
  public WSTRING C5Rot = new WSTRING();
/** VAR C6Rot */
  public WSTRING C6Rot = new WSTRING();
/** VAR C7Rot */
  public WSTRING C7Rot = new WSTRING();
/** VAR C8Rot */
  public WSTRING C8Rot = new WSTRING();
/** VAR C9Rot */
  public WSTRING C9Rot = new WSTRING();
/** VAR C10Rot */
  public WSTRING C10Rot = new WSTRING();
/** VAR C11Rot */
  public WSTRING C11Rot = new WSTRING();
/** VAR numOfBags */
  public INT numOfBags = new INT();
/** VAR index */
  public INT index = new INT();
/** VAR bagDetail */
  public ARRAY bagDetail = new ARRAY(new BagDetail(),18);
/** VAR tcOffset1 */
  public INT tcOffset1 = new INT();
/** VAR tcOffset2 */
  public INT tcOffset2 = new INT();
/** VAR tcOffset3 */
  public INT tcOffset3 = new INT();
/** VAR fcOffset1 */
  public INT fcOffset1 = new INT();
/** VAR fcOffset2 */
  public INT fcOffset2 = new INT();
/** VAR fc1Offset1 */
  public INT fc1Offset1 = new INT();
/** VAR fc1Offset2 */
  public INT fc1Offset2 = new INT();
/** VAR fc2Offset1 */
  public INT fc2Offset1 = new INT();
/** VAR fc2Offset2 */
  public INT fc2Offset2 = new INT();
/** Initialization Request */
 public EventServer INIT = new EventInput(this);
/** Normal Execution Request */
 public EventServer REQ = new EventInput(this);
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
    if("REQ".equals(s)) return REQ;
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
    if("C1BagOutX1".equals(s)) return C1BagOutX1;
    if("C1BagOutPE1".equals(s)) return C1BagOutPE1;
    if("C1BagOutX2".equals(s)) return C1BagOutX2;
    if("C1BagOutPE2".equals(s)) return C1BagOutPE2;
    if("C2BagOutX1".equals(s)) return C2BagOutX1;
    if("C2BagOutPE1".equals(s)) return C2BagOutPE1;
    if("C2BagOutX2".equals(s)) return C2BagOutX2;
    if("C2BagOutPE2".equals(s)) return C2BagOutPE2;
    if("C3BagOutX1".equals(s)) return C3BagOutX1;
    if("C3BagOutPE1".equals(s)) return C3BagOutPE1;
    if("C3BagOutX2".equals(s)) return C3BagOutX2;
    if("C3BagOutPE2".equals(s)) return C3BagOutPE2;
    if("C4BagOutX1".equals(s)) return C4BagOutX1;
    if("C4BagOutPE1".equals(s)) return C4BagOutPE1;
    if("C4BagOutX2".equals(s)) return C4BagOutX2;
    if("C4BagOutPE2".equals(s)) return C4BagOutPE2;
    if("C4BagOutX3".equals(s)) return C4BagOutX3;
    if("C4BagOutPE3".equals(s)) return C4BagOutPE3;
    if("C4BagOutPE4".equals(s)) return C4BagOutPE4;
    if("C4BagOutPE5".equals(s)) return C4BagOutPE5;
    if("C4BagOutPE6".equals(s)) return C4BagOutPE6;
    if("C5BagOutX1".equals(s)) return C5BagOutX1;
    if("C5BagOutPE1".equals(s)) return C5BagOutPE1;
    if("C5BagOutX2".equals(s)) return C5BagOutX2;
    if("C5BagOutPE2".equals(s)) return C5BagOutPE2;
    if("C1Rotate".equals(s)) return C1Rotate;
    if("C2Rotate".equals(s)) return C2Rotate;
    if("C3Rotate".equals(s)) return C3Rotate;
    if("C4Rotate".equals(s)) return C4Rotate;
    if("C5Rotate".equals(s)) return C5Rotate;
    if("C6Rotate".equals(s)) return C6Rotate;
    if("C7Rotate".equals(s)) return C7Rotate;
    if("C8Rotate".equals(s)) return C8Rotate;
    if("C9Rotate".equals(s)) return C9Rotate;
    if("C10Rotate".equals(s)) return C10Rotate;
    if("C11Rotate".equals(s)) return C11Rotate;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("Bag1X".equals(s)) return Bag1X;
    if("Bag1Y".equals(s)) return Bag1Y;
    if("Bag2X".equals(s)) return Bag2X;
    if("Bag2Y".equals(s)) return Bag2Y;
    if("Bag3X".equals(s)) return Bag3X;
    if("Bag3Y".equals(s)) return Bag3Y;
    if("Bag4X".equals(s)) return Bag4X;
    if("Bag4Y".equals(s)) return Bag4Y;
    if("Bag5X".equals(s)) return Bag5X;
    if("Bag5Y".equals(s)) return Bag5Y;
    if("Bag6X".equals(s)) return Bag6X;
    if("Bag6Y".equals(s)) return Bag6Y;
    if("Bag7X".equals(s)) return Bag7X;
    if("Bag7Y".equals(s)) return Bag7Y;
    if("Bag8X".equals(s)) return Bag8X;
    if("Bag8Y".equals(s)) return Bag8Y;
    if("Bag9X".equals(s)) return Bag9X;
    if("Bag9Y".equals(s)) return Bag9Y;
    if("Bag10X".equals(s)) return Bag10X;
    if("Bag10Y".equals(s)) return Bag10Y;
    if("Bag11X".equals(s)) return Bag11X;
    if("Bag11Y".equals(s)) return Bag11Y;
    if("Bag12X".equals(s)) return Bag12X;
    if("Bag12Y".equals(s)) return Bag12Y;
    if("Bag13X".equals(s)) return Bag13X;
    if("Bag13Y".equals(s)) return Bag13Y;
    if("Bag14X".equals(s)) return Bag14X;
    if("Bag14Y".equals(s)) return Bag14Y;
    if("Bag15X".equals(s)) return Bag15X;
    if("Bag15Y".equals(s)) return Bag15Y;
    if("Bag16X".equals(s)) return Bag16X;
    if("Bag16Y".equals(s)) return Bag16Y;
    if("Bag17X".equals(s)) return Bag17X;
    if("Bag17Y".equals(s)) return Bag17Y;
    if("Bag18X".equals(s)) return Bag18X;
    if("Bag18Y".equals(s)) return Bag18Y;
    if("PE1".equals(s)) return PE1;
    if("PE2".equals(s)) return PE2;
    if("PE3".equals(s)) return PE3;
    if("PE4".equals(s)) return PE4;
    if("PE5".equals(s)) return PE5;
    if("PE6".equals(s)) return PE6;
    if("PE7".equals(s)) return PE7;
    if("PE8".equals(s)) return PE8;
    if("PE9".equals(s)) return PE9;
    if("PE10".equals(s)) return PE10;
    if("PE11".equals(s)) return PE11;
    if("PE12".equals(s)) return PE12;
    if("PE13".equals(s)) return PE13;
    if("PE14".equals(s)) return PE14;
    if("C1Rot".equals(s)) return C1Rot;
    if("C2Rot".equals(s)) return C2Rot;
    if("C3Rot".equals(s)) return C3Rot;
    if("C4Rot".equals(s)) return C4Rot;
    if("C5Rot".equals(s)) return C5Rot;
    if("C6Rot".equals(s)) return C6Rot;
    if("C7Rot".equals(s)) return C7Rot;
    if("C8Rot".equals(s)) return C8Rot;
    if("C9Rot".equals(s)) return C9Rot;
    if("C10Rot".equals(s)) return C10Rot;
    if("C11Rot".equals(s)) return C11Rot;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("C1BagOutX1".equals(ivName)) connect_C1BagOutX1((ARRAY)newIV);
    else if("C1BagOutPE1".equals(ivName)) connect_C1BagOutPE1((BOOL)newIV);
    else if("C1BagOutX2".equals(ivName)) connect_C1BagOutX2((ARRAY)newIV);
    else if("C1BagOutPE2".equals(ivName)) connect_C1BagOutPE2((BOOL)newIV);
    else if("C2BagOutX1".equals(ivName)) connect_C2BagOutX1((ARRAY)newIV);
    else if("C2BagOutPE1".equals(ivName)) connect_C2BagOutPE1((BOOL)newIV);
    else if("C2BagOutX2".equals(ivName)) connect_C2BagOutX2((ARRAY)newIV);
    else if("C2BagOutPE2".equals(ivName)) connect_C2BagOutPE2((BOOL)newIV);
    else if("C3BagOutX1".equals(ivName)) connect_C3BagOutX1((ARRAY)newIV);
    else if("C3BagOutPE1".equals(ivName)) connect_C3BagOutPE1((BOOL)newIV);
    else if("C3BagOutX2".equals(ivName)) connect_C3BagOutX2((ARRAY)newIV);
    else if("C3BagOutPE2".equals(ivName)) connect_C3BagOutPE2((BOOL)newIV);
    else if("C4BagOutX1".equals(ivName)) connect_C4BagOutX1((ARRAY)newIV);
    else if("C4BagOutPE1".equals(ivName)) connect_C4BagOutPE1((BOOL)newIV);
    else if("C4BagOutX2".equals(ivName)) connect_C4BagOutX2((ARRAY)newIV);
    else if("C4BagOutPE2".equals(ivName)) connect_C4BagOutPE2((BOOL)newIV);
    else if("C4BagOutX3".equals(ivName)) connect_C4BagOutX3((ARRAY)newIV);
    else if("C4BagOutPE3".equals(ivName)) connect_C4BagOutPE3((BOOL)newIV);
    else if("C4BagOutPE4".equals(ivName)) connect_C4BagOutPE4((BOOL)newIV);
    else if("C4BagOutPE5".equals(ivName)) connect_C4BagOutPE5((BOOL)newIV);
    else if("C4BagOutPE6".equals(ivName)) connect_C4BagOutPE6((BOOL)newIV);
    else if("C5BagOutX1".equals(ivName)) connect_C5BagOutX1((ARRAY)newIV);
    else if("C5BagOutPE1".equals(ivName)) connect_C5BagOutPE1((BOOL)newIV);
    else if("C5BagOutX2".equals(ivName)) connect_C5BagOutX2((ARRAY)newIV);
    else if("C5BagOutPE2".equals(ivName)) connect_C5BagOutPE2((BOOL)newIV);
    else if("C1Rotate".equals(ivName)) connect_C1Rotate((BOOL)newIV);
    else if("C2Rotate".equals(ivName)) connect_C2Rotate((BOOL)newIV);
    else if("C3Rotate".equals(ivName)) connect_C3Rotate((BOOL)newIV);
    else if("C4Rotate".equals(ivName)) connect_C4Rotate((BOOL)newIV);
    else if("C5Rotate".equals(ivName)) connect_C5Rotate((BOOL)newIV);
    else if("C6Rotate".equals(ivName)) connect_C6Rotate((BOOL)newIV);
    else if("C7Rotate".equals(ivName)) connect_C7Rotate((BOOL)newIV);
    else if("C8Rotate".equals(ivName)) connect_C8Rotate((BOOL)newIV);
    else if("C9Rotate".equals(ivName)) connect_C9Rotate((BOOL)newIV);
    else if("C10Rotate".equals(ivName)) connect_C10Rotate((BOOL)newIV);
    else if("C11Rotate".equals(ivName)) connect_C11Rotate((BOOL)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable C1BagOutX1
  * @param newIV The variable to connect
 */
  public void connect_C1BagOutX1(ARRAY newIV){
    C1BagOutX1 = newIV;
    }
/** Connect the given variable to the input variable C1BagOutPE1
  * @param newIV The variable to connect
 */
  public void connect_C1BagOutPE1(BOOL newIV){
    C1BagOutPE1 = newIV;
    }
/** Connect the given variable to the input variable C1BagOutX2
  * @param newIV The variable to connect
 */
  public void connect_C1BagOutX2(ARRAY newIV){
    C1BagOutX2 = newIV;
    }
/** Connect the given variable to the input variable C1BagOutPE2
  * @param newIV The variable to connect
 */
  public void connect_C1BagOutPE2(BOOL newIV){
    C1BagOutPE2 = newIV;
    }
/** Connect the given variable to the input variable C2BagOutX1
  * @param newIV The variable to connect
 */
  public void connect_C2BagOutX1(ARRAY newIV){
    C2BagOutX1 = newIV;
    }
/** Connect the given variable to the input variable C2BagOutPE1
  * @param newIV The variable to connect
 */
  public void connect_C2BagOutPE1(BOOL newIV){
    C2BagOutPE1 = newIV;
    }
/** Connect the given variable to the input variable C2BagOutX2
  * @param newIV The variable to connect
 */
  public void connect_C2BagOutX2(ARRAY newIV){
    C2BagOutX2 = newIV;
    }
/** Connect the given variable to the input variable C2BagOutPE2
  * @param newIV The variable to connect
 */
  public void connect_C2BagOutPE2(BOOL newIV){
    C2BagOutPE2 = newIV;
    }
/** Connect the given variable to the input variable C3BagOutX1
  * @param newIV The variable to connect
 */
  public void connect_C3BagOutX1(ARRAY newIV){
    C3BagOutX1 = newIV;
    }
/** Connect the given variable to the input variable C3BagOutPE1
  * @param newIV The variable to connect
 */
  public void connect_C3BagOutPE1(BOOL newIV){
    C3BagOutPE1 = newIV;
    }
/** Connect the given variable to the input variable C3BagOutX2
  * @param newIV The variable to connect
 */
  public void connect_C3BagOutX2(ARRAY newIV){
    C3BagOutX2 = newIV;
    }
/** Connect the given variable to the input variable C3BagOutPE2
  * @param newIV The variable to connect
 */
  public void connect_C3BagOutPE2(BOOL newIV){
    C3BagOutPE2 = newIV;
    }
/** Connect the given variable to the input variable C4BagOutX1
  * @param newIV The variable to connect
 */
  public void connect_C4BagOutX1(ARRAY newIV){
    C4BagOutX1 = newIV;
    }
/** Connect the given variable to the input variable C4BagOutPE1
  * @param newIV The variable to connect
 */
  public void connect_C4BagOutPE1(BOOL newIV){
    C4BagOutPE1 = newIV;
    }
/** Connect the given variable to the input variable C4BagOutX2
  * @param newIV The variable to connect
 */
  public void connect_C4BagOutX2(ARRAY newIV){
    C4BagOutX2 = newIV;
    }
/** Connect the given variable to the input variable C4BagOutPE2
  * @param newIV The variable to connect
 */
  public void connect_C4BagOutPE2(BOOL newIV){
    C4BagOutPE2 = newIV;
    }
/** Connect the given variable to the input variable C4BagOutX3
  * @param newIV The variable to connect
 */
  public void connect_C4BagOutX3(ARRAY newIV){
    C4BagOutX3 = newIV;
    }
/** Connect the given variable to the input variable C4BagOutPE3
  * @param newIV The variable to connect
 */
  public void connect_C4BagOutPE3(BOOL newIV){
    C4BagOutPE3 = newIV;
    }
/** Connect the given variable to the input variable C4BagOutPE4
  * @param newIV The variable to connect
 */
  public void connect_C4BagOutPE4(BOOL newIV){
    C4BagOutPE4 = newIV;
    }
/** Connect the given variable to the input variable C4BagOutPE5
  * @param newIV The variable to connect
 */
  public void connect_C4BagOutPE5(BOOL newIV){
    C4BagOutPE5 = newIV;
    }
/** Connect the given variable to the input variable C4BagOutPE6
  * @param newIV The variable to connect
 */
  public void connect_C4BagOutPE6(BOOL newIV){
    C4BagOutPE6 = newIV;
    }
/** Connect the given variable to the input variable C5BagOutX1
  * @param newIV The variable to connect
 */
  public void connect_C5BagOutX1(ARRAY newIV){
    C5BagOutX1 = newIV;
    }
/** Connect the given variable to the input variable C5BagOutPE1
  * @param newIV The variable to connect
 */
  public void connect_C5BagOutPE1(BOOL newIV){
    C5BagOutPE1 = newIV;
    }
/** Connect the given variable to the input variable C5BagOutX2
  * @param newIV The variable to connect
 */
  public void connect_C5BagOutX2(ARRAY newIV){
    C5BagOutX2 = newIV;
    }
/** Connect the given variable to the input variable C5BagOutPE2
  * @param newIV The variable to connect
 */
  public void connect_C5BagOutPE2(BOOL newIV){
    C5BagOutPE2 = newIV;
    }
/** Connect the given variable to the input variable C1Rotate
  * @param newIV The variable to connect
 */
  public void connect_C1Rotate(BOOL newIV){
    C1Rotate = newIV;
    }
/** Connect the given variable to the input variable C2Rotate
  * @param newIV The variable to connect
 */
  public void connect_C2Rotate(BOOL newIV){
    C2Rotate = newIV;
    }
/** Connect the given variable to the input variable C3Rotate
  * @param newIV The variable to connect
 */
  public void connect_C3Rotate(BOOL newIV){
    C3Rotate = newIV;
    }
/** Connect the given variable to the input variable C4Rotate
  * @param newIV The variable to connect
 */
  public void connect_C4Rotate(BOOL newIV){
    C4Rotate = newIV;
    }
/** Connect the given variable to the input variable C5Rotate
  * @param newIV The variable to connect
 */
  public void connect_C5Rotate(BOOL newIV){
    C5Rotate = newIV;
    }
/** Connect the given variable to the input variable C6Rotate
  * @param newIV The variable to connect
 */
  public void connect_C6Rotate(BOOL newIV){
    C6Rotate = newIV;
    }
/** Connect the given variable to the input variable C7Rotate
  * @param newIV The variable to connect
 */
  public void connect_C7Rotate(BOOL newIV){
    C7Rotate = newIV;
    }
/** Connect the given variable to the input variable C8Rotate
  * @param newIV The variable to connect
 */
  public void connect_C8Rotate(BOOL newIV){
    C8Rotate = newIV;
    }
/** Connect the given variable to the input variable C9Rotate
  * @param newIV The variable to connect
 */
  public void connect_C9Rotate(BOOL newIV){
    C9Rotate = newIV;
    }
/** Connect the given variable to the input variable C10Rotate
  * @param newIV The variable to connect
 */
  public void connect_C10Rotate(BOOL newIV){
    C10Rotate = newIV;
    }
/** Connect the given variable to the input variable C11Rotate
  * @param newIV The variable to connect
 */
  public void connect_C11Rotate(BOOL newIV){
    C11Rotate = newIV;
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
public ConveyorRenderTwoConveyor(){
    super();
    numOfBags.initializeNoException("0");
    index.initializeNoException("0");
  }
/** {@inheritDoc}
* @param e {@inheritDoc} */
  public void serviceEvent(EventServer e){
    if (e == INIT) service_INIT();
    else if (e == REQ) service_REQ();
  }
/** Services the INIT event. */
  public void service_INIT(){
    if ((eccState == index_START)) state_INIT();
  }
/** Services the REQ event. */
  public void service_REQ(){
    if ((eccState == index_START)) state_REQ();
  }
  /** ALGORITHM INIT IN Java*/
public void alg_INIT(){
System.out.println("View Initialised");
Bag1X.value=6000;
Bag1Y.value=6000;
Bag2X.value=6000;
Bag2Y.value=6000;
Bag3X.value=6000;
Bag3Y.value=6000;
Bag4X.value=6000;
Bag4Y.value=6000;
Bag5X.value=6000;
Bag5Y.value=6000;
Bag6X.value=6000;
Bag6Y.value=6000;
Bag7X.value=6000;
Bag7Y.value=6000;
Bag8X.value=6000;
Bag8Y.value=6000;
Bag9X.value=6000;
Bag9Y.value=6000;
Bag10X.value=6000;
Bag10Y.value=6000;
Bag11X.value=6000;
Bag11Y.value=6000;
Bag12X.value=6000;
Bag12Y.value=6000;
Bag13X.value=6000;
Bag13Y.value=6000;
Bag14X.value=6000;
Bag14Y.value=6000;
Bag15X.value=6000;
Bag15Y.value=6000;
Bag16X.value=6000;
Bag16Y.value=6000;
Bag17X.value=6000;
Bag17Y.value=6000;
Bag18X.value=6000;
Bag18Y.value=6000;


for(int i = 0; i < 18; i++)
{
    ((BagDetail)bagDetail.value[i]).bagYValue.value=6000;
    ((BagDetail)bagDetail.value[i]).conId.value=6000;
    ((BagDetail)bagDetail.value[i]).bagXValue.value=6000;
}

fcOffset1.value=49;
fcOffset2.value=201;
fc1Offset1.value=659;
fc1Offset2.value=507;
fc2Offset1.value=659;
fc2Offset2.value=507;
tcOffset1.value=99;
tcOffset2.value=301;
tcOffset3.value=503;
if (C1BagOutPE1.value)
PE1.value = "/fb/rt/cs725/SSG.png";
else
PE1.value = "/fb/rt/cs725/SSR.png";
if (C1BagOutPE2.value)
PE2.value = "/fb/rt/cs725/SSG.png";
else
PE2.value = "/fb/rt/cs725/SSR.png";

if (C2BagOutPE1.value)
PE3.value = "/fb/rt/cs725/SSG.png";
else
PE3.value = "/fb/rt/cs725/SSR.png";
if (C2BagOutPE2.value)
PE4.value = "/fb/rt/cs725/SSG.png";
else
PE4.value = "/fb/rt/cs725/SSR.png";

if (C3BagOutPE1.value)
PE5.value = "/fb/rt/cs725/SSG.png";
else
PE5.value = "/fb/rt/cs725/SSR.png";
if (C3BagOutPE2.value)
PE6.value = "/fb/rt/cs725/SSG.png";
else
PE6.value = "/fb/rt/cs725/SSR.png";

if (C4BagOutPE1.value)
PE7.value = "/fb/rt/cs725/SSG.png";
else
PE7.value = "/fb/rt/cs725/SSR.png";
if (C4BagOutPE2.value)
PE8.value = "/fb/rt/cs725/SSG.png";
else
PE8.value = "/fb/rt/cs725/SSR.png";
if (C4BagOutPE3.value)
PE9.value = "/fb/rt/cs725/SSG.png";
else
PE9.value = "/fb/rt/cs725/SSR.png";
if (C4BagOutPE4.value)
PE10.value = "/fb/rt/cs725/SSG.png";
else
PE10.value = "/fb/rt/cs725/SSR.png";
if (C4BagOutPE5.value)
PE11.value = "/fb/rt/cs725/SSG.png";
else
PE11.value = "/fb/rt/cs725/SSR.png";
if (C4BagOutPE6.value)
PE12.value = "/fb/rt/cs725/SSG.png";
else
PE12.value = "/fb/rt/cs725/SSR.png";

if (C5BagOutPE1.value)
PE13.value = "/fb/rt/cs725/SSG.png";
else
PE13.value = "/fb/rt/cs725/SSR.png";
if (C5BagOutPE2.value)
PE14.value = "/fb/rt/cs725/SSG.png";
else
PE14.value = "/fb/rt/cs725/SSR.png";

if (C1Rotate.value)
C1Rot.value = "/fb/rt/cs725/FC.gif";
else
C1Rot.value = "/fb/rt/cs725/FC.png";

if (C2Rotate.value)
C2Rot.value = "/fb/rt/cs725/FC.gif";
else
C2Rot.value = "/fb/rt/cs725/FC.png";

if (C3Rotate.value)
C3Rot.value = "/fb/rt/cs725/FC.gif";
else
C3Rot.value = "/fb/rt/cs725/FC.png";

if (C4Rotate.value)
C4Rot.value = "/fb/rt/cs725/FC.gif";
else
C4Rot.value = "/fb/rt/cs725/FC.png";

if (C5Rotate.value)
C5Rot.value = "/fb/rt/cs725/FCU.gif";
else
C5Rot.value = "/fb/rt/cs725/FCU.png";

if (C6Rotate.value)
C6Rot.value = "/fb/rt/cs725/FCU.gif";
else
C6Rot.value = "/fb/rt/cs725/FCU.png";

if (C7Rotate.value)
C7Rot.value = "/fb/rt/cs725/TC.gif";
else
C7Rot.value = "/fb/rt/cs725/TC.png";

if (C8Rotate.value)
C8Rot.value = "/fb/rt/cs725/TC.gif";
else
C8Rot.value = "/fb/rt/cs725/TC.png";

if (C9Rotate.value)
C9Rot.value = "/fb/rt/cs725/TC.gif";
else
C9Rot.value = "/fb/rt/cs725/TC.png";

if (C10Rotate.value)
C10Rot.value = "/fb/rt/cs725/FCU.gif";
else
C10Rot.value = "/fb/rt/cs725/FCU.png";

if (C11Rotate.value)
C11Rot.value = "/fb/rt/cs725/FCU.gif";
else
C11Rot.value = "/fb/rt/cs725/FCU.png";

}
  /** ALGORITHM REQ IN Java*/
public void alg_REQ(){
index.value=0;

for(int i = 0; i < 5 ; i++)
{
  if(index.value < 16)
  {
   
    if(((DINT)C1BagOutX1.value[i]).value != 0)
    {
        ((BagDetail)bagDetail.value[index.value]).conId.value=1;
((BagDetail)bagDetail.value[index.value]).bagYValue.value=fcOffset1.value+((DINT)C1BagOutX1.value[i]).value;   
index.value++;
    } 
    if(((DINT)C1BagOutX2.value[i]).value != 0)
    {

        ((BagDetail)bagDetail.value[index.value]).conId.value=1;
((BagDetail)bagDetail.value[index.value]).bagYValue.value=fcOffset2.value+((DINT)C1BagOutX2.value[i]).value;   
index.value++;
    }
    if(((DINT)C2BagOutX1.value[i]).value != 0)
    {
        ((BagDetail)bagDetail.value[index.value]).conId.value=2;
((BagDetail)bagDetail.value[index.value]).bagYValue.value=fcOffset1.value+((DINT)C2BagOutX1.value[i]).value;   
index.value++;
    } 
    if(((DINT)C2BagOutX2.value[i]).value != 0)
    {
        ((BagDetail)bagDetail.value[index.value]).conId.value=2;
((BagDetail)bagDetail.value[index.value]).bagYValue.value=fcOffset2.value+((DINT)C2BagOutX2.value[i]).value;   
index.value++;
    }
    if(((DINT)C3BagOutX1.value[i]).value != 0)
    {
        ((BagDetail)bagDetail.value[index.value]).conId.value=3;
((BagDetail)bagDetail.value[index.value]).bagYValue.value=fc1Offset1.value-((DINT)C3BagOutX1.value[i]).value;   
index.value++;
    } 
    if(((DINT)C3BagOutX2.value[i]).value != 0)
    {
        ((BagDetail)bagDetail.value[index.value]).conId.value=3;
((BagDetail)bagDetail.value[index.value]).bagYValue.value=fc1Offset2.value-((DINT)C3BagOutX2.value[i]).value;   
index.value++;
    }
    if(((DINT)C5BagOutX1.value[i]).value != 0)
    {
	System.out.println("X1 is" + C5BagOutX1.value[i]);
        ((BagDetail)bagDetail.value[index.value]).conId.value=4;
((BagDetail)bagDetail.value[index.value]).bagYValue.value=fc2Offset1.value-((DINT)C5BagOutX1.value[i]).value;   
index.value++;
    } 
    if(((DINT)C5BagOutX2.value[i]).value != 0)
    {
	System.out.println("X2 is" + C5BagOutX1.value[i]);
        ((BagDetail)bagDetail.value[index.value]).conId.value=4;
((BagDetail)bagDetail.value[index.value]).bagYValue.value=fc2Offset2.value-((DINT)C5BagOutX2.value[i]).value;   
index.value++;
    }
 }
}
for(int i = 0; i < 16 ; i++)
{
  if(index.value < 16)
  {
    if(((DINT)C4BagOutX1.value[i]).value != 0)
    {
        ((BagDetail)bagDetail.value[index.value]).conId.value=0;
((BagDetail)bagDetail.value[index.value]).bagXValue.value=tcOffset1.value+((DINT)C4BagOutX1.value[i]).value;   
index.value++;
    } 
    if(((DINT)C4BagOutX2.value[i]).value != 0)
    {
        ((BagDetail)bagDetail.value[index.value]).conId.value=0;
((BagDetail)bagDetail.value[index.value]).bagXValue.value=tcOffset2.value+((DINT)C4BagOutX2.value[i]).value;   
index.value++;
    }
    if(((DINT)C4BagOutX3.value[i]).value != 0)
    {
        ((BagDetail)bagDetail.value[index.value]).conId.value=0;
((BagDetail)bagDetail.value[index.value]).bagXValue.value=tcOffset3.value+((DINT)C4BagOutX3.value[i]).value;   
index.value++;
    }
  }
}
for(int i = 0; i < 16; i++)
{
    switch(((BagDetail)bagDetail.value[i]).conId.value)
{
case 0: ((BagDetail)bagDetail.value[i]).bagYValue.value = 359;
        break;
case 1:((BagDetail)bagDetail.value[i]).bagXValue.value = 105;
        break;
case 2:((BagDetail)bagDetail.value[i]).bagXValue.value = 307;
        break;
case 3:((BagDetail)bagDetail.value[i]).bagXValue.value = 205;
        break;
case 4:((BagDetail)bagDetail.value[i]).bagXValue.value = 509;
        break;
case 6000: ((BagDetail)bagDetail.value[i]).bagXValue.value = 6000;
           ((BagDetail)bagDetail.value[i]).bagYValue.value = 6000;
        break;
}
}
Bag1X.value=6000;
Bag1Y.value=6000;
Bag2X.value=6000;
Bag2Y.value=6000;
Bag3X.value=6000;
Bag3Y.value=6000;
Bag4X.value=6000;
Bag4Y.value=6000;
Bag5X.value=6000;
Bag5Y.value=6000;
Bag6X.value=6000;
Bag6Y.value=6000;
Bag7X.value=6000;
Bag7Y.value=6000;
Bag8X.value=6000;
Bag8Y.value=6000;
Bag9X.value=6000;
Bag9Y.value=6000;
Bag10X.value=6000;
Bag10Y.value=6000;
Bag11X.value=6000;
Bag11Y.value=6000;
Bag12X.value=6000;
Bag12Y.value=6000;
Bag13X.value=6000;
Bag13Y.value=6000;
Bag14X.value=6000;
Bag14Y.value=6000;
Bag15X.value=6000;
Bag15Y.value=6000;
Bag16X.value=6000;
Bag16Y.value=6000;
Bag17X.value=6000;
Bag17Y.value=6000;
Bag18X.value=6000;
Bag18Y.value=6000;
for(int i = 0; i < 16; i++)
{
    switch(i)
        {
           case 0: Bag1X.value = ((BagDetail)bagDetail.value[i]).bagXValue.value;
           Bag1Y.value = ((BagDetail)bagDetail.value[i]).bagYValue.value;
   break;
   case 1: Bag2X.value = ((BagDetail)bagDetail.value[i]).bagXValue.value;
           Bag2Y.value = ((BagDetail)bagDetail.value[i]).bagYValue.value;
   break;   
   case 2: Bag3X.value = ((BagDetail)bagDetail.value[i]).bagXValue.value;
           Bag3Y.value = ((BagDetail)bagDetail.value[i]).bagYValue.value;
   break;
   case 3: Bag4X.value = ((BagDetail)bagDetail.value[i]).bagXValue.value;
           Bag4Y.value = ((BagDetail)bagDetail.value[i]).bagYValue.value;
   break;
   case 4: Bag5X.value = ((BagDetail)bagDetail.value[i]).bagXValue.value;
           Bag5Y.value = ((BagDetail)bagDetail.value[i]).bagYValue.value;
   break;
   case 5: Bag6X.value = ((BagDetail)bagDetail.value[i]).bagXValue.value;
           Bag6Y.value = ((BagDetail)bagDetail.value[i]).bagYValue.value;
   break;
   case 6: Bag7X.value = ((BagDetail)bagDetail.value[i]).bagXValue.value;
           Bag7Y.value = ((BagDetail)bagDetail.value[i]).bagYValue.value;
   break;
   case 7: Bag8X.value = ((BagDetail)bagDetail.value[i]).bagXValue.value;
           Bag8Y.value = ((BagDetail)bagDetail.value[i]).bagYValue.value;
   break;
   case 8: Bag9X.value = ((BagDetail)bagDetail.value[i]).bagXValue.value;
           Bag9Y.value = ((BagDetail)bagDetail.value[i]).bagYValue.value;
   break;
   case 9: Bag10X.value = ((BagDetail)bagDetail.value[i]).bagXValue.value;
           Bag10Y.value = ((BagDetail)bagDetail.value[i]).bagYValue.value;
   break;
case 10: Bag11X.value = ((BagDetail)bagDetail.value[i]).bagXValue.value;
           Bag11Y.value = ((BagDetail)bagDetail.value[i]).bagYValue.value;
   break;
   case 11: Bag12X.value = ((BagDetail)bagDetail.value[i]).bagXValue.value;
           Bag12Y.value = ((BagDetail)bagDetail.value[i]).bagYValue.value;
   break;   
   case 12: Bag13X.value = ((BagDetail)bagDetail.value[i]).bagXValue.value;
           Bag13Y.value = ((BagDetail)bagDetail.value[i]).bagYValue.value;
   break;
   case 13: Bag14X.value = ((BagDetail)bagDetail.value[i]).bagXValue.value;
           Bag14Y.value = ((BagDetail)bagDetail.value[i]).bagYValue.value;
   break;
   case 14: Bag15X.value = ((BagDetail)bagDetail.value[i]).bagXValue.value;
           Bag15Y.value = ((BagDetail)bagDetail.value[i]).bagYValue.value;
   break;
   case 15: Bag16X.value = ((BagDetail)bagDetail.value[i]).bagXValue.value;
           Bag16Y.value = ((BagDetail)bagDetail.value[i]).bagYValue.value;
   break;
   case 16: Bag17X.value = ((BagDetail)bagDetail.value[i]).bagXValue.value;
           Bag17Y.value = ((BagDetail)bagDetail.value[i]).bagYValue.value;
   break;
   case 17: Bag18X.value = ((BagDetail)bagDetail.value[i]).bagXValue.value;
           Bag18Y.value = ((BagDetail)bagDetail.value[i]).bagYValue.value;
   break;
    }
}


for(int i = 0; i < 10; i++)
{
    ((BagDetail)bagDetail.value[i]).bagYValue.value=6000;
    ((BagDetail)bagDetail.value[i]).conId.value=6000;
    ((BagDetail)bagDetail.value[i]).bagXValue.value=6000;
}

if (C1BagOutPE1.value)
PE1.value = "/fb/rt/cs725/SSG.png";
else
PE1.value = "/fb/rt/cs725/SSR.png";
if (C1BagOutPE2.value)
PE2.value = "/fb/rt/cs725/SSG.png";
else
PE2.value = "/fb/rt/cs725/SSR.png";

if (C2BagOutPE1.value)
PE3.value = "/fb/rt/cs725/SSG.png";
else
PE3.value = "/fb/rt/cs725/SSR.png";
if (C2BagOutPE2.value)
PE4.value = "/fb/rt/cs725/SSG.png";
else
PE4.value = "/fb/rt/cs725/SSR.png";

if (C3BagOutPE1.value)
PE5.value = "/fb/rt/cs725/SSG.png";
else
PE5.value = "/fb/rt/cs725/SSR.png";
if (C3BagOutPE2.value)
PE6.value = "/fb/rt/cs725/SSG.png";
else
PE6.value = "/fb/rt/cs725/SSR.png";

if (C4BagOutPE1.value)
PE7.value = "/fb/rt/cs725/SSG.png";
else
PE7.value = "/fb/rt/cs725/SSR.png";
if (C4BagOutPE2.value)
PE8.value = "/fb/rt/cs725/SSG.png";
else
PE8.value = "/fb/rt/cs725/SSR.png";
if (C4BagOutPE3.value)
PE9.value = "/fb/rt/cs725/SSG.png";
else
PE9.value = "/fb/rt/cs725/SSR.png";
if (C4BagOutPE4.value)
PE10.value = "/fb/rt/cs725/SSG.png";
else
PE10.value = "/fb/rt/cs725/SSR.png";
if (C4BagOutPE5.value)
PE11.value = "/fb/rt/cs725/SSG.png";
else
PE11.value = "/fb/rt/cs725/SSR.png";
if (C4BagOutPE6.value)
PE12.value = "/fb/rt/cs725/SSG.png";
else
PE12.value = "/fb/rt/cs725/SSR.png";

if (C5BagOutPE1.value)
PE13.value = "/fb/rt/cs725/SSG.png";
else
PE13.value = "/fb/rt/cs725/SSR.png";
if (C5BagOutPE2.value)
PE14.value = "/fb/rt/cs725/SSG.png";
else
PE14.value = "/fb/rt/cs725/SSR.png";

if (C1Rotate.value)
C1Rot.value = "/fb/rt/cs725/FC.gif";
else
C1Rot.value = "/fb/rt/cs725/FC.png";

if (C2Rotate.value)
C2Rot.value = "/fb/rt/cs725/FC.gif";
else
C2Rot.value = "/fb/rt/cs725/FC.png";

if (C3Rotate.value)
C3Rot.value = "/fb/rt/cs725/FC.gif";
else
C3Rot.value = "/fb/rt/cs725/FC.png";

if (C4Rotate.value)
C4Rot.value = "/fb/rt/cs725/FC.gif";
else
C4Rot.value = "/fb/rt/cs725/FC.png";

if (C5Rotate.value)
C5Rot.value = "/fb/rt/cs725/FCU.gif";
else
C5Rot.value = "/fb/rt/cs725/FCU.png";

if (C6Rotate.value)
C6Rot.value = "/fb/rt/cs725/FCU.gif";
else
C6Rot.value = "/fb/rt/cs725/FCU.png";

if (C7Rotate.value)
C7Rot.value = "/fb/rt/cs725/TC.gif";
else
C7Rot.value = "/fb/rt/cs725/TC.png";

if (C8Rotate.value)
C8Rot.value = "/fb/rt/cs725/TC.gif";
else
C8Rot.value = "/fb/rt/cs725/TC.png";

if (C9Rotate.value)
C9Rot.value = "/fb/rt/cs725/TC.gif";
else
C9Rot.value = "/fb/rt/cs725/TC.png";

if (C10Rotate.value)
C10Rot.value = "/fb/rt/cs725/FCU.gif";
else
C10Rot.value = "/fb/rt/cs725/FCU.png";

if (C11Rotate.value)
C11Rot.value = "/fb/rt/cs725/FCU.gif";
else
C11Rot.value = "/fb/rt/cs725/FCU.png";

//System.out.println(C1BagOutPE1.value);
}
  /** ALGORITHM BAGIN IN Java*/
public void alg_BAGIN(){
//if(numOfBags.value < 10)
{
  // numOfBags.value++;
}

}
}
