package Task;

import java.util.Optional;

public class OptionalClassDemo {
	public static void main(String[] args) {
		String str1=null;
		String str="Hello,World!";
		
		//.empty
		Optional<String> opt1=Optional.empty();
		System.out.println(opt1);
		
		//.ofNullabe
		Optional<String> opt=Optional.ofNullable(str1);
		System.out.println(opt);
		
		//.of
		Optional<String> opt2=Optional.of(str);
		System.out.println(opt2);
		
		
	
		//isPresent
		if(opt.isPresent()) {
			System.out.println("Value is "+opt.get());
			
		}
		else {
			System.out.println("Value is not present");
			//orElse
			String value = opt.orElse("Give any value");
			System.out.println("Value is not present- "+value);
		}
		
		//ifPresent
		opt2.ifPresent(value->System.out.println("Value is present:" +value));
		
		opt.ifPresent(value->System.out.println("(null)Value is present:" +value));
		
		//.filter
		opt2.filter(value->value!=null && value.contains("Hello"))
		.ifPresent(filteredValue->System.out.println("Filtered value: "+filteredValue));
		
		opt.filter(value->value!=null && value.contains("Hello"))
		.ifPresent(filteredValue->System.out.println("(null)Filtered value: "+filteredValue));
		
		//map
		opt2.map(value->"Mapped:"+value)
			.ifPresent(mappedValue->System.out.println(mappedValue));
		
		opt.map(value->"(null)Mapped:"+value)
			.ifPresent(mappedValue->System.out.println(mappedValue));
	
	}
}
