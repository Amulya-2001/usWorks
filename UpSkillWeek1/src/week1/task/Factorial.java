package week1.task;

import java.util.Scanner;


/* 0!=1,
 * 1!=1*1=1,
 * 2!=2*1=2,
 * 3!=3*2*1=6,
 * 4!=4*3*2*1=24  */
public class Factorial {
	public static void factorial(int n) 
	{	
		int i=1,fact=1;
		while(i<=n) {
			fact=fact*i;
			i=i+1;
		}

		System.out.println("Factorial of "+n+" is "+fact);
	}
	public static void factorial1(int n) 
	{	
		int i=n,fact=1;
		while(i>1) {
			fact=fact*i;
			i=i-1;
		}
		System.out.println("Factorial using another of "+n+" is "+fact);
	}
	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		number=sc.nextInt();
		factorial(number);
		factorial1(number);
	}
}
