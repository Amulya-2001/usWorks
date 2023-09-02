package Task;

import java.util.Arrays;
import java.util.List;


public class MethodReferenceDemo {
	interface Operation{
		 int perform(int x,int y);
				
	}
	public static void main(String[] args) 
	{
		List<String> names=Arrays.asList("abc","def","ghi","Jkl");
		
		
		for(String x:names){
			System.out.println(x);	
		}
		names.forEach(System.out::println);
		//Lambda exoression
		Operation adder = (x,y)->x+y;
		int result=adder.perform(8, 6);
		System.out.println(result);
	
		//using method reference
		Operation add1 = MethodReferenceDemo::add;
		int result1=add1.perform(8, 7);
		System.out.println(result1);
			
	}
	public static int add(int a,int b) 
	{
		return a+b;
	}
	
}
