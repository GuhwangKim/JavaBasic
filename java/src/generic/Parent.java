package generic;

public class Parent<T,M> {
	private T t;
	private M m;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public M getM() {
		return m;
	}
	public void setM(M m) {
		this.m = m;
	}
	
	public Parent(T t, M m) {
		this.t = t;
		this.m = m;
	}
	

}
