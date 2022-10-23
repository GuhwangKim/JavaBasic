package collectionFramework;

import java.util.Iterator;
import java.util.TreeSet;


public class ComporatorExample {
	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComporator());
		// 내림차순 정렬자 제공
		treeSet.add(new Fruit("포도", 10000));
		treeSet.add(new Fruit("딸기", 200));
		Iterator<Fruit> iteratorv = treeSet.iterator();
		while (iteratorv.hasNext()) {
			Fruit fruit = iteratorv.next();
			System.out.println(fruit.getName() + " : "+ fruit.getPrice());
			
		}
	}

}
