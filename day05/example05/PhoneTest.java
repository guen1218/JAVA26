package example05;

public class PhoneTest {
	public static void main(String[] args) {
		Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), new
	            Smartphone("민국이", "갤러그") };
		for(Phone p : phones) {
			if(p instanceof Smartphone) {
				Smartphone s = (Smartphone)p;
				s.playGame();
			}else if(p instanceof Telephone) {
				Telephone t = (Telephone)p;
				t.autoAnswering();
			}else {
				p.talk();
			}
		}
	}
}
