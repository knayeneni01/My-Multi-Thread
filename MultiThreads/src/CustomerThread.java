
public class CustomerThread extends Thread {
	
	static Integer custID = 1;
	
	private static ThreadLocal t1 = new ThreadLocal()
			{
				protected Integer initialValue()
				{
					return custID;
				}
				
			};
	
			CustomerThread(String name)
			{
				super(name);
			}
			
			public void run()
			{
				System.out.println(Thread.currentThread().getName()+" execute Current Thread Name"+t1.get());
			}
			
			public static void main(String[] args)
			{
				CustomerThread c1 = new CustomerThread("Current Thread -1 ");
				//System.out.println(c1);
				CustomerThread c2 = new CustomerThread("Current Thread -2 ");
				//System.out.println(c2);
				CustomerThread c3 = new CustomerThread("Current Thread -3 ");
				//System.out.println(c3);
				CustomerThread c4 = new CustomerThread("Current Thread -4 ");
				//System.out.println(c4);
				c1.start();
				c2.start();
				c3.start();
				c4.start();
			}
}
