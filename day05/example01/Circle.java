package example01;

public class Circle {
	int radius;
	Circle(int radius){
		this.radius = radius;
	}
	void show() {
		System.out.printf("반지름이 %d인 원이다.\n", radius);
	}
}
