package in.co.implicitexplicit;

public class B extends A {
	private String ad=null;
	
	public B (String ad,int id ,String name) {
		super(id ,name);
		System.out.println(this.ad=ad);
		
	}

}
