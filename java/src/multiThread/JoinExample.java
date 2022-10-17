package multiThread;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread=new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
			// sumThread의 실행이 종료될 때까지 main의 실행이 정지됨 
		} catch (Exception e) {
		}
		System.out.println("1~100까지의 합 : "+sumThread.getSum());
	}

}
