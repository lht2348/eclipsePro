package algorithm_hash;

import java.io.*;
import java.util.*;

public class 포켓몬마스터 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        String[] inputNM = br.readLine().split(" ");
        int n = Integer.parseInt(inputNM[0]); // 문자열의 개수 N
        int m = Integer.parseInt(inputNM[1]); // 검사해야 하는 문자열 개수 M

        HashMap<String, Integer> nameToNum = new HashMap<>();
        HashMap<Integer, String> numToName = new HashMap<>();

        for (int i = 1; i < n + 1; i++) {
            String poketName = br.readLine();
            nameToNum.put(poketName, i); // 이름을 키로, 번호를 값으로 저장
            numToName.put(i, poketName); // 번호를 키로, 이름을 값으로 저장
        }
        
        for (int i = 0; i < m; i++) {
            String checkString = br.readLine();
            if (Character.isDigit(checkString.charAt(0))) {
                int checkint = Integer.parseInt(checkString);
                bw.write(numToName.getOrDefault(checkint, ""));
                bw.newLine();
            } else {
                bw.write(nameToNum.getOrDefault(checkString, 0).toString());
                bw.newLine();
            }
        }
        
        br.close();
        bw.flush(); // BufferedWriter의 내용을 모두 출력
        bw.close(); // BufferedWriter 닫기
	}
}

/* 시간초과 구문
HashMap<String, Integer> hMap = new HashMap<>();

//포켓몬 이름 입력과 번호 맵핑
for (int i = 1; i < n+1; i++) {
	String poketName = br.readLine();
	hMap.put(poketName, i); // 1번부터 시작
}

for (int i = 0; i < m; i++) {
    String checkString = br.readLine();
    if(Character.isDigit(checkString.charAt(0))) {
    	int checkint = Integer.parseInt(checkString);
    		for(String key : hMap.keySet()) {
    			if (hMap.get(key) == checkint) {
					bw.write(key);
					bw.newLine();
					break;
				}
    		}
    	}else {
			bw.write(hMap.get(checkString).toString());
			bw.newLine();
		}
    }
    */