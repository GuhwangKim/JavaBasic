package multiThread;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Runnable beepTask=new BeepTask();
		Thread thread = new Thread(beepTask); 
		// Runnable ���� ��ü�� �Ű������� Thread�� ���� 
		thread.start(); 
		// �� �������� �۾������尡 ����� 
		
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
