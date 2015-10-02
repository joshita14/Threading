package com.interview.Thread;


/**
 * Showing usage for interrupt
 * @author joshita
 *
 */
public class Interrupt extends Thread{

	
	
	public static void main(String args[]){
		
		Interrupt i = new Interrupt();
		
		Thread t1 = new Thread(i,"joshita thread started");        //not alive
		t1.start();                      //alive after this statement
		t1.interrupt();
		System.out.println("Her");
		
	}
	
	//Example 1:
//	@Override
//	public void run(){
//		try{
//		Thread.sleep(1000);
//		System.out.println("TEST");   //this wont be printed as we have generated an exception and it goes to the catch block
//		}catch(InterruptedException e){
//			System.out.println("handled the exception    : PART 1");
//			/*
//			 * Here the sleep method generates an interrupt and then is handled, hence the program execution continues
//			 */
//		}
//	}
//	
	//Example 2:
	@Override
	public void run(){
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			throw new RuntimeException("We are stopping the current execution of thread");
		}
		System.out.println("If we throw an exception explicitly this line will not be called");
	}
	
	//Example 3:
//	@Override
//	public void run(){
//		
//		System.out.println("We are not interrupting a thread and hence there will be no interruption even if we generate an interrupt");
//	}
}
