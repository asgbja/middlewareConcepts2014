package org.omg.CosTransactions;


/**
 * Generated from IDL interface "Coordinator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class CoordinatorHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(CoordinatorHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosTransactions/Coordinator:1.0", "Coordinator");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTransactions.Coordinator s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosTransactions.Coordinator extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/CosTransactions/Coordinator:1.0";
	}
	public static Coordinator read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosTransactions._CoordinatorStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTransactions.Coordinator s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTransactions.Coordinator narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTransactions.Coordinator)
		{
			return (org.omg.CosTransactions.Coordinator)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosTransactions/Coordinator:1.0"))
		{
			org.omg.CosTransactions._CoordinatorStub stub;
			stub = new org.omg.CosTransactions._CoordinatorStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosTransactions.Coordinator unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTransactions.Coordinator)
		{
			return (org.omg.CosTransactions.Coordinator)obj;
		}
		else
		{
			org.omg.CosTransactions._CoordinatorStub stub;
			stub = new org.omg.CosTransactions._CoordinatorStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
