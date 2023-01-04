package com.onion.s4.objects5.characters;

public abstract class Magician extends Character{
	
	private int mp;
	
	
	//상속(확장)된 자식클래스의 객체생성은 부모의 생성자 호출후 부모객체를 만들고 확장해서 자신의 객체를 생성
	//super(), 와 this()는 생성자내 구문에서 무조건 첫번째 줄에 위치해야한다. 그래서 둘이 같이 쓸 수 없다
	//super()는 자식의 생성자내에서 부모의 생성자를 호출한다
	public Magician() {
		super("magicianaa");
	}
	
	//오버라이딩
	//상속받은 메소드를 재정의하는 것
//	@Override
//	public void attack() {
//		System.out.println("마법 공격");
//	}
	
	public abstract void spell();
	
	
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	
}
