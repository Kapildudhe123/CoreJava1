package in.co.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class TestMarksheetSerializable {
	public static void main(String[] args) throws IOException {
		
	FileOutputStream file=new FileOutputStream("C:\\Users\\Windows 11\\Desktop\\io\\kapil.txt");
		
	ObjectOutputStream out =new ObjectOutputStream(file);
		
		
		Marksheet m=new Marksheet();
		m.name="kapil";
		m.chemistry=89;
		m.physics=80;
		m.maths=95;
		
		out.writeObject(m);
		
		out.close();
		file.close();
}
	}