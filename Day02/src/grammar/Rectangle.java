package grammar;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("직사각형의 가로 길이 : ");
		double a = sc.nextDouble();
		System.out.print("직사각형의 세로 길이 : ");
		double b = sc.nextDouble();
		System.out.printf("직사각형의 넓이는 %.1fcm입니다.",a*b);
	}

}
