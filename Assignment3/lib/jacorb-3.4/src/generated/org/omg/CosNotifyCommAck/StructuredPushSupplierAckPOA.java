package org.omg.CosNotifyCommAck;


/**
 * Generated from IDL interface "StructuredPushSupplierAck".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class StructuredPushSupplierAckPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosNotifyCommAck.StructuredPushSupplierAckOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "disconnect_structured_push_supplier", Integer.valueOf(0));
		m_opsHash.put ( "subscription_change", Integer.valueOf(1));
		m_opsHash.put ( "acknowledge", Integer.valueOf(2));
	}
	private String[] ids = {"IDL:omg.org/CosNotifyCommAck/StructuredPushSupplierAck:1.0","IDL:omg.org/CosNotifyComm/NotifySubscribe:1.0","IDL:omg.org/CosNotifyComm/StructuredPushSupplier:1.0"};
	public org.omg.CosNotifyCommAck.StructuredPushSupplierAck _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosNotifyCommAck.StructuredPushSupplierAck __r = org.omg.CosNotifyCommAck.StructuredPushSupplierAckHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosNotifyCommAck.StructuredPushSupplierAck _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosNotifyCommAck.StructuredPushSupplierAck __r = org.omg.CosNotifyCommAck.StructuredPushSupplierAckHelper.narrow(__o);
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
			case 0: // disconnect_structured_push_supplier
			{
				_out = handler.createReply();
				disconnect_structured_push_supplier();
				break;
			}
			case 1: // subscription_change
			{
			try
			{
				org.omg.CosNotification.EventType[] _arg0=org.omg.CosNotification.EventTypeSeqHelper.read(_input);
				org.omg.CosNotification.EventType[] _arg1=org.omg.CosNotification.EventTypeSeqHelper.read(_input);
				_out = handler.createReply();
				subscription_change(_arg0,_arg1);
			}
			catch(org.omg.CosNotifyComm.InvalidEventType _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyComm.InvalidEventTypeHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // acknowledge
			{
				int[] _arg0=org.omg.CosNotifyCommAck.SequenceNumbersHelper.read(_input);
				_out = handler.createReply();
				acknowledge(_arg0);
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
