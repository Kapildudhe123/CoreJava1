package in.co.exercise;
public class SecondHigh1 {
	public static void main(String []args) {
		int ar[]= {121,20,45,5,54,5,4,55,88};
		int min=0;
		int max=0;
		 
		 for(int i=0;i<ar.length;i++) {
			 if (ar[i]>max) {
				 min=max;
				 max=ar[i];
			 }
			 if(ar[i]<max && ar[i]>min) {
				 
				 min=ar[i];
			 }
		 }
			System.out.println("second high="+min); 
			
			System.out.println( "first max no="+max);
		 }
	}