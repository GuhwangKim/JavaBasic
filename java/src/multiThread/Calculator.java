package multiThread;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); // 스레드 2초간 정지 
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
}
