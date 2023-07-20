package in.co.deepcloning;

public class TestStudent {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Teacher t1=new Teacher("kapil");
		Teacher t2=(Teacher)t1.clone();
		
		t2.name="dudhe";
		t2.boy.id=555;
		
		System.out.println(t1.name);
		System.out.println(t1.boy.id);
		System.out.println(t2.name);
		System.out.println(t2.boy.id);
	}

}
