package example05;

public class Phone {
	protected String owner;
	Phone(String owner){
		this.owner = owner;
	}
	
	void talk() {
		System.out.println(owner+"이가 통화 중이다.");
	}
}
