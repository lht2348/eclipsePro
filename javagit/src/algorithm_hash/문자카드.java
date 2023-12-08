package algorithm_hash;

import java.io.*;
import java.util.*;

public class 문자카드 {
	   public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        String[] inputNM = br.readLine().split(" ");
	        int n = Integer.parseInt(inputNM[0]); // 문자열의 개수 N
	        int m = Integer.parseInt(inputNM[1]); // 검사해야 하는 문자열 개수 M

	        HashMap<String, Integer> hMap = new HashMap<>();
	        
	        for (int i = 0; i < n; i++) {
	        	String word = br.readLine();
				hMap.put(word, i);
			}
	        
	        int count = 0;
	        
	        // 주어진 카드를 확인하여 결과 출력
	        for (int i = 0; i < m; i++) {
	            String checkword = br.readLine();
	            if (hMap.containsKey(checkword)) {
	                count ++;
	            }
	        }
	        
	        bw.write(Integer.toString(count)); // int를 String으로 변환하여 출력
	        
	        br.close();
	        bw.flush(); // BufferedWriter의 내용을 모두 출력
	        bw.close(); // BufferedWriter 닫기
	   }
}
