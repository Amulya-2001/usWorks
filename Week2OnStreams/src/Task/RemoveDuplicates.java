package Task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<String> Dup1=Arrays.asList("India","Singapore","Australia","India");
		List<Integer> Dup2=Arrays.asList(1,1,2,2,2,3,3,3,3,4,4,4,4,4);
		List<String> RemoveDup1=Dup1.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(RemoveDup1);
		List<Integer> RemoveDup2=Dup2.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(RemoveDup2);
	}
}
