class ClassRoom{
	String classRoomNumber;
	int noOfChairs;
	int noOfFans;
	int noOfLights;
	int noOfACs;

	public ClassRoom(){
		classRoomNumber = "blank";
		noOfACs = 1;
		noOfLights = 5;
		noOfFans = 2;
		noOfChairs = 10;
	}

	public ClassRoom(String classRoomNumber){
		this();
		this.classRoomNumber = classRoomNumber;
	}

	public void open(){
		// needs a key
		// turn on light
		// turn on projector
	}

	public void close(){
		// turn off project
		// turn off light
		// needs a key
	}
}

public class DemoEvening{
	public static void main(String[] args) {
		ClassRoom g104 = new ClassRoom("G-104");
		ClassRoom g105 = new ClassRoom("G-105");

	}
}