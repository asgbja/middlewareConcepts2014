package org.omg.CosNaming;


/**
 * Generated from IDL interface "NamingContextExt".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class NamingContextExtHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(NamingContextExtHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNaming/NamingContextExt:1.0", "NamingContextExt");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNaming.NamingContextExt s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosNaming.NamingContextExt extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/CosNaming/NamingContextExt:1.0";
	}
	public static NamingContextExt read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosNaming._NamingContextExtStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNaming.NamingContextExt s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNaming.NamingContextExt narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNaming.NamingContextExt)
		{
			return (org.omg.CosNaming.NamingContextExt)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosNaming/NamingContextExt:1.0"))
		{
			org.omg.CosNaming._NamingContextExtStub stub;
			stub = new org.omg.CosNaming._NamingContextExtStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosNaming.NamingContextExt unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNaming.NamingContextExt)
		{
			return (org.omg.CosNaming.NamingContextExt)obj;
		}
		else
		{
			org.omg.CosNaming._NamingContextExtStub stub;
			stub = new org.omg.CosNaming._NamingContextExtStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
