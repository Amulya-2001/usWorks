package Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
	private String name;
	private int age;
	private double grade;
	public Student(String name,int age,double grade) {
		this.name=name;
		this.age=age;
		this.grade=grade;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getGrade() {
		return grade;
	}
	public String toString() {
		return "StudentComparator{"+
				"name='"+name+'\''+
				",age="+age+
				", grade="+grade+
				'}';
	}

}
public class StudentComparator{
	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student("Riya",19,85.5));
		students.add(new Student("Anshu",20,90.5));
		students.add(new Student("Nidhi",18,78.5));

		Collections.sort(students,Comparator.comparingInt(Student::getAge).reversed());
		System.out.println("\nSorted by Age(descending):");
		students.forEach(System.out::println);

		Collections.sort(students,Comparator.comparing(Student::getName));
		System.out.println("\nSorted by Name:");
		students.forEach(System.out::println);

		Collections.sort(students,Comparator.comparingDouble(Student::getGrade));
		System.out.println("\nSorted by Grade");
		students.forEach(System.out::println);

		System.out.println("---------------Using Streams-------------------");
		List<Student> sortedByDesc=students.stream()

				.sorted(Comparator.comparingInt(Student::getAge).reversed())
				.collect(Collectors.toList());
		System.out.println("\nSorted by Age(descending) using Streams:");
		sortedByDesc.forEach(System.out::println);

		List<Student> sortedByName=students.stream()

				.sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
		System.out.println("\nSorted by Name using Streams:");
		sortedByName.forEach(System.out::println);
		
		List<Student> sortedByGrade=students.stream()

				.sorted(Comparator.comparingDouble(Student::getGrade))
				.collect(Collectors.toList());
		System.out.println("\nSorted by Grade using Streams:");
		sortedByGrade.forEach(System.out::println);
	}
}
