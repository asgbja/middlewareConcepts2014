package org.omg.CORBA;

/**
 * Generated from IDL alias "WCharSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class WCharSeqHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, char[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static char[] extract (final org.omg.CORBA.Any any)
	{
		if ( any.type().kind() == org.omg.CORBA.TCKind.tk_null)
		{
			throw new org.omg.CORBA.BAD_OPERATION ("Can't extract from Any with null type.");
		}
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(WCharSeqHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.WCharSeqHelper.id(), "WCharSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(26))));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/WCharSeq:1.0";
	}
	public static char[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		char[] _result;
		int _l_result31 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result31 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result31);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new char[_l_result31];
		_in.read_wchar_array(_result,0,_l_result31);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, char[] _s)
	{
		
		_out.write_long(_s.length);
		_out.write_wchar_array(_s,0,_s.length);
	}
}
