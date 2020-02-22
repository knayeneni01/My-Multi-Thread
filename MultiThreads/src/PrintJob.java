import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintJob implements Runnable{
	
	String name;
	
	PrintJob(String name)
	{
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(name);
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(name+" job completed by Thread: "+Thread.currentThread().getName());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintJob pj = new PrintJob("PJ");
		PrintJob[] jobs = new PrintJob[5]; 
		//jobs[] = {"jjg","gg","fgf","gfg","h"};
		
		PrintJob[] job = {new PrintJob("Durga"), new PrintJob("Ravi"), new PrintJob("Prakash"), new PrintJob("Kumar"),
				new PrintJob("Gaurav")};
				
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(PrintJob jb: job)
		{
			service.submit(jb);
		}
		service.shutdown();
		}
	}


