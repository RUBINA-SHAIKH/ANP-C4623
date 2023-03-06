package corejava;

import java.util.Scanner;

public class EligibleVote {

	public static void main(String[] args) 
	{
		//crating a scanner class to take input from user 
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter An Age:");
				//creating a variable using scanner class object
				int no = sc.nextInt();
				//checking condition
				if (no>=18)
				{
					System.out.println("User Is Eligible To Vote:");
					
				}
				else
				{
					System.out.println("User Is Not Eligible To Vote :");
				}
			
				sc.close();
				


	}

}
