package in.co.Opp.basic;

public class Allcondition {
	public static void main(String[] args) {
		//Addname();
		//table(9);
		max(10,12);
	}
public static int table (int k) {
	
	int t=0;
	for(int i=1;i<k;i++) {
		for(int j=1;j<k;j++) {
			t=i*j;
			System.out.print(t+"\t");
		}
		System.out.println( );
	}
	return 0;
}
	public static String Addname() {
		
		String str=new String();
		String b="kapil";
	
	str = "dudhe"+b;
     System.out.println(str);
	return str;
}
	
	public static int max(int a,int b) {
		if(a>b) {
			System.out.println("a is greater");
		}else {
			System.out.println("b is greater");
			
		}
		return 0;
		
	}
	
	
	
	
}