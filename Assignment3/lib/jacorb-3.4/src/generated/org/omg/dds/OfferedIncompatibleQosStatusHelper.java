package org.omg.dds;


/**
 * Generated from IDL struct "OfferedIncompatibleQosStatus".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class OfferedIncompatibleQosStatusHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(OfferedIncompatibleQosStatusHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.OfferedIncompatibleQosStatusHelper.id(),"OfferedIncompatibleQosStatus",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("total_count", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("total_count_change", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("last_policy_id", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.dds.QosPolicyId_tHelper.id(), "QosPolicyId_t",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3))), null),new org.omg.CORBA.StructMember("policies", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.dds.QosPolicyCountSeqHelper.id(), "QosPolicyCountSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.QosPolicyCountHelper.id(),"QosPolicyCount",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("policy_id", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.dds.QosPolicyId_tHelper.id(), "QosPolicyId_t",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3))), null),new org.omg.CORBA.StructMember("count", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.OfferedIncompatibleQosStatus s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.OfferedIncompatibleQosStatus extract (final org.omg.CORBA.Any any)
	{
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try
		{
			return read (in);
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (java.io.IOException e)
			{
			throw new RuntimeException("Unexpected exception " + e.toString() );
			}
		}
	}

	public static String id()
	{
		return "IDL:omg.org/dds/OfferedIncompatibleQosStatus:1.0";
	}
	public static org.omg.dds.OfferedIncompatibleQosStatus read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.OfferedIncompatibleQosStatus result = new org.omg.dds.OfferedIncompatibleQosStatus();
		result.total_count=in.read_long();
		result.total_count_change=in.read_long();
		result.last_policy_id=in.read_long();
		result.policies = org.omg.dds.QosPolicyCountSeqHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.OfferedIncompatibleQosStatus s)
	{
		out.write_long(s.total_count);
		out.write_long(s.total_count_change);
		out.write_long(s.last_policy_id);
		org.omg.dds.QosPolicyCountSeqHelper.write(out,s.policies);
	}
}
