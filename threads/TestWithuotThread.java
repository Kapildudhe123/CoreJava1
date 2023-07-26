package in.co.threads;

public class TestWithuotThread {
	public static void main(String[] args) {
		
		WithoutThread wt=new WithoutThread("kapil");
		WithoutThread wt2=new WithoutThread("jatin");
		wt2.run();
		wt.run();
				
	}

}
