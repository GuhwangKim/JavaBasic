package ramda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample1 {
	// 값을 집어넣음 
	private static List<Student> list = Arrays.asList(
			new Student("지호", 46, 45)
			);
	// function을 구현시킴 
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.println(function.apply(student)+" ");
			// 람다식 실행 
		}
	}
	// 실행 
	public static void main(String[] args) {
		System.out.println("학생이름");
		printString(t->t.getName());
		// printString 이라는 메소드의 매개변수는 Function 인터페이스 이기 때문에 T의 객체의 값이 됨 
		// 메소드 호출 
	}
}
