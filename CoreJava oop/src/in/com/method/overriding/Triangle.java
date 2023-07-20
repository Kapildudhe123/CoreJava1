package in.com.method.overriding;

public class Triangle extends Show {

	
	private int base=0;
	private int hight=0;
	
	
     public void setBase(int base) {
		this.base = base;
	}
     public int getBase() {
		return base;
	}
     public void setHight(int hight) {
		this.hight = hight;
	}
     public int getHight() {
		return hight;
	}
     public double area() {
    	 
    	 int tarea =(base*hight)*1/2;
    	 
    	 System.out.println("trangle area="+tarea);
		return tarea;
     }
	
}
