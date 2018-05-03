package com.ramanuj.calculate;

public class PetrolPump {
 void ConvrtTolitre(double money){
	double litre=money/74.38;
	System.out.println("You get" + litre+ "litrsof fuel");
 }
 
 //covert rupees to dollars
 
 void CovertRupeesToUsd(double rupees){
	 double usd=rupees/64.8;
	 double comm=usd*0.03;
	 double totalvalue=usd-comm;
	 System.out.println("the total conversion is "+usd);
	 System.out.println("the total commisionis " +comm);
	 System.out.println("the total value is "+totalvalue);
	 
 }
 public static void main(String args[]){
	 PetrolPump p=new PetrolPump();
	 p.ConvrtTolitre(1456.35);
	// MoneyExchange m=new MoneyExchange();
	 p.CovertRupeesToUsd(1000);
	 
 }
}
