package in.co.collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestTreeSet {
	
	public static void main(String[] args) {
		
		
		 // create a new TreeSet
       SortedSet set = new TreeSet();

        // add elements to the set
        set.add(5);
        set.add(3);
        set.add(8);
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(3);
       //set.add(null);
        

        // print the set
        System.out.println("TreeSet: " + set);

        // get the first element in the set
        System.out.println("First element: " + set.first());

        // get the last element in the set
        System.out.println("Last element: " + set.last());
        
        //get the headset element
        System.out.println("headset element"+set.headSet(5));

        // get a subset of the set
        System.out.println("Subset from 3 to 8: " + set.subSet(3, 8));

        // remove an element from the set
        set.remove(5);

        // print the set again
        System.out.println("TreeSet after removing 5: " + set);

        // get the size of the set
        System.out.println("Size of TreeSet: " + set.size());

        // clear the set
        set.clear();

        // check if the set is empty
        System.out.println("Is TreeSet empty? " + set.isEmpty());
    }
}

	
		
		
	