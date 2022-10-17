package multiThread;

public class StatePrintThread extends Thread{
	private Thread targetThread;
	public StatePrintThread(Thread targetThread) {
		// 상태를 조사할 스레드 
		this.targetThread = targetThread;
	}
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("타켓 스레드 상태 : "+state);
			if(state==Thread.State.NEW) {
				// 객체 생성 상태인 경우 
				targetThread.start();
				// 실행 대기 상태로 바꿈 
			}
			if(state==Thread.State.TERMINATED) {
				// 종료 상태인 경우 while문 종료 
				break;
			}
			try {
				Thread.sleep(500);
				// 0.5초간 정지 
			} catch (Exception e) {
			}
		}
	}

}
