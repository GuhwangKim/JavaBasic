package ramda;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar=40;
		// 매개변수 (arg)와 로컬변수 는 final 
		// 람다식
		MyFunctionInterface fi = ()->{
			System.out.println(arg);
			System.out.println(localVar);
		};
		fi.method();
	}
}
