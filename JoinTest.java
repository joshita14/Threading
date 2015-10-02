package com.interview.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JoinTest implements Runnable{
	
	
	public void run(){
		
		ExecutorService e=Executors.newFixedThreadPool(1);
		
		System.out.println("This thread has started   :"  + Thread.currentThread().getName());
		try{
			for(int i =0; i<10;i++){
				Thread.sleep(2000);
				System.out.println(i);
			}
		}catch(InterruptedException e1){
			
			
		}
		System.out.println("This thread has ended    : "   +Thread.currentThread().getName());
		
	}
	
	public static void main(String args[]){
		
		JoinTest test = new JoinTest();
		
		Thread thread1 = new Thread(test,"thread1");
		Thread thread2 = new Thread(test,"thread2");
		Thread thread3 = new Thread(test,"thread3");
		
		thread1.start();
		
		try{
		   thread1.join();
		}catch(InterruptedException e){
			
		}
		
		thread2.start();
		
		try{
			thread2.join();
		}catch(InterruptedException e){
		}
		
		thread3.start();
	}

}
