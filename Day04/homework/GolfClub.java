package homework;

public class GolfClub {
	int a = 7;
	String b = "아이언";
	boolean nameBool = false;
	GolfClub(){
	}
	GolfClub(int a){
		this.a = a;
	}
	GolfClub(String b){
		this.b = b;
		nameBool = true;
	}
	void print(){
		if(nameBool) {
			System.out.println(b+"입니다.");
		}else {
			System.out.printf("%d번 %s입니다.\n",a,b);
		}
	}
}
