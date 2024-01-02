package stack_queue_deque;

import java.io.*;
import java.util.*;

public class 큐2 {
	   public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        Queue<Integer> queue = new LinkedList<>();
	        
	        int n = Integer.parseInt(br.readLine());
	        
	        for(int i = 0; i < n; i++) {
	        	String[] command = br.readLine().split(" ");
	        	
	            switch (command[0]) {
	            
	            //큐에 수를 넣기
                case "push":
                    int X = Integer.parseInt(command[1]);
                    queue.offer(X);
                    break;
                
                // 빈 경우 -1 출력, 안 비어있는 경우 pop으로 밴앞 정수를 제거후 출력
                case "pop":
                    if (queue.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(queue.poll() + "\n");
                    }
                    break;
                    
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                    
                case "empty":
                    bw.write(queue.isEmpty() ? "1\n" : "0\n");
                    break;
                    
                //peek 큐의 맨 앞의 요소를 반환 빈 경우 null
                case "front":
                    bw.write(queue.isEmpty() ? "-1\n" : queue.peek() + "\n");
                    break;
                
                //LinkedList 클래스의 peekLast로 맨 뒤에 요소 확인
                case "back":
                    bw.write(queue.isEmpty() ? "-1\n" : ((LinkedList<Integer>) queue).peekLast() + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}