package org.omg.CORBA;

/**
 * Generated from IDL exception "INITIALIZE".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class INITIALIZE
	extends org.omg.CORBA.SystemException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public INITIALIZE()
	{
		super( "", 0 ,org.omg.CORBA.CompletionStatus.COMPLETED_NO ) ;
	}

	public INITIALIZE( String reason )
	{
		super( reason, 0 ,org.omg.CORBA.CompletionStatus.COMPLETED_NO ) ;
	}

	public INITIALIZE(int minor, org.omg.CORBA.CompletionStatus completed )
	{
		super( "", minor, completed ) ;
	}

	public INITIALIZE(String reason, int minor, org.omg.CORBA.CompletionStatus completed )
	{
		super( reason, minor, completed ) ;
	}

}
