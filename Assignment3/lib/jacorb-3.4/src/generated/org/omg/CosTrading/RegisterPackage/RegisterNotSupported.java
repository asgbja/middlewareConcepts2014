package org.omg.CosTrading.RegisterPackage;

/**
 * Generated from IDL exception "RegisterNotSupported".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class RegisterNotSupported
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public RegisterNotSupported()
	{
		super(org.omg.CosTrading.RegisterPackage.RegisterNotSupportedHelper.id());
	}

	public java.lang.String[] name;
	public RegisterNotSupported(java.lang.String _reason,java.lang.String[] name)
	{
		super(_reason);
		this.name = name;
	}
	public RegisterNotSupported(java.lang.String[] name)
	{
		super(org.omg.CosTrading.RegisterPackage.RegisterNotSupportedHelper.id());
		this.name = name;
	}
}
