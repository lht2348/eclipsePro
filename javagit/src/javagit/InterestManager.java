package javagit;

import java.util.Iterator;
import java.util.Scanner;

public class InterestManager {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("day를 입력하시오.");
		int day = scanner.nextInt();
	
		System.out.print("입금할 돈의 액수를 입력하시오.");
		long amount = scanner.nextLong();
		
		double doubleDay = getInterestRate(day);
		//int를 double로 변환하고 이율을 계산하는 메서드
		double result = calculateAmount(doubleDay, amount);
		
		System.out.println("날짜에 따른 이율 : " + doubleDay + "%");
		System.out.println("이자 : " + result + "원");
		
		for(int exDay=10; exDay<=370; exDay+=10) {
			double exAmount = calculateAmount(doubleDay, amount);
			System.out.println(exDay+":"+amount+" ");
		}
		
		scanner.close();
	}
	
	public static double getInterestRate(int day) {
		double rate;
		
		if (1 <= day && day < 91) {
			rate = 0.005;
		}
		else if (91<= day && day < 181) {
			rate = 0.01;
		}
		else if (181 <= day && day < 365) {
			rate = 0.02;
		}
		else if (365<= day) {
			rate = 0.056;
		}
		else {
			rate = 0;
		}
		return rate;
	}
	
	public static double calculateAmount(double rate, long amount) {
		return rate * amount;
	}
	
}

