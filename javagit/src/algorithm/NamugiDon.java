package algorithm;

import java.util.Scanner;

public class NamugiDon {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        int test = 0;
        
        System.out.print("테스트 수");
        test = scanner.nextInt(); 

        int money[] = new int[test];
        
        for(int i = 0; i < test; i++) {
        	money[i] = scanner.nextInt();
        }
        
        for(int j = 0; j < test; j++) {
            System.out.print(money[j] / 25+" ");
            System.out.print(money[j] % 25 / 10 +" ");
            System.out.print(money[j] % 25 % 10 / 5+" ");
            System.out.println(money[j] % 25 % 10 % 5 / 1);
        }
        
        scanner.close();
	}
}
