
public class Display {

	public synchronized void Wish(String name) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.print("Good morning ");
			
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}
				System.out.println(name);
		}
		
		

	}

}
