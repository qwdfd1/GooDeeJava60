package com.onion.s1.controls;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 합계점수, 평균, 성적
		int sum = 0;
		double avg = 0;
		String result = "Pass"; 
		
		System.out.println("성적을 구해드릴게요");
		System.out.println("국어 영어 수학점수를 입력하세요");
		
		// 라인을 입력받아서 공백문자를 기준으로 분리하여 점수리스트를 생성
		String [] scoreList = sc.nextLine().split(" ");
		
		// 반복문을 점수리스트의 크기만큼 반복, 합계점수를 구함
		for(int i=0; i<scoreList.length; i++) {
			sum += Integer.parseInt(scoreList[i]);
			if(Integer.parseInt(scoreList[i]) < 40) {
				result = "Fail";
			}
		}
		
		
		// 합계점수를 점수리스트의 크기만큼 나누기
		avg = sum/scoreList.length;
		
		if(avg < 60) {
			result = "Fail";
		}

		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.print("합격 여부 : " + result);
		
		
		
	}

}
