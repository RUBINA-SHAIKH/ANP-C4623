package corejava;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String args[]){
		int sum=0;
		int digit=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int no=sc.nextInt();
		
		while(no!=0) {
			digit=no%10;
			sum=sum+digit;
			no=no/10;
		}
		System.out.println("sum of digit: "+sum);
	}

}
