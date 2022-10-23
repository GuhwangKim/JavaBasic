package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("�ÿ�");
		set.add("��ȣ");
		set.add("�쿵");

		int size = set.size();
		System.out.println("�Ѱ��� : " + size);

		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("�쿵");
		size = set.size();
		System.out.println("�Ѱ��� : " + size);

		iterator = set.iterator();

		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
	}

}
