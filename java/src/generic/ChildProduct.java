package generic;

public class ChildProduct<T, M , C> extends Parent<T, M>{

	private C company;
	
	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}

	public ChildProduct(T t, M m, C company) {
		super(t, m);
		this.company = company;
	}

	
}
