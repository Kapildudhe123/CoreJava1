package in.co.collection;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	
	
	public static void main(String[] args) {
		
		
		Set s=new HashSet();
		
		
		
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("one");
		s.add(10);
		s.add("two");
		s.add(null);
		
		System.out.println(s);
		
		System.out.println(s.contains("on"));
		
		s.remove("two");
		System.out.println(s);
		
		s.removeAll(s);
		System.out.println(s);
		
		s.clear();
		System.out.println(s);
		
		s.containsAll(s);
		System.out.println(s);
		
		System.out.println(s.getClass());
		
		System.out.println(s.isEmpty());
		
		s.size();
		
		System.out.println();
		
		
		
		
	}

}
