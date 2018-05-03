package com.bluestar.airmanufacturer;

public class TestAir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirConditioner ac = new AirConditioner();
		System.out.println("Ac object is present");
		Water w = new Water();
		Air a = ac.blow(w);
	}

}
