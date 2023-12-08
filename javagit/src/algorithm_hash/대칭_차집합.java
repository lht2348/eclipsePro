package algorithm_hash;

import java.io.*;
import java.util.*;

public class 대칭_차집합 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	        String[] inputAB = br.readLine().split(" ");
	        int a = Integer.parseInt(inputAB[0]); // 집합 A 원소 개수
	        int b = Integer.parseInt(inputAB[1]); // 집합 B 원소 개수
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); //공백 구분
	        HashMap<Integer, Integer> aMap = new HashMap<>();
	        HashMap<Integer, Integer> bMap = new HashMap<>();

	        for (int i = 0; i < a; i++) {
	            int inputA = Integer.parseInt(st.nextToken());
	            aMap.put(inputA, 0);
	        }
	        
	        st = new StringTokenizer(br.readLine(), " "); // 다시 StringTokenizer 초기화
	        for (int i = 0; i < b; i++) {
	            int inputB = Integer.parseInt(st.nextToken());
	            bMap.put(inputB, 0);
	        }
	        
	        // aMap과 bMap의 대칭 차집합 구하기
	        HashMap<Integer, Integer> abMap = new HashMap<>(aMap);
	        abMap.keySet().removeAll(bMap.keySet());
	        bMap.keySet().removeAll(aMap.keySet());
	        abMap.putAll(bMap);
	        
	        int count = abMap.size();
	        
	        bw.write(String.valueOf(count)); // int를 string값으로 변환 후 출력
	        bw.newLine(); // 개행
	        
	        br.close();
	        bw.flush(); // BufferedWriter의 내용을 모두 출력
	        bw.close(); // BufferedWriter 닫기
		}
	}