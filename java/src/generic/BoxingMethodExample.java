package generic;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1=Util.<Integer>boxing(100);
		// Ÿ�� �Ķ������ ��ü���� Ÿ���� ��������� ���� 
		int intValue = box1.getT();
		
		Box<String> box2=Util.boxing("ȫ�浿");
		// �Ű����� ���� ��ü�� Ÿ���� ���� 
	}
}
