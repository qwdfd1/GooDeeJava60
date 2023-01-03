package com.onion.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex2 {
	public static void main(String[] args) {
		//배그
		//총알 30발 -> 1탄창
		//캐릭터당 -> 3탄창
		
		//1. 단발
		//2. 점사
		
		//1번이면 "탕" 30번 반복 출력
		//2번이면 "탕탕탕" 10번 반복 출력
		
		Scanner sc = new Scanner(System.in);
		
		// 1번째 방법
		/*
		for(int i=0; i<3; i++) {
			System.out.println("발사모드를 선택");
			System.out.println("1. 단발");
			System.out.println("2. 점사");
			int select = sc.nextInt();
			
			for(int j=0; j<30; j++) {
				if(select == 1) {
					System.out.println("탕");
					System.out.println(30-(j+1) + "/30");
				}
				else {
					j+=2;
					System.out.println("탕탕탕");
					System.out.println("남은 탄약 수 : "+ (30-(j+1)) + "/30");
				}
	
				
			}
			System.out.println("재장전!");
			
		}
		System.out.println("탄약이 부족합니다.");
		*/
		
		// 2번째 방법
		/*
		for(int i=1; i<4; i++) {
			System.out.println("발사모드를 선택");
			System.out.println("1. 단발");
			System.out.println("2. 점사");
			int select = sc.nextInt();
			
			for(int j=1; j<31; j++) {
				if(select == 1) {
					System.out.println("탕");
					System.out.println(30-j + "/30");
				}
				else {
					j+=2;
					System.out.println("탕탕탕");
					System.out.println("남은 탄약 수 : "+ (30-j) + "/30");
				}
				
			}
			System.out.println("재장전!");
			
		}
		System.out.println("탄약이 부족합니다.");
		*/
		
		// 3번째 방법
		for(int i=1; i<4; i++) {
			
			int select = sc.nextInt();
			int count = 10;
			String sound = "타타탕";
			
			if(select==1) {
				count=30;
				sound="탕";
			}
			
			for(int b=0; b<count; b++) {
				System.out.println(sound);
			}
			

			
		}
		
		
		
		
	}
}
