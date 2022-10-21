package ramda;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
	public static void main(String[] args) {
		IntBinaryOperator binaryOperator;
		
		binaryOperator = Calculator :: staticMethod;
		// ���� �޼ҵ� 
		// �Ű������� ���� Ÿ�� �ۼ� �������� 
		System.out.println("��� 1: " + binaryOperator.applyAsInt(1, 2));
		
		
		Calculator obj = new Calculator();
		// �ν��Ͻ� �޼ҵ�� static �� �� �پ����Ƿ� ��ü�� �������ְ� �ҷ��� �� �ִ�. 
		binaryOperator = obj :: instanceMethod;
		System.out.println("��� 2 : " + binaryOperator.applyAsInt(2, 2));
		
	
	}

}
