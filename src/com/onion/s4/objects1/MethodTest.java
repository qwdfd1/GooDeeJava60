package com.onion.s4.objects1;

public class MethodTest {
	//main메서드
	//public static void main(String [] args) {}
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]) {}
	
	//접근지정자 : public, protected, private, 생략
	//그외지정자 : 생략가능
	//리턴타입 : void, DataType
	//메서드타입 : 작명
	//매개변수 : 생략가능 
	
	
	// ()까지는 메서드의 header 또는 선언부
	// {}는 메서드의 body 또는 내용
	public void t1() {  				
		
		System.out.println("t1 메서드 실행");
		MethodTest2 mt2 = new MethodTest2();
		mt2.info();
		int num = 10;
		System.out.println("T1 NUM : "+num);
		System.out.println("t1 메서드 종료");
	}
	
	// t2 메서드 선언
	public void t2() {
		System.out.println("t2 메서드 실행");
		int num = 20;
		System.out.println("T2 NUM : "+num);		
		
		System.out.println("t2 메서드 종료");		
		
	}
	
	
}
