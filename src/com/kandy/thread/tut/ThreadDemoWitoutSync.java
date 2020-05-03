package com.kandy.thread.tut;

public class ThreadDemoWitoutSync extends Thread {
	
	private Thread t;
	private String threadName;
	PrintDemo  PD;

	   ThreadDemoWitoutSync( String name,  PrintDemo pd) {
	      threadName = name;
	      PD = pd;
	   }
	   
	   public void run() {
		   //Normal Flow thread without Sysncronization
	        // PD.printCount();
		   
		   //Flow with Sync Block
		   synchronized(PD) {
		         PD.printCount();
		      }
	      
	      
	      System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }

}
