package in.com.method.overriding;

public class Circle extends Show {

	public static final float PI = 3.14f;

	private double radius = 0;

	public void setRadius(double radius) {
		System.out.println(this.radius = radius);
	}

	public double getRadius(double radius) {
		System.out.println("radius" + radius);
		return radius;
	}

	public double area() {

		double total = 2 * PI * radius * radius;

		System.out.println("circle area=" + total);

		return total;
	}

}
