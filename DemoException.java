import java.util.*;
public class DemoException{

	public static void main(String[] args){
		parents();
	}

	public static void parents(){
		try{
			trustee();	
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			
		}
		
	}

	public static void trustee() throws Exception{
		GopiMam();
	}

	public static void GopiMam() throws Exception {
		Arjun();	
		
	}

	public static void Arjun() throws Exception{
		int balance = 10000;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to withdraw");
		int temp = sc.nextInt();
		if(temp>balance){
			throw new Exception("Insufficient Balance");
		}
		else{
			balance = balance - temp;
			System.out.println("Current Balance = "+balance);	
		}
		
		
	}
}