package org.omg.GIOP;

/**
 * Generated from IDL alias "FragmentHeader_1_3".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class FragmentHeader_1_3Helper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, org.omg.GIOP.FragmentHeader_1_2 s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.GIOP.FragmentHeader_1_2 extract (final org.omg.CORBA.Any any)
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
			synchronized(FragmentHeader_1_3Helper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.GIOP.FragmentHeader_1_3Helper.id(), "FragmentHeader_1_3",org.omg.CORBA.ORB.init().create_struct_tc(org.omg.GIOP.FragmentHeader_1_2Helper.id(),"FragmentHeader_1_2",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("request_id", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null)}));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/GIOP/FragmentHeader_1_3:1.0";
	}
	public static org.omg.GIOP.FragmentHeader_1_2 read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.GIOP.FragmentHeader_1_2 _result;
		_result=org.omg.GIOP.FragmentHeader_1_2Helper.read(_in);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.GIOP.FragmentHeader_1_2 _s)
	{
		org.omg.GIOP.FragmentHeader_1_2Helper.write(_out,_s);
	}
}
