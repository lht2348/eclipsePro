package stack_queue_deque;

import java.io.*;
import java.util.*;

public class 요세푸스 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int K = sc.nextInt();

	        Queue<Integer> queue = new LinkedList<>();
	        String result = "<";

	        // 원에 앉아 있는 사람들을 큐에 넣기
	        for (int i = 1; i <= N; i++) {
	            queue.offer(i);
	        }

	        // K번째 사람을 제거하는 과정
	        while (!queue.isEmpty()) {
	            for (int i = 0; i < K - 1; i++) {
	                queue.offer(queue.poll());
	            }
	            result += queue.poll() + ", ";
	        }

	        // 마지막 ", " 제거 후 ">" 추가
	        result = result.substring(0, result.length() - 2) + ">";

	        // 결과 출력
	        System.out.println(result);
	    }
}
