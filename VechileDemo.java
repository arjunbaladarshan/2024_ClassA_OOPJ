class MovingObject{
	public MovingObject(){
		System.out.println("MovingObject Default");
	}
	public MovingObject(int n1){
		this();
		System.out.println("MovingObject Parameterized");
	}
}
class Vehicle extends MovingObject{
	public Vehicle(){
		System.out.println("Vehicle Default");
	}
	public Vehicle(int n1){
		super(n1);
		this();
		System.out.println("Vehicle Parameterized");
	}
}

class Car extends Vehicle{
	public Car(){
		System.out.println("Car Default");
	}
	public Car(int n1){
		super(n1);
		this();
		
		System.out.println("Car Parameterized");
	}
}

public class VechileDemo{
	public static void main(String[] args) {
		Car v1 = new Car(15);
	}
}