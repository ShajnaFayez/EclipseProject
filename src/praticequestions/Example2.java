package praticequestions;

class Vehicle
{
	public void drive()
	{
		System.out.println("Repairing a Car");
	}
}

class Car extends Vehicle
{
	
}

public class Example2 {

	public static void main(String[] args) {
		
		Car ob=new Car();
		ob.drive();

	}

}
