package in.co.java8;

public interface DefStatic {
	
	public default void Defmethod() {
		System.out.println("default");

}
	public static void staticmethod() {
		
		System.out.println("static");
	}
}