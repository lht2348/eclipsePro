package algorithm_hash;

import java.io.*;
import java.util.*;

public class 듣보잡 {
	   public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        String[] inputNM = br.readLine().split(" ");
	        int n = Integer.parseInt(inputNM[0]); // 듣도 못한 사람 n명
	        int m = Integer.parseInt(inputNM[1]); // 보도 못한 사람 m명
	        HashMap<String, Integer> hear = new HashMap<>(); // 듣도 못한 사람
	        HashMap<String, Integer> seeHear = new HashMap<>(); //보지도 듣지도 못한 사람 
	        
	        
	        for (int i = 0; i < n; i++) {
	        	String nothear = br.readLine();
				hear.put(nothear, 0);
			}
	        
	        for (int i = 0; i < m; i++) {
	        	String notSee = br.readLine();
	        	if(hear.containsKey(notSee)) {
	        		seeHear.put(notSee, 0);
	        	}
			}
	        
	        //듣보목록을 List로 변환 후 정렬
	        List<String> sortedList = new ArrayList<>(seeHear.keySet());
	        Collections.sort(sortedList);
	        
	  
	        bw.write(String.valueOf(sortedList.size()));
	        bw.newLine();
	        
	        // 보지도 듣지도 못한 사람 목록 출력
	        for (String person : sortedList) {
	            bw.write(person);
	            bw.newLine();
	        }
	        
	        br.close();
	        bw.flush(); // BufferedWriter의 내용을 모두 출력
	        bw.close(); // BufferedWriter 닫기
	}
}
