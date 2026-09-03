package homework;

import java.util.Scanner;

public class Example5_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String url;
		do {
			System.out.print("URL을 입력하세요 : ");
			url = sc.next();
			if(url.endsWith("com")) {
				System.out.println(url+"은 'com'으로 끝납니다.");
			}
			if(url.contains("java")) {
				System.out.println(url+"은 'java'를 포함합니다.");
			}
		}while(!url.equals("bye"));
	}
}
