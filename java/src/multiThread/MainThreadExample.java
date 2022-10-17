package multiThread;

public class MainThreadExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		User1 user1= new User1(); 
		// 스레드 생성 
		user1.setCalculator(calculator);
		// 공유객체 설정 
		user1.start();
		// user1의 스레드 시작 
		
		User2 user2= new User2(); 
		// 스레드 생성 
		user2.setCalculator(calculator);
		// 공유객체 설정 
		user2.start();
		// user2의 스레드 시작 
	}
}
