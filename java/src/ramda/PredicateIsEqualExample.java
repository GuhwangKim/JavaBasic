package ramda;

import java.util.function.Predicate;

public class PredicateIsEqualExample {
	public static void main(String[] args) {
		Predicate<String> predicate;
		
		predicate =Predicate.isEqual("����");
		System.out.println("����"+predicate.test("��ȣ"));
	}
	

}
