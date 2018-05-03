package com.ramanuj.calculate;



public class Calculator {


int add(int num1,int num2)
{
int res=num1+num2;
return res;
}

int mul(int num1,int num2){
	int res1=num1*num2;
	return res1;
}

int div(int num1,int num2)
{
	int rs2=num1/num2;
	return rs2;
	
}
int sub(int num1,int num2)
{
	int res3=num1-num2;
	return res3;
}
	int square(int num1){
		int res4=num1*num1;
		return res4;
	}
	
	int cubeOfNumber(int num1){
		int res5=num1*num1*num1;
		return res5;
	}
	
	int convrtHrToMinute(int num){
		int res6=num*60;
		return res6;
	}
public static void main(String[] args){
	Calculator c=new Calculator();
	int res=c.add(25,35);
	System.out.println(res);
	System.out.println(c.add(21, 21));
	int res1=c.sub(35, 25);
	System.out.println(res1);
	int rs2=c.div(8, 6);
	System.out.println(rs2);
	int res3=c.mul(2,4);
	System.out.println(res3);
	int res4=c.square(65);
	System.out.println(res4);
	int res5=c.cubeOfNumber(3);
	System.out.println(res5);
	int res6=c.convrtHrToMinute(48);
	System.out.println(res6);
}
	
}