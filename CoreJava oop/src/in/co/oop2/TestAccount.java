package in.co.oop2;

public class TestAccount {
	
	
	public static void main(String[] args) {
		Account l=new Account() ;
			l.setBalance(500);
			l.setDeposite(100);
			l.setWithdrawal(150);
			
			
			
			System.out.println(l.getBalnce());
			System.out.println(l.getDeposite());
			System.out.println(l.getWithdrawal());
			
		}
	}
	

