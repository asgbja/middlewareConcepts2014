package org.omg.CosTrading;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TraderComponents".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class TraderComponentsPOATie
	extends TraderComponentsPOA
{
	private TraderComponentsOperations _delegate;

	private POA _poa;
	public TraderComponentsPOATie(TraderComponentsOperations delegate)
	{
		_delegate = delegate;
	}
	public TraderComponentsPOATie(TraderComponentsOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTrading.TraderComponents _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosTrading.TraderComponents __r = org.omg.CosTrading.TraderComponentsHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosTrading.TraderComponents _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosTrading.TraderComponents __r = org.omg.CosTrading.TraderComponentsHelper.narrow(__o);
		return __r;
	}
	public TraderComponentsOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TraderComponentsOperations delegate)
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
	public org.omg.CosTrading.Admin admin_if()
	{
		return _delegate.admin_if();
	}

	public org.omg.CosTrading.Link link_if()
	{
		return _delegate.link_if();
	}

	public org.omg.CosTrading.Proxy proxy_if()
	{
		return _delegate.proxy_if();
	}

	public org.omg.CosTrading.Register register_if()
	{
		return _delegate.register_if();
	}

	public org.omg.CosTrading.Lookup lookup_if()
	{
		return _delegate.lookup_if();
	}

}
