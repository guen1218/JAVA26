package homework;

public class Line {
	int a;
	public Line(int a){
		this.a = a;
	}
	public int getA() {
		return a;
	}
	
	public boolean isSameLine(Line b) {
		if(a != b.getA()) {
			return false;
		}
		return true;
	}
}
