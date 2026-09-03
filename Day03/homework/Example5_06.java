package homework;

import java.util.Arrays;

public class Example5_06 {

	public static void main(String[] args) {
		int[] org = {10, 20, 300, 40, 50};
		int[] rearr = reverse(org);
		System.out.println(Arrays.toString(rearr));
	}
	
	public static int[] reverse(int[] org) {
		int[] rearr = new int[org.length];
		for(int i=0; i<rearr.length; i++) {
			rearr[i] = org[rearr.length-1-i];
		}
		return rearr;
	}
}
