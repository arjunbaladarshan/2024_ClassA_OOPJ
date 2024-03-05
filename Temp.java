class Abc{
	int a;
}
public class Temp{
	public static void main(String[] args) {
		Abc a1 = new Abc();
		Abc a2 = a1;
		a1.a = 10;
		a1 = null;
		System.out.println(a2.a);

	}
}