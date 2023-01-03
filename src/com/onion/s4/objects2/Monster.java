package com.onion.s4.objects2;

public class Monster {
	//멤버변수, instance 변수
	int power;
	int hp;
	
	//멤버 메서드, instance method (행위)
	public boolean checkvalue(Monster monster) {
		//나의 파워와 hp가 같다면 true 리턴 false 리턴
		boolean check = false;
		if(this.power == monster.power && this.hp == monster.hp) {
			check = true;
		}
		return check;
		
	}
	
	public void info(int a) {
		
	}
	
	//공격
	//어슬렁
	public void info() {
		//참조변수 this : class내에서만 사용 가능, 생성된 객체주소를 담고있음
		System.out.println(this);
		System.out.println(this.power);
		System.out.println(this.hp);
		
		attack();
		
	}
	
	public void attack() {
		System.out.println("공격 시작해요");
		
	}

	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
}
