package org.omg.RTCORBA;

/**
 * Generated from IDL struct "ThreadpoolLane".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ThreadpoolLaneHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.RTCORBA.ThreadpoolLane value;

	public ThreadpoolLaneHolder ()
	{
	}
	public ThreadpoolLaneHolder(final org.omg.RTCORBA.ThreadpoolLane initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.RTCORBA.ThreadpoolLaneHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.RTCORBA.ThreadpoolLaneHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.RTCORBA.ThreadpoolLaneHelper.write(_out, value);
	}
}
