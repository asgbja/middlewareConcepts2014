package org.omg.CosCollection;


/**
 * Generated from IDL interface "KeyBag".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class KeyBagPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosCollection.KeyBagOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "add_or_replace_element_with_key_set_iterator", Integer.valueOf(0));
		m_opsHash.put ( "number_of_elements_with_key", Integer.valueOf(1));
		m_opsHash.put ( "locate_next_element_with_different_key", Integer.valueOf(2));
		m_opsHash.put ( "number_of_different_keys", Integer.valueOf(3));
		m_opsHash.put ( "number_of_elements", Integer.valueOf(4));
		m_opsHash.put ( "retrieve_element_at", Integer.valueOf(5));
		m_opsHash.put ( "replace_element_with_key", Integer.valueOf(6));
		m_opsHash.put ( "add_or_replace_element_with_key", Integer.valueOf(7));
		m_opsHash.put ( "_get_key_type", Integer.valueOf(8));
		m_opsHash.put ( "retrieve_element_with_key", Integer.valueOf(9));
		m_opsHash.put ( "keys", Integer.valueOf(10));
		m_opsHash.put ( "key", Integer.valueOf(11));
		m_opsHash.put ( "_get_element_type", Integer.valueOf(12));
		m_opsHash.put ( "remove_element_with_key", Integer.valueOf(13));
		m_opsHash.put ( "remove_element_at", Integer.valueOf(14));
		m_opsHash.put ( "add_element", Integer.valueOf(15));
		m_opsHash.put ( "replace_element_with_key_set_iterator", Integer.valueOf(16));
		m_opsHash.put ( "locate_or_add_element_with_key", Integer.valueOf(17));
		m_opsHash.put ( "is_empty", Integer.valueOf(18));
		m_opsHash.put ( "locate_next_element_with_key", Integer.valueOf(19));
		m_opsHash.put ( "create_iterator", Integer.valueOf(20));
		m_opsHash.put ( "locate_or_add_element_with_key_set_iterator", Integer.valueOf(21));
		m_opsHash.put ( "locate_element_with_key", Integer.valueOf(22));
		m_opsHash.put ( "add_element_set_iterator", Integer.valueOf(23));
		m_opsHash.put ( "contains_all_keys_from", Integer.valueOf(24));
		m_opsHash.put ( "remove_all_elements_with_key", Integer.valueOf(25));
		m_opsHash.put ( "remove_all", Integer.valueOf(26));
		m_opsHash.put ( "destroy", Integer.valueOf(27));
		m_opsHash.put ( "contains_element_with_key", Integer.valueOf(28));
		m_opsHash.put ( "add_all_from", Integer.valueOf(29));
		m_opsHash.put ( "replace_element_at", Integer.valueOf(30));
		m_opsHash.put ( "all_elements_do", Integer.valueOf(31));
	}
	private String[] ids = {"IDL:omg.org/CosCollection/KeyBag:1.0","IDL:omg.org/CosCollection/KeyCollection:1.0","IDL:omg.org/CosCollection/Collection:1.0"};
	public org.omg.CosCollection.KeyBag _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosCollection.KeyBag __r = org.omg.CosCollection.KeyBagHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosCollection.KeyBag _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosCollection.KeyBag __r = org.omg.CosCollection.KeyBagHelper.narrow(__o);
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
			case 0: // add_or_replace_element_with_key_set_iterator
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CosCollection.Iterator _arg1=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(add_or_replace_element_with_key_set_iterator(_arg0,_arg1));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex1);
			}
				break;
			}
			case 1: // number_of_elements_with_key
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_ulong(number_of_elements_with_key(_arg0));
			}
			catch(org.omg.CosCollection.KeyInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.KeyInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // locate_next_element_with_different_key
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(locate_next_element_with_different_key(_arg0));
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex1);
			}
				break;
			}
			case 3: // number_of_different_keys
			{
				_out = handler.createReply();
				_out.write_ulong(number_of_different_keys());
				break;
			}
			case 4: // number_of_elements
			{
				_out = handler.createReply();
				_out.write_ulong(number_of_elements());
				break;
			}
			case 5: // retrieve_element_at
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				org.omg.CORBA.AnyHolder _arg1= new org.omg.CORBA.AnyHolder();
				_out = handler.createReply();
				_out.write_boolean(retrieve_element_at(_arg0,_arg1));
				_out.write_any(_arg1.value);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex1);
			}
				break;
			}
			case 6: // replace_element_with_key
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(replace_element_with_key(_arg0));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // add_or_replace_element_with_key
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(add_or_replace_element_with_key(_arg0));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // _get_key_type
			{
			_out = handler.createReply();
			_out.write_TypeCode(key_type());
				break;
			}
			case 9: // retrieve_element_with_key
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CORBA.AnyHolder _arg1= new org.omg.CORBA.AnyHolder();
				_out = handler.createReply();
				_out.write_boolean(retrieve_element_with_key(_arg0,_arg1));
				_out.write_any(_arg1.value);
			}
			catch(org.omg.CosCollection.KeyInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.KeyInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // keys
			{
			try
			{
				org.omg.CORBA.Any[] _arg0=org.omg.CosCollection.AnySequenceHelper.read(_input);
				org.omg.CosCollection.AnySequenceHolder _arg1= new org.omg.CosCollection.AnySequenceHolder();
				_out = handler.createReply();
				keys(_arg0,_arg1);
				org.omg.CosCollection.AnySequenceHelper.write(_out,_arg1.value);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // key
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CORBA.AnyHolder _arg1= new org.omg.CORBA.AnyHolder();
				_out = handler.createReply();
				key(_arg0,_arg1);
				_out.write_any(_arg1.value);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // _get_element_type
			{
			_out = handler.createReply();
			_out.write_TypeCode(element_type());
				break;
			}
			case 13: // remove_element_with_key
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(remove_element_with_key(_arg0));
			}
			catch(org.omg.CosCollection.KeyInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.KeyInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // remove_element_at
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				remove_element_at(_arg0);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex1);
			}
				break;
			}
			case 15: // add_element
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(add_element(_arg0));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // replace_element_with_key_set_iterator
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CosCollection.Iterator _arg1=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(replace_element_with_key_set_iterator(_arg0,_arg1));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex1);
			}
				break;
			}
			case 17: // locate_or_add_element_with_key
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(locate_or_add_element_with_key(_arg0));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // is_empty
			{
				_out = handler.createReply();
				_out.write_boolean(is_empty());
				break;
			}
			case 19: // locate_next_element_with_key
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CosCollection.Iterator _arg1=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(locate_next_element_with_key(_arg0,_arg1));
			}
			catch(org.omg.CosCollection.KeyInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.KeyInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex1);
			}
				break;
			}
			case 20: // create_iterator
			{
				boolean _arg0=_input.read_boolean();
				_out = handler.createReply();
				org.omg.CosCollection.IteratorHelper.write(_out,create_iterator(_arg0));
				break;
			}
			case 21: // locate_or_add_element_with_key_set_iterator
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CosCollection.Iterator _arg1=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(locate_or_add_element_with_key_set_iterator(_arg0,_arg1));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex1);
			}
				break;
			}
			case 22: // locate_element_with_key
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CosCollection.Iterator _arg1=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(locate_element_with_key(_arg0,_arg1));
			}
			catch(org.omg.CosCollection.KeyInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.KeyInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex1);
			}
				break;
			}
			case 23: // add_element_set_iterator
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CosCollection.Iterator _arg1=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(add_element_set_iterator(_arg0,_arg1));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex1);
			}
				break;
			}
			case 24: // contains_all_keys_from
			{
			try
			{
				org.omg.CosCollection.KeyCollection _arg0=org.omg.CosCollection.KeyCollectionHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(contains_all_keys_from(_arg0));
			}
			catch(org.omg.CosCollection.KeyInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.KeyInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // remove_all_elements_with_key
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_ulong(remove_all_elements_with_key(_arg0));
			}
			catch(org.omg.CosCollection.KeyInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.KeyInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // remove_all
			{
				_out = handler.createReply();
				_out.write_ulong(remove_all());
				break;
			}
			case 27: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 28: // contains_element_with_key
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(contains_element_with_key(_arg0));
			}
			catch(org.omg.CosCollection.KeyInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.KeyInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // add_all_from
			{
			try
			{
				org.omg.CosCollection.Collection _arg0=org.omg.CosCollection.CollectionHelper.read(_input);
				_out = handler.createReply();
				add_all_from(_arg0);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // replace_element_at
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				org.omg.CORBA.Any _arg1=_input.read_any();
				_out = handler.createReply();
				replace_element_at(_arg0,_arg1);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex1);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex2);
			}
				break;
			}
			case 31: // all_elements_do
			{
				org.omg.CosCollection.Command _arg0=org.omg.CosCollection.CommandHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(all_elements_do(_arg0));
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
