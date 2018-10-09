/* Copyright (c)2012 The University of Auckland. All rights reserved. */
package fb.rt.cs725;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK Clock
  * @author Cheng Pang
  * @version 20120225/Cheng Pang
  */
public class Clock extends FBInstance
{
/** VAR Period */
  public TIME Period = new TIME();
/** VAR Clock */
  public DINT Clock = new DINT();
/** EVENT START */
 public EventOutput START = new EventOutput();
/** EVENT CLK */
 public EventOutput CLK = new EventOutput();
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventServer eiNamed(String s){
    if("START".equals(s)) return START;
    return super.eiNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventOutput eoNamed(String s){
    if("CLK".equals(s)) return CLK;
    return super.eoNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ivNamed(String s) throws FBRManagementException{
    if("Period".equals(s)) return Period;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("Clock".equals(s)) return Clock;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("Period".equals(ivName)) connect_Period((TIME)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable Period
  * @param newIV The variable to connect
  * @throws FBRManagementException An internal connection failed.
 */
  public void connect_Period(TIME newIV) throws FBRManagementException{
    Period = newIV;
    CYCLE.connectIVNoException("DT",Period);
    }
/** FB DLY */
  protected E_DELAY DLY = new E_DELAY() ;
/** FB CYCLE */
  protected E_CYCLE CYCLE = new E_CYCLE() ;
/** FB Counter */
  protected ClockCounter Counter = new ClockCounter() ;
/** The default constructor. */
public Clock(){
    super();
    DLY.EO.connectTo(CYCLE.START);
    START.connectTo(DLY.START);
    START.connectTo(Counter.INIT);
    CYCLE.EO.connectTo(Counter.REQ);
    Counter.CNF.connectTo(CLK);
    CYCLE.connectIVNoException("DT",Period);
    Clock = (DINT)Counter.ovNamedNoException("CLOCK");
    DLY.DT.initializeNoException("t#100ms");
    Counter.INCREMENTBY.initializeNoException("5");
  }
/** {@inheritDoc}
 * @param fbName {@inheritDoc}
 * @param r {@inheritDoc}
 * @throws FBRManagementException {@inheritDoc} */
  public void initialize(String fbName, Resource r)
  throws FBRManagementException{
    super.initialize(fbName,r);
    DLY.initialize("DLY",r);
    CYCLE.initialize("CYCLE",r);
    Counter.initialize("Counter",r);
}
/** Start the FB instances. */
public void start( ){
  DLY.start();
  CYCLE.start();
  Counter.start();
}
/** Stop the FB instances. */
public void stop( ){
  DLY.stop();
  CYCLE.stop();
  Counter.stop();
}
}
