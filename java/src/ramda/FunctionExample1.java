package ramda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample1 {
	// ���� ������� 
	private static List<Student> list = Arrays.asList(
			new Student("��ȣ", 46, 45)
			);
	// function�� ������Ŵ 
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.println(function.apply(student)+" ");
			// ���ٽ� ���� 
		}
	}
	// ���� 
	public static void main(String[] args) {
		System.out.println("�л��̸�");
		printString(t->t.getName());
		// printString �̶�� �޼ҵ��� �Ű������� Function �������̽� �̱� ������ T�� ��ü�� ���� �� 
		// �޼ҵ� ȣ�� 
	}
}
