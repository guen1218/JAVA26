package homework;
import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 999 사이의 숫자를 입력하세요 : ");
		int a = sc.nextInt();
		int t = a%10;
		int tw = a/10%10;
		int o = a/100;
		System.out.println("각 자릿수의 합 = "+(t+tw+o));
	}

}
