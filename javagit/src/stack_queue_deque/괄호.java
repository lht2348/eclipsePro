package stack_queue_deque;

import java.io.*;
import java.util.*;

public class 괄호 {
	   public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        int T = Integer.parseInt(br.readLine()); // 테스트 갯수 T
	        for (int i = 0; i < T; i++) {
	            String input = br.readLine();
	            bw.write(solve(input) + "\n");
	        }

	        br.close();
	        bw.flush();
	        bw.close();
	   }
	   
	   public static String solve(String s) {
	        Stack<Character> stack = new Stack<>();

	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);

	            if (c == '(') {
	                stack.push(c); // 여는 괄호 '('를 스택에 추가
	            } else if (c == ')') {
	                if (stack.isEmpty()) {
	                    return "NO"; // 닫는 괄호 ')'가 나왔는데 대응하는 여는 괄호가 없는 경우
	                }
	                stack.pop(); // 대응하는 여는 괄호가 있으면 스택에서 제거
	            }
	        }

	        // 문자열을 모두 확인한 후, 스택이 비어있지 않으면 올바른 괄호 문자열이 아님
	        if (!stack.isEmpty()) {
	            return "NO";
	        } else {
	            return "YES"; // 모든 괄호가 정확하게 대응되어 있는 경우
	        }
	    }
	}
//
//push(E item): 스택에 원소를 추가합니다.
//pop(): 스택의 맨 위에 있는(top에 있는) 원소를 제거하고 반환합니다.
//peek(): 스택의 맨 위에 있는(top에 있는) 원소를 반환합니다. 제거하지 않습니다.
//isEmpty(): 스택이 비어있는지 여부를 반환합니다.
//search(Object o): 스택 내에서 주어진 요소를 찾아 상대적 위치를 반환합니다.