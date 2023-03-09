package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Building {
	int num;
	int height;
	
	Building(int num, int height){
		this.num    = num;
		this.height = height;
	}
}

public class Test6198 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Building> stack = new Stack<>();
		int total = 0;
		
		for(int i=1;i<=N;i++) {
			int height = Integer.parseInt(br.readLine());
			
			if(stack.isEmpty()) {
				stack.push(new Building(i, height));
			}
			else {
				while(stack.peek().height <= height) {
					stack.pop();
					if(stack.isEmpty()) break;
				}
				if(stack.isEmpty()){
					stack.push(new Building(i, height));
				}
				else if(stack.peek().height > height) {
					stack.push(new Building(i, height));
					for(int j=0;j<stack.size()-1;j++) {
						total++;
					}
				}
			}
		}
		System.out.println(total);
	}
}


