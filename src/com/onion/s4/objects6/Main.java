package com.onion.s4.objects6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		Robot robot = new Robot();
		
		ArmLeft armLeft = new ArmLeft();
		robot.setArmLeft(armLeft);
		
		System.out.println("Left : " + robot.getArmLeft());
		System.out.println("Right : " + robot.getArmRight());
		
		//robot이라는 참조변수 null ----> 주소값이 사라진다, 즉 참조할 수 없다
		//armRight는 Robot생성자 호출과 동시에 만들어지므로 생명주기가 robot과 같다(강한 결합)
		//반면에 armLight는 외부에서 별개로 생성되어 robot객체에 대입했으므로 생명주기가 다르다(약한 결합)
		//외부에서 대입 --> 약한 결합
		//내부에서 객체생성 후 대입 --> 강한 결합
		
		robot = null;
		
		System.out.println("프로그램 종료");
	}

}
