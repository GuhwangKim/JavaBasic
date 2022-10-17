package multiThread;

public class WorkObject {

	public synchronized void methodA() {
		System.out.println("ThreadAA�� methodA() �۾����� ");
		notify();
		// �Ͻ� ���� �־��� ThreadBB�� ������ ���·� ���� 
		try {
			wait();
			// ThreadAA ������ �Ͻ����� ���·� ����
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadBB�� mehtodB() �۾�����");
		notify();
		// �Ͻ� ���� �־��� ThreadAA�� ������ ���·� ���� 
		try {
			wait();
			// ThreadBB ������ �Ͻ����� ���·� ����
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
