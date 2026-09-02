package homework;

import java.util.Scanner;

public class Example3_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("철수 : ");
		String a = sc.next();
		System.out.println("영희 : ");
		String b = sc.next();
		if(a.equals(b)) {
			System.out.println("무승부");
		}else {
			if((a.equals("r")&&b.equals("s")) || (a.equals("s") && b.equals("p")) || (a.equals("p") && b.equals("r"))) {
				System.out.println("철수, 승!");
			}else {
				System.out.println("영희, 승!");
			}
		}
	}
}
