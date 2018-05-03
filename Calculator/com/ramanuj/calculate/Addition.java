package com.ramanuj.calculate;

public class Addition {
	
	int add(int num1,int num2){
		
		int res=num1+num2;
		return res;
	}
	
	int add(int num1,int num2,int num3)
	{
		int res1=num1+num2+num3;
		return res1;
	}
    
	int add(int num1,int num2,int num3,int num4)
	{ 
		int res2=num1+num2+num3+num4;
		return res2;
	}

	public static void main(String args[])
	{
	Addition a =new Addition();
	System.out.println(a.add(4,10));
	System.out.println(a.add(10,30,20));
	System.out.println(a.add(1,2,3,4));
	}
}
