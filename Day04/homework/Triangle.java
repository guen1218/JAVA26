package homework;

public class Triangle {
	private double a;
	private double b;
	public Triangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double findArea() {
		return (a*b)/2;
	}
	
	public boolean isSameArea(Triangle t) {
		if (((a*b)/2) != t.findArea()) {
			return false;
		}
		return true;
	}
}
