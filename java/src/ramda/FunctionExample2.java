package ramda;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2  {
	private static List<Student> list = Arrays.asList(
			new Student("지호", 46, 45),
			new Student("지연", 78, 66)
			);
	// function 객체의 메소드
	public static double avg(ToIntFunction<Student> function) {
		int sum=0;
		for(Student student : list) {
			sum+=function.applyAsInt(student);
			// 람다식 실행 
		}
		double avg = (double)sum/list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double englishavg=avg(s->s.getEng());
		// Function을 구현함 s = Student 객체 return 값은 int
		System.out.println("영어평균 : "+englishavg);
		
		double mathavg=avg(s->s.getMat());
		System.out.println("수학평균 : "+mathavg);
		
		
	}
}
