import java.io.*;
import java.util.*;
class LabStudent{
	String batchNo;
	String name;
	String enrollmentNumber;
	int marks;
	public LabStudent(String batchNo, String name, String enrollmentNumber, int marks){
		this.batchNo = batchNo;
		this.name = name;
		this.enrollmentNumber = enrollmentNumber;
		this.marks = marks;
	}
}
public class Lab11{
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new FileReader("unit3marks.csv"));
			HashMap<String,LabStudent> students = new HashMap<String,LabStudent>();
			while(br.ready()){
				String temp = br.readLine();
				String[] data = temp.split(",");
				LabStudent tempStu = new LabStudent(data[0],data[2],data[1],Integer.parseInt(data[3]));
				students.put(data[1],tempStu);
			}

			LabStudent temp = students.get("23010101196");
			System.out.println(temp.name + " got "+ temp.marks +" marks");

			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}