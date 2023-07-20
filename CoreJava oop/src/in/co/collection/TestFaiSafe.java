package in.co.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestFaiSafe {
	
	public static void main(String[] args) {
		
		Vector v =new Vector();
		v.add("kapil");
		v.add("jatin");
		v.add("dipanshu");
		
		   Enumeration v1 =v.elements();
		   v.add("dipak");
		
		   while (v1.hasMoreElements()) {
			   System.out.println(v1.nextElement());
			
		}
		
	}

}
