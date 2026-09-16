package example03;

public class PointTest {
public static void main(String[] args) {
	Point p = new Point(5, 10);
	System.out.println(p.toString());
	MovablePoint mp = new MovablePoint(5, 10, 30, 50);
	System.out.println(mp.toString());
}
}
