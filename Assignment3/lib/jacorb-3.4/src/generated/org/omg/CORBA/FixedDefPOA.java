package org.omg.CORBA;


/**
 * Generated from IDL interface "FixedDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class FixedDefPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CORBA.FixedDefOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "_set_scale", Integer.valueOf(0));
		m_opsHash.put ( "_set_digits", Integer.valueOf(1));
		m_opsHash.put ( "_get_digits", Integer.valueOf(2));
		m_opsHash.put ( "_get_type", Integer.valueOf(3));
		m_opsHash.put ( "destroy", Integer.valueOf(4));
		m_opsHash.put ( "_get_scale", Integer.valueOf(5));
		m_opsHash.put ( "_get_def_kind", Integer.valueOf(6));
	}
	private String[] ids = {"IDL:omg.org/CORBA/FixedDef:1.0","IDL:omg.org/CORBA/IDLType:1.0","IDL:omg.org/CORBA/IRObject:1.0"};
	public org.omg.CORBA.FixedDef _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CORBA.FixedDef __r = org.omg.CORBA.FixedDefHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.FixedDef _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CORBA.FixedDef __r = org.omg.CORBA.FixedDefHelper.narrow(__o);
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
			case 0: // _set_scale
			{
			_out = handler.createReply();
			scale(_input.read_short());
				break;
			}
			case 1: // _set_digits
			{
			_out = handler.createReply();
			digits(_input.read_ushort());
				break;
			}
			case 2: // _get_digits
			{
			_out = handler.createReply();
			_out.write_ushort(digits());
				break;
			}
			case 3: // _get_type
			{
			_out = handler.createReply();
			_out.write_TypeCode(type());
				break;
			}
			case 4: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 5: // _get_scale
			{
			_out = handler.createReply();
			_out.write_short(scale());
				break;
			}
			case 6: // _get_def_kind
			{
			_out = handler.createReply();
			org.omg.CORBA.DefinitionKindHelper.write(_out,def_kind());
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
