package com.amazon.paymentapp;

public class PaymentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon a=new Amazon();
		System.out.println("Opening Amazon website");
		CreditCard cc=new CreditCard();
		Product p=a.pay(cc);
		System.out.println("Payment Successfull");
		Debitcard db=new Debitcard();
		Product pi=a.pay(db);
//		System.out.println(p);
		System.out.println("Payment Successfull through Debit Card");
		Wallet w=new Wallet();
		Product pr=a.pay(w);
	}

}
