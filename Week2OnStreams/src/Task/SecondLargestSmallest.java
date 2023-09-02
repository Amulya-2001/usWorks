package Task;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondLargestSmallest {
	public static void main(String[] args) {
		List<Integer> LI= Arrays.asList(1,23,41,24,46,73,12,31,24,46,73,37,15,16,17,18);
		//List<Integer> LI= Arrays.asList(1);
		List<Integer> SortInOrder= LI.stream()
								.sorted()
								.distinct()
								.collect(Collectors.toList());
		
		System.out.println(SortInOrder);
		
		//secondLargest and smallest
		if(SortInOrder.size()>=2)
		{
			int secondLargest=SortInOrder.get(SortInOrder.size()-2);
			int secondSmallest=SortInOrder.get(1);
			
			System.out.println("SecondLargest : "+secondLargest);
			System.out.println("SecondSmallest : "+secondSmallest);
		}
		else {
			System.out.println("Not enough elements in list");
		}
		
		//Finding 1st element
		int firstElement = LI.stream().findFirst().orElse(-1);
		System.out.println("First Element :"+firstElement);
		
		//Finding total numbers of elements in list
		long totalElements = LI.stream().count();
									
		System.out.println("Total Elements :"+totalElements);
		
		//all even numbers
		List<Integer> evenNumbers = LI.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		System.out.println("Even: "+evenNumbers);
		
		//start with 1
		List<Integer> numbersStartingWithOne = LI.stream()
                .filter(number -> String.valueOf(number).startsWith("1"))
                .collect(Collectors.toList());
        
        System.out.println("Numbers starting with 1: " + numbersStartingWithOne);
        
        //duplicate
        List<Integer> duplicateElements = LI.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("Duplicate elements: " + duplicateElements +" count is "+ duplicateElements.size());
       
		
	}
}
