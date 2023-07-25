package in.co.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFileWriter {
	public static void main(String[] args)throws IOException {
		
		FileReader file = new FileReader("C:\\Users\\Windows 11\\Desktop\\io\\f.txt");
		
		BufferedReader  b=new BufferedReader(file);
		
		
		FileWriter fw =new FileWriter("C:\\Users\\Windows 11\\Desktop\\io\\create.txt");
		
		PrintWriter pr=new PrintWriter(fw,true);
		pr.print("RAYS COACHING INSTITUTE IN INDORE");
		 String s=b.readLine();
		 
		 while (s!=null) {
			pr.println(s);
			 
			s=b.readLine();
			
		}
		 pr.close();
		 fw.close();
		b.close();
		file.close();
		
	}

}
