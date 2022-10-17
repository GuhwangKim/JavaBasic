package multiThread;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		ThreadAA threadAA = new ThreadAA(workObject);
		ThreadBB threadBB = new ThreadBB(workObject);
		
		threadAA.start();
		threadBB.start();
	}

}
