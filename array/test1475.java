package kr.co.baekjoon.array;
import java.util.Scanner;

public class test1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		
		int[] arr = new int[10];
		
		for(int i=0;i<N.length();i++) {
			int num = N.charAt(i) - 48;
			if(num == 6)
				arr[9]++;
			else
				arr[num]++;
		}
		if(arr[9] % 2 == 0){
			arr[9] = arr[9] / 2;
		}
		else {
			arr[9] = arr[9] / 2 + 1;
		}
		int max = arr[0];
		
		for(int i=1;i<10;i++)
			if(max < arr[i])
				max = arr[i];
		
		System.out.println(max);
				
		sc.close();
	}
}
