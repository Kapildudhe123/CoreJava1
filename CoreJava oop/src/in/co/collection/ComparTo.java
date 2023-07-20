package in.co.collection;

import java.util.Comparator;

public class ComparTo implements Comparator<ComparTo> {
	
	private int id=0;
	private String name=null;
	
	public ComparTo(int id, String name) {
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  id+""+name;
	}

	@Override
	public int compare(ComparTo o1, ComparTo o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
