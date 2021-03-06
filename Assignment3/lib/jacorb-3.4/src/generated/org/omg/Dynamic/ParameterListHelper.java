package org.omg.Dynamic;

/**
 * Generated from IDL alias "ParameterList".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ParameterListHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, org.omg.Dynamic.Parameter[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.Dynamic.Parameter[] extract (final org.omg.CORBA.Any any)
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
			synchronized(ParameterListHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.Dynamic.ParameterListHelper.id(), "ParameterList",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.Dynamic.ParameterHelper.id(),"Parameter",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("argument", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null),new org.omg.CORBA.StructMember("mode", org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CORBA.ParameterModeHelper.id(),"ParameterMode",new String[]{"PARAM_IN","PARAM_OUT","PARAM_INOUT"}), null)})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/Dynamic/ParameterList:1.0";
	}
	public static org.omg.Dynamic.Parameter[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.Dynamic.Parameter[] _result;
		int _l_result63 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result63 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result63);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.Dynamic.Parameter[_l_result63];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.Dynamic.ParameterHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.Dynamic.Parameter[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.Dynamic.ParameterHelper.write(_out,_s[i]);
		}

	}
}
