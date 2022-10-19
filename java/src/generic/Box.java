package generic;

public class Box<T> {
	private T t;
	// T는 Box 클래스로 객체를 생성할 때 구체적인 타입으로 변경됨 
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}
