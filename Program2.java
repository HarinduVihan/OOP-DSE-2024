import java.util.Scanner;

public class Program2
{
	public static void main(String[]args)
	{
		//create an object
        	Student std1 = new Student();
		std1.getdetails();	
		std1.display();

		//create another object
        	Student std2 = new Student();
		std2.getdetails();	
		std2.display();
	}
}
class Student
{
	//attributes 
	String name;
	int index;
	int age;

	Scanner imput = new Scanner(System.in);

	//methods
	void getdetails()
	{
		System.out.println("enter name : ");
		name = imput.nextLine();

		System.out.println("enter index : ");
		index = imput.nextInt();

		System.out.println("enter age : ");
		age = imput.nextInt();
	}

	void display()
	{
		System.out.println("Name : " + name);
		System.out.println("Index : " + index);
		System.out.println("Age : " + age);
	}
}