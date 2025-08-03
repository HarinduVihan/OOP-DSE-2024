import java.util.Scanner;
public class Example1
{
 public static void main(String[]args)
  {
   int a,b,c,max,min;
   Scanner input = new Scanner (System.in);
	
	System.out.println("Enter three numbers :");
	a=input.nextInt();
	b=input.nextInt();
	c=input.nextInt();

	if(a>b && b>c)
	{
	  max=a;
	  min=c;
	}

	else if(b>a && a>c)
	{
	 max=b;
	 min=c;
	}

	else if(c>a && a>b)
	{
	 max=c;
	 min=b;
	}

	else if(c>b && b>a)
	{
	 max=c;
	 min=a;
	}

	else if(a>c && c>b)
	{
	 max=a;
	 min=b;
	}

	else 
	{
	 max=b;
	 min=a;
	}

   System.out.println( "max: " + max);
   System.out.println( "min: " + min);
 }
}