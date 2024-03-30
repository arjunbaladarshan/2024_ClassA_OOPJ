import java.util.Date;
public class ConditionStatement{
	public static void main(String[] args) {
		Date d = new Date();

		int year = d.getYear()+1900;
		int month = d.getMonth()+1;
		int date = d.getDate();

		String fileName = "A_"+year+"_"+month+"_"+date+".txt";

		System.out.println(fileName);
	}
}