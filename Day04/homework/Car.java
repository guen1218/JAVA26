package homework;

public class Car {
	String color;
	static private int count = 0;
	static private int redcount = 0;
	Car(String color){
		this.color = color;
		count++;
		if(color.toLowerCase().equals("red")) {
			redcount++;
		}
	}
	
	static public int getNumOfCar() {
		return count;
	}
	
	static public int getNumOfRedCar() {
		return redcount;
	}
}
