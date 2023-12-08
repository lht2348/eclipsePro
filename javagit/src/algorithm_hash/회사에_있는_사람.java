package algorithm_hash;

import java.io.*;
import java.util.*;

public class 회사에_있는_사람 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); // 출입 기록의 수 n
        HashMap<String, String> hMap = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String[] record = br.readLine().split(" ");
            String name = record[0];
            String status = record[1];
            hMap.put(name, status); // 상태 업데이트
        }
        
        // HashMap의 키(key) 값을 가져와서 역순으로 정렬합니다.
        ArrayList<String> sortedKeys = new ArrayList<>(hMap.keySet());
        Collections.sort(sortedKeys, Collections.reverseOrder());
        
        for(String key : sortedKeys) {
        	if(hMap.get(key).equals("enter")) {
        		bw.write(key);
                bw.newLine(); // 개행 추가
        	}
        }
        
        br.close();
        bw.flush(); // BufferedWriter의 내용을 모두 출력
        bw.close(); // BufferedWriter 닫기
   }
}
