package generic;

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<Tv, String, String>(null, null, null);
		product.setT(new Tv());
		product.setM("tt");
		product.setCompany("LG");
		
		
	}

}
