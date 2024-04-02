import java.util.*;
import java.io.*;
class Point{
	int x;
	int y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}

	public double distance(Point temp){
		return Math.sqrt(Math.pow(x-temp.x,2)+Math.pow(y-temp.y,2));
	}
}
public class DemoCollection{
	public static void main(String[] args) {
		
		ArrayList<Point> listOfPoints = new ArrayList<Point>();
		try{
		BufferedReader br = new BufferedReader(new FileReader("myPoints.txt"));

		while(br.ready()){
			String temp  = br.readLine();
			String[] splitedData = temp.split(",");
			int x = Interger.parseInt(splitedData[0]);
			int y = Interger.parseInt(splitedData[1]);
			Point tempPoint = new Point(x,y);
			listOfPoints.add(tempPoint);
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		//Generics
	}
}