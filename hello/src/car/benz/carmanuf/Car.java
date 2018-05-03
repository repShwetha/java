package car.benz.carmanuf;

public class Car {
	Smoke fill(Petrol p) {
		System.out.println("Accepting Petrol");
		System.out.println("Generating Smoke");
		Smoke s = new Smoke();
		return s;

	}

	Smoke fill(Diesel d) {
		System.out.println("Accepting DIESEL");
		System.out.println("Generating Smoke");
		Smoke s = new Smoke();
		return s;
	}

	Smoke fill(Gasoline g) {
		System.out.println("Accepting gasoline");
		System.out.println("Generating Smoke");
		Smoke s = new Smoke();
		return s;
	}
}
