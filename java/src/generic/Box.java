package generic;

public class Box<T> {
	private T t;
	// T�� Box Ŭ������ ��ü�� ������ �� ��ü���� Ÿ������ ����� 
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}
