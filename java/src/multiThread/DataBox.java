package multiThread;

public class DataBox {

	private String data;

	public synchronized String getData() {
		if (this.data == null) {
			try {
				wait();
				// data 필드가 null 인 경우 소비자 스레드를 일시 정지로
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		String returnValue = data;
		System.out.println("ConsumerThread가 읽은 데이터 : " + returnValue);
		data = null;
		notify();
		// 생산자 스레드를 실행 대기 상태로 만듦
		return returnValue;

	}
	
	public synchronized void setData(String data) {
		if (this.data != null) {
			try {
				wait();
				// data 필드가 null 인 경우 생산자 스레드를 일시 정지로
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터 : " + data);
		notify();
		// 소비자 스레드를 실행 대기 상태로 만듦

	}
}
