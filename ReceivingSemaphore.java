package com.interview.Thread;

import java.util.concurrent.Semaphore;

public class ReceivingSemaphore implements Runnable{
	
	
	static Semaphore semaphore = null;
	
	ReceivingSemaphore(Semaphore s ){
		this.semaphore = s;
	}

	public void run(){
		while(true){
			this.semaphore.release();
			System.out.println("Releasing semaphore");
		}
	}
	
	
	public static void main(String[] args) {
		ReceivingSemaphore c = new ReceivingSemaphore(semaphore);
	}
}
