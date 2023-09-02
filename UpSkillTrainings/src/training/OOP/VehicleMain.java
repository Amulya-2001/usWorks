package training.OOP;
//Abstract class
abstract class Vehicle {
	private String model;

	public Vehicle(String model) {
		this.model = model;
	}

	public void start() {
		System.out.println(model + " is starting.");
	}

	// Abstract method
	public abstract void stop();
}
//Interface for electric vehicles
interface Electric {
	void charge();
}
//Car class extending Vehicle
class Car extends Vehicle {
	public Car(String model) {
		super(model);
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping.");
	}
}
//ElectricCar class extending Vehicle and implementing Electric interface
class ElectricCar extends Vehicle implements Electric {
	public ElectricCar(String model) {
		super(model);
	}

	@Override
	public void stop() {
		System.out.println("Electric car is stopping.");
	}

	@Override
	public void charge() {
		System.out.println("Electric car is charging.");
	}
}
public class VehicleMain {
	public static void main(String[] args) {
		Vehicle car = new Car("Toyota");
		Vehicle electricCar = new ElectricCar("Tesla");

		car.start();
		car.stop();

		System.out.println();

		electricCar.start();
		electricCar.stop();
		((Electric) electricCar).charge(); 
	}
}

