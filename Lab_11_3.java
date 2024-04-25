import java.util.*;
import java.io.*;
public class Lab_11_3{
	public static void main(String[] args) {
		Lab_11_Thread l11t = new Lab_11_Thread();
		l11t.start();

		for(int i=0;i<10000;i++){
			System.out.println("My Main Thread Also Running");
		}
	}
}

class Lab_11_Thread extends Thread{
	public void run(){
		try{
			FileInputStream fis = new FileInputStream("CEAVB-Generated.jpg");
			int temp = fis.read();
			while(temp>=0){
				System.out.println(temp);
				temp = fis.read();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}