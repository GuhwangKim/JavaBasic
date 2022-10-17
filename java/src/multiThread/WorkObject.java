package multiThread;

public class WorkObject {

	public synchronized void methodA() {
		System.out.println("ThreadAA의 methodA() 작업실행 ");
		notify();
		// 일시 정지 있었던 ThreadBB를 실행대기 상태로 만듦 
		try {
			wait();
			// ThreadAA 본인은 일시정지 상태로 만듦
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadBB의 mehtodB() 작업실행");
		notify();
		// 일시 정지 있었던 ThreadAA를 실행대기 상태로 만듦 
		try {
			wait();
			// ThreadBB 본인은 일시정지 상태로 만듦
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
