package in.co.exercise;

public class Array2D {
	public static void main(String []args) {
		int [][]table=new int[10][15];
		for(int i=0;i<table.length;i++) {
			for(int j=0;j<table.length;j++) {
				 
				table[i][j]=(i+1)*(j+1);}
			
		}
		
		for(int[]i:table) {
		for(int j:i) {
		
		
	//	for(int i=0;i<table.length;i++) {
		//	for(int j=0;j<table.length;j++) {
			//	System.out.print(table[i][j]+"\t");
			System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
	
}
			
			
		
	