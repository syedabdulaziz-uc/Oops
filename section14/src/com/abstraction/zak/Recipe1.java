package com.abstraction.zak;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Get the utensils");
		
	}

	@Override
	void doTheDish() {
		System.out.println("Get the raw");
		System.out.println("do the dish");
		
	}

	@Override
	void cleanUp() {
		System.out.println("Cleanup utensils");
		
	}
	
}
