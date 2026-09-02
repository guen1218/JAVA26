package homework;

import java.util.Scanner;

public class Example3_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, sum=0;
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			a = sc.nextInt();
			if(a%2==0) {
				sum+=a;
			}
		}while(a>0);
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 "+sum);
	}	
}