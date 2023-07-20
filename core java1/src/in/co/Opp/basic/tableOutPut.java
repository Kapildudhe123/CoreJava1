package in.co.Opp.basic;

public class tableOutPut {

	public int tablePrint(int n) {
		int t = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 11; j++) {
				t = i * j;
				System.out.print(t + "\t");

			}
			System.out.println();

		}
		return 0;

	}

}
