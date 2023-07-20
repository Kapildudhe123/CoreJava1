package in.co.exercise;

public class ArrayPrime {
	public static void main(String[] args) {

		int[] a = { 14, 12, 11, 45, 13, 17,19,21,8,16, };

		int count = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 2; j < a[i]; j++) {
				if (a[i] % j == 0) {
					count++;

				}
			}
			//if(count==0) //prime number

		if (count != 0) // not prime number
			{
				System.out.println(" not  prime number=" + a[i]);

			}
			count = 0;
		}
	}

}
