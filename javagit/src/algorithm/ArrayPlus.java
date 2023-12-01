package algorithm;

import java.util.Scanner;

public class ArrayPlus {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요: ");
        int sizeN = scanner.nextInt();
        int sizeM = scanner.nextInt();
		
		int arrayA[][] = new int[sizeN][sizeM];
		int arrayB[][] = new int[sizeN][sizeM];
		int sum[][] = new int[sizeN][sizeM];
		
	    System.out.println("배열 A의 요소를 입력하세요:");
	    for (int i = 0; i < sizeN; i++) {
	        for (int j = 0; j < sizeM; j++) {
	            arrayA[i][j] = scanner.nextInt();
	        }
	    }
	    
	    System.out.println("배열 B의 요소를 입력하세요:");
	    for (int i = 0; i < sizeN; i++) {
	        for (int j = 0; j < sizeM; j++) {
	            arrayB[i][j] = scanner.nextInt();
	        }
	    }
	    for(int i = 0; i < sizeN; i++) {
	    	for(int j = 0; j < sizeM; j++) {
	    		sum[i][j] = arrayA[i][j] + arrayB[i][j];
	    		System.out.print(sum[i][j] +" ");
	    	}
	    }
	    scanner.close();
	}
}