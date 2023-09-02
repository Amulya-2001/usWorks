package Java8.practice;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface MathOperation{
	int operation(int a,int b);
}
@FunctionalInterface
interface MathOperation2{
	int operation(int a,int b,int c);
}
public class LambdaDemo {
	public static void main(String[] args) {
		MathOperation add= (x,y)->x+y;
		
		System.out.println(add.operation(5, 3));
		
		MathOperation sub=(x,y)->x-y;
		
		System.out.println(sub.operation(5, 3));
		
		MathOperation2 adder= (x,y,z)->x+y-z;
		
		System.out.println(adder.operation(5,3,2));
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		numbers.forEach(x->System.out.println(x+""));
		
		
	}
	
}
