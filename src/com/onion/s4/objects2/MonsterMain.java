package com.onion.s4.objects2;

public class MonsterMain {
	public static void main(String[] args) {
		
		Monster m1 = new Monster();				// ====> 생성자는 메서드, 객체생성시에 한번만 호출됨
		m1.power=10;
		m1.hp = 100;
		
		Monster m2 = new Monster();
		m2.power=10;
		m2.hp=100;

		boolean result = m1.checkvalue(m2);
		System.out.println("Result : " + result);
		
	}
}
