package org.omg.dds;

/**
 * Generated from IDL struct "SubscriptionBuiltinTopicData".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SubscriptionBuiltinTopicDataHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.SubscriptionBuiltinTopicData value;

	public SubscriptionBuiltinTopicDataHolder ()
	{
	}
	public SubscriptionBuiltinTopicDataHolder(final org.omg.dds.SubscriptionBuiltinTopicData initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.SubscriptionBuiltinTopicDataHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.SubscriptionBuiltinTopicDataHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.SubscriptionBuiltinTopicDataHelper.write(_out, value);
	}
}
