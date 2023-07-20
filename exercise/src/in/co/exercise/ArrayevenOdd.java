package in.co.exercise;

public class ArrayevenOdd {
	public static void main(String []args) {
		int  a[]= {12,11,2,5,13,17,88,1,11,44,46,543,35,44,88,111,45,315,541,};
		System.out.println("odd  number#");
	
		for(int x=0;x<a.length;x++) {
			
			if (a[x]%2!=0) 		 
			
			{
			
				System.out.println(a[x]);
			}
		}
		
		System.out.println("even number#");
		
		for(int x=0;x<a.length;x++)
			
			if(a[x]%2==0)
		System.out.println(a[x]);
		}
}
