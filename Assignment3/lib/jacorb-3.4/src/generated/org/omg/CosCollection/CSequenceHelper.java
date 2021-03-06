package org.omg.CosCollection;


/**
 * Generated from IDL interface "CSequence".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class CSequenceHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(CSequenceHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosCollection/CSequence:1.0", "CSequence");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosCollection.CSequence s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosCollection.CSequence extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/CosCollection/CSequence:1.0";
	}
	public static CSequence read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosCollection._CSequenceStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosCollection.CSequence s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosCollection.CSequence narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.CSequence)
		{
			return (org.omg.CosCollection.CSequence)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosCollection/CSequence:1.0"))
		{
			org.omg.CosCollection._CSequenceStub stub;
			stub = new org.omg.CosCollection._CSequenceStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosCollection.CSequence unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.CSequence)
		{
			return (org.omg.CosCollection.CSequence)obj;
		}
		else
		{
			org.omg.CosCollection._CSequenceStub stub;
			stub = new org.omg.CosCollection._CSequenceStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
