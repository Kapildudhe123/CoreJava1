package in.com.exception;


public class TestLoginException {
	
	
	//program difined exception//
	
	public static void main(String[] args) {
		
		try {
			String name="kapil";
			if(name.equals("class")){
				System.out.println("valid user");
				
			}else {
				Login e=new Login();
				throw e;
			}	
					
				}catch(Exception e) {
					System.out.println(e);
				}
		finally {
			System.out.println("this is finally");
		}
		}
		
	}


