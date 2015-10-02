package com.interview.Thread;

public class WaiterNotifyTest implements Runnable{
	
	
	@Override
	public void run(){}
	
	public static void main(String args[]){
		
		Message message = new Message("Process That");
		
		Waiter waiter = new Waiter(message);
		Thread t2 = new Thread(waiter,"waiter");
		System.out.println(t2.isAlive());
		t2.start();
		System.out.println(t2.isAlive());
		Notifier notifier = new Notifier(message);
		Thread t1 = new Thread(notifier,"notifier");
		t1.start();
//		t1.interrupt();		
	}

}
