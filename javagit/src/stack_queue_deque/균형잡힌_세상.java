package stack_queue_deque;

import java.io.*;
import java.util.*;

public class 균형잡힌_세상 {
	   public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        while (true) {
	            String input = br.readLine();

	            if (input.equals(".")) {
	                break; // 입력 종료 조건 확인
	            }
	            
	            String result = solve(input);
	            bw.write(result + "\n"); // 결과를 BufferedWriter를 이용하여 출력
	        }
	        
	        br.close();
	        bw.flush();
	        bw.close();
	   }
	   
	   public static String solve(String s) {
	        Stack<Character> stack = new Stack<>();

	        for (int i = 0; i < s.length(); i++) {
	        	
	            char c = s.charAt(i);

	            if (c == '(' || c == '[') {
	                stack.push(c); // 여는 괄호 '('나 '['를 스택에 추가
	            } 
	           
	            else if (c == ')') {
	                if (stack.empty() || stack.peek() != '(') {
	                    return "no"; // 닫는 괄호 ')'가 나왔는데 대응하는 여는 괄호가 없거나 짝이 맞지 않는 경우
	                } else {
	                    stack.pop(); // 대응하는 여는 괄호가 있으면 스택에서 제거
	                }
	            } 
	            
	            else if (c == ']') {
	                if (stack.empty() || stack.peek() != '[') {
	                    return "no"; // 닫는 괄호 ']'가 나왔는데 대응하는 여는 괄호가 없거나 짝이 맞지 않는 경우
	                } else {
	                    stack.pop(); // 대응하는 여는 괄호가 있으면 스택에서 제거
	                }
	            }
	        }
	        
	        // 문자열을 모두 확인한 후, 스택이 비어있지 않으면 올바른 괄호 문자열이 아님
	        if (stack.empty()) {
	            return "yes";
	        } else {
	            return "no"; // 모든 괄호가 정확하게 대응되어 있는 경우
	        }
	    }
	}
//
//push(E item): 스택에 원소를 추가합니다.
//pop(): 스택의 맨 위에 있는(top에 있는) 원소를 제거하고 반환합니다.
//peek(): 스택의 맨 위에 있는(top에 있는) 원소를 반환합니다. 제거하지 않습니다.
//isEmpty(): 스택이 비어있는지 여부를 반환합니다.
//search(Object o): 스택 내에서 주어진 요소를 찾아 상대적 위치를 반환합니다.