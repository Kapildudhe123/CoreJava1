package in.co.constroctorcalling;

public class Rectangle extends Shape {
	
	private int length=0;
	private int borderWidth=0;
	
	
	public Rectangle() {
		
		
		System.out.println("this is adeflault constr....!!!");
		
	}
	
	 public Rectangle(int length,int borderWidth ,int border,String color) {
		 
		 super(border,color);
		 
		 this.length=length;
		 this.borderWidth=borderWidth;
	 }
	 public void setLength(int length) {
		this.length = length;
	}
	 public int getLength() {
		return length;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
}
	


