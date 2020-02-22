
public class ThreadPriorityDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnableThread myt = new MyRunnableThread();
		myt.run();
		
		System.out.println(Thread.currentThread().getName()+"  "+Thread.currentThread().getPriority() );
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getName()+"  "+Thread.currentThread().getPriority() );
		
	}

}
