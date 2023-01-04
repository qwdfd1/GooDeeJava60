package com.onion.s4.objects4;

public class Card {
	
	//card
	private String shape;
	private String color;
	private int number;
	
	
	
	//클래스 변수
	public static int size = 10;
	
	//클래스 메서드
	//클래스메서드는 멤버변수와 메서드를 사용할 수 없다
	//클래스변수,메서드는 객체를 만들지 않고 사용할 수 있지만
	//멤버변수,메서드는 객체를 생성해야지만 사용할 수 있으므로
	//클래스메서드는 멤버변수,메서드(인스턴스)를 포함할 수 없다
	public static void staticMethod() {
		Card.size = 10;
		System.out.println("Static Method");
	}
	
	//instance 초기화 블럭
	{
		
	}
	
	//static 초기화 블럭
	static {
		Card.size = 10;
	}
	
	public void info() {
		System.out.println("Shape : " + this.shape);
		System.out.println("Color : " + this.color);
		System.out.println("Number : " + this.number);
		System.out.println("Size : " + Card.size);
		Card.staticMethod();
	}
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
