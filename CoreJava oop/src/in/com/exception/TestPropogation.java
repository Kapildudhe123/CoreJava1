package in.com.exception;

public class TestPropogation  {
	
	public static void main(String[] args) throws Exception {
		dad();
		
	}
		
		public static  void dad() throws Exception {
			mom();
			
		}
		public static  void mom() throws Exception {
			
			son();
			
		}
		public static void son() throws Exception {
			throw new MistakeException();
			
		}
	

}
