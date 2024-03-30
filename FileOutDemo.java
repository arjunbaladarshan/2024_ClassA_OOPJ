import java.io.*;
public class FileOutDemo{
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("CEAVB.jpg");
			FileOutputStream fos = new FileOutputStream("CEAVB-Generated.jpg");
			int temp = fis.read();
			int counter = 0;

			String secretMsg = "kale bunk marvano che";
			byte[] byteArray = secretMsg.getBytes();

			while(temp>-1){
				counter++;

				if(counter>=5230 && counter<(5230+byteArray.length)){
					fos.write(byteArray[counter-5230]);
				}
				else{
					fos.write(temp);
					temp = fis.read();	
				}

				
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