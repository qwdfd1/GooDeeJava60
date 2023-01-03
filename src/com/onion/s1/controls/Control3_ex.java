package com.onion.s1.controls;

import java.util.Random;
import java.util.Scanner;

public class Control3_ex {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		// Game : MMORPG
		// 법사
		
		String name = "핫팩";
		int hp = 20;
		int mp = 20;
		
		String monsterName = "오크";
		int monsterHp = 10;
		
		//random.nextInt(?) ==> 0부터 ?미만의 정수 하나를 무작위로 리턴
		
		//1. HP보충(포션) 2.MP보충(포션) 3.마법1 4.마법2 5.턴을 넘기기
		//HP는 최대 40이 끝 
		//보충시 랜덤하게 0~40사이의 숫자를 받아서 HP에 더하기
		System.out.println("액션을 선택하세요");
		System.out.println(" 1.HP보충(포션) \n 2.MP보충(포션) \n 3.마법1 \n 4.마법2 \n 5.턴을 넘기기");
		int select = sc.nextInt();
		
		if(select == 1) {
			int plusHp = random.nextInt(41);
			hp = hp + plusHp;
			if(hp > 40) {
				hp = hp - (hp-40);
			}
			System.out.println(plusHp + "(이)가 회복되었습니다");
			System.out.println("현재 Hp : " + hp);
		}
		
		else if(select == 2) {
			int plusMp = random.nextInt(41);
			mp = mp + plusMp;
			if(mp > 40) {
				mp = mp - (mp-40);
			}
			
			System.out.println(plusMp + "가 회복되었습니다");
			System.out.println("현재 Mp : " + mp);
		}
		
		else if(select == 3) {
			// 주문
			// Mp 3씩 감소
			// 0~5이하의 수치를 공격
			System.out.println("에너지 보올트!!");
			mp -= 3;
			int atkPoint = random.nextInt(6);
			monsterHp -= atkPoint;
			if(atkPoint == 5) {
				System.out.println("Critical!!");
			}
	
			System.out.println(monsterName + "에게" + atkPoint + "의 데미지를 주었습니다");
			
		}
		
		else if(select == 4) {
			// 주문을 외우기
			// Mp 5씩 감소
			// 0~10이하의 수치를 공격
			System.out.println("하늘에서 정의가 빗발친다!!");
			mp -= 5;
			int atkPoint = random.nextInt(11);
			monsterHp -= atkPoint;
			if(atkPoint == 10) {
				System.out.println("Critical!!");
			}
			System.out.println(monsterName + "에게" + atkPoint + "의 데미지를 주었습니다");
		}
		else {
			System.out.println("턴을 넘깁니다");
		}
		
		
		System.out.println(name + "의 현재 HP : " + hp );
		System.out.println(name + "의 현재 MP : " + mp );
		System.out.println(monsterName + "남은 HP : " + monsterHp);
		//유저의 이름과 HP, MP
		//몬스터의 이름과 HP, 
		

	}
}
