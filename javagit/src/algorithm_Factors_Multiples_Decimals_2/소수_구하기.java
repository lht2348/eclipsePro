package algorithm_Factors_Multiples_Decimals_2;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 소수_구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()); // n~m까지의 범위 입력
        ArrayList<Integer> prime = new ArrayList<>();
        
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                prime.add(i); // 소수인 경우 prime 리스트에 추가
            }
        }
        
        // prime 리스트 출력
        for (int i = 0; i < prime.size(); i++) {
            bw.write(prime.get(i) + "\n");
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