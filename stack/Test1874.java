package baekjoon.stack;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Test1874 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> s = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		boolean err = false;
		int start = 1;
		for(int i=0;i<n;i++) {
			int t = Integer.parseInt(br.readLine());
			while(start <= t) {
				s.push(start);
				sb.append("+\n");
				start++;
			}
			if(s.peek()==t) {
				s.pop();
				sb.append("-\n");
			}
			else {
				err = true;
			}
		}
		if(err) {
			System.out.println("NO");
		}
		else {
			System.out.println(sb);
		}
	}
}
