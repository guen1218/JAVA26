package exception;

public class MultiCatchTest {
	
	public static void main(String[] args) {
		System.out.println("==========프로그램 시작=========");
		
		String[] array = {"100", "1oo"};
		
		for(int i=0; i <= array.length; i++) {
			int value;
			try {
				value = Integer.parseInt(array[i]);
				System.out.printf("array[%d]의 value = %d\n", i, value);
			}catch(NumberFormatException e) {
//				System.out.println(e.toString());
				System.out.printf("array[%d]의 값 %s는 숫자가 아님\n", i, array[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println(e.toString());
				System.out.println(i + "는 배열의 범위를 벗아났습니다.");
				
			}
			
			
		}
		

		System.out.println("==========프로그램 종료=========");
	}
}
