package generic;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		// T 타입으로 생성된 객체를 받아서 구체화 시킴 
		box1.setT("hello");
		String str = box1.getT();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(6);
		int value = box2.getT();
	}
}
