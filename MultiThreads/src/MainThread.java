
public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyRunnableThread myThread = new MyRunnableThread();
		Thread t1=new Thread(myThread);
		t1.start();
		//myThread.run();
		System.out.println(t1.getName());
		System.out.println(t1.currentThread().getPriority());
		t1.currentThread().setPriority(7);
		System.out.println(t1.currentThread().getPriority());
		
		Thread t2 = new Thread();
		t2.start();
		System.out.println(t2.getName());
		
		for(int i =0; i<5; i++)
		{
			System.out.println("run main thread "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
		}
		System.out.println(t1.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Durga");
		System.out.println(Thread.currentThread().getName());

	}

}
