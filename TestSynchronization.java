package com.interview.Thread;

public class TestSynchronization implements Runnable{
	

	@Override
	public void run() {
		
        SynchronizationJava s = new SynchronizationJava();
		
        SynchronizationJava.syncmethod();
		s.syncmethod1();
		
	}

}
