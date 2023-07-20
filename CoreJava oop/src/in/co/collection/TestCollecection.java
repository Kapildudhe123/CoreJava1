package in.co.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollecection {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();
	
		c1.add(1);
		c1.add("kapil");
        c1.add(2);
        c1.add(3);
		
		 
		// System.out.println(c1);

		Collection c2 = new ArrayList();

		c2.add(2);
		c2.add(3);

		// System.out.println(c2);

	//	c1.addAll(c2);

		// System.out.println(c1);

//		 c1.clear();
//		 System.out.println(c1+"c1 is clear");
		
		// System.out.println(c1);

//		System.out.println(c1.contains(1));
      	System.out.println(c1.containsAll(c2));
//		System.out.println(c1);
		
		 
		// System.out.println(c1.isEmpty());
		 
		  c1.remove("kapil");
		 System.out.println(c1);
		 
		 
//		c1.removeAll(c1);
//		System.out.println(c1);
		
		 
		 c1.retainAll(c2);
		 System.out.println(c1);
//		
		
		
	//	System.out.println(c1.size());

	}

}
