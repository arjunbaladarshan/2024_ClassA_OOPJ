class Vehicle{
	int noOfGears;
}
public class MCQDemo{
	public static void main(String[] args) {
		Vehicle audi = new Vehicle();
		audi.noOfGears = 5;
		Vehicle swift = audi;
		audi = null;
		System.out.println(swift.noOfGears);
	}
}