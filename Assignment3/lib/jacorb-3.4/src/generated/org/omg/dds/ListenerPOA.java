package org.omg.dds;


/**
 * Generated from IDL interface "Listener".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ListenerPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.dds.ListenerOperations
{
	private String[] ids = {"IDL:omg.org/dds/Listener:1.0"};
	public org.omg.dds.Listener _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.dds.Listener __r = org.omg.dds.ListenerHelper.narrow(__o);
		return __r;
	}
	public org.omg.dds.Listener _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.dds.Listener __r = org.omg.dds.ListenerHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
