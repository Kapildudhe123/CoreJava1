package in.co.constroctorcalling;

public class Shape {
	
	
	private int border=0;
	private String color="";
	
	
	
	public Shape() {
		System.out.println(" shape  is deflault constr....!!!");
		
	}
	public Shape( int border,String color) {
		this.border=border;
		this.color=color;
		
	}
	public void setBorder(int border) {
		this.border = border;
	}
	public int getBorder() {
		return border;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
		
		}

	
	
	
	

	
	
	
	
	

