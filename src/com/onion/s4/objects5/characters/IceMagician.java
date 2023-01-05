package com.onion.s4.objects5.characters;

public class IceMagician extends Magician implements Attackable{
	
	//Character클래스를 상속받은 Magician -> Magician 클래스를 상속받은 IceMagician, 그리고 Attack인터페이스 구현 요함.
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("아이스 볼");
	}
	
	@Override
	public void spell() {
		// TODO Auto-generated method stub
		
	}
}
