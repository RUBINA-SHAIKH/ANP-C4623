package corejava;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) 
	{
		//crating a scanner class to take input from user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A No of Times You Want to print ' Happy Holi'......:");
		//creating a variable using scanner class object
				int no = sc.nextInt();
				for(int i=0;i<=no;i++)
				{
					System.out.println(".......--HAPPY HOLI--.......");
				}
				
	}

}
