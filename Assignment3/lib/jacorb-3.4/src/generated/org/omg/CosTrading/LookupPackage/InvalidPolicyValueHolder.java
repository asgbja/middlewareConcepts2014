package org.omg.CosTrading.LookupPackage;

/**
 * Generated from IDL exception "InvalidPolicyValue".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InvalidPolicyValueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.LookupPackage.InvalidPolicyValue value;

	public InvalidPolicyValueHolder ()
	{
	}
	public InvalidPolicyValueHolder(final org.omg.CosTrading.LookupPackage.InvalidPolicyValue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.LookupPackage.InvalidPolicyValueHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.LookupPackage.InvalidPolicyValueHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.LookupPackage.InvalidPolicyValueHelper.write(_out, value);
	}
}
