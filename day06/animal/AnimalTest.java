package animal;

public class AnimalTest {
	public static void main(String[] args) {
		Animal[] animals = {new Tiger(),new Goldfish(),new Tiger()};
		
		for(Animal a : animals) {
			printDayLife(a);
		}
	}
	public static void printDayLife(Animal a) {
		System.out.println(a.toString());
		a.eat();
		a.move();
		a.sleep();
	}
}
