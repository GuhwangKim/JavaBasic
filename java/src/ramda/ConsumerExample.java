package ramda;

import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer=t->System.out.println(t+"8");
		// �������̽� ��ü�� ���� ��� ������ 
		consumer.accept("java");
		// ���� 
		
		ObjIntConsumer<String> objIntConsumer = (t,i)->{
			System.out.println(t+i);
			// ��ü T�� int�� �Һ� 
		};
		objIntConsumer.accept("java", 9);
		
	}

}
