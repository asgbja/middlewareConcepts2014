package org.omg.dds;

/**
 * Generated from IDL struct "SampleLostStatus".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SampleLostStatusHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.SampleLostStatus value;

	public SampleLostStatusHolder ()
	{
	}
	public SampleLostStatusHolder(final org.omg.dds.SampleLostStatus initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.SampleLostStatusHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.SampleLostStatusHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.SampleLostStatusHelper.write(_out, value);
	}
}
