package in.com.method.overriding;

public class Show {
	
	
	private String color="null";
	private int borderWidth=0;
	
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public double area() {
		
		System.out.println("this is show");
		return 0;
	}	
	
	}
	
	
	

