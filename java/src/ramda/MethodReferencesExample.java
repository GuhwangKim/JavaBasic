package ramda;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
	public static void main(String[] args) {
		IntBinaryOperator binaryOperator;
		
		binaryOperator = Calculator :: staticMethod;
		// 정적 메소드 
		// 매개변수와 리턴 타입 작성 간편해짐 
		System.out.println("결과 1: " + binaryOperator.applyAsInt(1, 2));
		
		
		Calculator obj = new Calculator();
		// 인스턴스 메소드는 static 이 안 붙었으므로 객체를 생성해주고 불러낼 수 있다. 
		binaryOperator = obj :: instanceMethod;
		System.out.println("결과 2 : " + binaryOperator.applyAsInt(2, 2));
		
	
	}

}
