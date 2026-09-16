package animal;

public class Eagle extends Animal {
	String wing;
	
	public void fly() {
		System.out.println("비상(날아오르다)");
	}
	
	@Override 
	public void eat() {
		System.out.println("음 고기 야미");
	}
}
