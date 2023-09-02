package Task;

import java.util.*;
import java.util.stream.Collectors;

public class StringConversion {
	public static void main(String[] args) {
		List<String> st =Arrays.asList("AbC","aBc","abc","ABC");
		List<String> convertToUpper= st.stream()
				.map(String::toUpperCase)				
				.collect(Collectors.toList());	
		System.out.println(convertToUpper);
		List<String> convertToLower= st.stream()
				.map(String::toLowerCase)
				.collect(Collectors.toList());
		System.out.println(convertToLower);
	}
}
