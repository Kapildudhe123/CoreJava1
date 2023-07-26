package in.co.threads;

public class TestRunnable {
	
	public static void main(String[] args) {
		
		ByRunnable b=new ByRunnable("kapil");
	
		ByRunnable b2=new ByRunnable("dudhe");
		
		Thread t1= new Thread(b);
		t1.setPriority(1);
		Thread t2 =new Thread(b2);
		t2.setPriority(10);
		
		//CHECK GET PRIORITY
		
		//int j=t2.getPriority();
		//System.out.println(j);
		
		t1.start();
		t2.start();
	}

}
