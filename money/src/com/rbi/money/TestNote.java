package com.rbi.money;

public class TestNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Note n1 = new Note();
		n1.color = "Blue";
		n1.value = 50;
		n1.length = 10;
		Note n2 = new Note();
		n2.color = "Pink";
		n2.value = 2000;
		n2.length = 12;
		Note n3 = new Note();
		n3.color = "Brown";
		n3.value = 10;
		n3.length = 8;
		System.out.println(n1.color + " " + n1.value + " " + n1.length);
		System.out.println(n2.color+" "+n2.value+" "+n2.length);
		System.out.println(n3.color+" "+n3.value+" "+n3.length);
		

	}

}
