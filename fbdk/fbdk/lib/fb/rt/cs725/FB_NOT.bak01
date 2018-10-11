/* Copyright (c)2018 Rockwell Automation. All rights reserved. */
package fb.rt.math;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK FB_NOT
  * @author JHC
  * @version 20181012/JHC
  */
class FB_NOT extends FBFunction1{
/** VAR IN */
  public BOOL IN = new BOOL();
/** NOT IN */
  public BOOL OUT = new BOOL();
/** EVENT REQ */
 public EventServer REQ = new EventInput(this);
/** EVENT CNF */
 public EventOutput CNF = new EventOutput();
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventServer eiNamed(String s){
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
    if("IN".equals(s)) return IN;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("OUT".equals(s)) return OUT;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("IN".equals(ivName)) connect_IN((BOOL)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable IN
  * @param newIV The variable to connect
 */
  public void connect_IN(BOOL newIV){
    IN = newIV;
    }
/** The default constructor. */
public FB_NOT(){
    super();
  }
/** {@inheritDoc}
* @param e {@inheritDoc} */
  public void serviceEvent(EventServer e){
    if (e == REQ) service_REQ();
  }
/** Services the REQ event. */
  public void service_REQ(){
  }
}
