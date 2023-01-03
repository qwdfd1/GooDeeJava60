package com.onion.s2.loops;

import java.util.Scanner;

public class LoopWhile3_exRpg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 게임
		// 1. 로그인
		// 2. 로그인 한 사용자만 게임 가능
		
		//------------------------------ 로그인 파트 -----------------------------
		
		// 1. 로그인 2. 종료
		
		// 1: id, pw 입력 후 로그인 판단
		// 2: 종료
		
		//------------------------------ 게임진행 파트 -----------------------------
		// 1.로그인 성공 했을 때 진행
		// 레벨은 1로 시작
		// 모든 몬스터의 경험치는 동일
		
		// 초기 골드 : 0gold
		// 5lev 달성시 1000gold 지급
		// 10lev 달성시 2000gold 지급
		// 15lev 달성시 3000gold 지급

		// 1lev -> 2lev : 3마리
		// 2lev -> 3lev : 6마리
		// 3lev -> 4lev : 9마리
		// 4lev -> 5lev : 12마리
		// ...
		// 14lev -> 15lev : 52마리
		// 몬스터 한마리 잡을 때 마다 '사냥했습니다'라는 메세지 띄우기
		// 만렙달성 축하, 현재 gold 출력
		
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		int id = 1234;
		int pw = 5678;
		
		// 로그인, 게임 진행
		System.out.println("1. 로그인 2. 게임 접속");
		int select = sc.nextInt();
		
		// 로그인 파트
		if(select == 1) {
			while(!check) {
				System.out.println("로그인 창");
				
				System.out.println("1. 로그인 2. 프로그램 종료");
				int logSelect = sc.nextInt();
				
				if(logSelect == 1) {
					System.out.println("아이디를 입력해주세요");
					int yId = sc.nextInt();
					
					System.out.println("비밀번호를 입력해주세요");
					int yPw = sc.nextInt();
					
					if(yId==id && yPw==pw) {
						check = true;
						System.out.println("로그인 성공!");
					}
					else if(yId!=id || yPw!=pw) {
						System.out.println("로그인에 실패하였습니다.");
					}
				}
				else if(logSelect == 2) {
					System.out.println("프로그램을 종료합니다");
					break;
				}
				else {
					System.out.println("잘못된 접근입니다.");
				}

			}

		}
		
		//게임 진행
		
		if(check) {
			int level = 1;
			int maxLev = 15;
			int gold = 0;
			
			for(;level<15; level++) {
				System.out.println("현재 레벨 : " + level);
				
				if(level % 5 == 0) {
					
					gold += level/5*1000;
					System.out.println(level + "레벨 달성 축하금");
				}
				
				for(int m=0;m<level*3;m++) {
					System.out.println(m+1+" 번째 사냥 성공");
				}
				
				System.out.println("축 레벨업");
			}
			System.out.println();
			gold = gold+level/5*1000;
			System.out.println("현재 보유 골드 : " + gold);
			
		}
		
		else {
			System.out.println("로그인 된 사용자가 아닙니다.");
		}
	}

}
