package in.co.deepcloning;

public class TestDeep {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Customer c1=new Customer("kapil") ;
		Customer c2= (Customer)c1.clone();
		c2.name="dip";
		c2.account.balance=52;
		System.out.println(c1.name);
		System.out.println(c1.account.balance);
		System.out.println(c2.name);
	    System.out.println(c2.account.balance);
		}
	}


