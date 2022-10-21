package ramda;

import java.util.function.Predicate;

public class PredicateIsEqualExample {
	public static void main(String[] args) {
		Predicate<String> predicate;
		
		predicate =Predicate.isEqual("지연");
		System.out.println("지연"+predicate.test("지호"));
	}
	

}
