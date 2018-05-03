package com.nestle.coffeeVendingMachine;

public class VendingMachine {

	Coffee prepare(CoffeeBean cb)
	{
	System.out.println("Creating object for CoffeeBean");
	Coffee c=new Coffee();
	System.out.println("Preparing Coffee");
	return c;
	}
	
	ColdWater prepare(Water w)
	{
		System.out.println("Creating object for Cold Water");
		ColdWater cw=new ColdWater();
		System.out.println("Preparing Cold water");
		return cw;
		}
		
		AppleJuice prepare(Apple a)
		{
			System.out.println("Creating object for Apple Juice");
			AppleJuice  aj=new AppleJuice();
			System.out.println("Preparing Apple juice");
			return aj;
	}
}   
