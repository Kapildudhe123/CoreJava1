package in.co.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TesReadKeyboard {
	
	public static void main(String[] args)throws IOException {
		
		InputStreamReader  is= new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(is);
		
		FileWriter f=new FileWriter("C:\\Users\\Windows 11\\Desktop\\io\\keyboard.txt");
		
		
		PrintWriter pe=new PrintWriter(f);
		
		  String line =bf.readLine();
		while (!line.equals("quit")) {
			pe.print(line);
			 line=bf.readLine();
		}
			
		is.close();
		pe.close();
		bf.close();
		
		 
			
		}
	}


