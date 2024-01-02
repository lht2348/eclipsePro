package stack_queue_deque;

import java.io.*;
import java.util.*;

public class 스택2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine()); // 명령의 수 N
        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "1":
                    int num = Integer.parseInt(command[1]);
                    stack.push(num);
                    break;
                case "2":
                    if (stack.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(stack.pop() + "\n");
                    }
                    break;
                case "3":
                    bw.write(stack.size() + "\n");
                    break;
                case "4":
                    bw.write(stack.isEmpty() ? "1\n" : "0\n");
                    break;
                case "5":
                    if (stack.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(stack.peek() + "\n");
                    }
                    break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

//스택은 후입선출구조 스택은 가장 최근에 저장된 값 다음에 저장되며, 가장 최근에 저장된 값이 먼저 나간다.
//LIFO(Last In First Out) 원칙