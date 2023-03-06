package corejava;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) 
	{
		//crating a scanner class to take input from user 
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter A Multiplication Table Of a Given No:");
			//creating a variable using scanner class object
		     int n = sc1.nextInt();
		     for(int i=1;i<=10;i++)
		     {
		     
		    	 System.out.println(n+"*"+i+"="+n*i);
		     }
						
		}

	}



