package com.interview.Thread;

public class SynchronizationJava {
	
	/**
	 * For a class (static) method, the monitor associated with the Class object for the method's class is used.
	 */
	
	static int x = 100;
	static int y =200;
	static String testing = "hello";
	

	   static synchronized void syncmethod(){
		  
		 System.out.println("In method static");
		 x++;
		 y++;
		 
		 System.out.println(x+"value of y  :"+y);
	 }
	  
	  void syncmethod1(){
		  
		  	System.out.println("In method non static");
			  x++;
			  y++;
		System.out.println(x+"hello  :"+y);
 
	  }
}
