package org.omg.CosEventChannelAdmin;


/**
 * Generated from IDL exception "TypeError".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class TypeErrorHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TypeErrorHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosEventChannelAdmin.TypeErrorHelper.id(),"TypeError",new org.omg.CORBA.StructMember[0]);
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosEventChannelAdmin.TypeError s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosEventChannelAdmin.TypeError extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/CosEventChannelAdmin/TypeError:1.0";
	}
	public static org.omg.CosEventChannelAdmin.TypeError read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		final org.omg.CosEventChannelAdmin.TypeError result = new org.omg.CosEventChannelAdmin.TypeError(id);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosEventChannelAdmin.TypeError s)
	{
		out.write_string(id());
	}
}
