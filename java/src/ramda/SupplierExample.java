package ramda;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier intSupplier = ()->{
			// 매개변수 없으므로 () 
			int num = (int)(Math.random()*6)+1;
			return num;
			
		};
		int num = intSupplier.getAsInt();
		System.out.println(num);
	}
	
}
