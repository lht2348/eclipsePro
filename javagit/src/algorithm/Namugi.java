package algorithm;

import java.util.Scanner;

public class Namugi {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[42];
		for(int i = 0; i < 10; i++) {
			int num = scanner.nextInt();
			a[i] = num % 42;
			b[a[i]] = 1;
			//System.out.println(a[i]); 중간 체크
		}
		scanner.close();
		
		//서로 다른 나머지 개수 구하기
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			if(b[i] != 0 ) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
// 10개 값 저장할 배열, 각각 나눈 것을 그 배열에 다시 재저장
// 그 후 값 비교 카운터