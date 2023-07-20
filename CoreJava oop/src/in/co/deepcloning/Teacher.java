package in.co.deepcloning;

public class Teacher implements Cloneable {
	
	String name=null;
	Student boy=null;
	
	
	public Teacher(String name) {
		this.name=name;
		this.boy= new Student(10);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Teacher t= (Teacher)super.clone();
		t.boy=(Student)boy.clone();
		return t;
		
		
	}

}
