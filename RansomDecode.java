import java.io.*;
public class RansomFile{
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("CEAVB-ransom.bala");
			FileOutputStream fos = new FileOutputStream("CEAVB-ransom.bala");
			int temp = fis.read();
			
			while(temp>-1){
				fos.write(temp/2);
				temp = fis.read();				
			}

			fos.close();
			fis.close();

			System.out.println("New file created");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}