package example01;

public class CircleTest {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		c.show();
		ColoredCircle cc = new ColoredCircle(10, "빨간색");
		cc.show();
	}
}
