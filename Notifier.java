package com.interview.Thread;

public class Notifier implements Runnable{
	
	Message message;
	Notifier(Message m){
		this.message = m;
		
	}
	@Override
	public void run(){
		
		String getName = Thread.currentThread().getName();

		synchronized(message){
			try{
				 Thread.sleep(5000);;
				 message.setMessage(getName+" Notifier work done");
	             message.notify();
				System.out.println(getName+"   This is the name of thread in notifer");
				
			}catch(InterruptedException e){
				
			}
		}
		
		
		
		
	}
	
	
	
	

}
