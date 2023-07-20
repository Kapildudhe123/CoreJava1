package in.com.methodovrerwithcostructor;

public class Rectangle2 extends Shape2 {
	
	private int length=0;
	
	private int  width=0;
	
	
	
	public Rectangle2() {
		
		
	}
	public Rectangle2(int length,int width) {
		this.length=length;
		this.width=width;
	}
	public void showArea() {
		int area=length*width;
		System.out.println("AREA OF RECTANGLE="+area);
	}
	
	
}
