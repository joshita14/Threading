package com.interview.Thread;

import java.util.concurrent.Semaphore;

public class Semaphores {
	
	//making binary semaphore
	Semaphore semaphore = new Semaphore(1);
	
	
	void mutualExclusion(){
	try{	
		semaphore.acquire();
		System.out.println(  Thread.currentThread().getName() +"  Inside mutual exclusion");
	  }catch(InterruptedException e){
		System.out.println(  e.getMessage() );
	  }finally{
		  semaphore.release();
		  System.out.println( Thread.currentThread().getName()  +" Outside mutual exclusion");
	  }
	}
	
	public static void main(String[] args) {
		
		final Semaphores s = new Semaphores();
		new Thread("Thread 1"){
			  @Override
			  public void run(){
				  s.mutualExclusion();
			  }
	     }.start();
	     
	     
	     new Thread("Thread 2"){
	    	 @Override
	    	 public void run(){
	    		 s.mutualExclusion();
	    	 }
	     }.start();
			
		
	}

}
