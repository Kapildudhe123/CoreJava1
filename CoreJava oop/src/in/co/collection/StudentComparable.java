package in.co.collection;

import java.util.Comparator;
public class StudentComparable implements Comparable<StudentComparable> {
	
	private int rollNo=0;
	private String name=null;
	private String address=null;
	
	
	public StudentComparable(int rollNo,String name,String address) {
		this.rollNo=rollNo;
		this.name=name;
		this.address=address;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
public int getRollNo() {
	return rollNo;
}public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
public void setAddress(String address) {
	this.address = address;
}
public String getAddress() {
	return address;
}
@Override
public String toString() {
	
	return rollNo+" "+name+" "+address;
}
@Override
public int compareTo(StudentComparable o) {

	// int value se compare
	
	return this . rollNo - o.rollNo;
}	
	
	// String value se compare
	
	//  return this.address .compareTo(o.address);
 
//}
//}
//	 int i=this.rollNo-o.rollNo;
//	  
//	 if(i==0) {
//		int k=  this.name.compareTo(o.name);
//	
//		if (k==0) {
//			return this.address.compareTo(o.address);
//		}
//		return k;
//		
//	 }
//	return i; 
//             
 
	}
                //COMAPARATOE METHOD USE//
        
class OrderBy implements Comparator<StudentComparable>{

	@Override
	public int compare(StudentComparable o1, StudentComparable o2) {
		
		return o2.getRollNo()-o1.getRollNo();
	}
	
}



	
