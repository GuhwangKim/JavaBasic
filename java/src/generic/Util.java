package generic;

public class Util {
	public static <T> Box<T> boxing(T t) {
		// <> ����Ÿ�� �Ű�Ÿ�� => Ÿ�� �Ķ���� 
		Box<T> box= new Box<T>();
		box.setT(t);
		
		return box;
	}
}
