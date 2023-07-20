package in.co.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCompareTo {
	public static void main(String[] args) {
	
		List l=new ArrayList();
		
		l.add(new ComparTo(01, "name"));
		l.add(new ComparTo(2, "kapil"));
		l.add(new ComparTo(5, "sangam"));
		l.add(new ComparTo(4, "sohan"));
		
		Collections.sort(l,new ComparTo());
}

}
