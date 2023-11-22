package javagit;

import java.util.Iterator;
import java.util.Scanner;

public class ManageHeight {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("보고싶은 반을 입력하시오.(0~4)");
		System.out.println("5를 입력 시 모든 반이 나옵니다.");
		int userN = scanner.nextInt();
		ManageHeight manageHeight = new ManageHeight();
		manageHeight.setData(); //데이터 초기화
		manageHeight.printHeight(userN); // printHeight 메서드에 userN 값을 전달하여 해당 반의 키 출력
        
		scanner.close();
	}
	
	int gradeHeights[][];
	
	public void setData() {
		
		gradeHeights = new int[5][];
		gradeHeights[0] = new int[] { 170, 180, 173, 175, 177 };
		gradeHeights[1] = new int[] { 160, 165, 167, 186 };
		gradeHeights[2] = new int[] { 158, 177, 187, 176 };
		gradeHeights[3] = new int[] { 173, 182, 181 };
		gradeHeights[4] = new int[] { 170, 180, 165, 177, 172 };	
	}
	
	
	public void printHeight(int classNo) {
		
		if (0 <= classNo && classNo <= 4) {
			for (int height : gradeHeights[classNo]) {
				System.out.println(height + " ");
			}
			System.out.println();
		}
		else if (classNo == 5) {
		    for (int i = 0; i < gradeHeights.length; i++) {
		        for (int height : gradeHeights[i]) {
		            System.out.print(height + " ");
		        }
		        System.out.println(); // 각 행의 출력이 끝나면 줄 바꿈
		    }
		}
		else {
			System.out.println("없는 반입니다.");
		}
	}
}
