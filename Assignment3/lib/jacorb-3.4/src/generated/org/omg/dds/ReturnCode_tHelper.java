package org.omg.dds;

/**
 * Generated from IDL alias "ReturnCode_t".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ReturnCode_tHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, int s)
	{
		any.insert_long(s);
	}

	public static int extract (final org.omg.CORBA.Any any)
	{
		return any.extract_long();
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ReturnCode_tHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.dds.ReturnCode_tHelper.id(), "ReturnCode_t",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/dds/ReturnCode_t:1.0";
	}
	public static int read (final org.omg.CORBA.portable.InputStream _in)
	{
		int _result;
		_result=_in.read_long();
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, int _s)
	{
		_out.write_long(_s);
	}
}
