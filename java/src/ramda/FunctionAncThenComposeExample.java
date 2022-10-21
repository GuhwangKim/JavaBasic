package ramda;

import java.util.function.Function;

public class FunctionAncThenComposeExample {
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = m -> m.getAddress();
		functionB = a -> a.getCity();
		
		functionAB = functionA.andThen(functionB);
		// functionAB�� ��ü�� ������ ������ 
		// functionA���� ���� ����� ���� �Լ��� �������̽��� �Ű������� �Ѱ��ְ� ��� ���� ���� ���⼱ String 
		// functionAB = functionB�� ���ϰ� �� a.getCity	
		city = functionAB.apply(new Member("����ȣ", new Address("�ѱ�","����")));
		// apply�� ���Ե� member �� ���ǵ� functionA.andThen(functionB);�� ����� 
		System.out.println("���ֵ��� : "+city);
	}
	
	
}
