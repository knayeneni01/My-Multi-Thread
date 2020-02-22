
public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display d1 = new Display();
		Display d2 = new Display();
		MyDisplayThread mt1 = new MyDisplayThread(d1, "Dhoni");
		MyDisplayThread mt2 = new MyDisplayThread(d2, "YuvRaj");
		mt1.start();
		mt2.start();
		

	}

}
