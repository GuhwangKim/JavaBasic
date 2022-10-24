package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import ramda.Student;

public class IteratorVsStreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("택연", "준호");
		
		Stream<String> stream = list.stream();
		stream.forEach(name->System.out.println(name));
		
		
		List<Student> list1 = Arrays.asList(new Student("택연", 22, 44));
		
		Stream<Student> stream1=list1.stream();
		stream1.forEach(s->{
			String str = s.getName();
			int score = s.getEng();
			System.out.println(str + " : "+score);
		});
		
		
	}

}
