package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL interface "ProxyPullSupplier".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ProxyPullSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public ProxyPullSupplier value;
	public ProxyPullSupplierHolder()
	{
	}
	public ProxyPullSupplierHolder (final ProxyPullSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ProxyPullSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProxyPullSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProxyPullSupplierHelper.write (_out,value);
	}
}
