package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL exception "NotConnected".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NotConnectedHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyChannelAdmin.NotConnected value;

	public NotConnectedHolder ()
	{
	}
	public NotConnectedHolder(final org.omg.CosNotifyChannelAdmin.NotConnected initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotifyChannelAdmin.NotConnectedHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotifyChannelAdmin.NotConnectedHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotifyChannelAdmin.NotConnectedHelper.write(_out, value);
	}
}
