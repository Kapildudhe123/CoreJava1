package in.com.methodovrerwithcostructor;

public class Shape2 {
	
	private int borderWidth=0;
	private String color="null";
	
	
	public Shape2() {
		
		
	}
	public  Shape2(int borderWidth) {
		
	System.out.println(this.borderWidth=borderWidth);	
	
	}
	public Shape2(String color) {
		System.out.println(this.color=color);
		
	}
	public void showShape2() {
		System.out.println("shapename");
	}
	
	public void showArea() {
		System.out.println("  ");
	}
	
	
	
	

}
