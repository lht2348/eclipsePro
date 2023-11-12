package javagit;

import java.util.Scanner;

public class String_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 대소문자 바꾸기
		//특수문자 출력(유니코드나 ""로 문자열 변환을 통해 구현)
		//홀짝 구분(if을 통해 %2로 나머지 유무를 통한 구분)
		Scanner scanner = new Scanner(System.in);
		StringBuilder sBuilder = new StringBuilder();
		
        String originalString = scanner.next();
        String upperCaseString = originalString.toUpperCase();
        String lowerCaseString = originalString.toLowerCase();

        System.out.println("Original String: " + originalString);
        System.out.println("Upper Case: " + upperCaseString);
        System.out.println("Lower Case: " + lowerCaseString);
        
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : originalString.toCharArray()) {
            if (Character.isUpperCase(c)) {
                stringBuilder.append(Character.toLowerCase(c));
            } else {
                stringBuilder.append(Character.toUpperCase(c));
            }
        }

        String swappedCaseString = stringBuilder.toString();

        System.out.println("Original String: " + originalString);
        System.out.println("Swapped Case: " + swappedCaseString);
        
        
    }
}

