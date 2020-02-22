
public class ThreadGroupDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadGroup pg = new ThreadGroup("ParentGroup");
		ThreadGroup cg = new ThreadGroup(pg,"ChildGroup");
		
		MyThreadDemo mt1 = new MyThreadDemo(pg,"ChildThread1");
		MyThreadDemo mt2 = new MyThreadDemo(pg,"ChildThread2");
		
		mt1.start();
		mt2.start();
		
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		
		Thread.sleep(10000);
		
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();

	}

}
