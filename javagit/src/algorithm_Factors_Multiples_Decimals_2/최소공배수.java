package algorithm_Factors_Multiples_Decimals_2;

import java.io.*;
import java.util.*;

public class 최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int lcm = findLCM(a, b);
            bw.write(lcm + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    // 최대공약수를 구하는 메소드
    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }

    // 최소공배수를 구하는 메소드
    public static int findLCM(int num1, int num2) {
        return (num1 * num2) / findGCD(num1, num2);
    }
}