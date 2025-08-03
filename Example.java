import java.util.Scanner;

public class Example
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
	rec1.display();
	}
}


class Rectangle
{ 
	private int width;
	private int length;
	int area;
	int parimeter;

	//constructor

	public Rectangle(int x, int y)
	{
	 this.length =x;
	 this.width =y;	
	}
	
	public void calcArea()
   	{
	area = length * width;
	
	}

	public void parimeter()
	{
	 parimeter = 2*(length + width);
	}

	public void display()
	{
	System.out.println("area :"+ area);
	System.out.println("parimeter :"+ parimeter);
	}
}