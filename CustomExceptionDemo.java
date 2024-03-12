import java.util.*;
import java.io.*;
class BijoChance extends Exception{
	public BijoChance(String msg){
		super(msg);
	}

	public void saveException(){
		PrintStream ps=null;
		try{
			ps = new PrintStream(new File("mylog.txt"));
			ps.println(new Date().toString()+getMessage());			
		}catch(FileNotFoundException fne){
			
			fne.printStackTrace();
		}
	}
}

public class CustomExceptionDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try{
			try{
				n = sc.nextInt();	
			}
			catch(Exception e){
				throw new BijoChance("Bhai have dhyan rakhaje");
			}
		}catch(BijoChance b){
			sc = new Scanner(System.in);
			n = sc.nextInt();
			b.printStackTrace();
			b.saveException();
			
		}

		System.out.println(n);
		

	}
}