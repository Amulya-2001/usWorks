package oop.practice;

public class Encapsulation {
	private String name;
	private int age;
	private String occupation;
	public Encapsulation(String name,int age,String occupation) {
		this.name=name;
		this.age=age;
		this.occupation=occupation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name != null && !name.isEmpty()) 
		{
			this.name = name;
		} 
		else 
		{
			System.out.println("Invalid name.");
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age<=0 || age>100) 
		{
			this.age = age;
		} else {
			System.out.println("Invalid age.");
		}
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {

		this.occupation = occupation;
	}



	public static void main(String[] args) {
		Encapsulation person=new Encapsulation("Bob",25,"Designer");
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		System.out.println("Occupation: " + person.getOccupation());
		Encapsulation person2=new Encapsulation("Bobby",25,"xyz");
		System.out.println("Name: " + person2.getName());
		System.out.println("Age: " + person2.getAge());
		System.out.println("Occupation: " + person2.getOccupation());
		person2.setOccupation("Teacher");
		System.out.println("After Modifying "
				+ "Occupation: " + person2.getOccupation());
	}
}

