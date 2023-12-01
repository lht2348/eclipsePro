package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class WordStudy {
	/*
	전공평점 = 학점*과목평점 P의 경우 계산에서 제외
 	 */
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> numbers = new ArrayList<>();
		ArrayList<String> grades = new ArrayList<>();
		HashMap<String, Double> gradesToNumbers = new HashMap<>();
		int getsoo = 0;
		double gradeMaping = 0.0;
		double credit = 0.0;
		double creditsum = 0.0;
		double sum = 0.0;
		String grade = "";
		
		// 학점과 점수 매핑
		gradesToNumbers.put("A+", 4.5);
		gradesToNumbers.put("A0", 4.0);
		gradesToNumbers.put("B+", 3.5);
		gradesToNumbers.put("B0", 3.0);
		gradesToNumbers.put("C+", 2.5);
        gradesToNumbers.put("C0", 2.0);
        gradesToNumbers.put("D+", 1.5);
        gradesToNumbers.put("D0", 1.0);
        gradesToNumbers.put("F", 0.0);
        gradesToNumbers.put("P", -1.0);
		
		System.out.println("과목 수");
		getsoo = scanner.nextInt();
		scanner.nextLine(); // 엔터키 소진하기
		
		for(int i = 0; i < getsoo; i++) {
			String input = scanner.nextLine();
			String parts[] = input.split("\\s+"); //공백을 기준으로 분할, \\s+는 하나 이상의 공백을 의미하는 정규 표현식
			
			if(parts.length >= 3) {
				grade = parts[2]; // 성적 저장
				
				if(!grade.equals("P")) { // P일시 처리X
					credit = Double.parseDouble(parts[1]); //학점 문자열을 double로 변환하여 학점 저장
					numbers.add(credit);
					grades.add(grade);
					gradeMaping = gradesToNumbers.get(grade); // 등급에 해당하는 점수 가져오기
					
					for(int j = 0; j < getsoo; j++) {
						creditsum += credit;
						sum += credit * gradeMaping; // 전공평점 = 학점*과목평점
					}
				}
			}else {
				System.out.println("잘못된 형식입니다.");
			}
		}

		
		System.out.println("전공평점: " + sum / creditsum);
		scanner.close();
	}
}
