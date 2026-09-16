package Challenge;

public class GoodGirl extends Girl{
	protected GoodGirl(String name) {
		super(name);
	}
	void show() {
		System.out.println(name+"는 자바를 잘 안다.");
	}
}
