package stack_queue_deque;

import java.io.*;
import java.util.*;


public class 제로 {
	   public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        Stack<Integer> stack = new Stack<>();
	        
	        int K = Integer.parseInt(br.readLine()); // 정수 K
	        for (int i = 0; i < K; i++) {
	            int num = Integer.parseInt(br.readLine());

	            if (num == 0) {
	                stack.pop(); // 가장 최근에 쓴 수를 지움
	            } else {
	                stack.push(num); // 해당 수를 스택에 추가
	            }
	        }

	        int sum = 0;
	        while (!stack.isEmpty()) {
	            sum += stack.pop(); // 스택에 남은 모든 수를 더함
	        }
	        bw.write(sum + "\n");

	        br.close();
	        bw.flush();
	        bw.close();
	    }
	}