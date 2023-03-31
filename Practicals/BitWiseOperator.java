package Operater;
import java.util.Scanner;

public class BitWiseOperator {

	public static void main(String[] args)
	{
		//take input from the user
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter 1st No:");
		int n1 = ss.nextInt();
		System.out.println("Enter 2nd No:");
		int n2 = ss.nextInt();
		
		//apply bitwise AND operator
		int and = n1 & n2;
		System.out.println(n1 +"&"+n2+"="+and);
		
		//apply bitwise OR operator
				int or = n1 | n2;
				System.out.println(n1 +"|"+n2+"="+or);
		//apply bitwise XOR operator
				int xor = n1 ^ n2;
				System.out.println(n1 +"^"+n2+"="+xor);
				
		//apply bitwise NOT operator
				int not =~ n2;
				System.out.println("~"+n2+"="+n2);
				
				
				
		
		
		

	}

}
