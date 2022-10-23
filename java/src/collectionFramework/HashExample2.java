package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("±èÁöÈ£", 31));
		set.add(new Member("±èÁöÈ£", 31));
		
		System.out.println("ÃÑ°³¼ö : "+set.size());
		
		
	}
}
