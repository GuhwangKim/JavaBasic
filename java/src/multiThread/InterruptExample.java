package multiThread;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread= new PrintThread2();
		thread.start();
		// PrintThread2가 실행이 되고 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		thread.interrupt();
		// PrintThread2에 일시 정지 상태가 있으면 예외가 발생하면서 스레드를 종료시킴 
	}

}
