package io;

public class ThreadJoin extends Thread
{
	// overriding the run method
	public void run()
	{
		for(int i = 0;i<=3;i++)
		{
		try
		{
			// sleeping the thread for 300 seconds
			Thread.sleep(300);
			System.out.println("The Current Thread Name Is :"+Thread.currentThread().getId());
		}
		// catch block for catching the raised exception
		catch(Exception e)
		{
			System.out.println("The Exception Has Been Caught:"+e);
			e.printStackTrace();
		}
		System.out.println(i);
		
		}
			
	}
	

}
class ThreadJoinExample
{
	//main method
	public static void main (String[] args)
	{
		//creating 3 threads
		ThreadJoin th1 = new ThreadJoin();
		ThreadJoin th2 = new ThreadJoin();
		ThreadJoin th3 = new ThreadJoin();
		
		//thread th1 starts
		 th1.start();
		 // starting the 2nd thread after when
		 // the 1st thread th1 has ended or died
	 try
	 {
		 System.out.println("The Current Thread Name is : "+Thread.currentThread().getId());
		 // invoking the join() Method
		  th1.join();
			 
	 }
	//catch block for catching the raised exception
	 catch(Exception e)
	 {
		 System.out.println("The Exception has been Caught:"+e);
	 }
	 //thread th2 starts
	 th2.start();
	 // starting the th3 threads after when the thread th2 has ended or died
	 try
	 {
		 System.out.println("The Current Thread Name is:"+Thread.currentThread().getId());
		  th2.join();
	 }
	//catch block for catching the raised exception
     catch(Exception e)
	 {
    	 System.out.println("The Exception has been Caught:"+e);
	 }
	 //thread th3 starts
	 th3.start();
	 }

	
	}
	


