package com.kandy.thread.tut;

public class TestThread {

	/*public static void main(String[] args) {
		
		
		System.out.println("+++++++++ Creating Thread with Runnable Interface+++++++");
		
		//Thread Initilizatioon with Runnable Interface..Kamlesh
		// TODO Auto-generated method stub
		 RunnableDemo R1 = new RunnableDemo( "Thread-1");
	      R1.start();
	      
	     RunnableDemo R2 = new RunnableDemo( "Thread-2");
	      R2.start();
	      
	      
	      System.out.println("+++++++++ Creating Thread with Thread Class +++++++++++");
		
		//Thread Initialization with Thread Class Calling
		
		ThreadDemo R3 = new ThreadDemo( "Thread-3");
	      R3.start();
	      
	      ThreadDemo R4 = new ThreadDemo( "Thread-4");
	      R4.start();
	}
*/
	
	
	/* public static void main(String args[]) {

	      PrintDemo PD = new PrintDemo();

	      Thread T1 = new ThreadDemoWitoutSync( "Thread - 1 ", PD );
	      Thread T2 = new ThreadDemoWitoutSync( "Thread - 2 ", PD );

	      T1.start();
	      T2.start();

	      // wait for threads to end
	         try {
	         T1.join();
	         T2.join();
	      } catch ( Exception e) {
	         System.out.println("Interrupted");
	      }
	   }*/
	 
	 
	 // Inter Communication between two thread..Kamlesh
	 
	 public static void main(String[] args) {
	      Chat m = new Chat();
	      new T1(m);
	      new T2(m);
	   }
}
