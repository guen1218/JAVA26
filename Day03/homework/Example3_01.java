package homework;

import java.util.Scanner;

public class Example3_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a>=19) {
			System.out.println("성년");
		}else {
			System.out.println("미성년");
		}
	}
}
