package animal;

public class Tiger extends Animal {

	@Override
	void eat() {
		System.out.println("고기 야르");
	}

	@Override
	void move() {
		System.out.println("달린다");
	}

	@Override
	void sleep() {
		System.out.println("누워서 잠을 잔다");
	}
	
	@Override
	public String toString() {
		return ">>> 호랑이";
	}
}
