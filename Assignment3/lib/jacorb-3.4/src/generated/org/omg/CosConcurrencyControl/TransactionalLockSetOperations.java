package org.omg.CosConcurrencyControl;


/**
 * Generated from IDL interface "TransactionalLockSet".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface TransactionalLockSetOperations
{
	/* constants */
	/* operations  */
	void lock(org.omg.CosTransactions.Coordinator current, org.omg.CosConcurrencyControl.lock_mode mode);
	boolean try_lock(org.omg.CosTransactions.Coordinator current, org.omg.CosConcurrencyControl.lock_mode mode);
	void unlock(org.omg.CosTransactions.Coordinator current, org.omg.CosConcurrencyControl.lock_mode mode) throws org.omg.CosConcurrencyControl.LockNotHeld;
	void change_mode(org.omg.CosTransactions.Coordinator current, org.omg.CosConcurrencyControl.lock_mode held_mode, org.omg.CosConcurrencyControl.lock_mode new_mode) throws org.omg.CosConcurrencyControl.LockNotHeld;
	org.omg.CosConcurrencyControl.LockCoordinator get_coordinator(org.omg.CosTransactions.Coordinator which);
}
