package in.co.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmploExtrSearili {
	

	public static void main(String[] args)throws Exception {
		
		FileOutputStream file=new FileOutputStream("C:\\Users\\Windows 11\\Desktop\\io\\externlizable.txt");
		ObjectOutputStream out =new ObjectOutputStream(file);
		
		EmployeeExtr e=new EmployeeExtr();
		e.id = 1;
		e.name="kapil";
		e.lastName="dudhe";
		e.salary=50000;
		
		out.writeObject(e);
		
		out.close();
		file.close();
	}

}
