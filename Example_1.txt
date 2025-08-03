import java.util.Scanner;

public class Example_1
{	
	public static void main(String[]args)
	{

	Scanner input = new Scanner(System.in);
        
	int a,b;

	System.out.println(" enter length and width ");
	a = input.nextInt();
	b = input.nextInt();
	 
	Rectangle rec1 = new Rectangle(a,b);
	rec1.calcArea();
	rec1.parimeter();
	}
}


class Rectangle
{ 
	private int width;
	private int length;


	//constructor

	public Rectangle(int x, int y)
	{
	 this.length =x;
	 this.width =y;	
	}
	
	public void calcArea()
   	{
	System.out.println("area = " +length * width);
	
	}

	public void parimeter()
	{
	 System.out.println("parimeter = " +2*(length + width));
	}


}