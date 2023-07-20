package in.co.deepcloning;

public class Student implements Cloneable {
	
	int id =0;
	
	public Student(int id) {
		this.id=id;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
