package in.co.Abstrction;

public  class Triangle1 extends Shape2 {
	
	public int base=0;
	public int hight=0;
	
	
	public void setBase(int base) {
		this.base = base;
	}
	public int getBase() {
		return base;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public int getHight() {
		return hight;
	}
	public  void area() {
	
		int tarea =(base*hight)*1/2;
	System.out.println("area of triangle="+tarea);
	
	}
	
}



	
	
	

