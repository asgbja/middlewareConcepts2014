package org.omg.CORBA;

/**
 * Generated from IDL struct "UnionMember".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UnionMemberHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.UnionMember value;

	public UnionMemberHolder ()
	{
	}
	public UnionMemberHolder(final org.omg.CORBA.UnionMember initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.UnionMemberHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.UnionMemberHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.UnionMemberHelper.write(_out, value);
	}
}
