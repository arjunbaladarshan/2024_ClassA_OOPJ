interface Abc{
	default void abc(){
		System.out.println("Hello world from interface");
	}
}

class MyAbc implements Abc{
	void xyz(){
		abc();
	}
}
public abstract class DemoExam{
	public static void main(String[] args) {
		
	}
}
