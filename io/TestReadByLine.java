package in.co.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestReadByLine {
	
	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("C:\\Users\\Windows 11\\Desktop\\io\\read.txt");
		BufferedReader br=new BufferedReader(file);
		 String str=br.readLine();
		 
		 while (str!=null) {
			 System.out.println(str);
			 
		str=br.readLine();
		 }	 
			 br.close();
			 file.close();
		
	}

}
