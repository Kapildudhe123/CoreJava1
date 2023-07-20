package in.com.exception;

public class TestUnchked {
	
	public static void main(String[] args) {
		
		int a=10;
		
		if(a>10) {
		
		try {
			throw new Unchkeced();
				
			}
		catch(Exception e) {
			System.out.println(e);
		}
		
		}
	
		
	}

}
