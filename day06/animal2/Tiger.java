package animal2;

public class Tiger implements Animal{

	@Override
	public void eat() {
		System.out.println("고기 야르");
	}

	@Override
	public void move() {
		System.out.println("달린다");
	}

	@Override
	public void sleep() {
		System.out.println("누워서 잠을 잔다");
	}
	
	@Override
	public String toString() {
		return ">>> 호랑이";
	}

}
