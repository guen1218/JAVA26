package grammar;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=1;
		Scanner sc = new Scanner(System.in);
		while(b!=0){
			System.out.print("숫자를 입력하세요 : ");
			a = sc.nextInt();
			if(a%2==0) {
				System.out.println(">> 짝수입니다.");
			}else {
				System.out.println(">> 홀수입니다.");
			}
			System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) : ");
			b = sc.nextInt();
		}
	}	

}
