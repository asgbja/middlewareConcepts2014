package org.omg.CSIIOP;


/**
 * Generated from IDL struct "SECIOP_SEC_TRANS".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class SECIOP_SEC_TRANSHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(SECIOP_SEC_TRANSHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CSIIOP.SECIOP_SEC_TRANSHelper.id(),"SECIOP_SEC_TRANS",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("target_supports", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CSIIOP.AssociationOptionsHelper.id(), "AssociationOptions",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4))), null),new org.omg.CORBA.StructMember("target_requires", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CSIIOP.AssociationOptionsHelper.id(), "AssociationOptions",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4))), null),new org.omg.CORBA.StructMember("mech_oid", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CSI.OIDHelper.id(), "OID",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10)))), null),new org.omg.CORBA.StructMember("target_name", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CSI.GSS_NT_ExportedNameHelper.id(), "GSS_NT_ExportedName",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10)))), null),new org.omg.CORBA.StructMember("addresses", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CSIIOP.TransportAddressListHelper.id(), "TransportAddressList",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CSIIOP.TransportAddressHelper.id(),"TransportAddress",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("host_name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("port", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CSIIOP.SECIOP_SEC_TRANS s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CSIIOP.SECIOP_SEC_TRANS extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/CSIIOP/SECIOP_SEC_TRANS:1.0";
	}
	public static org.omg.CSIIOP.SECIOP_SEC_TRANS read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CSIIOP.SECIOP_SEC_TRANS result = new org.omg.CSIIOP.SECIOP_SEC_TRANS();
		result.target_supports=in.read_ushort();
		result.target_requires=in.read_ushort();
		result.mech_oid = org.omg.CSI.OIDHelper.read(in);
		result.target_name = org.omg.CSI.GSS_NT_ExportedNameHelper.read(in);
		result.addresses = org.omg.CSIIOP.TransportAddressListHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CSIIOP.SECIOP_SEC_TRANS s)
	{
		out.write_ushort(s.target_supports);
		out.write_ushort(s.target_requires);
		org.omg.CSI.OIDHelper.write(out,s.mech_oid);
		org.omg.CSI.GSS_NT_ExportedNameHelper.write(out,s.target_name);
		org.omg.CSIIOP.TransportAddressListHelper.write(out,s.addresses);
	}
}
