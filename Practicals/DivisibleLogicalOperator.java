package Operater;
import java.util.Scanner;
public class DivisibleLogicalOperator
{

	public static void main(String[] args)
	{
		//take input from user
		Scanner rs = new Scanner(System.in);
		System.out.println("Enter A Number Between 1 To 100:");
		int i = rs.nextInt();
		
	if(i>=1 && i<=100)
		{
			//check the no is divisible by 2 or 3	
	        if (i%2==0 && i%3==0)
	    	{
	    		System.out.println("Divisible By 2 and 3");
	    	
	        }
		//check the no is divisible by either 2 or 3	
		        else if(i%2==0 || i%3==0)
	            {
	    
	    	       System.out.println("Number Is Divisible By Either 2 Or 3");
	    	
	            }
		//check the no is not divisible by 2 or 3	
	            else  
		        {
			       System.out.println("The Number Is Not Divisible by 2 Or 3");
		        }
	     }

   }
}
