package com.interview.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorService1 {
	
	
	public static void main(String[] args) {
		
		//dont define the class, the reference to the runnable interface , this means that it will define a anonymous class which implements
		//runnable interface and hence impements all the methods in a runnable interface.
		//this can take callable interface also.
		
		//functions are first class objects, directly pass as reference, object is not needed.
		//seedha run method mai bhi pass kiya ja sakta hai, in lamda expresssions ....
		ExecutorService service =  Executors.newFixedThreadPool(10);
		service.execute(new Runnable(){            //here runnable represents a class
			public void run() {
		        System.out.println("Asynchronous task");
		    }
		});
		
		
	}
	
	/**
	 *  A Callable needs to implement call() method while a Runnable needs to implement run() method.
		A Callable can return a value but a Runnable cannot.
		A Callable can throw checked exception but a Runnable cannot.
		A Callable can be used with ExecutorService#invokeXXX methods but a Runnable cannot be.
	 */
}
