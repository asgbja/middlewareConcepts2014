package org.omg.CORBA;


/**
 * Generated from IDL interface "ExtLocalInterfaceDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ExtLocalInterfaceDefHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ExtLocalInterfaceDefHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/ExtLocalInterfaceDef:1.0", "ExtLocalInterfaceDef");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.ExtLocalInterfaceDef s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CORBA.ExtLocalInterfaceDef extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/CORBA/ExtLocalInterfaceDef:1.0";
	}
	public static ExtLocalInterfaceDef read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CORBA._ExtLocalInterfaceDefStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CORBA.ExtLocalInterfaceDef s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CORBA.ExtLocalInterfaceDef narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.ExtLocalInterfaceDef)
		{
			return (org.omg.CORBA.ExtLocalInterfaceDef)obj;
		}
		else if (obj._is_a("IDL:omg.org/CORBA/ExtLocalInterfaceDef:1.0"))
		{
			org.omg.CORBA._ExtLocalInterfaceDefStub stub;
			stub = new org.omg.CORBA._ExtLocalInterfaceDefStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CORBA.ExtLocalInterfaceDef unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.ExtLocalInterfaceDef)
		{
			return (org.omg.CORBA.ExtLocalInterfaceDef)obj;
		}
		else
		{
			org.omg.CORBA._ExtLocalInterfaceDefStub stub;
			stub = new org.omg.CORBA._ExtLocalInterfaceDefStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
