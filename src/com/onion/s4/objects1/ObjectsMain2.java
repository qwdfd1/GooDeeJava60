package com.onion.s4.objects1;

public class ObjectsMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sword의 Instance 생성
		
		int n=10;				// => stack영역의 지역변수
		
		Sword s1 = new Sword();				// => stack영역의 지역 변수 그리고 참조 변수
		
		// heap 영역에서 선언(공간 할당) 	=> 	멤버변수 또는 인스턴스변수
		// 객체생성시 멤버변수 만들어짐
		s1.name = "집행검";
		s1.damage = 50;
		s1.dur = 200;
		s1.price = 50000;
		s1.inchant = 3;
		
		Knight knight = new Knight();
		
		//knight의 instance 생성
		
		knight.name = "독산동 피바다";
		knight.hp = 100;
		knight.sta = 50;
		knight.dex = 30;
		knight.wis = 10;
		
		//knight의 멤버변수 sword에 s1라는 인스턴스를 대입
		knight.sword = s1;
		
		System.out.println(knight.sword.name);
		
		//변수 선언
		// new 키워드x, 객체생성을 하지않았으니 nullpointer 에러 발생
		Sword s2 = null;
		
		System.out.println(s2.damage);
				
	}

}
