package in.co.constroctorcalling;

public class Emlpooyee extends Person {
	private String name = null;
	
	public Emlpooyee() {
		System.out.println("employeee ");
		
	}

	public Emlpooyee(String name, String firstName,String lastName,String address) {
		
		super(firstName, lastName, address);
		this.name=name;
	}
	   public void setName(String name) {
		this.name = name;
	}
	   public String getName() {
		return name;
	}
		
		
	}
	
     
