package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("택연");
		set.add("준호");
		set.add("우영");

		int size = set.size();
		System.out.println("총개수 : " + size);

		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("우영");
		size = set.size();
		System.out.println("총개수 : " + size);

		iterator = set.iterator();

		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
	}

}
