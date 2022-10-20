package ramda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("��ȣ", 46, 45),
			new Student("����", 78, 66)
			);
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum =0;
		for(Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum+=student.getEng();
			} 
		}
		return (double)sum/count;
	}
	public static void main(String[] args) {
		double mavg = avg(t->t.getName().equals("��ȣ"));
		System.out.println("��ȣ ���� ���� " +mavg);
	}

}
