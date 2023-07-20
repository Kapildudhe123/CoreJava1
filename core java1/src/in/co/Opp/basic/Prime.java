package in.co.Opp.basic;

public class Prime {
	public static void main(String[] args) {
	
		primenumber(11);
	
	}
	
	public static int primenumber(int no) {
int a=0;
    for(int i=2;i<no ;i++) {
    	  
		if(no%i==0) {
			a++;
			
		}
	}
	
	if (a ==0){
		System.out.println("prime number...!!!!");
	}else {
        System.out.println("not prime number...!!!!");

}
	return 0;
}
	
}


