package org.omg.CORBA;


/**
 * Generated from IDL interface "TypedefDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class TypedefDefPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CORBA.TypedefDefOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "_get_type", Integer.valueOf(0));
		m_opsHash.put ( "_get_def_kind", Integer.valueOf(1));
		m_opsHash.put ( "_get_absolute_name", Integer.valueOf(2));
		m_opsHash.put ( "_set_id", Integer.valueOf(3));
		m_opsHash.put ( "_get_name", Integer.valueOf(4));
		m_opsHash.put ( "_get_version", Integer.valueOf(5));
		m_opsHash.put ( "describe", Integer.valueOf(6));
		m_opsHash.put ( "_set_version", Integer.valueOf(7));
		m_opsHash.put ( "_get_id", Integer.valueOf(8));
		m_opsHash.put ( "_get_containing_repository", Integer.valueOf(9));
		m_opsHash.put ( "destroy", Integer.valueOf(10));
		m_opsHash.put ( "_get_defined_in", Integer.valueOf(11));
		m_opsHash.put ( "move", Integer.valueOf(12));
		m_opsHash.put ( "_set_name", Integer.valueOf(13));
	}
	private String[] ids = {"IDL:omg.org/CORBA/TypedefDef:1.0","IDL:omg.org/CORBA/Contained:1.0","IDL:omg.org/CORBA/IDLType:1.0","IDL:omg.org/CORBA/IRObject:1.0"};
	public org.omg.CORBA.TypedefDef _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CORBA.TypedefDef __r = org.omg.CORBA.TypedefDefHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.TypedefDef _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CORBA.TypedefDef __r = org.omg.CORBA.TypedefDefHelper.narrow(__o);
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
			case 0: // _get_type
			{
			_out = handler.createReply();
			_out.write_TypeCode(type());
				break;
			}
			case 1: // _get_def_kind
			{
			_out = handler.createReply();
			org.omg.CORBA.DefinitionKindHelper.write(_out,def_kind());
				break;
			}
			case 2: // _get_absolute_name
			{
			_out = handler.createReply();
			java.lang.String tmpResult186 = absolute_name();
_out.write_string( tmpResult186 );
				break;
			}
			case 3: // _set_id
			{
			_out = handler.createReply();
			id(_input.read_string());
				break;
			}
			case 4: // _get_name
			{
			_out = handler.createReply();
			java.lang.String tmpResult187 = name();
_out.write_string( tmpResult187 );
				break;
			}
			case 5: // _get_version
			{
			_out = handler.createReply();
			java.lang.String tmpResult188 = version();
_out.write_string( tmpResult188 );
				break;
			}
			case 6: // describe
			{
				_out = handler.createReply();
				org.omg.CORBA.ContainedPackage.DescriptionHelper.write(_out,describe());
				break;
			}
			case 7: // _set_version
			{
			_out = handler.createReply();
			version(_input.read_string());
				break;
			}
			case 8: // _get_id
			{
			_out = handler.createReply();
			java.lang.String tmpResult189 = id();
_out.write_string( tmpResult189 );
				break;
			}
			case 9: // _get_containing_repository
			{
			_out = handler.createReply();
			org.omg.CORBA.RepositoryHelper.write(_out,containing_repository());
				break;
			}
			case 10: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 11: // _get_defined_in
			{
			_out = handler.createReply();
			org.omg.CORBA.ContainerHelper.write(_out,defined_in());
				break;
			}
			case 12: // move
			{
				org.omg.CORBA.Container _arg0=org.omg.CORBA.ContainerHelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				move(_arg0,_arg1,_arg2);
				break;
			}
			case 13: // _set_name
			{
			_out = handler.createReply();
			name(_input.read_string());
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
