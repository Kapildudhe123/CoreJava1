package in.co.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {
	
	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add("kapil");
		l.add("jatin");
		l.add("lalit");
		l.add("sohan");
		l.add("dipanshu");
		
      Iterator it=l.iterator();
      
      l.add("dipak");
      
      while (it.hasNext()) {
    	  System.out.println(it.next());
		
	}
		
		
		
	}

}
