package oop.practice;
//Inheritance
class Instrumentt{
	public String name;
	
	public Instrumentt(String name) {
		this.name=name;
	}
	public void play() {
		System.out.println(name+ " is playing");
	}
	
}
class Guitarr extends Instrumentt{
	public int numOfStringsOrKeys;
	public Guitarr(String name,int numOfStringsOrKeys) {
		super(name);
		this.numOfStringsOrKeys=numOfStringsOrKeys;
	}
	public void play() {
		System.out.println(name+" (guitar) has "+numOfStringsOrKeys+" Strings");
	}
}
class Pianoo extends Guitarr{	
	
	public Pianoo(String name, int numOfStringsOrKeys) {
		super(name, numOfStringsOrKeys);
	}

	public void play() {
		System.out.println(name+" (Piano) has "+numOfStringsOrKeys+" keys");
	}
}
public class MusicalInstruments {
	public static void main(String[] args) {
		
		Instrumentt obj1 =new Instrumentt("GUITAR");
		Guitarr guitar1=new Guitarr("Fender",12);
		Instrumentt obj2=new Instrumentt("PIANO");
		Pianoo piano1=new Pianoo("Yamaha",88);
		
		obj1.play();
		guitar1.play();
		obj2.play();
		piano1.play();
	}
}
