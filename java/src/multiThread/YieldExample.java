package multiThread;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		threadA.work=false; 
		// yield �� �۵��Ǹ鼭 ThreadB�� ����� 
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		threadA.work=true;
		// �Ѵ� ����� 
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		threadA.stop=true;
		threadB.stop=true;
	}
}
