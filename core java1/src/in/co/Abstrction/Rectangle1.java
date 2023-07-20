package in.co.Abstrction;

public class Rectangle1 extends Shape2 {
	
	private int length=0;
	private int width=0;
	
	
	
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
	public void area(){
		
		int rect=length*width;
		System.out.println( "area of rectangle="+rect);
		
	}
	
	

}
