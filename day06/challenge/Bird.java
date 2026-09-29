package challenge;

public class Bird implements Counterble{
	String name;
	int num;
	Bird(String name, int num){
		this.name = name;
		this.num = num;
	}
	public void fly(){
		System.out.printf("%d마리 %s가 날아간다.\n",num,name);
	}
	@Override
	public void count() {
		System.out.printf("%s가 %d마리 있다.\n",name, num);
	}
	@Override
	public void ripen() {
		// TODO Auto-generated method stub
		
	}

}
