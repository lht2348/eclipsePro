package algorithm;

import java.util.Scanner;

public class CharArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//String s = scanner.next();
		//int i = scanner.nextInt();
		
		/*
		System.out.println(s.charAt(i-1));
		System.out.println(s.length());
		*/
		
		/* char를 int로 형변환하여 아스키 코드 값 얻기
		int asciiValue = (int) ch; 
		*/
		
		//아스키 코드값 string으로 변환하기 위해 ""추가 or String.valueof()추가하기
		//System.out.println(""+s.charAt(i-1)+s.charAt(s.length()-1));
		
		/* 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력
		for(int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			for(int z = 0; z < i; z++) {
				System.out.print(c);
			}
			}
			*/
			
			/*nextLine으로 " "도 인식
			String s = scanner.nextLine();
			String split[] = s.split(" ");
		System.out.println(split.length);
		for(int j = 0; j < split.length; j++) {
			System.out.println(split[j]);
		}
		*/
		
		scanner.close();
	}
}


//indexOf() 메서드는 주어진 문자 또는 패턴의 첫 번째 발생 위치를 반환
//charAt() 메서드는 해당 인덱스에 위치한 문자를 반환합니다