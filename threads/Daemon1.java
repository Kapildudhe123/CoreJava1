package in.co.threads;

public class Daemon1 extends Thread {
	
	 public String name=null;
	
	public Daemon1(String name) {
		this.name=name;
		
	}
	public void run() {
		while (true) {
		//for (int i = 1; i <=10; i++) {
			
		
			try {
				Thread.sleep(400);
				
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			System.out.println(name);
		}
		
		}
}
	

