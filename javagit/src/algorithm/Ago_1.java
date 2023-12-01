package algorithm;

import java.util.Scanner;

public class Ago_1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		//N개의 정수 입력받기
		int N = scanner.nextInt();
		
		//입력한 정수 배열에 넣기
		int numbers[] = new int[N];
		for(int i = 0; i < N; i++) {
			 numbers[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		//최대 최소 초기화, 비교
		int max = numbers[0];
		int min = numbers[0];
		
        for (int i = 1; i < N; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // 결과 출력
        System.out.println(min + " " + max);
	}
}
