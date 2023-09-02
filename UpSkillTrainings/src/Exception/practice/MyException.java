package Exception.practice;

import java.util.Scanner;


public class MyException extends Exception{
	
	public MyException(String msg) {
		super(msg);
	}

	public static void EvenOrOdd(int n) throws MyException {
		if(n%2==0) {
			System.out.println("number is even - "+n);
		}
		else {
			throw new MyException("number is odd - "+n);
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
		catch(MyException e){
			System.out.println(e.getMessage());
		}
		
	}
}