package org.omg.CosNotifyFilter;

/**
 * Generated from IDL interface "FilterAdmin".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class FilterAdminHolder	implements org.omg.CORBA.portable.Streamable{
	 public FilterAdmin value;
	public FilterAdminHolder()
	{
	}
	public FilterAdminHolder (final FilterAdmin initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return FilterAdminHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FilterAdminHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FilterAdminHelper.write (_out,value);
	}
}
