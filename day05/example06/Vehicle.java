package example06;

public class Vehicle {
	String color; // 자동차 색상
	int speed; 	  // 자동차 속도
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	void show() {
		System.out.printf("색상 : %s, 속도 : %d", color, speed);
	}
}
