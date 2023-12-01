package algorithm;

import java.util.Iterator;
import java.util.Scanner;

public class MaxWhere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0; // 최댓값을 저장할 변수 초기화
        int index = 0; // 최댓값이 있는 인덱스를 저장할 변수 초기화

        for (int i = 1; i <= 9; i++) {
            int num = scanner.nextInt(); // 자연수 입력받기
            if (num > max) { // 최댓값 갱신 조건
                max = num;
                index = i; // 최댓값의 인덱스 갱신
            }
        }

        scanner.close();

        System.out.println(max); // 최댓값 출력
        System.out.println(index); // 최댓값의 인덱스 출력
    }
}
