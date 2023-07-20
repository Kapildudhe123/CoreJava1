package in.co.exercise;

public class BufferTest {
	public static void main(String[] args) {

	StringBuffer ab=new StringBuffer("basic");
	ab.append("concept");
	System.out.println("append="+ab);
	
	System.out.println("length:"+ab.length());
	
	System.out.println("capacity:"+ab.capacity());
	
	System.out.println(ab.charAt(10));
	
	System.out.println(ab.indexOf("tfgh"));
	
	System.out.println(ab.replace(0,1, "jay"));
	
	System.out.println(ab.reverse());
	
	

	}
}
