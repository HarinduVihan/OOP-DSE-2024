import java.util.Scanner;

public class exSetter
{
   public static void main(String[]args)
    {
	Employee emp1 = new Employee();
	emp1.setName("Harindu");
	emp1.setAge(24);
	emp1.getName();
	emp1.getAge();
	emp1.getinput();
	emp1.print();
	emp1.print1();
     }
}
	
class Person //parent
{
 //attributes
	protected String name;
	protected int age;
  
   public void print()
    {
	System.out.println("Name :" + name);
	System.out.println("Age :" + age);
    }
}

//child Class

class Employee extends Person  
{
 //attributes
	private int empNumber;
	private int empSalary;
	
	Scanner input = new Scanner(System.in);

// setters
  public void setName(String name)
   {
	this.name = name;
   }

  public void setAge(int age)
   {
	this.age = age;
   }

//getters
  public String getName()
   {
    return name;
   }

  public int getAge()
   {
    return age;
   }

//methods
   public void getinput()
   {
	System.out.println("Enter employee number :");
	empNumber = input.nextInt();

	System.out.println("Enter employee salary :");
	empSalary = input.nextInt();
   }
  
   public void print1()
   {
	System.out.println("Employee number :" + empNumber);
	System.out.println("Employee salary :" + empSalary);
   }
}