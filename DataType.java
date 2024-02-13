public class DataType{
	public static void main(String[] args) {
		String msg = "Mjqqt%\twqi";
		for(int i=0;i<msg.length();i++){
			int ch = msg.charAt(i);
			ch=ch-5;
			System.out.print((char)ch);	
		}
		
	}
}