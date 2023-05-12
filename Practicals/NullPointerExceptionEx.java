package io;

import java.util.Scanner;

public class NullPointerExceptionEx {

	public static void main(String[] args, String Ruby) 
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number:");
		String input = s.nextLine();
		
		
		try
		{
			//attempt to access a method on a null object
			int n = Integer.parseInt(input);  //this line will throw a NullPointerException
			
			System.out.println("Number:"+n);
		}
		catch(NullPointerException e)
		
		{
			System.out.println("Caught an Exception:"+e);
			
			
		}
		
	}

}
