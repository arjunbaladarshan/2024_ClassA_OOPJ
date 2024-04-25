import java.util.*;
import java.io.*;
public class Lab11_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();

		File f = new File(fileName);
		if(f.exists()){
			if(f.isFile()){
				System.out.println("File size = "+f.length());
			}
			else{
				System.out.println("Folder :");
				String[] fileNames = f.list();
				for(int i=0;i<fileNames.length;i++){
					System.out.println(fileNames[i]);
				}
			}
		}
	}
}