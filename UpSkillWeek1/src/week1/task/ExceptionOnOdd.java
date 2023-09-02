package week1.task;

import java.util.Scanner;

public class ExceptionOnOdd extends Exception{
	
	public ExceptionOnOdd(String msg) {
		super(msg);
	}

	public static void EvenOrOdd(int n) throws ExceptionOnOdd {
		if(n%2==0) {
			System.out.println("number is even - "+n);
		}
		else {
			throw new ExceptionOnOdd("number is odd - "+n);
		}
	}
	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		number=sc.nextInt();
		try {
			EvenOrOdd(number);
		}
		catch(ExceptionOnOdd e){
			System.out.println(e.getMessage());
		}
		
	}
}



