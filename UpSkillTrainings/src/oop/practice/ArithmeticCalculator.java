package oop.practice;


interface Calc {
	public void add(int a,int b);
	public void sub(int a,int b);
	public void mul(int a,int b);
	public void div(int a,int b);
}

abstract class Calculator implements Calc {
	public void add(int a,int b) {
		System.out.println("Performing addition."+(a+b));
	}

	public void sub(int a,int b) {
		System.out.println("Performing subtraction."+(a-b));
	}

	public void mul(int a,int b) {
		System.out.println("Performing multiplication."+(a*b));
	}
	public abstract void div(int a,int b);
}
public class ArithmeticCalculator extends Calculator {
	public void div(int a,int b) {
		System.out.println("Performing division."+(a/b));
	}
	public static void main(String[] args) {

		Calc calculator = new ArithmeticCalculator();

		// Perform arithmetic operations
		calculator.add(4,2); // Output: Performing addition.
		calculator.sub(4,2); // Output: Performing subtraction.
		calculator.mul(4,2); // Output: Performing multiplication.
		calculator.div(4,2); // Output: Performing division.
	}

}

