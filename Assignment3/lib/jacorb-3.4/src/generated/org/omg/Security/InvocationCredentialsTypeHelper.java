package org.omg.Security;
/**
 * Generated from IDL enum "InvocationCredentialsType".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class InvocationCredentialsTypeHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(InvocationCredentialsTypeHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.Security.InvocationCredentialsTypeHelper.id(),"InvocationCredentialsType",new String[]{"SecOwnCredentials","SecReceivedCredentials"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Security.InvocationCredentialsType s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.Security.InvocationCredentialsType extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/Security/InvocationCredentialsType:1.0";
	}
	public static InvocationCredentialsType read (final org.omg.CORBA.portable.InputStream in)
	{
		return InvocationCredentialsType.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final InvocationCredentialsType s)
	{
		out.write_long(s.value());
	}
}
