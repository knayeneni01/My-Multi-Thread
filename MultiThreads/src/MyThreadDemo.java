
public class MyThreadDemo extends Thread{
	
	MyThreadDemo(ThreadGroup g, String name)
	{
		super(g,name);
	}
	
	public void run()
	{
		System.out.println("Child Thread");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
