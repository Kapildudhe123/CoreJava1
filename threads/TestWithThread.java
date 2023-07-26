package in.co.threads;

public class TestWithThread {
public static void main(String[] args) {
		
		WithThread w=new WithThread("rays", "kapil");
		WithThread w2=new WithThread("khargone", "dipanshu");
		
		w.start();
		w2.start();
	
		
	
}

}
