package in.co.threads;

public class WithThread extends Thread {
	
	String address=null;
	
	String name=null;
	
	public WithThread( String address ,String name) {
		this.address=address;
		this.name=name;
	}
	public void run() {
		for (int i = 1; i <=8; i++) {
			System.out.println(i+""+ "address" +name);
			
		}
		
	}
	

}



