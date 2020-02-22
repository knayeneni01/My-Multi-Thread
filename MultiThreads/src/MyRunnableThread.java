
public class MyRunnableThread implements Runnable {
	
	public void run()
	{
		for(int i =0; i<5;i++)
		{
			System.out.println("run child thread "+Thread.currentThread().getName());
		} 
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}

}
