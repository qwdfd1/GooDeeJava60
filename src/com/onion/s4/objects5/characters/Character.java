package com.onion.s4.objects5.characters;

//abstract class							-------> 미완성된 클래스(추상클래스)
//											자식클래스가 상속받아 완성시켜서 사용하여야 한다
public abstract class Character {
	
	private String name;
	private int hp;
	
	// 기본 생성자
	public Character() {
		
	}
	
	public Character(String name) {
		
	}
	
	//abstract method						-------> 미완성된 메소드(추상메소드)
//	public abstract void attack();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
}
