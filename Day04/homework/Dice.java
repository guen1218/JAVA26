package homework;

public class Dice {	
	int[] face = {1,2,3,4,5,6};
	
	int roll() {
		double a = Math.random();
		if(a<0.167) {
			return face[0];
		}else if(a<0.333) {
			return face[1];
		}else if(a<0.5) {
			return face[2];
		}else if(a<0.666) {
			return face[3];
		}else if(a<0.833) {
			return face[4];
		}
		return face[5];
	}
}
