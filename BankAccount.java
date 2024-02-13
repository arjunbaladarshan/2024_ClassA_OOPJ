import java.util.Scanner;
public class BankAccount{
	int accNo;
	double balance;
	String accHolderName;
	int accHolderAge;
	double minBalance;

	public BankAccount(){
		Scanner sc = new Scanner(System.in);
		accHolderAge = sc.nextInt();
		if(accHolderAge>59){
			minBalance = 0;
		}
		else{
			minBalance = 10000;
		}
	}
}