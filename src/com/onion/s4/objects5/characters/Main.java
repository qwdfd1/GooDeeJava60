package com.onion.s4.objects5.characters;

public class Main {
	public static void main(String[] args) {
		
		
		//다형성
		//상속관계에서 부모와 자식간의 형변환
		
		Archer archer = new Archer();
		
		Character character = null;
		
		character = archer;
		
		archer = (Archer)character;
		
//		군인 : 계급, 군번, 관등성명
		
		//계급, 군번, 관등성명
		//이병, 어리버리, 관등성명
		//일병, 일, 관등성명
		//상병, 갈구기, 관등성명
		//병장, 짱박히기, 관등성명
		
				
//			군인 = 이병
//			군인 = 일병
//			군인 = 상병
//			군인 = 병장
//
//			이병 = 군인 			---> x, 군인은 이병이다
//			이병 = (이병)군인		---> o, 군인중에 이병은 이병이다
		
//			이병.계급, 이병.군번, 이병.관등성명(), 이병.어리버리()
//			군인.계급, 군인.군번, 군인.관등성명(), 군인.어리버리() -> x, 군인으로 접근할 땐 공통적인 요소만 접근 가능
		
		
	

	}
}
