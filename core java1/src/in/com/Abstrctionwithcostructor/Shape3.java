package in.com.Abstrctionwithcostructor;

public abstract class Shape3{

	
	public  int i =0;
	
	public String  color="";
	
	
	
	public Shape3() {
		
	}
		
	public Shape3(int i,String color) {
		System.out.println(this.color=color);
		System.out.println(this.i=i);
	}
	
	
	public abstract void displayarea();
	
}	
	
	
	
	
	
	
	

