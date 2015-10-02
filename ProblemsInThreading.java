package com.interview.Thread;

public class ProblemsInThreading {
	/*
	 * Built-in synchronization (methods and blocks) are fine for many lock-based applications, but they do have their own limitations, such as:
	 * 
	 * No way to back off from an attempt to acquire a lock that is already held, 
	 * or to give up after waiting for a specified period of time, or to cancel a lock attempt after an interrupt.
	   
	   No way to alter the semantics of a lock, for example, 
	   with respect to reentrancy, read versus write protection, or fairness.
	   ****
	   No access control for synchronization. 
	   Any method can perform synchronized(obj) for any accessible object.
	   ****
	   Synchronization is done within methods and blocks, 
	   thus limiting use to strict block-structured locking. 
	   In other words, you cannot acquire a lock in one method and release it in another.
	 * 
	 * 
	 */

	
	/*
	 * Use mutex to control locking :
	 * public class Mutex {
	     public void acquire() throws InterruptedException { }
	     public void release() { }
	     public boolean attempt(long msec) throws InterruptedException { }
		 }
		
		Which then can be used as:
		 
		try {
		  mutex.acquire();
		  try {
		    // do something
		  } finally {
		    mutex.release();
		  }
		  } catch(InterruptedException ie) {
		  // ...
		 }
		
		 So the advantage of mutex is that we can decide when to give the lock and when to release it.
	 */
}
