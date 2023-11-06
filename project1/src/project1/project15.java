package project1;

import java.util.Scanner;

public class project15 {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 표준 입력(System.in)을 읽을 준비를 합니다.
        Scanner scanner = new Scanner(System.in);

        System.out.print("세 정수를 입력하세요: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // 버블 정렬을 사용하여 세 숫자를 정렬
        int temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("정렬된 숫자는 " + num1 + ", " + num2 + ", " + num3 + "입니다.");

        scanner.close();
    }
}