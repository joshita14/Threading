package com.interview.Thread;

public class WaitNotify extends Thread{
	
	/**
	 * Semaphores
	 */
	
	boolean signal;
	
	public synchronized void take(){
		
		this.signal = true;
	    this.notify();
	    
	    System.out.println("Signal value from receive  :"+signal);
	}
	
	public synchronized void receive(){
		
		while(!this.signal){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.signal = false;
		System.out.println("Signal value from receive  :"+signal);
	}
}
