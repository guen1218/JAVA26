package grammar;

import java.util.Scanner;

public class For02 {
public static void main(String[] args) {
	System.out.println("5개의 숫자를 입력하세요.");
	Scanner sc = new Scanner(System.in);
	int sum=0;
	for(int i=1; i<=5; i++)
		sum += sc.nextInt();
	System.out.printf("5개 숫자의 합은 %d입니다.",sum);
	
}
}
