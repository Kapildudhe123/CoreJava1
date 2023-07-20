package in.com.method.overriding;

public class TestShowRetangle {
	public static void main(String[] args) {
		
	
		
		
		
//		Show s =new Show();
//		Show s1=s.getShow(1);
//		Rectangle1 r=(Rectangle1)s1;
//		r.setLength(10);
//	r.setWidth(10);
//		s1.area();
//		//System.out.println();
		

	Show s = new Circle();
	
	Circle c = (Circle) s;
		Circle c1 = new Circle();
		
		c.setBorderWidth(20);
	c.setRadius(12);
		c.area();
		c.getBorderWidth();
		System.out.println(c.getColor()); 
		
		
		 Show h = new Triangle(); 
		Triangle t = (Triangle) h;
		t.setBase(10);
	t.setHight(11);
		t.area();
		t.setColor("pink");
		System.out.println(t.getColor());
		

		Rectangle1 R = new Rectangle1();
		Show sw = new Rectangle1();
		Rectangle1 r = (Rectangle1) sw;
		r.setLength(10);
		r.setWidth(20);
		r.area();
		r.setColor("yolloe");
        System.out.println(r.getColor());
		  
		  // Show[] s=new Show[3];
		 
//       s[0] = new Rectangle1();
//       Rectangle1 r = (Rectangle1) s[0];
//       r.setLength(12);
//       r.setWidth(25);
//       r.setColor("yellow");
//       
//       s[1] = new Circle();
//       Circle c = (Circle) s[1];
//       c.setRadius(50.50);
//       c.setColor("red");
//       
//       s[2] = new Triangle();
//       Triangle t = (Triangle) s[2];
//       t.setBase(25);
//       t.setHight(25);
//       t.setColor("pink");
//
//			System.out.println(s[i].getColor());
//			
//		totalArea = totalArea+s[i].area();
//			
//		}
//		}
//		
//		
//	}			
//			

	}
}
