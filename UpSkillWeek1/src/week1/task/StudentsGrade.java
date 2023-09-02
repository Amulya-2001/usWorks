package week1.task;
import java.util.Scanner;

public class StudentsGrade {
	public static void nestedIf(char ch) {
		if(ch=='A') {
			System.out.println("Excellent Job!");
		}
		else if(ch=='B'){
			System.out.println("Good Job!");
		}
		else if(ch=='C') {
			System.out.println("Average Job.");
		}
		else if(ch=='D') {
			System.out.println("Needs improvement.");
		}
		else if(ch=='F') {
			System.out.println("Failed.");
		}
		else {
			System.out.println("Invalid grade.");
		}
	}
	public static void switchStatement(char ch) {
		switch (ch) {
        case 'A':
            System.out.println("Excellent Job!");
            break;
        case 'B':
            System.out.println("Good Job!");
            break;
        case 'C':
            System.out.println("Average Job.");
            break;
        case 'D':
            System.out.println("Needs improvement.");
            break;
        case 'F':
            System.out.println("Failed.");
            break;
        default:
            System.out.println("Invalid grade.");
            break;
    }
	}
	public static void main(String[] args) {
		char grade;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter your grade(A,B,C,D or F):");
		grade=obj.next().charAt(0);
		System.out.print("Printing grade using nested if -> ");
		nestedIf(grade);
		System.out.print("Printing grade using switch statement -> ");
		switchStatement(grade);
	}
}
