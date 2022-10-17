package multiThread;

public class DataBox {

	private String data;

	public synchronized String getData() {
		if (this.data == null) {
			try {
				wait();
				// data �ʵ尡 null �� ��� �Һ��� �����带 �Ͻ� ������
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		String returnValue = data;
		System.out.println("ConsumerThread�� ���� ������ : " + returnValue);
		data = null;
		notify();
		// ������ �����带 ���� ��� ���·� ����
		return returnValue;

	}
	
	public synchronized void setData(String data) {
		if (this.data != null) {
			try {
				wait();
				// data �ʵ尡 null �� ��� ������ �����带 �Ͻ� ������
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		this.data = data;
		System.out.println("ProducerThread�� ������ ������ : " + data);
		notify();
		// �Һ��� �����带 ���� ��� ���·� ����

	}
}
