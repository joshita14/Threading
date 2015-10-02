package com.interview.Thread;

public class ThreadClassTestSync extends Thread{

	
	public static void main(String[] args) {
		
		ThreadClassTestSync th = new ThreadClassTestSync();
		TestSynchronization te =new TestSynchronization();
		Thread t = new Thread(te);
		Thread t1 = new Thread(te);
		
		t.start();
		t1.start();
		
	}
}
