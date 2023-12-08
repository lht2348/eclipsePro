package algorithm_hash;

import java.io.*;
import java.util.*;

public class 숫자카드 {
	 public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		  
		 int n = Integer.parseInt(br.readLine()); // 가진 카드 숫자
		 StringTokenizer st = new StringTokenizer(br.readLine(), " "); //공백 구분
		 HashMap<String, Integer> truefalse = new HashMap<>();
		 
	        // 상근이가 가진 숫자 카드를 HashMap에 저장
	        for (int i = 0; i < n; i++) {
	            String card = st.nextToken();
	            truefalse.put(card, 0);
	        }

	        int m = Integer.parseInt(br.readLine()); // 주어지는 카드 숫자

	        // 주어진 카드를 확인하여 결과 출력
	        st = new StringTokenizer(br.readLine(), " "); // 다시 StringTokenizer 초기화
	        for (int i = 0; i < m; i++) {
	            String card = st.nextToken();
	            if (truefalse.containsKey(card)) {
	                bw.write("1 ");
	            } else {
	                bw.write("0 ");
	            }
	        }

	        br.close();
	        bw.flush(); // BufferedWriter의 내용을 모두 출력
	        bw.close(); // BufferedWriter 닫기
	 }
}