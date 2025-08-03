import java.util.Scanner;

public class ConstruterExample2
{
	public static void main(String[]args)
	{

	Car car1 = new Car();
	car1.getinput();
	car1.drive(50);
	car1.showdata();
	}
}

class Car
{
	private String brand;
	private String model;
	private int mileage;

Scanner input = new Scanner(System.in);

	//constructor
	public Car()
	{
		brand = null;
		model = null;
		mileage = 0;
	}

  	public void getinput()
	{
		System.out.println("Enter brand, model and Mileage :");
		brand =input.next();
		model =input.next();
		mileage = input.nextInt();
	}

	public void drive(int distance)
	{
		mileage = mileage + distance;
	}

	public void showdata()
	{
		System.out.println("brand :" + brand);
		System.out.println("Model :" + model);
		System.out.println("Mileage :" + mileage);
	}
}



