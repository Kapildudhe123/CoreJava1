package in.com.exception;

public class TestTryCatch {
	
	
	public static void main(String[] args) {
		
		
		try {
			
			int a=10;
		int b=0;
			int c=a/b;
			
			System.out.println("divede "+c);
			
			
			String d="kapil";
			
			System.out.println(d);
			
		System.out.println(d.length());
		
		System.out.println(d.charAt(5));
		
		
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("this block is finally");
		}
			
			
//		}catch (StringIndexOutOfBoundsException e) {
//			System.out.println(e);
//		
//		
//	}catch(RuntimeException e){
//		System.out.println(e);
//	}
	}
}

