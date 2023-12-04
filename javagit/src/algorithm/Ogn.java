package algorithm;

import java.util.Scanner;

public class Ogn {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        //fn = a1n + a0 입력받기
        int a0 = scanner.nextInt();
        int a1 = scanner.nextInt();
        int c = scanner.nextInt();
        int n0 = scanner.nextInt();
        
        boolean ox = true;
        
        for (int n = n0; n <= 100; n++) {
			int fn = a1 * n + a0;
			int cn = c * n;
			if(fn > cn) {
				ox = false;
				break;
			}
        }  
        if(ox) {
			System.out.print("1");
		}else {
			System.out.print("0");
		}
        scanner.close();
    }
}

/*
O(g(n)) = {f(n) | 모든 n ≥ n0에 대하여 f(n) ≤ c × g(n)인 양의 상수 c와 n0가 존재한다}
함수 f(n) = a1n + a0, 양의 정수 c, n0가 주어질 경 우 O(n) 정의를 만족하는지 알아보자.

입력
첫째 줄에 함수 f(n)을 나타내는 정수 a1, a0가 주어진다. (0 ≤ |ai| ≤ 100)
다음 줄에 양의 정수 c가 주어진다. (1 ≤ c ≤ 100)
다음 줄에 양의 정수 n0가 주어진다. (1 ≤ n0 ≤ 100)

출력
f(n), c, n0가 O(n) 정의를 만족하면 1, 아니면 0을 출력한다.
*/
