import java.util.*;
import java.io.*;
class DStudent{
	String batchNo;
	String name;
	String enrollmentNumber;
	int marks;

	public DStudent(String batchNo,String name,String enrollmentNumber,int marks){
		this.batchNo=batchNo;
		this.name=name;
		this.enrollmentNumber=enrollmentNumber;
		this.marks=marks;
	}
}
public class Unit3MarkCollection{
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new FileReader("unit3marks.csv"));

			ArrayList<DStudent> students = new ArrayList<DStudent>();

			while(br.ready()){
				String temp = br.readLine();
				String[] data = temp.split(",");
				students.add(new DStudent(data[0],data[2],data[1],Integer.parseInt(data[3])));
			}

			Collections.sort(students, new NameComparator());

			Iterator<DStudent> itr = students.iterator();

			while(itr.hasNext()){
				DStudent temp = itr.next();
				System.out.println(temp.name +"("+temp.enrollmentNumber+")" +" got "+temp.marks);	
			
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}


class MarkComparator implements Comparator<DStudent>{

	public int compare(DStudent stu1, DStudent stu2){
		if(stu1.marks==stu2.marks){
			return 0;
		}
		else if(stu1.marks<stu2.marks){
			return 1;
		}
		else{
			return -1;
		}
	}
}

class NameComparator implements Comparator<DStudent>{
	public int compare(DStudent stu1, DStudent stu2){
		return stu1.name.compareTo(stu2.name);
	}
}