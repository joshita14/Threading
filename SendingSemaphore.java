package com.interview.Thread;

import java.util.concurrent.Semaphore;

public class SendingSemaphore implements Runnable{

	Semaphore semaphore = null;
	SendingSemaphore(Semaphore s ){
		this.semaphore = s;
	}
	
	SendingSemaphore(int x, int y){
		
	}
	
	public void run(){
		System.out.println("Sending semaphore");
		try {
			this.semaphore.acquire();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
