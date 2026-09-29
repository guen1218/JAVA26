package CircleA;

public abstract class CircleTemplate {
	protected double radius;
	
	public abstract double getArea();

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
