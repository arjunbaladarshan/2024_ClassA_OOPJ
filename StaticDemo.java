public class StaticDemo{
	static int age = 16;
	static int standard;
	static{
		if(age==14){
			standard = 7;
		}
		else if(age==15){
			standard = 8;
		}
		else if(age==16){
			standard = 9;
		}
	}
	public static void main(String[] args) {
		
		System.out.println("standard = "+standard);
	}
	
}