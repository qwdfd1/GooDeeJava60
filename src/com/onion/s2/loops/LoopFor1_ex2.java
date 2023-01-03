package com.onion.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 학생수 입력 받음
		// 학생수 만큼 점수를 입력 받아서
		// 점수 합산
		
//		System.out.println("학생 수를 입력해주세요");
//		int count = sc.nextInt();
//		int sum = 0;
//		
//		for(int i=0; i<count; i++) {
//			System.out.println(i+1 + "번째 학생의 점수를 입력해주세요");
//			int score = sc.nextInt();
//			sum += score;
//		}
//		
//		System.out.println("총 학생의 합계점수 : " + sum);
//		
		//
		
		System.out.println("초를 입력하세요");
		int sec = sc.nextInt();
		
		for(int i=0;i<60;i++) {
//			System.out.println(i+"초");
//		    if(sec==i) {
//		    	i = i+60;
//		    };
		    
		    if(sec > i-1) {
		    	System.out.println(i+"초");
		    }
		    
		}
		
		System.out.println("종료");
	}
}
