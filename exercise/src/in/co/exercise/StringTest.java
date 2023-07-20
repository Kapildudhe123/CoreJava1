package in.co.exercise;

public class StringTest {
	public static void main(String []args) {
		
		
		
		String name="kapil dudhe deepak gayke";
		
		
		System.out.println("String lenght= "+name.length());
		
		System.out.println(name.charAt(6));
		
		System.out.println(name.indexOf("ga"));
		
		System.out.println(name.indexOf("d"));
		
		System.out.println(name.substring(2));
		
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.replace("kapil", "sohan"));
		
		System.out.println(name.endsWith("ke"));
		
		System.out.println(name.startsWith("kapil"));
	}

}
