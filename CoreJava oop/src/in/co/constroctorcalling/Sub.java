package in.co.constroctorcalling;

public class Sub extends Maneger {
	
	
	private int mobileNo=0;
	private String add=null;
	
	
public Sub() {
	System.out.println("deh");
}
public Sub(int mobileNo,String add ,String name,int salery) {
	super(name,salery);
	
	System.out.println(this.add=add);
	System.out.println(this.mobileNo=mobileNo);
	
}
}