package ramda;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxExample {
	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		binaryOperator=BinaryOperator.minBy((f1,f2)->Integer.compare(f1.getPrice(), f2.getPrice()));
		// binaryOperator를 정적 메소드로 정의함 
		// Binary의 인터페이스에 타입이 Fruit 객체로 지정되어 있음
		// minBy의 매개값도 Fruit 객체 여기서는 (f1, f2)
		// minBy이기 때문에 두 값을 비교해야하고 
		// 리턴값은 int 형이기 때문에 Integer를 앞에 붙이고 (리턴 값의 타입) 
		// minBy의 특징인 Comparator 인터페이스를 구현식을 작성함 
		fruit = binaryOperator.apply(new Fruit("딸기", 7000), new Fruit("수박", 1000));
		// 함수적 인터페이스를 실행시팀  -> 여기선 정적메소드가 실행됨
		// Operator의 특징상 연산 수행한 후 매개값과 동일한 타입으로 리턴값 제공 
		System.out.println(fruit.getName());
	
	}
}
