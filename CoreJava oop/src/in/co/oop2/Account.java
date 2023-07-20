package in.co.oop2;

public class Account {

	
	private int balance;
	 private int withdrawal;
	 private int deposite;
	 
	 
	public void setBalance(int balance) {
   this.  balance=balance;
	}
	public int getBalnce() {
		return balance;     
		
	}
	public void setWithdrawal(int withdrawal ) {
		
	 this.withdrawal=getBalnce()-withdrawal;
	}
	public int getWithdrawal() {
		return withdrawal;
			
	}
	public void setDeposite(int deposite) {
	 this.deposite= getBalnce()+deposite;
	}
	public int getDeposite() {
		return deposite;
		
	
	}
	
	}
	

