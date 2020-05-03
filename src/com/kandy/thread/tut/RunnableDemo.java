package com.kandy.thread.tut;

public class RunnableDemo implements Runnable {
	
	private Thread t;
	private String threadName;
	
	
	
	RunnableDemo(String Name){
		this.threadName=Name;
		System.out.println("Creating Thread >"+ threadName);
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running Thread >"+ threadName);
		try {
		for(int i=4;i>0;i--){
			System.out.println("Thread >"+threadName+", "+i);
			
			//Let thread have to sleep for a while..Kamlesh
				Thread.sleep(50);
		      }
		
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Thread " +  threadName + " interrupted.");
			}
		System.out.println("Thread " +  threadName + " exiting.");
	}
	
	
	public void start(){
		 System.out.println("Starting " +  threadName );
		 //System.out.println("this > " +  this );
		 if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	        
	      }
	}

}
