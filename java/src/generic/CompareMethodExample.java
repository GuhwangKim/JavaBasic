package generic;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "���");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "���");
		// ���׸� Ÿ�� �ȿ� ������ ���� 
		
		boolean result = Util2.compare(p1, p2);
		// ���׸� �޼ҵ� ȣ�� (��ü���� Ÿ���� ����)
		if(result) {
			System.out.println("�������� ������ ��ü�Դϴ�");
		} else {
			System.out.println("�������� �������� ���� ��ü�Դϴ�.");
		}
		
	}

}
