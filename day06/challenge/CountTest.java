package challenge;

public class CountTest {
	public static void main(String[] args) {
		Counterble[] c = {new Bird("뻐꾸기", 5), new Bird("독수리", 2), new Tree("사과나무", 10), new Tree("밤나무", 7) };
		for(Counterble cc : c) {
			cc.count();
		}
		
		for(Counterble cc : c) {
			if(cc instanceof Bird) {
				cc.fly();
			}else {
				cc.ripen();
			}
			
		}
	}
}
