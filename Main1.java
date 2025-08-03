class Student
{
 //attributes
 int index;
 String name;

 //method
 void printName()
 {
  System.out.println("Name = " + name);
 }
 void printIndex()
 {
 System.out.println("index = " + index);
 }
}
 
public class Main1
{
  public static void main(String[]args)
   {
      //create object
      Student std1 = new Student();
      std1.printName();
      std1.printIndex();
    }
}