package week2.task;

import java.util.ArrayList;

public class ArrayListIntegers {
	public static int sum(ArrayList<Integer> n){
		int sum=0;
		for(int i=0;i<n.size();i++)
		{
			sum=sum+n.get(i);
		}
		return sum;
	}
	public static void main(String[] args) {
		ArrayList<Integer> integers=new ArrayList<>();
		
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(5);
		integers.add(6);
		
		System.out.println("Sum of Inserted Integers: " +sum(integers));
	}
}
