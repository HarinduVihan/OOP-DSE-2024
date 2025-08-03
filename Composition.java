public class Composition
{
  public static void main(String[]args)
  {
  
   Person person = new Person();
   long salary = person.getSalary();
   long salar1y = person.getSalary1();
   System.out.println("Salary = " + salary+"-"+salar1y);
  }
}

class Job// part class
{
  private String role;
  private long salary;

  public String getRole()
  {
    return role;
  }

  public void setRole(String role)
  {
    this.role = role;
  }

  public long getSalary()
  {
    return salary;
  }
 
  public void setSalary(long salary)
  {
  this.salary = salary;
  }
}

class Person //whole class
{
   //composition has-a relationship

   private Job j;
private Job j2;

   public Person()
  {
  this.j = new Job();
  j.setSalary(1000L);
  this.j2 = new Job();
  j2.setSalary(2000L);
  }

  public long getSalary()
  {
  return j.getSalary();

  }


  public long getSalary1()
  {

  return j2.getSalary();
  }
}



