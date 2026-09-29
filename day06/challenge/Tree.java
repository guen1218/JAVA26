package challenge;

public class Tree implements Counterble{
	String name;
	int num;
	Tree(String name, int num){
		this.name = name;
		this.num = num;
	}
	public void ripen(){
		System.out.printf("%d그루 %s에 열매가 잘 익었다.\n",num,name);
	}
	@Override
	public void count() {
		System.out.printf("%s가 %d그루 있다.\n",name, num);
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

}
