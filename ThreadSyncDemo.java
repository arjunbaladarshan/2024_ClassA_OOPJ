class Table{
	synchronized public void printTable(int n){
		for(int i=1;i<=10;i++){
			System.out.println(n+" X "+i+" = "+(n*i));

			try{
				Thread.sleep(200);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

class Thread1 extends Thread{
	Table t;
	public Thread1(Table t){
		this.t = t;
	}
	public void run(){
		//code
		for(int i=0;i<10;i++){
			System.out.println("Thread 1 "+i);
			try{
				sleep(100);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		t.printTable(5);
	}
}
class Thread2 extends Thread{
	Table t;
	public Thread2(Table t){
		this.t = t;
	}
	public void run(){
		//other code
		for(int i=0;i<10;i++){
			System.out.println("Thread 2 "+i);
			try{
				sleep(100);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		t.printTable(12);
	}
}

public class ThreadSyncDemo{
	public static void main(String[] args) {
		Table t = new Table();
		Thread1 t1 = new Thread1(t);
		t1.start();

		Thread2 t2 = new Thread2(t);
		t2.start();

	}
}