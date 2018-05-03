package com.ramanuj.calculate;

public class GSTCalculator {
void calculateGST(double productprice){
	double gst=productprice*1.8;
	double totalcost=productprice+gst;
	System.out.println("The base of the product is " + productprice);
	System.out.println("GST of the product is " + gst);
	System.out.println("Total cost of the product is " + totalcost);
}
public static void main(String args[]){
	GSTCalculator g=new GSTCalculator();
	g.calculateGST(155.35);
}


}