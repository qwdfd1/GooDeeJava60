package com.onion.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//분과 초를 입력받아서 
		//해당 분 초가 되면 반복문 종료
		
		System.out.println("종료시킬 분 초를 입력하세요");
		
		System.out.println("분 입력 : ");
		int min = sc.nextInt();
		
		System.out.println("초 입력 : ");
		int sec = sc.nextInt();
		
		//1번째 방법
		for(int b=0;b<60;b++) {
			
			for(int s=0;s<60;s++) {
				System.out.println(b+ "분 " + s + "초 ");
				
				if(b==min && s==sec) {
					break; 
				}
			}//안 쪽 for
			
			if(b==min) {
				break;
			}
			
		}// 바깥 for
		
		//2번째 방법
		for(int b=0;b<60;b++) {
			
			for(int s=0;s<60;s++) {
				System.out.println(b+ "분 " + s + "초 ");
				if(b==min && s==sec) {
					s=60;
					b=60;
				}
			}//안 쪽 for			
		}// 바깥 for
		
		//3번째 방법
		for(int b=0;b<60;b++) {
			
			for(int s=0;s<60;s++) {
				System.out.println(b+ "분 " + s + "초 ");
				if(b==min && s==sec) {
					b=60;
					break;
				}
			}//안 쪽 for			
		}// 바깥 for
		
		//4번째 방법
		boolean check = false;
		for(int b=0;b<60;b++) {
			
			for(int s=0;s<60;s++) {
				System.out.println(b+ "분 " + s + "초 ");
				if(b==min && s==sec) {
					s=60;
					check = true;
					break;
				}
			}//안 쪽 for
			
			if(check)
				break;
		}// 바깥 for
		
		
		System.out.println("프로그램 종료");
	}// 메인 메서드
}
