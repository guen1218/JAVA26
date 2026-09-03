package homework;

import java.util.Scanner;

public class Example5_05 {

	public static void main(String[] args) {
		System.out.println("숫자를 10개 입력하세요.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		
		int[] star = {0,0,0,0,0,0,0,0,0,0};
		for(int j=0; j<arr.length; j++) {
			if(arr[j]>=0 && arr[j]<10) {
				star[0]++;
			}else if(arr[j]>=10 && arr[j]<20) {
				star[1]++;
			}else if(arr[j]>=20 && arr[j]<30) {
				star[2]++;
			}else if(arr[j]>=30 && arr[j]<40) {
				star[3]++;
			}else if(arr[j]>=40 && arr[j]<50) {
				star[4]++;
			}else if(arr[j]>=50 && arr[j]<60) {
				star[5]++;
			}else if(arr[j]>=60 && arr[j]<70) {
				star[6]++;
			}else if(arr[j]>=70 && arr[j]<80) {
				star[7]++;
			}else if(arr[j]>=80 && arr[j]<90) {
				star[8]++;
			}else if(arr[j]>=90 && arr[j]<100) {
				star[9]++;
			}
		}
		for(int k=0; k<arr.length; k++) {
			if(k==0) {
				System.out.print(" 0 ~  9 : ");
			}else {
				System.out.printf("%d0 ~ %d9 : ",k,k);
			}
			for(int a=0; a<star[k]; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
