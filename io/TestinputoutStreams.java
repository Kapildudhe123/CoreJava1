package in.co.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

       public class TestinputoutStreams {
	public static void main(String[] args) throws IOException {
		
FileInputStream in = new FileInputStream("C:\\Users\\Windows 11\\Desktop\\io\\java.txt");
FileOutputStream out = new FileOutputStream("C:\\Users\\Windows 11\\Desktop\\io\\deepak.txt",true);
               
                                                              
		
		 int ch = in.read();
		 while (ch!=-1) {
			 out.write(ch);
			ch = in.read();
			
		}
		 out.close();
		 in.close();
	}

}
