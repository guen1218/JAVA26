package animal;

public class Eagle extends Animal {

	@Override
	void eat() {
		System.out.println("고기 야르렁");
	}

	@Override
	void move() {
		System.out.println("니조랄");
	}

	@Override
	public String toString() {
		return ">>> 독수리";
	}
	
}