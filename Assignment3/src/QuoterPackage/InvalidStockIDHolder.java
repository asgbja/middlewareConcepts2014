package QuoterPackage;

/**
* StockExchange/QuoterPackage/InvalidStockIDHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stock.idl
* Saturday, 24 May 2014 15:04:29 o'clock CEST
*/

public final class InvalidStockIDHolder implements org.omg.CORBA.portable.Streamable
{
  public QuoterPackage.InvalidStockID value = null;

  public InvalidStockIDHolder ()
  {
  }

  public InvalidStockIDHolder (QuoterPackage.InvalidStockID initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = QuoterPackage.InvalidStockIDHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
        QuoterPackage.InvalidStockIDHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return QuoterPackage.InvalidStockIDHelper.type ();
  }

}