package in.co.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmploExtrDesailizable {
	public static void main(String[] args) throws Exception {
		
		FileInputStream file=new FileInputStream("C:\\\\Users\\\\Windows 11\\\\Desktop\\\\io\\\\externlizable.txt");
		ObjectInputStream out =new ObjectInputStream(file);
		EmployeeExtr ex=(EmployeeExtr) out.readObject();
		
		System.out.println(ex.id);
		System.out.println(ex.name);
		System.out.println(ex.lastName);
		System.out.println(ex.salary);
		
		out.close();
		file.close();
	}

}
