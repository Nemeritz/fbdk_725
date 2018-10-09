/* Copyright (c)2012 Rockwell Automation. All rights reserved. */
package fb.rt.cs725;
import fb.datatype.*;
/** TYPE BagDetail
  * @author JHC
  * @version 20120225/JHC
  */
public class BagDetail extends StructuredData
{
/** VAR bagYValue */
  public DINT bagYValue = new DINT();
/** VAR bagXValue */
  public DINT bagXValue = new DINT();
/** VAR conId */
  public DINT conId = new DINT();
/** The default constructor. */
public BagDetail(){
    super();
    values = new ANY[3];
    values[0]=bagYValue;
    values[1]=bagXValue;
    values[2]=conId;
  }
public int getTagNumber(){return 5;}
public int getTagClass(){return ASN1.PRIVATE+ASN1.CONSTRUCTED;}
private static String[] elementNames = {"bagYValue","bagXValue","conId"};
protected String[] getElementNames() {
return elementNames;}
protected StructuredData newInstanceForCopy() {
return new BagDetail();}
}
