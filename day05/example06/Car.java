package example06;

public class Car extends Vehicle{
	int displacement; // 자동차 배기량
	int gears;		  // 자동차 기어 단수
	
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	
	void show() {
		System.out.printf("색상 : %s, 속도 : %d, 배기량 : %d, 기어 단수 : %d", color, speed, displacement, gears);
	}
}
