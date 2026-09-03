package homework;

public class Example5_07 {

	public static void main(String[] args) {
		int[] a = {3, 2, 4, 1, 5};
		int[] b = {3, 2, 4, 1};
		int[] c = {3, 2, 4, 1, 5};
		int[] d = {2, 7, 1, 8, 2};
		
		System.out.println(vigyo(a,b));
		System.out.println(vigyo(a,c));
		System.out.println(vigyo(c,d));
		System.out.println(vigyo(b,c));
	}
	
	public static boolean vigyo(int[] ar1, int[] ar2) {
		if(ar1.length != ar2.length) {
			return false;
		}
		for(int i=0; i<ar1.length; i++) {
			if(ar1[i] != ar2[i]) {
				return false;
			}
		}
		return true;
	}
}
