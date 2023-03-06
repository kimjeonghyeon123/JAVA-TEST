package kr.co.baekjoon.array;

import java.util.Scanner;

public class test10808 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int count;
		for(int i=97;i<123;i++) {
			count = 0;
			for(int j=0;j<s.length();j++) {
				if(i==s.charAt(j))
					count++;
			}
			System.out.print(count + " ");
		}
		
		sc.close();
	}
}
