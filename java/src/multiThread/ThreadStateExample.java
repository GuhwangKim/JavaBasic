package multiThread;

public class ThreadStateExample {
	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		// ŸŶ �Ǵ� �����带 state�����忡 ����ְ� �� �����带 ȣ��
		statePrintThread.start();
	}
}
