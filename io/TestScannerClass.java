package in.co.io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestScannerClass {
	public static void main(String[] args) throws IOException {
		
		FileReader f= new FileReader("C:\\Users\\Windows 11\\Desktop\\io\\kapil.txt");
		
		Scanner sc = new Scanner(f);
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
			
		}
		f.close();
		sc.close();
	}

}
