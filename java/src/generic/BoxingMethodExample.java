package generic;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1=Util.<Integer>boxing(100);
		// 타입 파라미터의 구체적인 타입을 명시적으로 지정 
		int intValue = box1.getT();
		
		Box<String> box2=Util.boxing("홍길동");
		// 매개값을 보고 구체적 타입을 추정 
	}
}
