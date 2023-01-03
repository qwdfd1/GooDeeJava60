package com.onion.s4.objects1;

public class MethodMain1 {
	public static void main(String[] args) {
		
		System.out.println("Main Method 실행");
		MethodTest mt = new MethodTest();
		MethodTest3 mt3 = new MethodTest3();
		
		int salary = 3000000;
		//매개변수로 보내는 값 : 인자값
		//메서드를 호출한다
		
		
		mt3.t3(salary, 0.93);
		System.out.println("main : " + salary);
		
		Sword sword = new Sword();
		sword.name = "집행검";
		sword.damage = 50;
		sword.dur = 20;
		sword.inchant= 3;
		sword.price = 5000000;
		mt3.info(sword);
		
		//stack이 아닌 heap영역의 인스턴스 변수를 변경한후 참조하기 때문에 값은 다르게 출력
		System.out.println(sword.name);
		
		
		System.out.println("Main Method 종료");
	}
}
