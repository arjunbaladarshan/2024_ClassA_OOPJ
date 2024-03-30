public class DemoClock{
	public static void main(String[] args) {
		PrintAnyString pas1 = new PrintAnyString("DrhnClee");
		pas1.start();

		PrintAnyString pas2 = new PrintAnyString("asa olg");
		pas2.start();
	}
}

class PrintAnyString extends Thread {
	String collegeName;
	public PrintAnyString(String msg){
		collegeName = msg;
	}

	public void run(){
		for(int i=0;i<collegeName.length();i++){
			System.out.print(collegeName.charAt(i));
			try{
				sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}

		}
	}
}