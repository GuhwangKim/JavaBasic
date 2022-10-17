package multiThread;

public class ThreadStateExample {
	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		// 타킷 되는 스레드를 state스레드에 집어넣고 그 스레드를 호출
		statePrintThread.start();
	}
}
