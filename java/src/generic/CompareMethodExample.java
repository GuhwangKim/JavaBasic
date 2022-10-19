package generic;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		// 제네릭 타입 안에 변수를 대입 
		
		boolean result = Util2.compare(p1, p2);
		// 제네릭 메소드 호출 (구체적인 타입은 추정)
		if(result) {
			System.out.println("논리적으로 동등한 객체입니다");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
	}

}
