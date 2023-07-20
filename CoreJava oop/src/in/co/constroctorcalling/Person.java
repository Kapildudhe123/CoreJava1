package in.co.constroctorcalling;

public class Person {
	
	
	
	private String firstName="null";
	private String lastName="null";
	private String address="null";
	
	
	public Person() {
		System.out.println("defualt");
	}
	public Person(String firstName,String lastName, String address ) {
		this.firstName= firstName;
		this.lastName = lastName;
		this.address = address;
		
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	

}
