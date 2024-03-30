public class DemoThreadPriority{
	public static void main(String[] args) {
		
		TryPriority2 tp2 = new TryPriority2();
		tp2.setPriority(10);
		tp2.start();


		TryPriority1 tp1 = new TryPriority1();
		tp1.setPriority(1);
		tp1.start();

	}
}

class TryPriority1 extends Thread{
	public void run(){
		int i = 0;
		while(true){
			i++;
			System.out.println("TryPriority1 ="+i);
		}
	}
}

class TryPriority2 extends Thread{
	public void run(){
		int i = 0;
		while(true){
			i++;
			System.out.println("TryPriority2 ="+i);
		}
	}
}