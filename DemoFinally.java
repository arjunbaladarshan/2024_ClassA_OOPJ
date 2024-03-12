import java.io.*;
import java.util.*;
public class DemoFinally{
	public static void main(String[] args) {
		PrintStream ps=null;
		try{
			ps = new PrintStream(new File("abclasdflasdf.txt"));
			Scanner sc = new Scanner(System.in);
			int temp = sc.nextInt();
			for(int i=0;i<temp;i++){
				ps.println("Hello world from java "+i);	
			}
			
		}catch(FileNotFoundException fne){
			
			fne.printStackTrace();
		}
		finally{
			System.out.println("Closing the file");
			ps.close();	
		}
		
	}
}