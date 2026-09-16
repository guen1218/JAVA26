package example02;

public class Student extends Person{
	int hakbun;
	Student(String name, int age, int hakbun) {
		super(name, age);
		this.hakbun = hakbun;
	}
	void show(){
		System.out.printf("학생[이름 : %s, 나이 : %d, 학번 : %d]\n", name, age, hakbun);
	}
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	
	
}
