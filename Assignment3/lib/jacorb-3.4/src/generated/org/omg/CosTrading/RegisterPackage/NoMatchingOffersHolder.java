package org.omg.CosTrading.RegisterPackage;

/**
 * Generated from IDL exception "NoMatchingOffers".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NoMatchingOffersHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.RegisterPackage.NoMatchingOffers value;

	public NoMatchingOffersHolder ()
	{
	}
	public NoMatchingOffersHolder(final org.omg.CosTrading.RegisterPackage.NoMatchingOffers initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.RegisterPackage.NoMatchingOffersHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.RegisterPackage.NoMatchingOffersHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.RegisterPackage.NoMatchingOffersHelper.write(_out, value);
	}
}
