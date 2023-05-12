package io;

public class EvenThread extends Thread
{
	public void run()
	{
		for(int i = 2;i<=10;i++)
		{
			System.out.println("EvenThread:"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
				
			}
		}
	}
class OddThread extends Thread
{
	public void run()
	{
		for(int i = 1;i<=9;i++)
		{
			System.out.println("OddThread:"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
				
			}
		}
	}
}
public class CheckEvenOddUsingThread
{
	public static void main(String[] args)
	{
		EvenThread e = new EvenThread();
		OddThread o = new OddThread();
		e.start();
		o.start();
		
		try
		{
			e.join();
			o.join();
			
		}
		catch(InterruptedException e1)
		
		{
			System.out.println("");
			
		}
	}
}
}
	



