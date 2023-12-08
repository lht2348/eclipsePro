package algorithm_hash;

import java.io.*;
import java.util.*;

public class 숫자카드2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(br.readLine()); // 가진 카드 숫자	
		HashMap<Integer, Integer> fnumber = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); //공백 구분
		
	       // 상근이가 가진 숫자 카드를 HashMap에 저장
        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(st.nextToken());
            fnumber.put(card, fnumber.getOrDefault(card, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine()); // 주어지는 카드 숫자
        st = new StringTokenizer(br.readLine(), " "); // 다시 StringTokenizer 초기화
        
        // 카드 개수 확인 및 결과 문자열 생성
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int checkNumber = Integer.parseInt(st.nextToken());
            if (fnumber.containsKey(checkNumber)) {
                result.append(fnumber.get(checkNumber)).append(" ");
            } else {
                result.append("0 ");
            }
        }

        bw.write(result.toString().trim()); // 결과 문자열을 BufferedWriter를 통해 출력
        bw.newLine(); // 개행
        
        br.close();
        bw.flush(); // BufferedWriter의 내용을 모두 출력
        bw.close(); // BufferedWriter 닫기
	}
}
