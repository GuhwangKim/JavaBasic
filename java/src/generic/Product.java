package generic;

public class Product<T,M> {
	// T�� M�� ������ �����ΰ� Object ��ü�� ��¡
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
