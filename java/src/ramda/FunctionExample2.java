package ramda;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2  {
	private static List<Student> list = Arrays.asList(
			new Student("��ȣ", 46, 45),
			new Student("����", 78, 66)
			);
	// function ��ü�� �޼ҵ�
	public static double avg(ToIntFunction<Student> function) {
		int sum=0;
		for(Student student : list) {
			sum+=function.applyAsInt(student);
			// ���ٽ� ���� 
		}
		double avg = (double)sum/list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double englishavg=avg(s->s.getEng());
		// Function�� ������ s = Student ��ü return ���� int
		System.out.println("������� : "+englishavg);
		
		double mathavg=avg(s->s.getMat());
		System.out.println("������� : "+mathavg);
		
		
	}
}
