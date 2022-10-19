package generic;

public class BoundTypeParameterExample {
	public static void main(String[] args) {
		int result = Util3.compare(10, 20);
		// 자동으로 박싱 됨 
		// compare의 인자로는 숫자형태로
		System.out.println(result);
		// 첫번째 매개값이 작으면 -1 같으면 0 크면 1
	}

}
