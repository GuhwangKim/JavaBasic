package ramda;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar=40;
		// �Ű����� (arg)�� ���ú��� �� final 
		// ���ٽ�
		MyFunctionInterface fi = ()->{
			System.out.println(arg);
			System.out.println(localVar);
		};
		fi.method();
	}
}
