package com.ki;

import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // (과목별점수 x 과목평점)를 학점의 총합으로 나눈값이 전공 평점!

        // 학점 x 과목평점 들의 합을 저장할 변수 sum 선언 및 초기화
        double sum = 0;
        // 학점의 합을 저장할 변수 ScoreSum 선언 및 초기화
        double scoreSum = 0;

        // 등급별 과목평점을 반환할 해쉬맵 생성
        HashMap<String, Double> gradeScore = new HashMap<>();
        gradeScore.put("A+", 4.5);
        gradeScore.put("A0", 4.0);
        gradeScore.put("B+", 3.5);
        gradeScore.put("B0", 3.0);
        gradeScore.put("C+", 2.5);
        gradeScore.put("C0", 2.0);
        gradeScore.put("D+", 1.5);
        gradeScore.put("D0", 1.0);
        gradeScore.put("F", 0.0);
        gradeScore.put("P", 0.0);

        // 문자열 하나를 20번 입력받기 위해 반복문 추가
        for(int i = 0; i < 20; i++) {
            String str = sc.nextLine();

            // 입력받은 문자열을 공백을 기준으로 나눈 후
            String[] map = str.split(" ");
            // 인덱스 1의 값은 성적, 인덱스 2의 값은 등급을 점수로 변환
            double score = Double.parseDouble(map[1]);
            double pScore = gradeScore.get(map[2]);

            if(!map[2].equals("P")) {
                // 곱한 값 sum에 더하기
                sum += score * pScore;
                // 학점의 합에 학점 더하기
                scoreSum += score;
            }
            // 인덱스1 x 인덱스2 등급에 해당하는 과목평점 -> 차례대로 sum에 저장
        }
        System.out.printf("%.6f",(sum / scoreSum));
        System.out.printf("%.6f",(sum / scoreSum));
    }
}





