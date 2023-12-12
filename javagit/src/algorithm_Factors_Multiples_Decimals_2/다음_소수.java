package algorithm_Factors_Multiples_Decimals_2;

import java.io.*;

public class 다음_소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long inputN[] = new long[n];
        
        //테스트 할 숫자 입력
        for (int i = 0; i < n; i++) {
            inputN[i] = Long.parseLong(br.readLine());
        }

        // 주어진 수보다 크거나 같은 소수 중 가장 작은 소수를 찾아 출력
        for (int i = 0; i < n; i++) {
            long n2 = inputN[i];
            long nextPrime = findNextPrime(n2);
            bw.write(nextPrime + "\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }

    // 주어진 수보다 크거나 같은 소수 중 가장 작은 소수를 찾는 함수
    public static long findNextPrime(long n2) {
        if (n2 <= 1) {
            return 2;
        }

        if (isPrime(n2)) {
            return n2;
        }

        while (!isPrime(n2)) {
            n2++;
        }

        return n2;
    }

    // 소수인지를 판별하는 함수
    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }

        for (long i = 2; i * i <= number; i++) { // i를 long으로 변경
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}