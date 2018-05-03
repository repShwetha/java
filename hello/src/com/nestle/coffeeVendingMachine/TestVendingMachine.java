package com.nestle.coffeeVendingMachine;

public class TestVendingMachine {
	
	public static void main(String args[]){
	
System.out.println("Creating Vending machine object");

VendingMachine v=new VendingMachine();

System.out.println("Preparing a coffee");

CoffeeBean cb=new CoffeeBean();
Coffee c=v.prepare(cb);
Water w=new Water();
ColdWater cw=v.prepare(w);
Apple a=new Apple();
AppleJuice aj=v.prepare(a);

	}

}
