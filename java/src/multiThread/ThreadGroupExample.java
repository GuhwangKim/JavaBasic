package multiThread;

public class ThreadGroupExample {
	public static void main(String[] args) {
		ThreadGroup myGroup=new ThreadGroup("myGroup");
		// 그룹 스레드를 호출하고 
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		// 2개의 스레드를 포함 시킴 
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[main 스레드 그룹의 list() 메소드 출력내용]");
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
