package ramda;

import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer=t->System.out.println(t+"8");
		// 인터페이스 구체적 실현 방법 정해줌 
		consumer.accept("java");
		// 실행 
		
		ObjIntConsumer<String> objIntConsumer = (t,i)->{
			System.out.println(t+i);
			// 객체 T와 int를 소비 
		};
		objIntConsumer.accept("java", 9);
		
	}

}
