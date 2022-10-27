package apiClass;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(2);
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		// �� ��ü�� ���ڷ� ���ؼ� int ���� ������ 
		System.out.println(result);
		
	}
	
	static class Student{
		int sno;
		Student(int sno) {
			this.sno=sno;
		}
	}
	
	static class StudentComparator implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			// compare �޼ҵ� ��Ģ�� ���� 
			return Integer.compare(o1.sno, o2.sno);
			// �� ���� ���ؼ� -1, 0, 1 �� ���ϰ��� ������ �ϰڴ� 
		}
		
	}

}
