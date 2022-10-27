package apiClass;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(2);
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		// 두 객체를 비교자로 비교해서 int 값을 리턴함 
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
			// compare 메소드 법칙에 따라 
			return Integer.compare(o1.sno, o2.sno);
			// 두 값을 비교해서 -1, 0, 1 로 리턴값을 나오게 하겠다 
		}
		
	}

}
