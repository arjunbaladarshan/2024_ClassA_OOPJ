import java.util.Scanner;
public class Cricket{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 1,2,4,5,6,7,9,11,16,29,39,40,48,51,52,59,66,77,99,102,1000,5200,7500,9652 };

		System.out.println("Enter Number to search");
		int n = sc.nextInt();

		boolean isFound = false;
		for(int i=0;i<a.length;i++){
			System.out.print("*");
			if(a[i]==n){
				isFound = true;
				break;
			}
		}

		// int low = 0;
		// int high = a.length-1;
		// int mid = (high+low)/2;

		// while(mid!=high && mid!=low ){
		// 	System.out.print("*");
		// 	if(a[mid]==n){
		// 		isFound = true;
		// 		break;
		// 	}
		// 	if(a[mid]>n){
		// 		high = mid;
		// 		mid = (low+high)/2;	
		// 	}
		// 	else{
		// 		low = mid;
		// 		mid = (low+high)/2;
		// 	}
		// }

		if(isFound){
			System.out.println("Found");
		}
		else{
			System.out.println("Not Found");
		}
	}
}