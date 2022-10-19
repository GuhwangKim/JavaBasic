package generic;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product = new Product<Tv, String>();
		product.setKind(new Tv());
	}

}
