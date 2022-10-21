package ramda;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferenceExample {
	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;
		
		function = String :: compareToIgnoreCase;
		// String의 인스턴스 메소드 compareToIgnoreCase
		// String은 람다식에서 제공되는 매개변수의 멤버가 됨 
		print(function.applyAsInt("지호", "지호"));
	}

	private static void print(int x) {
		if(x==0) {
			System.out.println("동일한 문자입니다");
		} else {
			System.out.println("사전 순에 먼저 옵니다");
		}
		
	}

}
