package in.co.Opp.basic;

public class TablePrint {
	public static void main(String[] args) {
		
		tablePrint(5);
		
	}
	public static int tablePrint(int n ) {
		int t=0;
		for (int i = 1; i<=n; i++) 
			for (int j = 1; j <= 10; j++) {
		    t = i*j;
		    System.out.println(t+"\t");
			}
				
			System.out.println("");
			
	


			return 0;
			}
}
         
	



	
	



