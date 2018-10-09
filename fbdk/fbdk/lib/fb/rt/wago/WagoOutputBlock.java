/* Copyright (c)2011 University of Auckland. All rights reserved. */
package fb.rt.wago; #include "kbusapi.h"
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK WagoOutputBlock
  * @author JHC
  * @version 20110418/JHC
  */
public class WagoOutputBlock extends FBInstance
{
/** VAR ByteIndex */
  public INT ByteIndex = new INT();
/** VAR DO0 */
  public BOOL DO0 = new BOOL();
/** VAR DO1 */
  public BOOL DO1 = new BOOL();
/** VAR DO2 */
  public BOOL DO2 = new BOOL();
/** VAR DO3 */
  public BOOL DO3 = new BOOL();
/** VAR DO4 */
  public BOOL DO4 = new BOOL();
/** VAR DO5 */
  public BOOL DO5 = new BOOL();
/** VAR DO6 */
  public BOOL DO6 = new BOOL();
/** VAR DO7 */
  public BOOL DO7 = new BOOL();
/** Initialization Request */
 public EventServer INIT = new EventInput(this);
/** Execution Confirmation */
 public EventServer REQ = new EventInput(this);
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
    if("CNF".equals(s)) return CNF;
    return super.eoNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ivNamed(String s) throws FBRManagementException{
    if("ByteIndex".equals(s)) return ByteIndex;
    if("DO0".equals(s)) return DO0;
    if("DO1".equals(s)) return DO1;
    if("DO2".equals(s)) return DO2;
    if("DO3".equals(s)) return DO3;
    if("DO4".equals(s)) return DO4;
    if("DO5".equals(s)) return DO5;
    if("DO6".equals(s)) return DO6;
    if("DO7".equals(s)) return DO7;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("ByteIndex".equals(ivName)) connect_ByteIndex((INT)newIV);
    else if("DO0".equals(ivName)) connect_DO0((BOOL)newIV);
    else if("DO1".equals(ivName)) connect_DO1((BOOL)newIV);
    else if("DO2".equals(ivName)) connect_DO2((BOOL)newIV);
    else if("DO3".equals(ivName)) connect_DO3((BOOL)newIV);
    else if("DO4".equals(ivName)) connect_DO4((BOOL)newIV);
    else if("DO5".equals(ivName)) connect_DO5((BOOL)newIV);
    else if("DO6".equals(ivName)) connect_DO6((BOOL)newIV);
    else if("DO7".equals(ivName)) connect_DO7((BOOL)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable ByteIndex
  * @param newIV The variable to connect
 */
  public void connect_ByteIndex(INT newIV){
    ByteIndex = newIV;
    }
/** Connect the given variable to the input variable DO0
  * @param newIV The variable to connect
 */
  public void connect_DO0(BOOL newIV){
    DO0 = newIV;
    }
/** Connect the given variable to the input variable DO1
  * @param newIV The variable to connect
 */
  public void connect_DO1(BOOL newIV){
    DO1 = newIV;
    }
/** Connect the given variable to the input variable DO2
  * @param newIV The variable to connect
 */
  public void connect_DO2(BOOL newIV){
    DO2 = newIV;
    }
/** Connect the given variable to the input variable DO3
  * @param newIV The variable to connect
 */
  public void connect_DO3(BOOL newIV){
    DO3 = newIV;
    }
/** Connect the given variable to the input variable DO4
  * @param newIV The variable to connect
 */
  public void connect_DO4(BOOL newIV){
    DO4 = newIV;
    }
/** Connect the given variable to the input variable DO5
  * @param newIV The variable to connect
 */
  public void connect_DO5(BOOL newIV){
    DO5 = newIV;
    }
/** Connect the given variable to the input variable DO6
  * @param newIV The variable to connect
 */
  public void connect_DO6(BOOL newIV){
    DO6 = newIV;
    }
/** Connect the given variable to the input variable DO7
  * @param newIV The variable to connect
 */
  public void connect_DO7(BOOL newIV){
    DO7 = newIV;
    }
private static final int index_START = 0;
private void state_START(){
  eccState = index_START;
}
private static final int index_SetOutputs = 1;
private void state_SetOutputs(){
  eccState = index_SetOutputs;
  alg_SetKBusInputs();
  CNF.serviceEvent(this);
}
/** The default constructor. */
public WagoOutputBlock(){
    super();
  }
/** {@inheritDoc}
* @param e {@inheritDoc} */
  public void serviceEvent(EventServer e){
    if (e == INIT) service_INIT();
    else if (e == REQ) service_REQ();
  }
/** Services the INIT event. */
  public void service_INIT(){
    if ((eccState == index_START)) state_SetOutputs();
  }
/** Services the REQ event. */
  public void service_REQ(){
    if ((eccState == index_SetOutputs)) state_SetOutputs();
  }
  /** ALGORITHM SetKBusInputs IN Java*/
public void alg_SetKBusInputs(){
// read byte from pab and show it on console
KbusOpen();

pstPabOUT->uc.Pab[me->ByteIndex] = 0x00; // CLEAR

pstPabOUT->uc.Pab[me->ByteIndex] |= me->DO0;// << 0;
pstPabOUT->uc.Pab[me->ByteIndex] |= me->DO1 << 1;
pstPabOUT->uc.Pab[me->ByteIndex] |= me->DO2 << 2;
pstPabOUT->uc.Pab[me->ByteIndex] |= me->DO3 << 3;
pstPabOUT->uc.Pab[me->ByteIndex] |= me->DO4 << 4;
pstPabOUT->uc.Pab[me->ByteIndex] |= me->DO5 << 5;
pstPabOUT->uc.Pab[me->ByteIndex] |= me->DO6 << 6;
pstPabOUT->uc.Pab[me->ByteIndex] |= me->DO7 << 7;

// Write Output values
KbusUpdate();

// Close
KbusClose();

}
}
