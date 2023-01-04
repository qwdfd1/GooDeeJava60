package com.onion.s4.objects2;

public class Car {
	
	String name;
	String company="qwdfd";
	int price;
	String color;
	
	{
		// 초기화 블럭
		// 어떤 멤버변수에 공통적인 값으로 초기화 할 때 사용
		System.out.println(this.company);
		this.company="Onion";
	}
	
	
	public Car() {
//		this("White"); 								//this() -> 생성자내에서 다른 생성자 호출구문
		System.out.println("생성자 : " + this.company);
		this.name="s클래스";
		this.company="Benz";
		this.price=15000;
		this.color="White";
	}
	
	public Car(String color) {
		this(color, 20000);
//		this.name="s클래스";
//		this.company="Benz";
//		this.price=15000;
//		this.color = color;
	}
	public Car(String color, int price) {
		this(color, price, "BMW");
//		this.name="s클래스";
//		this.company="Benz";
//		this.price=price;
//		this.color = color;
	}
	
	public Car(String color, int price, String name) {
		this.company = "Benz";
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public void info() {
		System.out.println("Name : " + this.name);
		System.out.println("Company : " + this.company);
		System.out.println("Price : " + this.price);
		System.out.println("Color : " + this.color);
	}
	
	
}
