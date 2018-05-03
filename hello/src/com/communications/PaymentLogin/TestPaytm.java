package com.communications.PaymentLogin;

public class TestPaytm {
	public static void main(String args[])
	{
		System.out.println("Opening Paytm app");
		Paytm p=new Paytm();
		System.out.println("Trying to login");
	p.login(9741951211L,"hjdnlkqwj");
	}

}
