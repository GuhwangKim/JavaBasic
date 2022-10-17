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
		// yield 가 작동되면서 ThreadB만 실행됨 
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		threadA.work=true;
		// 둘다 실행됨 
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		threadA.stop=true;
		threadB.stop=true;
	}
}
