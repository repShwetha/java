package com.charlie.waterBottlemanuf;

public class TestWaterBottle {

	public static void main(String[] args) {
		Bottle b=new Bottle();
		Water w=new Water();
		Juice j=new Juice();
		Milk m=new Milk();
		b.store(w);
		b.store(j);
		b.store(m);

	}

}
