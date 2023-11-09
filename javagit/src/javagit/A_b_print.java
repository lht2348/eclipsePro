package javagit;

import java.io.Closeable;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.Scanner;

public class A_b_print {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String any = scanner.next();
		int n = scanner.nextInt();
		
		String returnAny = returnAnymethod(any, n);
		System.out.print("출력 : " + returnAny);
	
		scanner.close();
	}	
	
	public static String returnAnymethod(String any, int n) {
		StringBuilder resutl = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			resutl.append(any);
		}
		
		return resutl.toString();
		
		//new 인스턴트 만들기
		//클래스는 필드와 메소드를 가짐
	}
	
}