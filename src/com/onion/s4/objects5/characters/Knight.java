package com.onion.s4.objects5.characters;

public class Knight extends Character implements Attackable {

	int strong;
	
	Item item = new Staff();
	
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		item.a();
	}

}
