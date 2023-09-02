package oop.practice;

public class Polymorphism {

	// Calculate area of a circle
	public static double calculateArea(double radius) {
		return Math.PI * radius * radius;
	}

	// Calculate area of a rectangle
	public static double calculateArea(double length, double width) {
		return length * width;
	}

	public static void main(String[] args) {
		// Calculate area of a circle
		double circleArea = calculateArea(5);
		System.out.println("Area of the circle: " + circleArea);

		// Calculate area of a rectangle
		double rectangleArea = calculateArea(4, 6);
		System.out.println("Area of the rectangle: " + rectangleArea);

	}
}