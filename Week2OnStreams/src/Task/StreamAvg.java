package Task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAvg {
	public static void main(String[] args) {
		//List<Integer> integers=Arrays.asList(1,2,3,4,5,6,7,8,9,10,5);
		List<Integer> integers=Arrays.asList(10,10);
		OptionalDouble average=integers.stream()
				.mapToInt(Integer::intValue)
				.average();


		System.out.println("Average of Integers: "+average);
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		List<Integer> nameLengths = names.stream()
				.map(String::length)
				.collect(Collectors.toList());

		System.out.println("LengthName: "+nameLengths);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> evenNumbers = numbers.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		System.out.println("Even: "+evenNumbers);

		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");
		fruits.stream()
		.forEach(fruit -> System.out.println(fruit));
		fruits.forEach( System.out::println);
		fruits.forEach(fruit -> System.out.println(fruit));




		List<Integer> numb = new ArrayList<>();
		numb.add(1);
		numb.add(2);
		numb.add(3);
		numb.add(4);
		numb.add(5);

		// Using forEach to add 10 to each number
		numbers.forEach(number -> {
			int result = number + 10;
			System.out.println("Original: " + number + ", After adding 10: " + result);
		});
		
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
		Predicate<Integer> evenPredicate = num -> num % 2 == 0;
		List<Integer> evenNumbers1 = numbers1.stream().
				filter(evenPredicate).
				collect(Collectors.toList());
		System.out.println("Even(Predicate): "+evenNumbers1);
		
		
		Predicate<Integer> greaterThanThree = num -> num > 3;
		Predicate<Integer> lessThanTen = num -> num < 10;

		Predicate<Integer> combinedPredicate = greaterThanThree.and(lessThanTen);

		List<Integer> numbers2 = Arrays.asList(1, 5, 8, 12);
		List<Integer> filteredNumbers = numbers2.stream()
				.filter(combinedPredicate)
				.collect(Collectors.toList());
		System.out.println(">3 and <10: "+filteredNumbers);
		
		String text = "Hello, world!";
		Function<Integer, String> converter = text::substring;
		String result = converter.apply(7);
		System.out.println(result);
		
		 LocalDate today = LocalDate.now();
	     System.out.println("Today's date: " + today);
		
		 LocalTime currentTime = LocalTime.now();
	     System.out.println("Current time: " +currentTime);
	     
	     LocalDateTime dateTime = LocalDateTime.now();
	        System.out.println("Current date and time: " + dateTime);
	        
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	        String formattedDateTime = dateTime.format(formatter);
	        System.out.println("Formatted DateTime: " + formattedDateTime);
	        
	        String dateString = "2023-08-15 14:30:50";
	        
	        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);
	        System.out.println("Parsed DateTime: " + parsedDateTime);

	}
}

