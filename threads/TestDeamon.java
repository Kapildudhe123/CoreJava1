package in.co.threads;

public class TestDeamon {
	
   public static void main(String[] args) {
	   
	   Daemon1 d=new Daemon1("kapil");
	  // Daemon1 d2 =new Daemon1("dipanshu");
	   
	 //  d2.setDaemon(true);
	   d.setDaemon(true);
	
	   d.start();
	 //  d2.start();
	
	   for (int i = 1; i <=10; i++) {
		   try {
				Thread.sleep(400);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		   System.out.println(i+""+"main");
			

	}
	   
}

}
