package homework;

import java.util.Scanner;

public class Example5_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		float p = sc.nextFloat();
		
		char[][] maparr = new char[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(Math.random()<p) {
					maparr[i][j] = '*';
				}else {
					maparr[i][j] = '-';
				}
			}
		}
		
		String[][] daparr = new String[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(maparr[i][j] == '*') {
					daparr[i][j] = "*";
					continue;
				}
				int count = 0;
				
				if(i!=0) {
					if(maparr[i-1][j] == '*') count ++; // 상
				}
				if(i!=m-1) {
					if(maparr[i+1][j] == '*') count ++; // 하
				}
				if(j!=0) {
					if(maparr[i][j-1] == '*') count ++; // 좌
				}
				if(j!=n-1) {
					if(maparr[i][j+1] == '*') count ++; // 우
				}
				if(i!=0 && j!=0) {
					if(maparr[i-1][j-1] == '*') count ++; // 상좌
				}
				if(i!=m-1 && j!=n-1) {
					if(maparr[i+1][j+1] == '*') count ++; // 하우
				}
				if(i!=m-1 && j!=0) {
					if(maparr[i+1][j-1] == '*') count ++; // 하좌
				}
				if(i!=0 && j!=n-1) {
					if(maparr[i-1][j+1] == '*') count ++; // 상우
				}
				
				daparr[i][j] = count+"";
			}
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(daparr[i][j]+" ");
				}
			System.out.println();
		}
	}
}

