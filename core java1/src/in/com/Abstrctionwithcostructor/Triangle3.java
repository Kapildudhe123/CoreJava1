package in.com.Abstrctionwithcostructor;

public class Triangle3 extends Shape3 {
	
	
	
	public int  higth=0;
	public int base=0;
	

	@Override
	public void displayarea() {
		
		int tarea=base*higth;
		System.out.println("AREA OF TRIANGLE"+tarea );
		
		
	}
	
	
	public Triangle3() {
		
	}

	     public  Triangle3(int higth,int base) {
	    	 
	    	 this.color=color;
	    	 this.i=i;
	    	 System.out.println(this.base=base);
	    	 System.out.println(this.higth=higth);
	    			 
	    	 
	    	 
	     }
       	
}
