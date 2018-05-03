package car.benz.carmanuf;

public class TestCar {
public static void main(String args[])
{
	System.out.println("Creating a Car object");
	Car c=new Car();
	System.out.println("Creating a Petrol object" );
     Petrol p=new Petrol();
     Smoke s=c.fill(p);
}
}