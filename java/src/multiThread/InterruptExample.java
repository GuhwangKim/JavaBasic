package multiThread;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread= new PrintThread2();
		thread.start();
		// PrintThread2�� ������ �ǰ� 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		thread.interrupt();
		// PrintThread2�� �Ͻ� ���� ���°� ������ ���ܰ� �߻��ϸ鼭 �����带 �����Ŵ 
	}

}
