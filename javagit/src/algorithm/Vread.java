package algorithm;

import java.util.Iterator;
import java.util.Scanner;

public class Vread {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 흰 도화지 생성
        int[][] whitePaper = new int[100][100];

        // 색종이 수 입력
        int n = scanner.nextInt();
        
        // 색종이를 도화지에 붙이기
        for (int k = 0; k < n; k++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    whitePaper[i][j] = 1;
                }
            }
        }
        
        //좌표값이 1 넣을 sum
        int sum = 0;
        
        //좌표값1이면 sum에 넣기
        for(int i = 0; i < 100; i++) {
        	for(int j = 0; j < 100; j++) {
        		if(whitePaper[i][j] == 1) {
        			sum++;
        		}
        	}
        }
        System.out.println(sum);
        scanner.close();
	}
}