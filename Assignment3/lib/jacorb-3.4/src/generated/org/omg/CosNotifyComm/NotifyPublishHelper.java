package org.omg.CosNotifyComm;


/**
 * Generated from IDL interface "NotifyPublish".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class NotifyPublishHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(NotifyPublishHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyComm/NotifyPublish:1.0", "NotifyPublish");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyComm.NotifyPublish s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosNotifyComm.NotifyPublish extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyComm/NotifyPublish:1.0";
	}
	public static NotifyPublish read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosNotifyComm._NotifyPublishStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNotifyComm.NotifyPublish s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNotifyComm.NotifyPublish narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyComm.NotifyPublish)
		{
			return (org.omg.CosNotifyComm.NotifyPublish)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosNotifyComm/NotifyPublish:1.0"))
		{
			org.omg.CosNotifyComm._NotifyPublishStub stub;
			stub = new org.omg.CosNotifyComm._NotifyPublishStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosNotifyComm.NotifyPublish unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyComm.NotifyPublish)
		{
			return (org.omg.CosNotifyComm.NotifyPublish)obj;
		}
		else
		{
			org.omg.CosNotifyComm._NotifyPublishStub stub;
			stub = new org.omg.CosNotifyComm._NotifyPublishStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
