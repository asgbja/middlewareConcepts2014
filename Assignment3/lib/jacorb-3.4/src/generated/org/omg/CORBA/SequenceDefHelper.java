package org.omg.CORBA;


/**
 * Generated from IDL interface "SequenceDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class SequenceDefHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(SequenceDefHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/SequenceDef:1.0", "SequenceDef");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.SequenceDef s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CORBA.SequenceDef extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/CORBA/SequenceDef:1.0";
	}
	public static SequenceDef read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CORBA._SequenceDefStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CORBA.SequenceDef s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CORBA.SequenceDef narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.SequenceDef)
		{
			return (org.omg.CORBA.SequenceDef)obj;
		}
		else if (obj._is_a("IDL:omg.org/CORBA/SequenceDef:1.0"))
		{
			org.omg.CORBA._SequenceDefStub stub;
			stub = new org.omg.CORBA._SequenceDefStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CORBA.SequenceDef unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.SequenceDef)
		{
			return (org.omg.CORBA.SequenceDef)obj;
		}
		else
		{
			org.omg.CORBA._SequenceDefStub stub;
			stub = new org.omg.CORBA._SequenceDefStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
