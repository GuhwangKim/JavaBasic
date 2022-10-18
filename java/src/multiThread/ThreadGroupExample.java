package multiThread;

public class ThreadGroupExample {
	public static void main(String[] args) {
		ThreadGroup myGroup=new ThreadGroup("myGroup");
		// �׷� �����带 ȣ���ϰ� 
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		// 2���� �����带 ���� ��Ŵ 
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[main ������ �׷��� list() �޼ҵ� ��³���]");
		ThreadGroup mainGroup=Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		myGroup.interrupt();
	}

}
