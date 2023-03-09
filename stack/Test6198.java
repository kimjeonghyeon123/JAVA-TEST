package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Top {
	int num;
	int height;
	
	Top(int num, int height){
		this.num    = num;
		this.height = height;
	}
}

public class Test6198 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Top> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= N; i++) {
			int height = Integer.parseInt(st.nextToken());
			
			if(stack.isEmpty()) {
				stack.push(new Top(i, height));
				sb.append("0 ");
			}
			else {
				while(true) {
					if(stack.isEmpty()) {
						stack.push(new Top(i, height));
						sb.append("0 ");
						break;
					}
					
					Top top = stack.peek(); 
					if(top.height > height) {
						stack.push(new Top(i, height));
						sb.append(top.num + " ");
						break;
					}
					else {
						stack.pop();
					}
				}
			}
		}
		System.out.println(sb);
	}
}
