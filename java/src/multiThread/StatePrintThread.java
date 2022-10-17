package multiThread;

public class StatePrintThread extends Thread{
	private Thread targetThread;
	public StatePrintThread(Thread targetThread) {
		// ���¸� ������ ������ 
		this.targetThread = targetThread;
	}
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ���� : "+state);
			if(state==Thread.State.NEW) {
				// ��ü ���� ������ ��� 
				targetThread.start();
				// ���� ��� ���·� �ٲ� 
			}
			if(state==Thread.State.TERMINATED) {
				// ���� ������ ��� while�� ���� 
				break;
			}
			try {
				Thread.sleep(500);
				// 0.5�ʰ� ���� 
			} catch (Exception e) {
			}
		}
	}

}
