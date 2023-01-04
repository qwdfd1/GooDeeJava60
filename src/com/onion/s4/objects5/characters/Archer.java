package com.onion.s4.objects5.characters;

public class Archer extends Character implements Attackable{
	


	private int dex;
	
	//상속(확장)된 자식클래스의 객체생성은 부모의 생성자 호출후 부모객체를 만들고 확장해서 자신의 객체를 생성
	//super(), 와 this()는 생성자내 구문에서 무조건 첫번째 줄에 위치해야한다. 그래서 둘이 같이 쓸 수 없다
	//super()는 자식의 생성자내에서 부모의 생성자를 호출한다
	public Archer() {
		super("archeraa");
	}
	
	@Override
	public void attack() {
		System.out.println("활 쏘기");
	}
	
	public void move() {
		System.out.println("이동");
	}
	

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}
	
	
}
