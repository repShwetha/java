package com.ramanuj.calculate;

public class GenderDecision {

	String GenderDisplay(int num){
		
		if(num==1) 
			
			return ("Boy");
		
		else if(num==2)
			
			return ("Girl");
		
		else 
			
			return ("Nill");
			
			
}
	
	public static void main(String args[])
	{
		GenderDecision g=new GenderDecision();
		String res=g.GenderDisplay(0);
				System.out.println(res);
	}
}
