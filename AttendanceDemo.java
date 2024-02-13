import java.util.Scanner;
public class AttendanceDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Roll No of the class");
		int firstRoll = sc.nextInt();
		int absentNos[] = new int[200];
		int totalAbsent = 0;
		int curretRollNo = firstRoll;
		while(curretRollNo>0){
			System.out.println("Rollno "+curretRollNo);
			int temp = sc.nextInt();
			if(temp==0){
				absentNos[totalAbsent] = curretRollNo;
				totalAbsent++;
				curretRollNo++;
			}
			else if(temp==1){
				curretRollNo++;
			}
			else if(temp<0){
				curretRollNo = temp;
			}

			
		}

		for(int i=0;i<totalAbsent;i++){
			if(i==totalAbsent-1){
				System.out.print(absentNos[i]);	
			}
			else{
				System.out.print(absentNos[i]+", ");
			}
			
		}
	}
}