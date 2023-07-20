package in.co.exercise;

public class Array1 { 
	public static  void main (String []args) {
	//	int []arra= {12,1,51,65,2,6,55};
		int []table=new int[12];
		for(int i=0;i<table.length;i++) {
			table[i]=(i+1)*2;
			
		}
		for(int i:table) {
			System.out.println(i);
			
		}
	
	}

}
