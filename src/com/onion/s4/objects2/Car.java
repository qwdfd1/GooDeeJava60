package com.onion.s4.objects2;

public class Car {
	
	String name;
	String company;
	int price;
	String color;
	
	public Car() {
		this("White"); 								//this() -> 생성자내에서 다른 생성자 호출구문
//		this.name="s클래스";
//		this.company="Benz";
//		this.price=15000;
//		this.color="White";
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
