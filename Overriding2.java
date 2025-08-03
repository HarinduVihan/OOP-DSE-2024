public class Overriding2
{
  public static void main(String[]args)
   {
       Employee emp1 = new Employee(1,30000);
       Employee Man1 = new Manager(1,50000,400);
       emp1.calcSalary(300);
       emp1.display();
       Man1.calcSalary(700);
       Man1.display();  
   }
}	

//parent
class Employee
{
	protected int index;
	protected int salary;

	//methods

  public Employee(int i, int s)
 {
	this.index = i;
	this.salary = s;
 }

    public void calcSalary(int bonus)
  {
	salary += bonus;
  }
    public void display()
  {
	System.out.println("Salary of employee =" +salary);
  }
}

//child
class Manager extends Employee
{
	private int ot;
	
	public Manager(int i,int s,int o)
	{
          super(i,s);
	  this.ot = o;
	}
	
        public void calcSalary(int bonus)
       {
	   salary = salary + bonus + ot;
       } 

	public void display()
	{
	System.out.println("Salary of manager =" +salary);
        }
}
	    