package org.omg.CORBA;

/**
 * Generated from IDL alias "ServiceDetailSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ServiceDetailSeqHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, org.omg.CORBA.ServiceDetail[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CORBA.ServiceDetail[] extract (final org.omg.CORBA.Any any)
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
			synchronized(ServiceDetailSeqHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.ServiceDetailSeqHelper.id(), "ServiceDetailSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.ServiceDetailHelper.id(),"ServiceDetail",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("service_detail_type", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.ServiceDetailTypeHelper.id(), "ServiceDetailType",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("service_detail", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.ServiceDetailDataHelper.id(), "ServiceDetailData",org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.OctetSeqHelper.id(), "OctetSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))))), null)})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/ServiceDetailSeq:1.0";
	}
	public static org.omg.CORBA.ServiceDetail[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CORBA.ServiceDetail[] _result;
		int _l_result45 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result45 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result45);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.CORBA.ServiceDetail[_l_result45];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.CORBA.ServiceDetailHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CORBA.ServiceDetail[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.CORBA.ServiceDetailHelper.write(_out,_s[i]);
		}

	}
}
