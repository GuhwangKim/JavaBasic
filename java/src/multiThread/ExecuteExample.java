package multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 10; i++) {
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					ThreadPoolExecutor executor= (ThreadPoolExecutor) executorService;
					// ������ �� ���� �� �۾� ������ �̸� ���
					
				}
			};
		}
		
	}

}
