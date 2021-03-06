package org.omg.BridgeTransactionMgmt;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TransactionManagement".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class TransactionManagementPOATie
	extends TransactionManagementPOA
{
	private TransactionManagementOperations _delegate;

	private POA _poa;
	public TransactionManagementPOATie(TransactionManagementOperations delegate)
	{
		_delegate = delegate;
	}
	public TransactionManagementPOATie(TransactionManagementOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.BridgeTransactionMgmt.TransactionManagement _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.BridgeTransactionMgmt.TransactionManagement __r = org.omg.BridgeTransactionMgmt.TransactionManagementHelper.narrow(__o);
		return __r;
	}
	public org.omg.BridgeTransactionMgmt.TransactionManagement _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.BridgeTransactionMgmt.TransactionManagement __r = org.omg.BridgeTransactionMgmt.TransactionManagementHelper.narrow(__o);
		return __r;
	}
	public TransactionManagementOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransactionManagementOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public void disable_transaction() throws org.omg.BridgeTransactionMgmt.TransactionActive
	{
_delegate.disable_transaction();
	}

	public void enable_transaction(int events, int timeout) throws org.omg.BridgeTransactionMgmt.TransactionAlreadyActive,org.omg.BridgeTransactionMgmt.UnsupportedTransaction
	{
_delegate.enable_transaction(events,timeout);
	}

}
