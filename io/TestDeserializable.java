package in.co.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestDeserializable {
	
	public static void main(String[] args) throws Exception {
		
	FileInputStream f=new FileInputStream("C:\\Users\\Windows 11\\Desktop\\io\\kapil.txt");
	
	ObjectInputStream in =new ObjectInputStream(f);
	
	Marksheet m=(Marksheet)in.readObject();
	
	System.out.println(m.name);
	
	System.out.println(m.chemistry);
	System.out.println(m.maths);
	System.out.println(m.physics);
	
	
	in.close();
	f.close();
}
}