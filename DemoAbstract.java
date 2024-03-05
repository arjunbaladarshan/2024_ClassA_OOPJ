interface MovingObject{
	public void start();
	public void stop();
	public void turnLeft();
	public void turnRight();
	int a = 10;
}

interface LuxurySpace{
	public void sofa();
}

class Abc{
	int count = 1;
}


abstract class Vehicle extends Abc implements MovingObject, LuxurySpace{
	public void turnRight(){
		//code
	}
	public void turnLeft(){
		//code
	}
	public void start(){
		//code
	}
	public void sofa(){
		//code
	}
}

class Car extends Vehicle{
	public void stop(){
		//code here
	}
}


public class DemoAbstract{
	public static void main(String[] args) {
		System.out.println(Car.a);
	}
}