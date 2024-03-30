import java.util.Date;
class CountStudent extends Thread{
	int i;
	public CountStudent(int i){
		this.i = i;
	}
	public void run(){
		for(long i=0;i<10000000000l;i++){
			// code here
		}
		System.out.println("Loop "+i+" Completed");
	}
}
public class DemoWhatWhen{
	public static void main(String[] args) {

		long dStart = new Date().getTime();
		CountStudent cs1 = new CountStudent(1);
		cs1.start();

		CountStudent cs2 = new CountStudent(2);
		cs2.start();

		CountStudent cs3 = new CountStudent(3);
		cs3.start();

		try{
			cs1.join();
			cs2.join();
			cs3.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Program Completed");
		long dEnd = new Date().getTime();

		System.out.println("Total Time taken = "+(dEnd-dStart) +" ms");
	}
}