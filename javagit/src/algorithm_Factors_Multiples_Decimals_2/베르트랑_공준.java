package algorithm_Factors_Multiples_Decimals_2;

import java.io.*;
import java.util.*;

public class 베르트랑_공준 {
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        ArrayList<Integer> prime = new ArrayList<>();
	        
	        for (;;) {
	            int input = Integer.parseInt(br.readLine());
	            if (input == 0) {
	                break; // 입력이 0이면 입력 중단
	            }
	            prime.add(input); // 입력을 ArrayList에 추가
	        }
	        
	        //prime 배열에 들어간 a, b, c, d, e가 2a, 2b, 2c, 2d, 2d 안의 소수의 개수 출력
	        
	        for(int num : prime) {
	        	int count = 0;
	        	for(int j = num; j <= 2*num; j++ ) {
	        		if(j!=num && isPrime(j)) { //자기자신 제외 그리고 소수일때
	        			count ++;
	        		}
	        	}
	        	bw.write(String.valueOf(count));
	        	bw.newLine();
        }
	        
	        br.close();
	        bw.flush();
	        bw.close();
	    }
	    
	    // 주어진 수가 소수인지를 판별하는 함수
	    public static boolean isPrime(int number) {
	        if (number < 2) {
	            return false;
	        }

	        for (int i = 2; i * i <= number; i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
}
