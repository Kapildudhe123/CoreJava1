package in.com.methodovrerwithcostructor;

public class TestMethodWithCost {
	
	
	public static void main(String[] args) {
		
		Shape2 s[]= new Shape2[2];
		s[0]=new Rectangle2(10,25);
		s[1]=new Circle2(4);
		
		
		for (int j = 0; j < s.length; j++) {
			System.out.println(s[j]);
			s[j].showArea();
			
			
		}
	
		
		
		
	}
	
	

}
