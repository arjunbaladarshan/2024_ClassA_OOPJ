import java.util.*;
public class FirstProgram{
	public static void main(String[] args){
		//command line argument
		//int temp = Integer.parseInt(args[0]);	


		// Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter total marks per subject");
		float totalMarks = sc.nextFloat();

		int m1;
		do{
			System.out.println("Please enter marks 1");
			m1 = sc.nextInt();
		}while(m1>totalMarks || m1<0);

		System.out.println("Please enter marks 2");
		int m2 = sc.nextInt();
		
		System.out.println("Please enter marks 3");
		int m3 = sc.nextInt();

		System.out.println("Please enter marks 4");
		int m4 = sc.nextInt();
		
		System.out.println("Please enter marks 5");
		int m5 = sc.nextInt();

		double per = ((m1 + m2 + m3 + m4 + m5) / totalMarks * 100) / 5.0;

		if(per>=60){
			System.out.println("First Division");
		}
		else if(per>=50){
			System.out.println("Second Division");
		}
		else if(per>=40){
			System.out.println("Third Division");
		}
		else{
			System.out.println("Oppps.... you are failed");
		}
	}
}