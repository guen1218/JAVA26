package grammar;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		int a = sc.nextInt();
		
		System.out.println("동전의 수 >");
		System.out.printf("500원짜리 = %d개\n100원짜리 = %d개", a/500, a%500/100);

	}

}
