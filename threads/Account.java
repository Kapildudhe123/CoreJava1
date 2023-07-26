package in.co.threads;

public class Account {
	
	private int Balance=0;
	
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	
	public synchronized void Deposite(String name ,int amt) {
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	int total=	getBalance()+amt;
	setBalance(total);
	System.out.println(name+ " "+total);
	}

}
