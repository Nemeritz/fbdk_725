/* Copyright (c)2013 Rockwell Automation. All rights reserved. */
package fb.rt.cs725;import fb.rt.vhmi.*;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK Conveyor_View_Small
  * @author JHC
  * @version 20130526/JHC
  */
public class Conveyor_View_Small extends FBInstance
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
/** Initialization Request */
 public EventOutput INIT = new EventOutput();
/** Normal Execution Request */
 public EventOutput REQ = new EventOutput();
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
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C1BagOutX1(ARRAY newIV) throws FBRManagementException{
    C1BagOutX1 = newIV;
    RenderView.connectIVNoException("C1BagOutX1",C1BagOutX1);
    }
/** Connect the given variable to the input variable C1BagOutPE1
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C1BagOutPE1(BOOL newIV) throws FBRManagementException{
    C1BagOutPE1 = newIV;
    RenderView.connectIVNoException("C1BagOutPE1",C1BagOutPE1);
    }
/** Connect the given variable to the input variable C1BagOutX2
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C1BagOutX2(ARRAY newIV) throws FBRManagementException{
    C1BagOutX2 = newIV;
    RenderView.connectIVNoException("C1BagOutX2",C1BagOutX2);
    }
/** Connect the given variable to the input variable C1BagOutPE2
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C1BagOutPE2(BOOL newIV) throws FBRManagementException{
    C1BagOutPE2 = newIV;
    RenderView.connectIVNoException("C1BagOutPE2",C1BagOutPE2);
    }
/** Connect the given variable to the input variable C2BagOutX1
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C2BagOutX1(ARRAY newIV) throws FBRManagementException{
    C2BagOutX1 = newIV;
    RenderView.connectIVNoException("C2BagOutX1",C2BagOutX1);
    }
/** Connect the given variable to the input variable C2BagOutPE1
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C2BagOutPE1(BOOL newIV) throws FBRManagementException{
    C2BagOutPE1 = newIV;
    RenderView.connectIVNoException("C2BagOutPE1",C2BagOutPE1);
    }
/** Connect the given variable to the input variable C2BagOutX2
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C2BagOutX2(ARRAY newIV) throws FBRManagementException{
    C2BagOutX2 = newIV;
    RenderView.connectIVNoException("C2BagOutX2",C2BagOutX2);
    }
/** Connect the given variable to the input variable C2BagOutPE2
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C2BagOutPE2(BOOL newIV) throws FBRManagementException{
    C2BagOutPE2 = newIV;
    RenderView.connectIVNoException("C2BagOutPE2",C2BagOutPE2);
    }
/** Connect the given variable to the input variable C3BagOutX1
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C3BagOutX1(ARRAY newIV) throws FBRManagementException{
    C3BagOutX1 = newIV;
    RenderView.connectIVNoException("C3BagOutX1",C3BagOutX1);
    }
/** Connect the given variable to the input variable C3BagOutPE1
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C3BagOutPE1(BOOL newIV) throws FBRManagementException{
    C3BagOutPE1 = newIV;
    RenderView.connectIVNoException("C3BagOutPE1",C3BagOutPE1);
    }
/** Connect the given variable to the input variable C3BagOutX2
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C3BagOutX2(ARRAY newIV) throws FBRManagementException{
    C3BagOutX2 = newIV;
    RenderView.connectIVNoException("C3BagOutX2",C3BagOutX2);
    }
/** Connect the given variable to the input variable C3BagOutPE2
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C3BagOutPE2(BOOL newIV) throws FBRManagementException{
    C3BagOutPE2 = newIV;
    RenderView.connectIVNoException("C3BagOutPE2",C3BagOutPE2);
    }
/** Connect the given variable to the input variable C4BagOutX1
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C4BagOutX1(ARRAY newIV) throws FBRManagementException{
    C4BagOutX1 = newIV;
    RenderView.connectIVNoException("C4BagOutX1",C4BagOutX1);
    }
/** Connect the given variable to the input variable C4BagOutPE1
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C4BagOutPE1(BOOL newIV) throws FBRManagementException{
    C4BagOutPE1 = newIV;
    RenderView.connectIVNoException("C4BagOutPE1",C4BagOutPE1);
    }
/** Connect the given variable to the input variable C4BagOutX2
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C4BagOutX2(ARRAY newIV) throws FBRManagementException{
    C4BagOutX2 = newIV;
    RenderView.connectIVNoException("C4BagOutX2",C4BagOutX2);
    }
/** Connect the given variable to the input variable C4BagOutPE2
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C4BagOutPE2(BOOL newIV) throws FBRManagementException{
    C4BagOutPE2 = newIV;
    RenderView.connectIVNoException("C4BagOutPE2",C4BagOutPE2);
    }
/** Connect the given variable to the input variable C4BagOutX3
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C4BagOutX3(ARRAY newIV) throws FBRManagementException{
    C4BagOutX3 = newIV;
    RenderView.connectIVNoException("C4BagOutX3",C4BagOutX3);
    }
/** Connect the given variable to the input variable C4BagOutPE3
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C4BagOutPE3(BOOL newIV) throws FBRManagementException{
    C4BagOutPE3 = newIV;
    RenderView.connectIVNoException("C4BagOutPE3",C4BagOutPE3);
    }
/** Connect the given variable to the input variable C4BagOutPE4
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C4BagOutPE4(BOOL newIV) throws FBRManagementException{
    C4BagOutPE4 = newIV;
    RenderView.connectIVNoException("C4BagOutPE4",C4BagOutPE4);
    }
/** Connect the given variable to the input variable C4BagOutPE5
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C4BagOutPE5(BOOL newIV) throws FBRManagementException{
    C4BagOutPE5 = newIV;
    RenderView.connectIVNoException("C4BagOutPE5",C4BagOutPE5);
    }
/** Connect the given variable to the input variable C4BagOutPE6
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C4BagOutPE6(BOOL newIV) throws FBRManagementException{
    C4BagOutPE6 = newIV;
    RenderView.connectIVNoException("C4BagOutPE6",C4BagOutPE6);
    }
/** Connect the given variable to the input variable C5BagOutX1
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C5BagOutX1(ARRAY newIV) throws FBRManagementException{
    C5BagOutX1 = newIV;
    RenderView.connectIVNoException("C5BagOutX1",C5BagOutX1);
    }
/** Connect the given variable to the input variable C5BagOutPE1
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C5BagOutPE1(BOOL newIV) throws FBRManagementException{
    C5BagOutPE1 = newIV;
    RenderView.connectIVNoException("C5BagOutPE1",C5BagOutPE1);
    }
/** Connect the given variable to the input variable C5BagOutX2
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C5BagOutX2(ARRAY newIV) throws FBRManagementException{
    C5BagOutX2 = newIV;
    RenderView.connectIVNoException("C5BagOutX2",C5BagOutX2);
    }
/** Connect the given variable to the input variable C5BagOutPE2
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C5BagOutPE2(BOOL newIV) throws FBRManagementException{
    C5BagOutPE2 = newIV;
    RenderView.connectIVNoException("C5BagOutPE2",C5BagOutPE2);
    }
/** Connect the given variable to the input variable C1Rotate
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C1Rotate(BOOL newIV) throws FBRManagementException{
    C1Rotate = newIV;
    RenderView.connectIVNoException("C1Rotate",C1Rotate);
    }
/** Connect the given variable to the input variable C2Rotate
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C2Rotate(BOOL newIV) throws FBRManagementException{
    C2Rotate = newIV;
    RenderView.connectIVNoException("C2Rotate",C2Rotate);
    }
/** Connect the given variable to the input variable C3Rotate
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C3Rotate(BOOL newIV) throws FBRManagementException{
    C3Rotate = newIV;
    RenderView.connectIVNoException("C3Rotate",C3Rotate);
    }
/** Connect the given variable to the input variable C4Rotate
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C4Rotate(BOOL newIV) throws FBRManagementException{
    C4Rotate = newIV;
    RenderView.connectIVNoException("C4Rotate",C4Rotate);
    }
/** Connect the given variable to the input variable C5Rotate
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C5Rotate(BOOL newIV) throws FBRManagementException{
    C5Rotate = newIV;
    RenderView.connectIVNoException("C5Rotate",C5Rotate);
    }
/** Connect the given variable to the input variable C6Rotate
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C6Rotate(BOOL newIV) throws FBRManagementException{
    C6Rotate = newIV;
    RenderView.connectIVNoException("C6Rotate",C6Rotate);
    }
/** Connect the given variable to the input variable C7Rotate
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C7Rotate(BOOL newIV) throws FBRManagementException{
    C7Rotate = newIV;
    RenderView.connectIVNoException("C7Rotate",C7Rotate);
    }
/** Connect the given variable to the input variable C8Rotate
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C8Rotate(BOOL newIV) throws FBRManagementException{
    C8Rotate = newIV;
    RenderView.connectIVNoException("C8Rotate",C8Rotate);
    }
/** Connect the given variable to the input variable C9Rotate
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C9Rotate(BOOL newIV) throws FBRManagementException{
    C9Rotate = newIV;
    RenderView.connectIVNoException("C9Rotate",C9Rotate);
    }
/** Connect the given variable to the input variable C10Rotate
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C10Rotate(BOOL newIV) throws FBRManagementException{
    C10Rotate = newIV;
    RenderView.connectIVNoException("C10Rotate",C10Rotate);
    }
/** Connect the given variable to the input variable C11Rotate
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_C11Rotate(BOOL newIV) throws FBRManagementException{
    C11Rotate = newIV;
    RenderView.connectIVNoException("C11Rotate",C11Rotate);
    }
/** FB RenderView */
  protected ConveyorRenderTwoConveyor RenderView = new ConveyorRenderTwoConveyor() ;
/** FB Bag */
  protected BagView Bag = new BagView() ;
/** FB PE */
  protected PEView PE = new PEView() ;
/** FB TC1 */
  protected TwoConveyorInput TC1 = new TwoConveyorInput() ;
/** FB TC2 */
  protected TwoConveyorInput TC2 = new TwoConveyorInput() ;
/** FB TC3 */
  protected TwoConveyorInput TC3 = new TwoConveyorInput() ;
/** FB TC5 */
  protected ThreeConveyorInput TC5 = new ThreeConveyorInput() ;
/** FB TC4 */
  protected TwoConveyorInput TC4 = new TwoConveyorInput() ;
/** The default constructor. */
public Conveyor_View_Small(){
    super();
    INIT.connectTo(RenderView.INIT);
    REQ.connectTo(RenderView.REQ);
    RenderView.INITO.connectTo(Bag.INIT);
    RenderView.CNF.connectTo(Bag.ChangeXY);
    Bag.INITO.connectTo(PE.INIT);
    RenderView.CNF.connectTo(PE.ChangePic);
    PE.INITO.connectTo(TC1.INIT);
    TC1.INITO.connectTo(TC2.INIT);
    TC2.INITO.connectTo(TC3.INIT);
    TC5.INITO.connectTo(INITO);
    RenderView.CNF.connectTo(TC1.ChangePic);
    RenderView.CNF.connectTo(TC2.ChangePic);
    RenderView.CNF.connectTo(TC3.ChangePic);
    RenderView.CNF.connectTo(TC5.ChangePic);
    TC3.INITO.connectTo(TC4.INIT);
    TC4.INITO.connectTo(TC5.INIT);
    RenderView.CNF.connectTo(TC4.ChangePic);
    Bag.connectIVNoException("PosX1",RenderView.ovNamedNoException("Bag1X"));
    Bag.connectIVNoException("PosY1",RenderView.ovNamedNoException("Bag1Y"));
    Bag.connectIVNoException("PosX2",RenderView.ovNamedNoException("Bag2X"));
    Bag.connectIVNoException("PosY2",RenderView.ovNamedNoException("Bag2Y"));
    Bag.connectIVNoException("PosX3",RenderView.ovNamedNoException("Bag3X"));
    Bag.connectIVNoException("PosY3",RenderView.ovNamedNoException("Bag3Y"));
    Bag.connectIVNoException("PosX4",RenderView.ovNamedNoException("Bag4X"));
    Bag.connectIVNoException("PosY4",RenderView.ovNamedNoException("Bag4Y"));
    Bag.connectIVNoException("PosX5",RenderView.ovNamedNoException("Bag5X"));
    Bag.connectIVNoException("PosY5",RenderView.ovNamedNoException("Bag5Y"));
    Bag.connectIVNoException("PosX6",RenderView.ovNamedNoException("Bag6X"));
    Bag.connectIVNoException("PosY6",RenderView.ovNamedNoException("Bag6Y"));
    Bag.connectIVNoException("PosX7",RenderView.ovNamedNoException("Bag7X"));
    Bag.connectIVNoException("PosY7",RenderView.ovNamedNoException("Bag7Y"));
    Bag.connectIVNoException("PosX8",RenderView.ovNamedNoException("Bag8X"));
    Bag.connectIVNoException("PosY8",RenderView.ovNamedNoException("Bag8Y"));
    Bag.connectIVNoException("PosX9",RenderView.ovNamedNoException("Bag9X"));
    Bag.connectIVNoException("PosY9",RenderView.ovNamedNoException("Bag9Y"));
    Bag.connectIVNoException("PosX10",RenderView.ovNamedNoException("Bag10X"));
    Bag.connectIVNoException("PosY10",RenderView.ovNamedNoException("Bag10Y"));
    Bag.connectIVNoException("PosX11",RenderView.ovNamedNoException("Bag11X"));
    Bag.connectIVNoException("PosY11",RenderView.ovNamedNoException("Bag11Y"));
    Bag.connectIVNoException("PosX12",RenderView.ovNamedNoException("Bag12X"));
    Bag.connectIVNoException("PosY12",RenderView.ovNamedNoException("Bag12Y"));
    Bag.connectIVNoException("PosX13",RenderView.ovNamedNoException("Bag13X"));
    Bag.connectIVNoException("PosY13",RenderView.ovNamedNoException("Bag13Y"));
    Bag.connectIVNoException("PosX14",RenderView.ovNamedNoException("Bag14X"));
    Bag.connectIVNoException("PosY14",RenderView.ovNamedNoException("Bag14Y"));
    Bag.connectIVNoException("PosX15",RenderView.ovNamedNoException("Bag15X"));
    Bag.connectIVNoException("PosY15",RenderView.ovNamedNoException("Bag15Y"));
    Bag.connectIVNoException("PosX16",RenderView.ovNamedNoException("Bag16X"));
    Bag.connectIVNoException("PosY16",RenderView.ovNamedNoException("Bag16Y"));
    Bag.connectIVNoException("PosX17",RenderView.ovNamedNoException("Bag17X"));
    Bag.connectIVNoException("PosY17",RenderView.ovNamedNoException("Bag17Y"));
    Bag.connectIVNoException("PosX18",RenderView.ovNamedNoException("Bag18X"));
    Bag.connectIVNoException("PosY18",RenderView.ovNamedNoException("Bag18Y"));
    RenderView.connectIVNoException("C1BagOutX1",C1BagOutX1);
    RenderView.connectIVNoException("C1BagOutX2",C1BagOutX2);
    RenderView.connectIVNoException("C2BagOutX1",C2BagOutX1);
    RenderView.connectIVNoException("C2BagOutX2",C2BagOutX2);
    RenderView.connectIVNoException("C1BagOutPE1",C1BagOutPE1);
    RenderView.connectIVNoException("C1BagOutPE2",C1BagOutPE2);
    RenderView.connectIVNoException("C2BagOutPE1",C2BagOutPE1);
    RenderView.connectIVNoException("C2BagOutPE2",C2BagOutPE2);
    RenderView.connectIVNoException("C3BagOutX1",C3BagOutX1);
    RenderView.connectIVNoException("C3BagOutPE1",C3BagOutPE1);
    RenderView.connectIVNoException("C3BagOutX2",C3BagOutX2);
    RenderView.connectIVNoException("C3BagOutPE2",C3BagOutPE2);
    RenderView.connectIVNoException("C4BagOutX1",C4BagOutX1);
    RenderView.connectIVNoException("C4BagOutPE1",C4BagOutPE1);
    RenderView.connectIVNoException("C4BagOutX2",C4BagOutX2);
    RenderView.connectIVNoException("C4BagOutPE2",C4BagOutPE2);
    RenderView.connectIVNoException("C4BagOutX3",C4BagOutX3);
    RenderView.connectIVNoException("C4BagOutPE3",C4BagOutPE3);
    PE.connectIVNoException("name1",RenderView.ovNamedNoException("PE1"));
    PE.connectIVNoException("name2",RenderView.ovNamedNoException("PE2"));
    PE.connectIVNoException("name3",RenderView.ovNamedNoException("PE3"));
    PE.connectIVNoException("name4",RenderView.ovNamedNoException("PE4"));
    PE.connectIVNoException("name5",RenderView.ovNamedNoException("PE5"));
    PE.connectIVNoException("name6",RenderView.ovNamedNoException("PE6"));
    PE.connectIVNoException("name7",RenderView.ovNamedNoException("PE7"));
    PE.connectIVNoException("name8",RenderView.ovNamedNoException("PE8"));
    PE.connectIVNoException("name9",RenderView.ovNamedNoException("PE9"));
    PE.connectIVNoException("name10",RenderView.ovNamedNoException("PE10"));
    PE.connectIVNoException("name11",RenderView.ovNamedNoException("PE11"));
    PE.connectIVNoException("name12",RenderView.ovNamedNoException("PE12"));
    RenderView.connectIVNoException("C4BagOutPE4",C4BagOutPE4);
    RenderView.connectIVNoException("C4BagOutPE5",C4BagOutPE5);
    TC1.connectIVNoException("name1",RenderView.ovNamedNoException("C1Rot"));
    TC1.connectIVNoException("name2",RenderView.ovNamedNoException("C2Rot"));
    TC2.connectIVNoException("name1",RenderView.ovNamedNoException("C3Rot"));
    TC2.connectIVNoException("name2",RenderView.ovNamedNoException("C4Rot"));
    TC5.connectIVNoException("name1",RenderView.ovNamedNoException("C7Rot"));
    TC5.connectIVNoException("name2",RenderView.ovNamedNoException("C8Rot"));
    TC5.connectIVNoException("name3",RenderView.ovNamedNoException("C9Rot"));
    RenderView.connectIVNoException("C1Rotate",C1Rotate);
    RenderView.connectIVNoException("C2Rotate",C2Rotate);
    RenderView.connectIVNoException("C3Rotate",C3Rotate);
    RenderView.connectIVNoException("C4Rotate",C4Rotate);
    RenderView.connectIVNoException("C5Rotate",C5Rotate);
    RenderView.connectIVNoException("C6Rotate",C6Rotate);
    RenderView.connectIVNoException("C7Rotate",C7Rotate);
    RenderView.connectIVNoException("C8Rotate",C8Rotate);
    RenderView.connectIVNoException("C9Rotate",C9Rotate);
    PE.connectIVNoException("name13",RenderView.ovNamedNoException("PE13"));
    PE.connectIVNoException("name14",RenderView.ovNamedNoException("PE14"));
    RenderView.connectIVNoException("C10Rotate",C10Rotate);
    RenderView.connectIVNoException("C11Rotate",C11Rotate);
    RenderView.connectIVNoException("C4BagOutPE6",C4BagOutPE6);
    RenderView.connectIVNoException("C5BagOutX1",C5BagOutX1);
    RenderView.connectIVNoException("C5BagOutPE1",C5BagOutPE1);
    RenderView.connectIVNoException("C5BagOutX2",C5BagOutX2);
    RenderView.connectIVNoException("C5BagOutPE2",C5BagOutPE2);
    TC3.connectIVNoException("name2",RenderView.ovNamedNoException("C5Rot"));
    TC3.connectIVNoException("name1",RenderView.ovNamedNoException("C6Rot"));
    TC4.connectIVNoException("name2",RenderView.ovNamedNoException("C10Rot"));
    TC4.connectIVNoException("name1",RenderView.ovNamedNoException("C11Rot"));
    PE.PosX1.initializeNoException("132");
    PE.PosX2.initializeNoException("132");
    PE.PosY1.initializeNoException("170");
    PE.PosY2.initializeNoException("322");
    PE.PosX3.initializeNoException("334");
    PE.PosX4.initializeNoException("334");
    PE.PosY3.initializeNoException("170");
    PE.PosY4.initializeNoException("322");
    PE.PosX5.initializeNoException("232");
    PE.PosX6.initializeNoException("232");
    PE.PosY5.initializeNoException("538");
    PE.PosY6.initializeNoException("386");
    PE.PosX7.initializeNoException("270");
    PE.PosY7.initializeNoException("386");
    PE.PosY8.initializeNoException("386");
    PE.PosY9.initializeNoException("386");
    PE.PosX8.initializeNoException("472");
    PE.PosX9.initializeNoException("674");
    PE.PosX10.initializeNoException("154");
    PE.PosY10.initializeNoException("386");
    PE.PosX11.initializeNoException("356");
    PE.PosY11.initializeNoException("386");
    PE.PosX13.initializeNoException("536");
    PE.PosY13.initializeNoException("538");
    PE.PosX14.initializeNoException("536");
    PE.PosY14.initializeNoException("386");
    PE.PosX12.initializeNoException("558");
    PE.PosY12.initializeNoException("386");
    TC1.PosX1.initializeNoException("100");
    TC1.PosY1.initializeNoException("50");
    TC1.PosX2.initializeNoException("100");
    TC1.PosY2.initializeNoException("202");
    TC2.PosX1.initializeNoException("302");
    TC2.PosY1.initializeNoException("50");
    TC2.PosX2.initializeNoException("302");
    TC2.PosY2.initializeNoException("202");
    TC3.PosX1.initializeNoException("200");
    TC3.PosY1.initializeNoException("386");
    TC3.PosX2.initializeNoException("200");
    TC3.PosY2.initializeNoException("538");
    TC5.PosX1.initializeNoException("100");
    TC5.PosY1.initializeNoException("354");
    TC5.PosX2.initializeNoException("302");
    TC5.PosY2.initializeNoException("354");
    TC5.PosX3.initializeNoException("504");
    TC5.PosY3.initializeNoException("354");
    TC4.PosX1.initializeNoException("504");
    TC4.PosY1.initializeNoException("386");
    TC4.PosX2.initializeNoException("504");
    TC4.PosY2.initializeNoException("538");
  }
/** {@inheritDoc}
 * @param fbName {@inheritDoc}
 * @param r {@inheritDoc}
 * @throws FBRManagementException {@inheritDoc} */
  public void initialize(String fbName, Resource r)
  throws FBRManagementException{
    super.initialize(fbName,r);
    RenderView.initialize("RenderView",r);
    Bag.initialize("Bag",r);
    PE.initialize("PE",r);
    TC1.initialize("TC1",r);
    TC2.initialize("TC2",r);
    TC3.initialize("TC3",r);
    TC5.initialize("TC5",r);
    TC4.initialize("TC4",r);
}
/** Start the FB instances. */
public void start( ){
  RenderView.start();
  Bag.start();
  PE.start();
  TC1.start();
  TC2.start();
  TC3.start();
  TC5.start();
  TC4.start();
}
/** Stop the FB instances. */
public void stop( ){
  RenderView.stop();
  Bag.stop();
  PE.stop();
  TC1.stop();
  TC2.stop();
  TC3.stop();
  TC5.stop();
  TC4.stop();
}
}
