package in.com.Abstrctionwithcostructor;

public class Rectangle3 extends Shape3 {
	
	
	
	public int length=0;
	public  int width =0;
	
	@Override
	public void displayarea() {
		int area=length*width;
		System.out.println("AREA OF RECTANGLE="+area);
		
		
	}
	
	public Rectangle3() {
		
		
	}
	public Rectangle3(int length,int width) {
		this.color=color;
		this.i=i;
		System.out.println(this.length=length);
		System.out.println(this.width=width);
	}
	
	
	}

     