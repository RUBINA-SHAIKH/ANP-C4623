package io;

public class ThreadPriority
{
	    public static void main(String[] args) {
	        // Create three threads with different priorities
	        Thread t1 = new MyThreadEx("Thread 1", Thread.MIN_PRIORITY);
	        Thread t2 = new MyThreadEx("Thread 2", Thread.NORM_PRIORITY);
	        Thread t3 = new MyThreadEx("Thread 3", Thread.MAX_PRIORITY);
	        
	        // Start the threads
	        t1.start();
	        t2.start();
	        t3.start();
	    }
	}

	class MyThreadEx extends Thread {
	    public MyThreadEx(String name, int priority) {
	        super(name);
	        setPriority(priority);
	  }
	    
	    @Override
	    public void run() 
	    {
	        System.out.println(getName() + " started");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(getName() + " count " + i);
	            try {
	                // Sleep for a random amount of time to simulate work
	                Thread.sleep((long) (Math.random() * 1000));
	            } catch (InterruptedException e)
	            {
	            	 e.printStackTrace();
	            }
	        }
	        System.out.println(getName() + " Finished");
	    }
	       
}
	
	       
	    

	    
