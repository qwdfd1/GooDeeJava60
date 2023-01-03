package com.onion.s2.loops;

import java.util.Scanner;

public class LoopWhile2_ex1 {
	public static void main(String[] args) {
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
		while(check) {
			int userGold = 0;
			int userLev = 1;
			int userExp = 0;
			int userMaxExp = 30;
			int userAttack = 5;
			int gold = 0;
			int monsterExp = 10;
			
			while(userLev<15) {
				
				int monsterHp = 15;

				while(monsterHp>0) {
					System.out.println("1. 공격하기 2. 쉬기");
					int action = sc.nextInt();
					
					if(action==1) {
						monsterHp -= userAttack;
						System.out.println("몬스터의 남은 체력 : " + monsterHp);
					}
					
					if(monsterHp<=0) {
						userExp = userExp + monsterExp;
						System.out.println("사냥했습니다.");
						break;
					}
					
					
				}
				if(userExp==userMaxExp) {
					userLev += 1;
					userExp = 0;
					userMaxExp = userMaxExp*2;
					userAttack += 3;
					System.out.println("레벨업!!");
					System.out.println("현재 레벨 : " + userLev);
				}
				
				if(userLev % 5 == 0) {
					userGold += userLev/5*1000;
					System.out.println(userLev + "레벨 달성 축하선물이 도착했어요!!");
					System.out.println("개봉!!");
					System.out.println(userLev/5*1000 + " 골드 지급!");
					
				}
				
				
				if(userLev == 15) {
					System.out.println("만렙 달성!");
					break;
				}
			
			}

		
		}
		
		if(!check) {
			System.out.println("로그인 된 사용자가 아닙니다.");
		}
		
	}
}
