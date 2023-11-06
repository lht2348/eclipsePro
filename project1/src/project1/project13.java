package project1;

import java.util.Scanner;

public class project13 {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 표준 입력(System.in)을 읽을 준비를 합니다.
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 입력을 요청합니다.
        System.out.print("정수를 입력하세요: ");

        // 사용자의 입력을 읽습니다.
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        // 입력 받은 값을 출력합니다ddd.
        System.out.println("입력한 정수: " + number1 + number2);

        // Scanner를 닫습니다.
        scanner.close();
    }
}
