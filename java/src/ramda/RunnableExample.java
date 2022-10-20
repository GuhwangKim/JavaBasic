package ramda;

public class RunnableExample {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
			// run()�̶�� �ϳ��� �߻� �޼ҵ常 �����ϹǷ� ���� �� 
		};
		
		Thread thread = new Thread(runnable);
		// ������ ���� ��� (Runnable�� �۾� ������ �����)
		// Thread ��ü ���� �Ŀ� �۾� ������ ���� 
		thread.start();
	}
}
