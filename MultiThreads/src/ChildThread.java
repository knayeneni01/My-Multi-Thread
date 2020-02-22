
public class ChildThread extends Thread{
	
	public void run()
	{
		System.out.println("Child Thread value is "+ParentThread.tl.get());
	}
	
	public static void main(String[] args)
	{
		ParentThread pt = new ParentThread();
		pt.start();
	}
}
