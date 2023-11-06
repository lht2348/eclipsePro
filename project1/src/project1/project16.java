package project1;

import java.util.Scanner;

public class project16 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("양수인 정수를 입력하세요: ");
	        int number = scanner.nextInt();

	        boolean isPrime = true;

	        if (number <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(number); i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        if (isPrime) {
	            System.out.println("입력한 숫자는 소수입니다.");
	        } else {
	            System.out.println("입력한 숫자는 소수가 아닙니다.");
	        }

	        scanner.close();
	    }
	}