import java.io.*;
import java.util.*;
class DarshanStudent{
	int rollNo;
	String name;
	String batchNo;
	boolean isPresent;

	public DarshanStudent(int rollNo, String name, String batchNo){
		this.rollNo = rollNo;
		this.name= name;
		this.batchNo = batchNo;
	}
	public DarshanStudent(String temp){
		String[] data = temp.split(",");
		this.rollNo = Integer.parseInt(data[0]);
		this.name = data[1];
		this.batchNo = data[2];
	}
}
public class NewAttendanceDemo{
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			ArrayList<DarshanStudent> studentList = new ArrayList<DarshanStudent>();
			BufferedReader br = new BufferedReader(new FileReader("mystudents.csv"));	

			while(br.ready()){
				String temp = br.readLine();
				studentList.add(new DarshanStudent(temp));
			}

			Iterator<DarshanStudent> itr = studentList.iterator();

			while(itr.hasNext()){
				DarshanStudent temp = itr.next();
				System.out.println("Roll No. "+temp.rollNo);
				int tempPresent = sc.nextInt();
				if(tempPresent>0){
					temp.isPresent = true;
				}
				else{
					temp.isPresent = false;
				}
			}

			itr = studentList.iterator();
			while(itr.hasNext()){
				DarshanStudent temp = itr.next();
				String ans = temp.isPresent?"Presnet":"Absent";
				System.out.println("Roll No. "+temp.rollNo+" is "+ans);
				
			}

		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}