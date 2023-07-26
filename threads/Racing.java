package in.co.threads;

public class Racing extends Thread {
	
	String name =null;
	
	public static Account ac=new Account() ;
			
		
		
		public Racing(String name) {
			
			this.name=name;
}
		@Override
		public void run() {
			
			for (int i = 1; i <=5; i++) {
				this.ac.Deposite(name, 200);
				
			}
		}
	}
