package in.co.exercise;

public class  ArrayMin{ 
	public static void main(String []args) {
		int []abc= {652,101,100,22,55,15,565,-1,55545};
	
			int a=abc[0];	
				
		for(int i=0;i<abc.length;i++) {
			if(abc[i]<a) {
				a=abc[i];
			}
		}
		System.out.println("minimum value="+a);
	}

}
