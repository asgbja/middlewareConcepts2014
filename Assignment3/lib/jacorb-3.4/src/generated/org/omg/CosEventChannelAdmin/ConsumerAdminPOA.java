package org.omg.CosEventChannelAdmin;


/**
 * Generated from IDL interface "ConsumerAdmin".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ConsumerAdminPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosEventChannelAdmin.ConsumerAdminOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "obtain_pull_supplier", Integer.valueOf(0));
		m_opsHash.put ( "obtain_push_supplier", Integer.valueOf(1));
	}
	private String[] ids = {"IDL:omg.org/CosEventChannelAdmin/ConsumerAdmin:1.0"};
	public org.omg.CosEventChannelAdmin.ConsumerAdmin _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosEventChannelAdmin.ConsumerAdmin __r = org.omg.CosEventChannelAdmin.ConsumerAdminHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosEventChannelAdmin.ConsumerAdmin _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosEventChannelAdmin.ConsumerAdmin __r = org.omg.CosEventChannelAdmin.ConsumerAdminHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // obtain_pull_supplier
			{
				_out = handler.createReply();
				org.omg.CosEventChannelAdmin.ProxyPullSupplierHelper.write(_out,obtain_pull_supplier());
				break;
			}
			case 1: // obtain_push_supplier
			{
				_out = handler.createReply();
				org.omg.CosEventChannelAdmin.ProxyPushSupplierHelper.write(_out,obtain_push_supplier());
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
