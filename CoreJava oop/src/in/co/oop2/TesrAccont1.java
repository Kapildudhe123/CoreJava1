package in.co.oop2;

public class TesrAccont1 {

	
	public static void main(String[] args) {
		
		Account1 x=new Account1();
		x.setbalance(500);
		x.setName("kapil");
	
		
		System.out.println(x.getacountType());
		System.out.println(x.getName());
		System.out.println(x.getbalance());
	}
	
	
}
