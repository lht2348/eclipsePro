package javagit;
import java.util.Scanner;

public class operator {
	//전역 변수
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 2개 입력하세요");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
	
		int plus = plusMe(num1, num2);
		System.out.println("두 정수의 합 = " + plus);
		
		scanner.close(); // 스캐너 사용 후 닫기
	}

	
	public static int plusMe(int a, int b) {
		return a + b;
	//두 정수의 합을 반환하는 메서드
	}
	
}
