package in.co.Abstrction;

public class TestAbstract {
	public static void main(String[] args) {
		
		//type casting se
		
		Shape2 s=new Triangle1();
		Triangle1 tr=(Triangle1) s;
		tr.setBase(10);
		tr.setHight(10);
		tr.area();
		
	
		Shape2 s1=new Rectangle1();
		Rectangle1 r=(Rectangle1) s1;
		r.setLength(12);
		r.setWidth(10);
		r.area();
	
		
		
	}
}
			