package homework;

import java.util.Scanner;

public class Challenge3_02 {
	public static void main(String[] args) {
		int result, n;
		Scanner in = new Scanner(System.in);
		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();
		result = factorial(n);
		System.out.println(result);
	}
	
	static int factorial(int x) {
		int r = 1;
		while(x>0) {
			r *= x--;
		}
		return r;
	}
}
