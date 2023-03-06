package corejava;

import java.util.Scanner;

public class IfElseEX {

	public static void main(String[] args) {
		//crating a scanner class to take input from user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A No:");
		//creating a variable using scanner class object
		int no = sc.nextInt();
		//checking condition
		if (no>0)
		{
			System.out.println("The NO is Positive:");
			
		}
		else if(no<0)
		{
			System.out.println("The No Is Negative:");
		}
		else
		{
			System.out.println("The No is Zero:");
		}
		sc.close();

	}

}
