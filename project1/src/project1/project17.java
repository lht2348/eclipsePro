package project1;

import java.util.Scanner;

public class project17 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자를 입력하세요: ");
        char inputChar = scanner.next().charAt(0);

        if (Character.isUpperCase(inputChar)) {
            System.out.println("입력한 문자는 대문자입니다.");
        } else if (Character.isLowerCase(inputChar)) {
            System.out.println("입력한 문자는 소문자입니다.");
        } else {
            System.out.println("입력한 문자는 알파벳이 아닙니다.");
        }

        scanner.close();
    }
}

//위 코드에서는 사용자로부터 문자를 입력받고, Character.isUpperCase() 및 Character.isLowerCase() 
//메서드를 사용하여 입력된 문자가 대문자인지 소문자인지를 판별합니다. 입력된 문자가 알파벳이 아닌 경우에는 "알파벳이 아닙니다."라고 출력합니다.