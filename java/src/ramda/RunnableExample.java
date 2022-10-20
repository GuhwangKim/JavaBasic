package ramda;

public class RunnableExample {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
			// run()이라는 하나의 추상 메소드만 존재하므로 구현 함 
		};
		
		Thread thread = new Thread(runnable);
		// 스레드 실행 방법 (Runnable로 작업 스레드 만들기)
		// Thread 객체 형성 후에 작업 스레드 대입 
		thread.start();
	}
}
