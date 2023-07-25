package in.co.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.Buffer;

public class TestEmail {
	
	public static void main(String[] args) throws IOException {
		
		FileReader file =new FileReader("C:\\Users\\Windows 11\\Desktop\\io\\gmail.txt");
		
		BufferedReader  b=new BufferedReader(file);
		
		
		FileWriter f=new FileWriter("C:\\Users\\Windows 11\\Desktop\\io\\checkgmail.txt");
		
		PrintWriter p= new PrintWriter(f);
		
		  String line= b.readLine();
		  
String emailreg ="^([\\w]*[\\w\\.]*(?!\\.)@gmail.com)";
//"^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		  
while (line!=null) {
	if(line.matches(emailreg)) {
		p.println(line);;
	}
	else {
		System.out.println(line);
	}
	line =b.readLine();
	
}
b.close();
p.close();
file.close();

	}

}	
	
	
	
	
	
	
	
	
	
	
	

