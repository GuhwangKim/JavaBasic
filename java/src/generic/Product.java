package generic;

public class Product<T,M> {
	// T와 M은 임이의 변수인것 Object 객체를 상징
	private T kind;
	private M model;
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
}
