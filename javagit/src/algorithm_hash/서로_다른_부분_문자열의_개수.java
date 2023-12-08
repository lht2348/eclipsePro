package algorithm_hash;

import java.io.*;
import java.util.*;

public class 서로_다른_부분_문자열의_개수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		String n = br.readLine();
		TreeSet<String> countString = new TreeSet<>();
		
        // 모든 가능한 부분 문자열을 생성하여 countString에 추가
        for (int i = 0; i < n.length(); i++) {
            for (int j = i + 1; j <= n.length(); j++) {
                String subString = n.substring(i, j); // 부분 문자열 생성
                countString.add(subString); // TreeSet에 부분 문자열 추가
            }
        }
        
        bw.write(String.valueOf(countString.size()));
		
        br.close();
        bw.flush(); // BufferedWriter의 내용을 모두 출력
        bw.close(); // BufferedWriter 닫기
	}
}

/*        int count = countUniqueSubstrings(input);
        System.out.println("서로 다른 부분 문자열의 개수: " + count);
    }

    public static int countUniqueSubstrings(String s) {
        Set<String> set = new HashSet<>();

        // 모든 가능한 부분 문자열을 생성하여 Set에 추가
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                set.add(s.substring(i, j));
            }
        }

        // 중복을 제거한 서로 다른 부분 문자열의 개수 반환
        return set.size();
    }
}*/