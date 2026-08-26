package homework;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		int s = sc.nextInt();
		int m = s/60;
		s %= 60;
		int h = m/60;
		m%=60;
		System.out.printf("%d시간 %d분 %d초",h,m,s);
	}

}
