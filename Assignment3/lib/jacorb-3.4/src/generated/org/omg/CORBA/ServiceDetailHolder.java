package org.omg.CORBA;

/**
 * Generated from IDL struct "ServiceDetail".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServiceDetailHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ServiceDetail value;

	public ServiceDetailHolder ()
	{
	}
	public ServiceDetailHolder(final org.omg.CORBA.ServiceDetail initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.ServiceDetailHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.ServiceDetailHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.ServiceDetailHelper.write(_out, value);
	}
}
