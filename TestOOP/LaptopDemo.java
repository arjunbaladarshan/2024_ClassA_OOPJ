public class LaptopDemo{
	public static void main(String[] args) {
		int a = 10;
		String temp = new String("asdfasfd");
		Laptop l1;
		l1 = new Laptop();
		System.out.println(l1.modelName);
		

	}
}
class Laptop{
	String modelName = "default value";
	int ramSize;
	String processorName;
	boolean isHavingGraphicsCard;
	int graphicsMemorySize;
	boolean isHavingSSD;
	int ssdSize;
	int hddSize;

	public void boot(){
		System.out.println("Laptop booting");
	}

	public void login(){
		System.out.println("login");
	}

	public void connectToInternet(){
		System.out.println("connectToInternet");
	}

}