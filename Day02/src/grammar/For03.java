package grammar;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
			System.out.printf("[구구단 %d단]\n",a);
			for(int j=1; j<=9; j++) {
				System.out.printf("%d x %d = %d\n",a,j,a*j);
			}
			System.out.println();
		}
	}


