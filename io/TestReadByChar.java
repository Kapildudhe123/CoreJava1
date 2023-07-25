package in.co.io;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class TestReadByChar {
	
	public static void main(String[] args) throws IOException {
		
		
		FileReader f=new FileReader("C:\\Users\\Windows 11\\Desktop\\io\\java.txt");
		
		int ch=f.read();
		while (ch!=-1) {
			System.out.print((char)ch);
		ch=f.read();
			
		}
		f.close();
			
			
		}
	}


