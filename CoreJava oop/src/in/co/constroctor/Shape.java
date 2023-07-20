package in.co.constroctor;

public class Shape {
	
	
	private int id=0;
	private String name= null;
	
	
	
	public Shape() {
	
//	System.out.println("this is default costruturs");
	}
	
	
	public Shape(int id,String name) {
		
		
//		    System.out.println(this.id=id);
//		    System.out.println(this.name=name);
//		
	}
	public void setId(int id) {
	this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
		
}	
	


