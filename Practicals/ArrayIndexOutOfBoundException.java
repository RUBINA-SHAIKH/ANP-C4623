package io;

import java.util.Scanner;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args)
	{
		//take input from user
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter The Size of The Array:");
		int size = s.nextInt();
		int[] ar = new int[size];
		
		System.out.println("Enter The Elements of The Array:");
		for(int i =0; i<size;i++)
		{
			System.out.println("Element"+(i+1)+":");
			ar[i] = s.nextInt();
			
		}
		System.out.println("Enter The Index To Access:");
		int index = s.nextInt();
	
		try
		{
			
			int value = ar[index];
			System.out.println("The Value At Index is :"+index+":"+value);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: Array Index Out Of Bounds! :");
		}
		s.close();
		
		

	}

}
