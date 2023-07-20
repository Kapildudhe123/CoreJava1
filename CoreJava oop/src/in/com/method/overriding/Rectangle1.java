package in.com.method.overriding;

public class Rectangle1 extends Show {
	
	private  int length=0;
	private int width=0;
	
	
//	public static Rectangle1 getRectangle1() {
//		return null;
//	}{
		
		
	
	
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	public double area () {
		
		int  rarea=length*width;
		System.out.println("Rectangle area="+rarea);
		return rarea;
	}
	

}

