package com.moto.mobilephone;

public class TestMobilePhone {
	public static void main(String Args[])
	{
		System.out.println("Creating object for MobilePhone");
		MobilePhone m=new MobilePhone();
		System.out.println("Accepting Pin as input");
		Pattern p=new Pattern();

		m.unlock(p);
		System.out.println("Input Pattern recieved and unlocked");
		m.unlock(1234);
		System.out.println("Input Pin recieved and unlocked");
		
	}

}
