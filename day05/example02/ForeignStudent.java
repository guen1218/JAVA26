package example02;

public class ForeignStudent extends Student{
	String nara;
	ForeignStudent(String name, int age, int hakbun, String nara) {
		super(name, age, hakbun);
		this.nara = nara;
	}
	void show(){
		System.out.printf("외국학생[이름 : %s, 나이 : %d, 학번 : %d, 국적 : %s]\n", name, age, hakbun, nara);
	}
	public String getNara() {
		return nara;
	}
	public void setNara(String nara) {
		this.nara = nara;
	}
	
}
