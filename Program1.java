import java.util.Scanner;

public class Program1
{  
    public static void main( String[] args)
   {  

      //create an object
       Rectangle rec1 = new Rectangle();
       rec1.getinput();
       rec1.displaylength();
       rec1.displaywidth();
	
   }
}
class Rectangle
{
  // attributes
    int length;
    int width;

Scanner input = new Scanner(System.in);
	
  //methods
	void getinput()
	{
         System.out.println("enter length : ");
	 length = input.nextInt();
	 System.out.println("enter width : ");
	 width = input.nextInt();
	}

  void displaylength()
 {
   System.out.println(" length = " + length);
 }
 void displaywidth()
 {
  System.out.println(" width = " + width);
 }
}