import java.io.File;
import java.util.Date;
public class FileDemo{
	public static void main(String[] args) {
		File myFile = new File("D:\\Darshan University");
		String[] allFiles = myFile.list();

		for(int i=0;i<allFiles.length;i++){
			File tmp = new File(myFile,allFiles[i]);

			tmp.delete();
		}
	}
}