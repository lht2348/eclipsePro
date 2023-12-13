package algorithm_Factors_Multiples_Decimals_2;

import java.io.*;

public class 골드바흐_파티션 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test = Integer.parseInt(br.readLine()); 
		boolean prime[] = new boolean[1000001];
        isPrime(prime);
		
		for(int i = 0; i < test; i++) {
			int n = Integer.parseInt(br.readLine());
			int count = 0;
			
            for (int j = 2; j <= n / 2; j++) {
                if (prime[j] && prime[n - j]) {
                    count++;
                }
            }
            bw.write(count + "\n");
        }
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	
	//에라토네체스의 체로 소수 구하기
	public static void isPrime(boolean[] prime) {
		//prime 배열을 모두 true로 초기화 소수로 가정하기
        for (int i = 2; i <= 1000000; i++) {
        	prime[i] = true;
        }

        for (int i = 2; i * i <= 1000000; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                	prime[j] = false;
                }
            }
        }
    }
}