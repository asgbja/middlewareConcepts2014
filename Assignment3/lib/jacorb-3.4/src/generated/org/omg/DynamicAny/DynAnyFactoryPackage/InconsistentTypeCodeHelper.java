package org.omg.DynamicAny.DynAnyFactoryPackage;


/**
 * Generated from IDL exception "InconsistentTypeCode".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class InconsistentTypeCodeHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(InconsistentTypeCodeHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCodeHelper.id(),"InconsistentTypeCode",new org.omg.CORBA.StructMember[0]);
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/DynamicAny/DynAnyFactory/InconsistentTypeCode:1.0";
	}
	public static org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		final org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode result = new org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode(id);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode s)
	{
		out.write_string(id());
	}
}
