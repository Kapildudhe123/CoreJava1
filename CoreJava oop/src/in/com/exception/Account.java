package in.com.exception;

public class Account  {
	
	    private int balance=0;
	

public void setBalance(int balance) {
	this.balance = balance;
}
public int getBalance() {
	return balance;
}
     public void deposite(int amount) {
    	 int total=getBalance()+amount;
    	 setBalance(total);
    	 System.out.println("balance after deposite= "+getBalance());
     }
     public void withdrawal(int amount ) throws Exception {
    	 int total=getBalance()-amount;
    	 if(total<200) {
    		 throw new LowAmmount();
    	 }else {
    		 setBalance(total);
    		 System.out.println(getBalance());
    	 }
     }

}
