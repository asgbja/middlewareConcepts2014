package org.omg.IIOP;

/**
 * Generated from IDL struct "BiDirIIOPServiceContext".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class BiDirIIOPServiceContextHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.IIOP.BiDirIIOPServiceContext value;

	public BiDirIIOPServiceContextHolder ()
	{
	}
	public BiDirIIOPServiceContextHolder(final org.omg.IIOP.BiDirIIOPServiceContext initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.IIOP.BiDirIIOPServiceContextHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.IIOP.BiDirIIOPServiceContextHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.IIOP.BiDirIIOPServiceContextHelper.write(_out, value);
	}
}
