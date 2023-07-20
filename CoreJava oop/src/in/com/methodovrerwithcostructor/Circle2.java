package in.com.methodovrerwithcostructor;

public class Circle2 extends Shape2 {
	
	private double radius;



      public Circle2() {
    	  
    	  
      }
 public Circle2(double radius) {
	 this.radius=radius;
 }
 public void showArea() {
	 double area=Math.PI*radius*radius;
	 System.out.println("AREA OF CIRCLE="+area);
 }
}