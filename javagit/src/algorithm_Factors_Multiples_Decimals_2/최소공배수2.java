package algorithm_Factors_Multiples_Decimals_2;

import java.io.*;
import java.util.*;

public class 최소공배수2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            long lcm = findLCM(a, b);
            bw.write(lcm + "\n");
        

        br.close();
        bw.flush();
        bw.close();
    }


    // 최대공약수를 구하는 메소드
    public static long findGCD(long num1, long num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }

    // 최소공배수를 구하는 메소드
    public static long findLCM(long num1, long num2) {
        return (num1 * num2) / findGCD(num1, num2);
    }
}