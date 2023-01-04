package com.onion.s4.objects5.characters;

public interface Attackable {
	//인터페이스는 상수와 추상메서드만 멤버로 가진다
	
	//상수
	//접근지정자는 무조건 public이어야만 한다
	static final int DAMAGE = 1;
	
	//추상메서드
	//접근지정자 : public
	//그외지정자 : abstract
	//인터페이스는 접근지정자와 그외지정자를 생략가능하다
	public abstract void attack();
//	abstract void attack2();
//	void attack3();
//	public void attack4();
	
	
}
