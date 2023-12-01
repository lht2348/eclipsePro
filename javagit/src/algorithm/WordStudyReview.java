package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WordStudyReview{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        ArrayList<String> grades = new ArrayList<>();
        HashMap<String, Double> gradesToNumbers = new HashMap<>();

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
        int numberOfSubjects = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        // 사용자로부터 학점과 등급 입력받기
        for (int i = 0; i < numberOfSubjects; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split("\\s+"); // 공백을 기준으로 분할

            if (parts.length >= 3) {
                String grade = parts[2]; // 등급 저장
                if (!grade.equals("P")) { // P가 아닌 등급만 처리
                    double credit = Double.parseDouble(parts[1]); // 학점 저장
                    numbers.add(credit);
                    grades.add(grade);
                }
            } else {
                System.out.println("잘못된 형식입니다.");
            }
        }

        // 전공평점 계산
        double sum = calculateMajorGPA(numbers, grades, gradesToNumbers);
        System.out.println("전공평점: " + sum);

        scanner.close();
    }

    // 전공평점 계산 메서드
    private static double calculateMajorGPA(ArrayList<Double> numbers, ArrayList<String> grades, HashMap<String, Double> gradesToNumbers) {
        double sum = 0.0;
        double creditsum = 0.0;

        for (int i = 0; i < numbers.size(); i++) {
            double credit = numbers.get(i);
            String grade = grades.get(i);

            double gradePoint = gradesToNumbers.get(grade); // 등급에 해당하는 점수 가져오기
            sum += credit * gradePoint; // 학점과 점수를 곱하여 합산
            creditsum += credit; // 총 학점 누적
        }

        if (creditsum > 0) {
            return sum / creditsum; // 전공평점 계산
        } else {
            System.out.println("입력된 학점이 없습니다.");
            return 0.0;
        }
    }
}
