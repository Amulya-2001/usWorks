package week2.task.Enum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a month:");
		String input=sc.nextLine().toUpperCase();
		 Month selectedMonth=Month.valueOf(input);
		 int days=selectedMonth.getDays();
		 
		 System.out.println("Selected Month:"+selectedMonth);
		 System.out.println("Number of Days in "+selectedMonth+": "+days);
	}
}
