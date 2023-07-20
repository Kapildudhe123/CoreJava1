package in.com.exception;

public class TestAccount {

	
	   public static void main(String[] args) {
		
		   Account a=new Account();
		   a.deposite(4000);
		   try {
			   a.withdrawal(2900);
		   }
		   catch(Exception e) {
			   System.out.println(e);
		   }
		   
	}
}
