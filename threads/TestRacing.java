package in.co.threads;

public class TestRacing {
	
	public static void main(String[] args) {
		
		Racing r=new Racing("kapil");
		Racing r2 =new Racing("deepanshu");
		r.start();
		r2.start();
	}

}
