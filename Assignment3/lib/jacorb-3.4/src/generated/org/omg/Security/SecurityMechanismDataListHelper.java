package org.omg.Security;

/**
 * Generated from IDL alias "SecurityMechanismDataList".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class SecurityMechanismDataListHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, org.omg.Security.SecurityMechanismData[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.Security.SecurityMechanismData[] extract (final org.omg.CORBA.Any any)
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
			synchronized(SecurityMechanismDataListHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.Security.SecurityMechanismDataListHelper.id(), "SecurityMechanismDataList",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.Security.SecurityMechanismDataHelper.id(),"SecurityMechanismData",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("mechanism", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.Security.MechanismTypeHelper.id(), "MechanismType",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("security_name", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.Security.SecurityNameHelper.id(), "SecurityName",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("options_supported", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.Security.AssociationOptionsHelper.id(), "AssociationOptions",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4))), null),new org.omg.CORBA.StructMember("options_required", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.Security.AssociationOptionsHelper.id(), "AssociationOptions",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4))), null)})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/Security/SecurityMechanismDataList:1.0";
	}
	public static org.omg.Security.SecurityMechanismData[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.Security.SecurityMechanismData[] _result;
		int _l_result149 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result149 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result149);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.Security.SecurityMechanismData[_l_result149];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.Security.SecurityMechanismDataHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.Security.SecurityMechanismData[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.Security.SecurityMechanismDataHelper.write(_out,_s[i]);
		}

	}
}
