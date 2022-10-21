package ramda;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferenceExample {
	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;
		
		function = String :: compareToIgnoreCase;
		// String�� �ν��Ͻ� �޼ҵ� compareToIgnoreCase
		// String�� ���ٽĿ��� �����Ǵ� �Ű������� ����� �� 
		print(function.applyAsInt("��ȣ", "��ȣ"));
	}

	private static void print(int x) {
		if(x==0) {
			System.out.println("������ �����Դϴ�");
		} else {
			System.out.println("���� ���� ���� �ɴϴ�");
		}
		
	}

}
