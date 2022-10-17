package multiThread;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Runnable beepTask=new BeepTask();
		Thread thread = new Thread(beepTask); 
		// Runnable 구현 객체를 매개값으로 Thread를 생성 
		thread.start(); 
		// 이 시점에서 작업스레드가 실행됨 
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
