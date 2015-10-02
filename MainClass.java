package com.interview.Thread;

import java.util.concurrent.Semaphore;

public class MainClass extends Thread{

	
	
	public static void main(String[] args) {
		

		Semaphore s = new Semaphore(1);
		ReceivingSemaphore rec = new ReceivingSemaphore(s);
		
		SendingSemaphore send = new SendingSemaphore(s);
		
		
		Thread t = new Thread(rec);
		Thread t1 = new Thread(send);
		t.start();
		t1.start();
	}
	
	
}
