package stack_queue_deque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        // 카드 번호를 큐에 넣기
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        // 카드 처리
        while (queue.size() > 1) {
            queue.poll(); // 맨 위에 있는 카드 버리기
            int topCard = queue.poll(); // 그 다음 맨 위에 있는 카드를 가져와서
            queue.offer(topCard); // 맨 밑으로 옮기기
        }

        // 마지막으로 남는 카드 출력
        System.out.println(queue.peek());
    }
}