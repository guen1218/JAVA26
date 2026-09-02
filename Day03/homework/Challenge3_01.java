package homework;

import java.util.Scanner;

public class Challenge3_01 {
	public static void main(String[] args) {
		int result, n;
		Scanner in = new Scanner(System.in);
		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();
		result = 1;
		while(true) {
			result *= n--;
			if(n<0) {
				break;
			}
		}
		System.out.println(result);
	}
}
