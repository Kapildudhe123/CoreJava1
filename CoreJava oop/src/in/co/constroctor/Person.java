package in.co.constroctor;


public class Person {
	
	private int id=0;
	private String name="null";
	private String address="";
	
	
	public Person() {
		
		System.out.println("  ");
	}
	
	
	  public Person(int id) {
		  System.out.println(this.id=id);
		  
	  }
	  public Person(String name) {
		  System.out.println(this.name=name);
	  }
	  
	  public Person(int id,String address) {
	
		  	
		  System.out.println(this.address=address);
		  System.out.println(this.id = id);
	  }

}
	  
	  
	  
		  
	  

        
  