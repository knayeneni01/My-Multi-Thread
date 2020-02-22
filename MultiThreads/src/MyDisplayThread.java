
public class MyDisplayThread extends Thread {
	
	Display d;
	String name;
	
	MyDisplayThread(Display d, String name)
	{
		this.d = d;
		this.name = name;
	}
	
	public void run()
	{
		d.Wish(name);
	}

}
