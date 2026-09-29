package CircleA;

public class Ball extends CircleTemplate{

	static final double PI = 3.14;
	public Ball(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return 4 * PI * radius * radius;
	}

}
