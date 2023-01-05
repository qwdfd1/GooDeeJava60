package com.onion.s4.objects6;

public class Robot {

	private ArmLeft armLeft;
	private ArmRight armRight;
	
	//armRight는 Robot생성자 호출과 동시에 만들어지므로 생명주기가 Robot과 같다(강한 결합)
	public Robot() {	
		this.armRight = new ArmRight();
	}
	
	public ArmLeft getArmLeft() {
		return armLeft;
	}
	public void setArmLeft(ArmLeft armLeft) {
		this.armLeft = armLeft;
	}
	public ArmRight getArmRight() {
		return armRight;
	}
	public void setArmRight(ArmRight armRight) {
		this.armRight = armRight;
	}
	
}
