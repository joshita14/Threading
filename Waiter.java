package com.interview.Thread;

public class Waiter implements Runnable{
	
	Message message;
	Waiter(Message mess){
		this.message =mess;
		
	}
	public void run(){
		synchronized(message) {
			System.out.println("testing");
		}
		
				String name = Thread.currentThread().getName();
		        System.out.println(name+" started");
		      
		        	 try{
		                 System.out.println(name+" waiting to get notified at time:"+System.currentTimeMillis());
		                 message.wait();
		             }catch(InterruptedException e){
		                 e.printStackTrace();
		             }
		             System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
		             //process the message now
		             System.out.println(name+" processed: "+message.getMessage());
		
		
	}

}
