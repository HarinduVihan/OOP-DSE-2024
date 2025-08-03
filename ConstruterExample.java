import java.util.Scanner;

public class ConstruterExample
{
	public static void main(String[]args)
	{

 	//create objects
	Employee emp1 = new Employee();
	//emp1.getinput();
	emp1.display();

	//create objects with parameters
	/*Employee emp2 = new Employee(2,"name");
	//emp2.getinput();
	emp2.display();*/
	}
}
 	

class Employee
{
	//create attributes
	private int empnum;
	private String name;

	Scanner imput = new Scanner(System.in);

	//construtor
	public Employee()
	{
		empnum = 2;
		name = "modaya";
	}

	//parameterized construtor
	/*public Employee(int i,String n)
	{
		empnum =i;
                name =n;
	}*/

	
	//methods
	public void getinput()
	{
		 System.out.println("enter employee number: ");
         	empnum = imput.nextInt();
		imput.nextLine();

		 System.out.println("enter employee name: ");
         	name = imput.nextLine();
	}

	public void display()
	{
		System.out.println("Employee number: " + empnum);
		System.out.println("Employee name: "+ name);
	}
}
	
