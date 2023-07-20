package in.com.exception;

public class TestChecked {

	
	public static void main(String[] args) {
		
		int a=10;
		 if(a>10);{
			 try {
				 throw new checked();
				 
			 }catch(checked e) {
				 System.out.println(e);
			 }
		 }
	}
}
