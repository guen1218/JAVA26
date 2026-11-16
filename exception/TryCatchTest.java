package exception;

public class TryCatchTest {
	public static void main(String[] args) {
		System.out.println("==========프로그램 시작=========");
		
		
		arithmentcException();
		IndexException();
		nullPointerException();
		numberFormatException();
		

		System.out.println("==========프로그램 종료=========");
	}

	public static void arithmentcException() {
		
		int a = 10, b = 0;
		
		try {
			int c = a/b;
		} catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
	}
	
	private static void IndexException() {
		int[] array = {0, 1, 2};
		try {
		System.out.println(array[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
	
	private static void nullPointerException() {
		String str = null;
		try {
		str.charAt(1);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	private static void numberFormatException() {
		String str = "123AA";
		try {
			int num = Integer.parseInt(str);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}

	
	
	
}
