package in.co.collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class TestItrator {
	
	
	public static void main(String[] args) {
		
		ArrayList c=new ArrayList();
		c.add("kapil");
		c.add("dipak");
		c.add("jatin");
		c.add("dipanshu");
		
		
	
	//	System.out.println(c);
		
	Iterator i=c.iterator();
		
		while(i.hasNext()) {
	//	Object k =i.next();
	System.out.println(i.next());
		}
		
	//	System.out.println(c.remove());
		
	
}
	
		//for each loop
		
		//for(Object o :c) {
//		System.out.println(o);
			
		//for loop
		
//	for (int i = 0; i < c.size(); i++) {		
//		
//			
//			System.out.println(c.get(i));
//			
			
			
		
		
		}
		
	
