package kr.co.baekjoon.array;

import java.util.Scanner;

public class test2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int M = A * B * C;
		char[] arr = String.valueOf(M).toCharArray();
		
		int count;
		for(int i=48;i<58;i++) {
			count = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j] == i)
					count++;
			}
			System.out.println(count);
		}
		sc.close();
		System.exit(0);
	}
}
