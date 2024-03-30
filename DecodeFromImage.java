import java.io.*;
public class DecodeFromImage{
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("CEAVB-Generated.jpg");
			fis.skip(5228);

			int length = fis.read();

			for(int i=0;i<length;i++){
				int temp = fis.read();
				System.out.print((char)temp);	
			}

			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}