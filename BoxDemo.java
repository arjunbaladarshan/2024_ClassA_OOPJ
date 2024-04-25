import java.util.Scanner;
public class BoxDemo{
	static int a = 0;
	public static void main(String[] args) {
		int ans = totalSum(10);
		System.out.println(ans);
	}

	public static void printA(){
		System.out.println(a);	
	}

	public static int totalSum(int n){
		if(n!=0){
			return n+totalSum(n-1);
		}
		else{
			return 0;
		}
	}
}