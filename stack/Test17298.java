package baekjoon.stack;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

class NGE {
	int sequence;
	int num;
	
	NGE(int sequence, int num){
		this.sequence = sequence;
		this.num      = num;
	}
}

public class Test17298 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<NGE> stack = new Stack<>();
		
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = -1;
		}
		
		for(int i=1;i<=N;i++) {
			int temp = Integer.parseInt(st.nextToken());
			if(stack.isEmpty()) {
				stack.push(new NGE(i, temp));
			}
			else {
				while(stack.peek().num < temp) {
					arr[stack.pop().sequence - 1] = temp;
					if(stack.isEmpty()) break;
				}
				stack.push(new NGE(i, temp));
			}
		}
		
		for(int i=0;i<N;i++) {
			bw.write(arr[i] + " ");
		}
		
		bw.flush();
	}
}
