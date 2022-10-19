package generic;

public class Util {
	public static <T> Box<T> boxing(T t) {
		// <> 리턴타입 매개타입 => 타입 파라미터 
		Box<T> box= new Box<T>();
		box.setT(t);
		
		return box;
	}
}
