package homework;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은? ");
		int a = sc.nextInt();
		System.out.print("원기둥의 높이? ");
		int b = sc.nextInt();
		System.out.println("원기둥의 부피는 "+ a*a*3.14*b);
	}

}
