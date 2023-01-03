package com.onion.s4.objects1;

public class MethodTest3 {
	
	//실급여를 계산하는 메서드
	public void t3(int salary, double tax) {
		salary = (int)(salary*tax);
		System.out.println("T3 : " + salary);
		
	}
	
	public void info(Sword sword) {
		//Sword 모든 정보 출력
		System.out.println(sword.name);
		System.out.println(sword.damage);
		System.out.println(sword.dur);
		System.out.println(sword.inchant);
		System.out.println(sword.price);
		
		sword.name = "단도";
	}
}
