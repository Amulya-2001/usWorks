package week1.task;

import java.util.Scanner;

public class ReverseString {
	public static void reverseString(String str)		//amulya
	{
		String rev="";							//rev=""
		char chars[]=str.toCharArray();			//chars[]={'a','m','u','l','y','a'}
		for(int i=chars.length-1;i>=0;i--) 		//chars.length-1=accessing last element in array=a
		{
			rev=rev+chars[i];				//rev= "a-5","ay-4","ayl-3","aylu-2","aylum-1","ayluma-0"
		}
		System.out.println("After Reversing the string:"+rev);
	}
	public static void reverseUsingInbuilt(String str) 
	{
		StringBuilder reverseString = new StringBuilder(str);
        reverseString.reverse();
        System.out.println(reverseString.toString());
	}
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String str1;
		
		System.out.println("Enter the String:");
		str1=obj.next();
		reverseString(str1);
		
		String str2="Suchitra";
		System.out.println("Given String2:"+str2);
		reverseUsingInbuilt(str2);
	}
}
