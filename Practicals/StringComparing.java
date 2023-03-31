package Operater;
import java.util.Scanner;
public class StringComparing {

	public static void main(String[] args) {
		
		
			{
				//take input from user
				Scanner thv = new Scanner(System.in);
				System.out.println("Enter Two String:");
				
				String s1 = thv.next();
				String s2= thv.next();
				int Result =s1.compareTo(s2);
				
				if(Result<0)
				{
					//comparing two string
					System.out.println("First String Come Before Second String");
				}
				else if(Result>0)
				{
					System.out.println("First String Come After Second String");
				}
				


			}

		}

	}


