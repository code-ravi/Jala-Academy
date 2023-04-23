package com.abstractclass.Test3;

class Cow extends Animal {

	@Override
	void eats() {
		System.out.println("Eats veg only");
	}

	public static void main(String[] args) {
		Cow ob = new Cow();
		ob.eats();
	}
}
