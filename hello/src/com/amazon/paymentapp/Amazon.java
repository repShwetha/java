package com.amazon.paymentapp;

public class Amazon {
	
	Product pay(CreditCard c){
		System.out.println("Payment throughCredit card");
		Product p=new Product();
		System.out.println("Delivering the product tothe customer");
		return p;
	}
	Product pay(Debitcard d){
		System.out.println("Payment through Debit card");
		Product p=new Product();
		System.out.println("Delivering the product tothe customer");
		return p;
	}
	Product pay(Wallet w){
		System.out.println("Payment through Wallet");
		Product p=new Product();
		System.out.println("Delivering the product tothe customer");
		return p;
	}
		

}
