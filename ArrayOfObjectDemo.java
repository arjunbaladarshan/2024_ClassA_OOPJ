import java.util.*;
import java.io.*;
class Student{
	int rollNo;
	int present;
	public Student(int rollNo, int present){
		this.rollNo = rollNo;
		this.present = present;
	}
}


public class ArrayOfObjectDemo{
	public static void main(String[] args) {
		Student[] stu = new Student[1000];

		Scanner sc = new Scanner(System.in);
		for(int i=0;i<stu.length;i++){
			System.out.println("Roll No. "+(i+101));
			int temp = sc.nextInt();
			if(temp==-1){
				int nextRollNo = ((((i+101)/100)+1)*100);
				i = nextRollNo-101;
				continue;
			}
			else if(temp==-2){
				break;
			}
			stu[i] = new Student(i+101,temp);
		}

		String abStudents = "";
		for(int i=0;i<stu.length;i++){
			if(stu[i]!=null && stu[i].present==0){
				abStudents += stu[i].rollNo+",";
				System.out.print(stu[i].rollNo+",");
			}
		}

		try{
			Date d = new Date();

			int year = d.getYear()+1900;
			int month = d.getMonth()+1;
			int date = d.getDate();

			String fileName = "A_"+year+"_"+month+"_"+date+".txt";
			FileWriter outFile = new FileWriter(fileName);
			outFile.write(abStudents);
			outFile.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Is attedance ok?? please enter 1 for ok");
		int aOk = sc.nextInt();
		if(aOk!=1){
			while(true){
				System.out.println("Enter RollNo to change");
				int rollTemp = sc.nextInt();
				if(rollTemp<0){
					for(int i=0;i<stu.length;i++){
						if(stu[i]!=null && stu[i].present==0){
							System.out.print(stu[i].rollNo+",");
						}
					}
					break;
				}
				System.out.println("Enter 1 for present and 0 for absent");
				int presentTemp = sc.nextInt();

				stu[rollTemp-101].present = presentTemp;
			}
		}
	}
}