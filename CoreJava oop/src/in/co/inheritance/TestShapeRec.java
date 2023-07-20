package in.co.inheritance;

public class TestShapeRec {

	
	public static void main(String[] args) {
		//First class
		Shape1 f= new Shape1();
		f.setBorderWidhth(0);
		f.setColor("blue");
		
		
		//Recangleclass
		Rectangle r= new Rectangle();
		r.setBorderWidhth(1);
		r.setColor("red");
		r.setLength(12);
		r.setWidth(14);
		
		//first class print
		System.out.println("first class");
		System.out.println(f.getBorderWidhth());
		System.out.println(f.getColor());
		
	//	rectangle class print
		System.out.println("Rectangle print");
		System.out.println(r.getBorderWidhth());
		System.out.println(r.getColor());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
	}
}
