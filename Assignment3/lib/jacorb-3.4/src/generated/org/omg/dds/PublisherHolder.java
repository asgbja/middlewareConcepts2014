package org.omg.dds;

/**
 * Generated from IDL interface "Publisher".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PublisherHolder	implements org.omg.CORBA.portable.Streamable{
	 public Publisher value;
	public PublisherHolder()
	{
	}
	public PublisherHolder (final Publisher initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PublisherHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PublisherHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PublisherHelper.write (_out,value);
	}
}
