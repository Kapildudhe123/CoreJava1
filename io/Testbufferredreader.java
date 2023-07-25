package in.co.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Testbufferredreader  {
	public static void main(String[] args)  throws IOException{
		
	
	
	FileReader fr=new FileReader("C:\\Users\\Windows 11\\Desktop\\io\\java.txt");
	
	BufferedReader bf=new BufferedReader(fr);
	 String line=bf.readLine();
	
	
	while (line!=null) {
		System.out.println(line);
		line=bf.readLine();
		
		
		bf.close();
		fr.close();
	}
		
	}

}
