package in.com.exception;

public class TestVoting {
	
	
	public static void main(String[] args) {
		
		try {
		int age=19;
		
		if(age<18) {
			
			throw new CheckedVoting();
		}
		else {
			System.out.println("you can ");
		}
		
		
	}catch(CheckedVoting e) {
		System.out.println(e);
	}

}
}