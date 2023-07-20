package in.co.collection;

public class TestHashEqual {
	
	public static void main(String[] args) {
		
		HashEqual h=new HashEqual(1,"rays","indore");
		HashEqual h1=new HashEqual(1,"rays","indore");
		
//		HashEqualEmployee e=new HashEqualEmployee("bhopal");
//		
//		System.out.println(e.equals(h1));
		
		System.out.println(h.equals(h1));
		
		System.out.println(h.hashCode());
		System.out.println(h1.hashCode());
		
		
		
		
		
		
	}

}
