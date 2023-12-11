package algorithm_Factors_Multiples_Decimals_2;

import java.io.*;
import java.util.*;

public class 가로수 {
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	        int N = Integer.parseInt(br.readLine()); // 이미 심어져 있는 가로수의 수
	        int[] trees = new int[N]; // 가로수의 위치를 저장할 배열

	        // 가로수의 위치 입력 받기
	        for (int i = 0; i < N; i++) {
	            trees[i] = Integer.parseInt(br.readLine());
	        }

	        Arrays.sort(trees); // 가로수의 위치를 정렬

	        int[] intervals = new int[N - 1]; // 각 가로수 간의 간격을 저장할 배열

	        // 가로수 간의 간격 구하기
	        for (int i = 0; i < N - 1; i++) {
	            intervals[i] = trees[i + 1] - trees[i];
	        }

	        // 모든 가로수 간의 간격의 최대공약수 구하기
	        int gcd = findGCD(intervals);

	        // 추가로 필요한 가로수의 수 계산
	        int additionalTrees = 0;
	        for (int interval : intervals) {
	            additionalTrees += (interval / gcd) - 1;
	        }

	        bw.write(String.valueOf(additionalTrees));
	        br.close();
	        bw.flush();
	        bw.close();
	    }

	    // 최대공약수를 구하는 메소드
	    public static int findGCD(int[] nums) {
	        int result = nums[0];
	        for (int i = 1; i < nums.length; i++) {
	            result = gcd(result, nums[i]);
	        }
	        return result;
	    }

	    // 최대공약수 계산을 위한 유클리드 호제법
	    public static int gcd(int a, int b) {
	        if (b == 0) {
	            return a;
	        }
	        return gcd(b, a % b);
	    }
}
