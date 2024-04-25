class Mobile{
	int stock=500;

	public synchronized void produce(){
		while(stock>1000){
			try{
				wait();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		try{
			notifyAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		stock++;
		System.out.println("Current Stock = "+stock);
	}
	public synchronized void consume(){
		while(stock<1){
			try{
				wait();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		try{
			notifyAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		stock--;
		System.out.println("Current Stock = "+stock);
	}
}
class Producer extends Thread{
	Mobile m;
	public Producer(Mobile m){
		this.m = m;
	}

	public void run(){
		while(true){
			try{
				m.produce();
				//sleep(100);
			}catch(Exception e){

			}
		}
	}
}
class Consumer extends Thread{
	Mobile m;
	public Consumer(Mobile m){
		this.m = m;
	}

	public void run(){
		while(true){
			try{
				m.consume();
				//sleep(100);
			}catch(Exception e){

			}
		}
	}
}
public class ProducerConsumer{
	public static void main(String[] args) {
		Mobile m = new Mobile();
		Producer p = new Producer(m);
		Consumer c = new Consumer(m);

		p.start();
		c.start();
	}
}