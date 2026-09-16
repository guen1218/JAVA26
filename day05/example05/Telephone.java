package example05;

public class Telephone extends Phone{
	private String when;
	Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}
	
	void autoAnswering() {
		System.out.println(owner+"이가 없다. "+when+" 전화 줄래.");
	}
}
