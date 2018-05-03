package com.ramanuj.calculate;

public class Coverter {

	double convertDegreeCelsiusToFar(double Celsius) {

		double res = Celsius * 1.8 + 32;
		return res;
	}

	double convertDegreeFarToCelsius(double Farhan) {

		double res1 = (Farhan - 32) / 1.8;
		return res1;
	}

	public static void main(String args[]) {
		Coverter c = new Coverter();
		double res = c.convertDegreeCelsiusToFar(38);
		System.out.println(res);

	}
}
