package org.omg.CosTransactions;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TransactionFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class TransactionFactoryPOATie
	extends TransactionFactoryPOA
{
	private TransactionFactoryOperations _delegate;

	private POA _poa;
	public TransactionFactoryPOATie(TransactionFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public TransactionFactoryPOATie(TransactionFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTransactions.TransactionFactory _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosTransactions.TransactionFactory __r = org.omg.CosTransactions.TransactionFactoryHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosTransactions.TransactionFactory _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosTransactions.TransactionFactory __r = org.omg.CosTransactions.TransactionFactoryHelper.narrow(__o);
		return __r;
	}
	public TransactionFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransactionFactoryOperations delegate)
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
	public org.omg.CosTransactions.Control create(int time_out)
	{
		return _delegate.create(time_out);
	}

	public org.omg.CosTransactions.Control recreate(org.omg.CosTransactions.PropagationContext ctx)
	{
		return _delegate.recreate(ctx);
	}

}
