package in.co.exercise;
public class SecondHigh{
	public static void main(String []args){
		int []ar= {10,2,11,33,550,55,61,11,50,012,54,3};
		int min=0;
		int big=0;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>big) {
				min=big;
				big=ar[i];
			}
		}
		System.out.println("second highest="+big);
		
		
	}

}
