package org.omg.dds;


/**
 * Generated from IDL interface "ReadCondition".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ReadConditionPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.dds.ReadConditionOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "get_datareader", Integer.valueOf(0));
		m_opsHash.put ( "get_instance_state_mask", Integer.valueOf(1));
		m_opsHash.put ( "get_view_state_mask", Integer.valueOf(2));
		m_opsHash.put ( "get_sample_state_mask", Integer.valueOf(3));
		m_opsHash.put ( "get_trigger_value", Integer.valueOf(4));
	}
	private String[] ids = {"IDL:omg.org/dds/ReadCondition:1.0","IDL:omg.org/dds/Condition:1.0"};
	public org.omg.dds.ReadCondition _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.dds.ReadCondition __r = org.omg.dds.ReadConditionHelper.narrow(__o);
		return __r;
	}
	public org.omg.dds.ReadCondition _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.dds.ReadCondition __r = org.omg.dds.ReadConditionHelper.narrow(__o);
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
			case 0: // get_datareader
			{
				_out = handler.createReply();
				org.omg.dds.DataReaderHelper.write(_out,get_datareader());
				break;
			}
			case 1: // get_instance_state_mask
			{
				_out = handler.createReply();
				_out.write_ulong(get_instance_state_mask());
				break;
			}
			case 2: // get_view_state_mask
			{
				_out = handler.createReply();
				_out.write_ulong(get_view_state_mask());
				break;
			}
			case 3: // get_sample_state_mask
			{
				_out = handler.createReply();
				_out.write_ulong(get_sample_state_mask());
				break;
			}
			case 4: // get_trigger_value
			{
				_out = handler.createReply();
				_out.write_boolean(get_trigger_value());
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
