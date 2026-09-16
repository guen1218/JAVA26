package example01;

public class ColoredCircle extends Circle{
	String color;
	ColoredCircle(int radius, String color){
		super(radius);
		this.color = color;
	}
	@Override
	void show() {
		System.out.printf("반지름이 %d인 %s 원이다.\n", radius, color);
	}
}
