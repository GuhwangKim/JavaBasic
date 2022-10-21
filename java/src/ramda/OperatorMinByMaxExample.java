package ramda;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxExample {
	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		binaryOperator=BinaryOperator.minBy((f1,f2)->Integer.compare(f1.getPrice(), f2.getPrice()));
		// binaryOperator�� ���� �޼ҵ�� ������ 
		// Binary�� �������̽��� Ÿ���� Fruit ��ü�� �����Ǿ� ����
		// minBy�� �Ű����� Fruit ��ü ���⼭�� (f1, f2)
		// minBy�̱� ������ �� ���� ���ؾ��ϰ� 
		// ���ϰ��� int ���̱� ������ Integer�� �տ� ���̰� (���� ���� Ÿ��) 
		// minBy�� Ư¡�� Comparator �������̽��� �������� �ۼ��� 
		fruit = binaryOperator.apply(new Fruit("����", 7000), new Fruit("����", 1000));
		// �Լ��� �������̽��� �������  -> ���⼱ �����޼ҵ尡 �����
		// Operator�� Ư¡�� ���� ������ �� �Ű����� ������ Ÿ������ ���ϰ� ���� 
		System.out.println(fruit.getName());
	
	}
}
