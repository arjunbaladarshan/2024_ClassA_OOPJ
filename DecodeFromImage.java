import java.io.*;
public class DecodeFromImage{
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("CEAVB-Generated.jpg");
			fis.skip(5229);

			int temp = fis.read();
			System.out.println((char)temp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}