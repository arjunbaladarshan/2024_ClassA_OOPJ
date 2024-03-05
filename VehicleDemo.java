class Vehicle{
	int noOfPerson;
	String color;
	int cc;
	int noOfGears = 5;
	double milage;
	String fuelType;
	double price;
	String modelName;
	int manufacturingYear;
	int scrapeYear;
}
class Bike extends Vehicle{
	boolean isMoped;
	String standType;
	boolean isKickStart;
}

class Car extends Vehicle{
	int noOfAirBag = 2;
	double acCapacity;
	boolean isPowerStearing;
}

public class VehicleDemo{
	public static void main(String[] args) {
		Car audi = new Car();
		audi.noOfGears = 6;
		System.out.println(audi.noOfGears);
	}
}

class Phone{
	public void alarm(){
		System.out.println("Enter clock");
		System.out.println("set time");
		System.out.println("ALarm Set done");
	}
}

class IPhone{
	public void alarm(){
		System.out.println("Enter setting");
		System.out.println("Enter submenu");
		System.out.println("Enter clock");
		System.out.println("Enter set alarm");
		System.out.println("Enter set time");
		System.out.println("Enter is repeat");
		System.out.println("ALarm Set done");
	}
}
class Android{
	public void alarm(){
		System.out.println("Enter setting");
		System.out.println("Enter clock");
		System.out.println("Enter set alarm");
		System.out.println("Enter set time");
		System.out.println("Enter is repeat");
		System.out.println("ALarm Set done");
	}
}