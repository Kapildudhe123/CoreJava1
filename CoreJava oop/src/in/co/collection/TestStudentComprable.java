package in.co.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestStudentComprable {
	
	public static void main(String[] args) {
		
		
		List l= new ArrayList();
		
		
		l.add(new StudentComparable(10,"kapil", "khargone"));
		l.add( new StudentComparable(3,"dipanshu","khargone"));
		l.add( new StudentComparable(10,"kapil","bpithmpur"));
		l.add( new StudentComparable(12,"achandan","khargone"));
		l.add( new StudentComparable(4,"naman","sehore"));
		l.add( new StudentComparable(9,"rahul","ujjain"));
		l.add( new StudentComparable(8,"jatin","nashik"));
		l.add( new StudentComparable(6,"rahul","mumbai"));
		l.add( new StudentComparable(2,"sachin","bhopal"));
		l.add( new StudentComparable(7,"vikas","khandwa"));
		l.add( new StudentComparable(5,"bdipak","indore"));
		
	Collections.sort(l,new OrderBy());
	
   Iterator i=l.iterator();
   
   while(i.hasNext()) {
   System.out.println(i.next());

}
}
}
