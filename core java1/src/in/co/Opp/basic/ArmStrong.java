package in.co.Opp.basic;

public class ArmStrong {

	public static String armstrongNumber(int k) {

		int number = k;
		int r;
		int sum = 0;
		int n = number;

		while (n > 0) {
			r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;
		}
		if (number == sum) {

			return "amstronm number " + sum;
		}

		else {
			return "not amstronm number " + sum;
		}

	}
}
