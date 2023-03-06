package kr.co.baekjoon.array;

import java.util.*;

public class test3273 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		int x = sc.nextInt();
		
		Arrays.sort(arr);
		
		int start = 0;
		int end = n-1;
		int sum = 0;
		int result = 0;
		while(start < end) {
			sum = arr[start] + arr[end];
			if(sum==x) result++;
			if(sum<=x) start++;
			else end--;
		}
		
		System.out.println(result);
		sc.close();
	}
}
