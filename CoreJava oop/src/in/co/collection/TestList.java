package in.co.collection;


import java.util.ArrayList;
import java.util.List;

public class TestList {
	
	public static void main(String[] args) {
		 
		List l1 = new ArrayList();
			
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(5);
		l1.add(null);
		l1.add(null);
		l1.add(15);
		l1.add(10);
		
		System.out.println(l1);
		
		List l2=new ArrayList();
		
		l2.add("kapil");
		l2.add("dipak");
		l2.add("jatin");
		
		
		l2.add(1, "kapil");
		System.out.println(l2);
		
		System.out.println(l2.get(2));
		
	l1.remove(1);
	System.out.println(l1);
		
		l2.set(1, "patidar");
		System.out.println(l2);
		
		
		System.out.println(l2.indexOf("jatin"));
		
		System.out.println(l1.lastIndexOf(7));
		
		
		System.out.println(l2.subList(1, 3));
		
		
		
		}
		
		
	}
	
	


