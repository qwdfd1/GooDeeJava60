package com.onion.s1.controls;

import java.util.List;
import java.util.Scanner;

public class Control1_ex1 {
	public static void main(String[] args) {
		
		// 키보드로 부터 국어, 영어, 수학 점수 입력 받음
		// 총점과 평균 계산
		
		// 평균이 90점 이상이면 A를 출력
		// 평균이 80점 이상이면 B를 출력
		// 평균이 70점 이상이면 C를 출력
		// 그 외 나머지는 F를 출력 
		
		Scanner sc = new Scanner(System.in);
		
		// 합계점수, 평균, 성적
		int sum = 0;
		double avg = 0;
		String level = "F";
		
		System.out.println("성적을 구해드릴게요");
		System.out.println("국어 영어 수학점수를 입력하세요");
		
		// 라인을 입력받아서 공백문자를 기준으로 분리하여 점수리스트를 생성
		String [] scoreList = sc.nextLine().split(" ");
		
		// 반복문을 점수리스트의 크기만큼 반복, 합계점수를 구함
		for(int i=0; i<scoreList.length; i++) {
			sum += Integer.parseInt(scoreList[i]);
			
		}
		
		// 합계점수를 점수리스트의 크기만큼 나누기
		avg = sum/scoreList.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.print("성적 : ");
		
		// 조건식에 따라 성적부여
		if(avg >= 90) {	
			level = "A";
		}
		
		if (avg >= 80 && avg < 90){
			level = "B";
		}
		
		if (avg >= 70 && avg < 80){
			level = "C";
		}
		
		
		// 성적 출력
		// 출력문은 한 번만 사용
		System.out.println(level);
		
		
	
		
	}
}
