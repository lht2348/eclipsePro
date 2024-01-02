package stack_queue_deque;

import java.io.*;
import java.util.*;

public class 간식드리미 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int student = 1;
        Stack<Integer> stack = new Stack<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int n2 = Integer.parseInt(st.nextToken());
            
            // 스택이 차있고, 맨 위 스택의 번호가 받을 학생 번호와 같을 시
            while (!stack.empty() && stack.peek() == student) {
                stack.pop(); // 스택 맨 위 학생 제거
                student++; // 다음 받을 학생 번호
            }
            
            // 대기열 학생 번호가 받아야할 학생 번호와 같지 않으면 스택에 넣기
            if (n2 == student) {
                student++;
            } else {
                stack.push(n2);
            }
        }
        
        br.close();

        // 모든 학생이 순서대로 받는지 판단
        while (!stack.empty() && stack.peek() == student) {
            stack.pop();
            student++;
        }

        if (stack.empty()) {
            bw.write("Nice");
        } else {
            bw.write("Sad");
        }

        bw.flush();
        bw.close();
    }
}
