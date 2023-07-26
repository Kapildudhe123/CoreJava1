package in.co.java8;

public class TestHello {
	public static void main(String[] args) {

		
		Hello h=new Hello() {
			
			@Override
			public void hii() {
				System.out.println("hii method");
				
			}
		}; 
		h.hii();
	}
}
		