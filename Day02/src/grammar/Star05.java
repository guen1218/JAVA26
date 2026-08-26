package grammar;

public class Star05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		for(int i=num; i>0; i--) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=num; j++) {
				System.out.print("*");
			}
			for(int j=num; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
