package grammar;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		a = sc.nextInt();
		sum += a;
		while(a!=0){
			System.out.print("숫자를 입력하세요 : ");
			a = sc.nextInt();
			sum += a;
		}
		System.out.printf("지금까지 입력한 숫자의 합은 %d입니다.",sum);
	}

}
