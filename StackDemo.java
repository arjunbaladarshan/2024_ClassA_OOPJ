import java.util.*;
public class StackDemo{
	public static void main(String[] args) {
		Stack<String> names = new Stack<String>();

		names.push("arjun");
		names.push("bala");
		names.push("darshan");
		names.push("rajkot");
		names.push("india");

		System.out.println("Stack Before = "+names);
		String temp = names.pop();

		names.push("INDIA");
		System.out.println("Pop = "+temp);
		System.out.println("Stack After = "+names);
		
	}
}