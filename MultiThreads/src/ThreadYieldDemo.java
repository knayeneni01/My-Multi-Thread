
public class ThreadYieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread myt = new MyThread();
		myt.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}
		
		

	}

}
