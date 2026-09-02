package method;

import java.util.Arrays;

public class MethodTest {
	
	public static void main(String[] args) {
		int[] numArr = {3, 6, 2, 4, 8};
		
		System.out.println("getSum의 결과값 = "+getSum(numArr));
		System.out.println("getMax의 결과값 = "+getMax(numArr));
		System.out.println("getCount의 결과값 = "+getCount(numArr, 4));
		swapArray(numArr);
		System.out.println("swapArray이후의 numArr = "+Arrays.toString(numArr));
	}
	
	public static int getSum(int[] numArr) {
		if (numArr == null) return -1;
		int sum = 0;
		for(int i=0; i<numArr.length; i++) {
			sum += numArr[i];
		}
		return sum;
	}
	
	public static int getMax(int[] numArr) {
		if (numArr == null) return -1;
		int max = numArr[0];
		
		for(int i=0; i<numArr.length; i++) {
			if(numArr[i] > max) {
				max = numArr[i];
			}
		}
		return max;
	}
	
	public static int getCount(int[] numArr, int target) {
		if (numArr == null) return -1;
		int count = 0;
		
		for(int i=0; i<numArr.length; i++) {
			if(numArr[i] > target) {
				count++;
			}
		}
		return count;
	}
	
	public static void swapArray(int[] numArr) {
		if (numArr != null) {
			int len = numArr.length;
			for(int i=0; i<len/2; i++) {
				int temp = numArr[i];
				numArr[i] = numArr[len-i-1];
				numArr[len-i-1] = temp;
			}
		}
	}
}
