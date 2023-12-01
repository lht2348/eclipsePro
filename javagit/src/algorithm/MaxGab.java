package algorithm;

import java.util.Scanner;

public class MaxGab {
	public static void main() {
        Scanner scanner = new Scanner(System.in);

        int maxVal = 0;
        int row = 0;
        int col = 0;

        int[][] grid = new int[9][9];

        // 9x9 격자판 입력 받기
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = scanner.nextInt();

                // 최댓값과 그 위치 찾기
                if (grid[i][j] > maxVal) {
                    maxVal = grid[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        // 최댓값과 그 위치 출력
        System.out.println(maxVal);
        System.out.println(row + " " + col);
        scanner.close();
    }
}
